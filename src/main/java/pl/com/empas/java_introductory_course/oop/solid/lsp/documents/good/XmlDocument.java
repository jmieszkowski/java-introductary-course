package pl.com.empas.java_introductory_course.oop.solid.lsp.documents.good;

public class XmlDocument extends TextDocument {
    public XmlDocument(String fileName, String content, long fileSize) {
        super(fileName, fileSize, content);
    }
}
