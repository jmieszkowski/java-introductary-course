package pl.com.empas.java_introductory_course.oop.solid.isp.documents.bad;

import pl.com.empas.java_introductory_course.oop.solid.common.OfficeDocument;
import pl.com.empas.java_introductory_course.oop.solid.common.OfficeVersion;
import pl.com.empas.java_introductory_course.oop.solid.common.WordDocument;

public interface OfficeDocumentProcessorContract {

    void upgradeDocumentToOfficeVersion(OfficeDocument doc, OfficeVersion newVersion);
    OfficeDocument reevaluateFormulas(OfficeDocument doc);
    OfficeDocument setNewTemplate(OfficeDocument document, WordDocument template);
}
