package by.etc.task.three.server;

import by.etc.task.three.user.Admin;
import by.etc.task.three.user.User;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private ServerSocket serverSocket;
    private boolean end;
    private boolean admin;
    private  Admin administrator;

    public Server() {
        administrator = new Admin();
        admin = false;
        end = false;
    }

    public ServerSocket getServerSocket() {

        return serverSocket;
    }

    public boolean isEnd() {

        return end;
    }

    public void setEnd(boolean end) {

        this.end = end;
    }

    public void setAdmin(boolean admin) {

        this.admin = admin;
    }

    public void makeServer() {
        try {

            Socket socketToMakeServer = serverSocket.accept();
            System.out.println("Connected");
            checkFile();
            if (admin) {
                adminFunctions();
            } else {
                userFunctions();
            }
            socketToMakeServer.close();


        } catch (IOException | SAXException | ParserConfigurationException | TransformerException e) {
            e.printStackTrace();
        }
    }

    private void checkFile() {
        try{
          File a =new File("D:\\IdeaProjects\\BasicsTasks\\src\\by\\etc\\task\\three\\user\\myXML.xml");

           if(a.length()==0){
               BufferedWriter writer =new BufferedWriter(new FileWriter(a));
               writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" +
                       "<employees>\n</employees>");
               writer.close();
           }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void userFunctions() throws IOException, SAXException, ParserConfigurationException {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: show particular note");
        System.out.println("2: exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Write user number");
                choice=scanner.nextInt();
                user.showParticularNote(choice);
                break;
            }
            case 2: {
                break;
            }
        }


    }

    private void adminFunctions() throws IOException, SAXException, ParserConfigurationException, TransformerException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: show particular note");
        System.out.println("2: change information in note");
        System.out.println("3: create new note");
        System.out.println("4: exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Write user number");
                choice=scanner.nextInt();
                administrator.showParticularNote(choice);
                break;
            }
            case 2: {
                System.out.println("Write user number");
                choice=scanner.nextInt();
                administrator.changeInformationInNote(choice);
                break;
            }
            case 3: {
                administrator.createNewNote();
                break;
            }
            case 4: {
                break;
            }
        }
    }

    public void connect() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            Socket socketToConnect = new Socket();

            socketToConnect.connect(new InetSocketAddress(InetAddress.getLocalHost(), 8888));


            socketToConnect.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void joinToServer() throws IOException {
        serverSocket = new ServerSocket(8888);
    }
}
