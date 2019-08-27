package by.etc.task.three.user;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class User {
    public void showParticularNote(int index) throws ParserConfigurationException, IOException, SAXException {


            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("D:\\IdeaProjects\\BasicsTasks\\src\\by\\etc\\task\\three\\user\\myXML.xml"));
            NodeList employeeElements = document.getDocumentElement().getElementsByTagName("employee");
            Node employee = employeeElements.item(index);

        try {
            NamedNodeMap attributes = employee.getAttributes();
            System.out.println("Job: "+(attributes.getNamedItem("job").getNodeValue()) +" Name: "+ attributes.getNamedItem("name").getNodeValue() + employee.getTextContent());
        }catch (NullPointerException e){
            System.out.println("Nobody found");
        }





    }
}
