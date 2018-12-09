package pl.com.empas.java_introductory_course.oop.solid.isp.documents.good;

import pl.com.empas.java_introductory_course.oop.solid.common.ExcelDocument;
import pl.com.empas.java_introductory_course.oop.solid.common.OfficeDocument;
import pl.com.empas.java_introductory_course.oop.solid.common.OfficeVersion;
import pl.com.empas.java_introductory_course.oop.solid.common.WordDocument;

public class ExcelDocumentProcessor implements OfficeVersionUpgraderContract, ExcelDocumentFormulaEvaluatorContract {


    @Override
    public void upgradeDocumentToOfficeVersion(OfficeDocument doc, OfficeVersion newVersion) {
        doc.setOfficeVersion(newVersion);
        //Actually, we would do some additional magic, but this would involve LOTS of work :)
    }

    @Override
    public ExcelDocument reevaluateFormulas(ExcelDocument doc) {
        return doc.reevaluateFormulas();

    }
}
