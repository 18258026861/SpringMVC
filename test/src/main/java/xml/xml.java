package xml;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author YZY
 * @date 2020/4/20 - 11:49
 */
public class xml {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//         DocumentBuilder类是DOM中的解析器类，开发者可以使其从XML文档获取DOM文档实例
        DocumentBuilder db = dbf.newDocumentBuilder();
//        解析器类DocumentBuilder的parse()方法接受一个XML文档名作为输入参数，将返回一个Document实例
        Document document = db.parse("xml.xml");
        InputStream inputStream = new FileInputStream("xml.xml");
//        XML文档转化为输入流，然后将输入流对象作为parse()方法的输入参数
        DocumentBuilder doc = (DocumentBuilder) db.parse(inputStream);
//        XML文档中所有<message>标签对应的Node对象的一个列表。
        NodeList nodeList = document.getElementsByTagName("xml");
    }
}
