package pl.com.empas.java_introductory_course.oop.solid.isp.documents.bad;

import pl.com.empas.java_introductory_course.oop.solid.common.ExcelDocument;
import pl.com.empas.java_introductory_course.oop.solid.common.OfficeDocument;
import pl.com.empas.java_introductory_course.oop.solid.common.OfficeVersion;
import pl.com.empas.java_introductory_course.oop.solid.common.WordDocument;

public class ExcelDocumentProcessor implements OfficeDocumentProcessorContract {


    @Override
    public void upgradeDocumentToOfficeVersion(OfficeDocument doc, OfficeVersion newVersion) {
        doc.setOfficeVersion(newVersion);
        //Actually, we would do some additional magic, but this would involve LOTS of work :)
    }

    @Override
    public OfficeDocument reevaluateFormulas(OfficeDocument doc) {
        if(!doc.getClass().equals(ExcelDocument.class))
            throw new WrongDocumentTypeException("Cannot reevaluate formulas on a file that is not an Excel document!");
        ExcelDocument excelDocument = (ExcelDocument) doc;
        return ((ExcelDocument) doc).reevaluateFormulas();

    }

    @Override
    public OfficeDocument setNewTemplate(OfficeDocument doc, WordDocument template) {
        throw new WrongDocumentTypeException("Unable to set template for a Excel document!");
    }
}
