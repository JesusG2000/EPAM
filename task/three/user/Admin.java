package by.etc.task.three.user;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Admin extends User {


    public void createNewNote() throws ParserConfigurationException, TransformerException, IOException, SAXException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name");
        String name = scanner.nextLine();
        System.out.println("Write job");
        String job = scanner.nextLine();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document saveDocument = builder.newDocument();

        Document document = builder.parse(new File("D:\\IdeaProjects\\BasicsTasks\\src\\by\\etc\\task\\three\\user\\myXML.xml"));

        NodeList employeeElements = document.getDocumentElement().getElementsByTagName("employee");
        int length = employeeElements.getLength();


        Element employees = saveDocument.createElement("employees");
        saveDocument.appendChild(employees);

        savePreviousInformation(saveDocument, employeeElements, length, employees, -1);

        Element employee = saveDocument.createElement("employee");
        employee.setAttribute("job", job);
        employee.setAttribute("name", name);
        employees.appendChild(employee);


        saveXML(saveDocument);

    }

    private void savePreviousInformation(Document saveDocument, NodeList employeeElements, int length, Element employees, int change) {
        for (int i = 0; i < length; i++) {
            Element employee = saveDocument.createElement("employee");
            NamedNodeMap attributes = employeeElements.item(i).getAttributes();
            String employeeName = attributes.getNamedItem("name").getNodeValue();
            String employeeJob = attributes.getNamedItem("job").getNodeValue();
            if (i == change) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Write name");
                String name = scanner.nextLine();
                System.out.println("Write job");
                String job = scanner.nextLine();
                employeeName = name;
                employeeJob = job;
            }


            employee.setAttribute("job", employeeJob);
            employee.setAttribute("name", employeeName);

            employees.appendChild(employee);
        }
    }

    private void saveXML(Document saveDocument) throws TransformerException, FileNotFoundException {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(new DOMSource(saveDocument), new StreamResult(new FileOutputStream("D:\\IdeaProjects\\BasicsTasks\\src\\by\\etc\\task\\three\\user\\myXML.xml")));
    }


    public void changeInformationInNote(int index) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document saveDocument = builder.newDocument();
        if (checkIndex(saveDocument, index)) {
            Document document = builder.parse(new File("D:\\IdeaProjects\\BasicsTasks\\src\\by\\etc\\task\\three\\user\\myXML.xml"));

            NodeList employeeElements = document.getDocumentElement().getElementsByTagName("employee");
            int length = employeeElements.getLength();
            Element employees = saveDocument.createElement("employees");
            saveDocument.appendChild(employees);

            savePreviousInformation(saveDocument, employeeElements, length, employees, index);
            saveXML(saveDocument);
        }
    }

    private boolean checkIndex(Document saveDocument, int index) {
        try {
        NodeList employeeElements = saveDocument.getDocumentElement().getElementsByTagName("employee");
            return true;

        } catch (NullPointerException e) {
            System.out.println("Nobody is found");
            return false;
        }
    }
}
