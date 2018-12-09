package pl.com.empas.java_introductory_course.oop.solid.dip.documents.good;

import pl.com.empas.java_introductory_course.oop.solid.common.ExcelDocument;

public class ExcelDocumentPagesProvider implements DocumentPagesProviderContract {

    public static int EXCEL_ROWS_PER_PAGE = 40;

    private final ExcelDocument document;

    public ExcelDocumentPagesProvider(ExcelDocument doc) {
        this.document = doc;
    }

    @Override
    public int getPagesNumber() {
        int rows = 0;
        for(int i = 0; i < document.getSheetsNumber(); i++) {
            rows += document.getRowsNumber(i);
        }
        return (int) Math.ceil(rows/EXCEL_ROWS_PER_PAGE);
    }
}
