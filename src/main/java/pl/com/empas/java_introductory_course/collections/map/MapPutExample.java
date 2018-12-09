package pl.com.empas.java_introductory_course.collections.map;

import pl.com.empas.java_introductory_course.oop.solid.common.ExcelDocument;
import pl.com.empas.java_introductory_course.oop.solid.common.OfficeDocument;
import pl.com.empas.java_introductory_course.oop.solid.common.OfficeVersion;
import pl.com.empas.java_introductory_course.oop.solid.common.WordDocument;

import java.util.HashMap;
import java.util.Map;

public class MapPutExample {

    public static void main(String [] args) {
        Map<String, ? super OfficeDocument> map = new HashMap<>();
        ExcelDocument excelDoc = new ExcelDocument("spreadsheet.xlsx", 12345, OfficeVersion.OFFICE_2010, new byte[0]);
        WordDocument wordDoc = new WordDocument("word.docx", 12345, OfficeVersion.OFFICE_2016, "p.fronc", new byte [0], null);
        map.put(excelDoc.getFileName(), excelDoc);
        map.put(wordDoc.getFileName(), wordDoc);
        System.out.println(map.get("word.docx"));
    }




}
