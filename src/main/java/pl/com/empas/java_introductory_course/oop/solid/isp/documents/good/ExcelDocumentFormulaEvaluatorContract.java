package pl.com.empas.java_introductory_course.oop.solid.isp.documents.good;

import pl.com.empas.java_introductory_course.oop.solid.common.ExcelDocument;

public interface ExcelDocumentFormulaEvaluatorContract {
    ExcelDocument reevaluateFormulas(ExcelDocument doc);
}
