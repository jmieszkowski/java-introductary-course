package pl.com.empas.java_introductory_course.oop.solid.dip.documents.bad;

import pl.com.empas.java_introductory_course.oop.solid.common.ExcelDocument;
import pl.com.empas.java_introductory_course.oop.solid.common.OfficeDocument;
import pl.com.empas.java_introductory_course.oop.solid.common.WordDocument;

import java.util.List;

public class DocumentPrinter {

    public static int EXCEL_ROWS_PER_PAGE = 40;

    public int getPrintoutPagesNumber(OfficeDocument [] documents) {
        int pages = 0;
        for(OfficeDocument doc : documents) {
            if(doc.getClass().equals(ExcelDocument.class)) {
                int rows = 0;
                for(int i = 0; i < ((ExcelDocument) doc).getSheetsNumber(); i++) {
                    rows += ((ExcelDocument) doc).getRowsNumber(i);
                }
                pages += (int) Math.ceil(rows/EXCEL_ROWS_PER_PAGE);
            } else {
                pages += ((WordDocument) doc).getPagesNumber();
            }
        }
        return pages;
    }

    public void print(OfficeDocument doc) {
        //print!
    }
}
