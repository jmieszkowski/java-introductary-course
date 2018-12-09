package pl.com.empas.java_introductory_course.oop.solid.lsp.documents.good;

public class ExcelDocument extends OfficeDocument {

    public ExcelDocument(String fileName, long fileSize, OfficeVersion version, byte [] content) {
        super(fileName, fileSize, version, content);
    }
}
