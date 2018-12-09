package pl.com.empas.java_introductory_course.oop.solid.dip.documents.good;

import pl.com.empas.java_introductory_course.oop.solid.common.ExcelDocument;
import pl.com.empas.java_introductory_course.oop.solid.common.OfficeDocument;
import pl.com.empas.java_introductory_course.oop.solid.common.WordDocument;

public class DocumentPrinter {


    public int getPrintoutPagesNumber(DocumentPagesProviderContract [] documents) {
        int pages = 0;
        for(DocumentPagesProviderContract doc : documents) {
            pages += doc.getPagesNumber();
        }
        return pages;
    }

}
