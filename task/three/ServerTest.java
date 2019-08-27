package by.etc.task.three;

import by.etc.task.three.server.Server;

import java.io.IOException;
import java.util.Scanner;
//Общие требования к заданию:
//
//• В архиве хранятся Дела (например, студентов). Архив находится на сервере.
// • Клиент, в зависимости от прав, может запросить дело на просмотр, внести в него изменения, или создать новое дело.
//
//
//Требования к коду лабораторной работы: • Для реализации сетевого соединения используйте сокеты.
// • Формат хранения данных на сервере – xml-файлы.
public class ServerTest {
    public static void main(String[] args) throws InterruptedException, IOException {
        Server server = new Server();
        server.joinToServer();
        Scanner scanner = new Scanner(System.in);
        while (!server.isEnd()) {
            System.out.println("1:Enter like client");
            System.out.println("2:Enter like Admin");
            System.out.println("3:Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    start(server);
                    break;
                }
                case 2: {

                    server.setAdmin(true);
                    start(server);
                    server.setAdmin(false);
                    break;
                }
                case 3: {
                    server.setEnd(true);
                    server.getServerSocket().close();
                    break;
                }
            }


        }
    }

    private static void start(Server server) throws InterruptedException {
        Thread one = new Thread(new Runnable() {
            @Override
            public void run() {
                server.makeServer();
            }
        });
        Thread two = new Thread(new Runnable() {
            @Override
            public void run() {
                server.connect();
            }
        });
        one.start();
        two.start();
        one.join();
        two.join();
    }
}
