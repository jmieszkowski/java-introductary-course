package pl.com.empas.java_introductory_course.oop.solid.lsp.documents.bad;

public class ExcelDocument extends AbstractDocument {

    public ExcelDocument(String fileName, long fileSize, byte [] content) {
        super(fileName, fileSize, content, DocumentFormatType.BINARY);
    }

    @Override
    public byte [] getContent() {
        return (byte []) content;
    }
}
