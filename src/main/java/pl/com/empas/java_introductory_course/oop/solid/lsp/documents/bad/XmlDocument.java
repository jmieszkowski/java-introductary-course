package pl.com.empas.java_introductory_course.oop.solid.lsp.documents.bad;

public class XmlDocument extends AbstractDocument {
    public XmlDocument(String fileName, String content, long fileSize) {
        super(fileName, fileSize, content, DocumentFormatType.TEXT);
    }

    @Override
    public String getContent() {
        return (String) this.content;
    }
}
