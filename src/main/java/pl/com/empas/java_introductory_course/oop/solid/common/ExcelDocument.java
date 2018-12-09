package pl.com.empas.java_introductory_course.oop.solid.common;

import java.util.Random;

public class ExcelDocument extends OfficeDocument {

    public ExcelDocument(String fileName, long fileSize, OfficeVersion version, byte [] content) {
        super(fileName, fileSize, version, content);
    }

    public ExcelDocument reevaluateFormulas() {
        return new ExcelDocument(fileName, fileSize, officeVersion, content);
        //Actually we would have to do much more than just create a new document, but for now it must suffice.
    }

    //YAGNI violation!
    public ExcelDocument addSheetsFromOtherExcelDoc(ExcelDocument other) {
        long fileSize = this.getFileSize() + other.getFileSize();
        byte [] newContent = new byte[this.content.length + other.content.length];
        //and obviously do the actual concatenation which is out of scope of this example
        return new ExcelDocument(fileName, fileSize, officeVersion, newContent);
    }

    public int getSheetsNumber() {
        //Actual Excel document operations should go here
        return new Random(System.currentTimeMillis()).nextInt();
    }

    public int getRowsNumber(int sheet) {
        //Actual Excel document operations should go here
        return new Random(System.currentTimeMillis()).nextInt();
    }
}
