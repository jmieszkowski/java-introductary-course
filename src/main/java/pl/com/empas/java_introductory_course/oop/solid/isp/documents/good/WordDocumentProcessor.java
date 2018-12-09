package pl.com.empas.java_introductory_course.oop.solid.isp.documents.good;

import pl.com.empas.java_introductory_course.oop.solid.common.OfficeDocument;
import pl.com.empas.java_introductory_course.oop.solid.common.OfficeVersion;
import pl.com.empas.java_introductory_course.oop.solid.common.WordDocument;

public class WordDocumentProcessor implements OfficeVersionUpgraderContract, WordDocumentTemplateSetterContract {


    @Override
    public void upgradeDocumentToOfficeVersion(OfficeDocument doc, OfficeVersion newVersion) {
        doc.setOfficeVersion(newVersion);
        //Actually, we would do some additional magic, but this would involve LOTS of work :)
    }

    @Override
    public WordDocument setNewTemplate(WordDocument doc, WordDocument template) {
        long fileSize = doc.getFileSize() - doc.getTemplate().getFileSize() + template.getFileSize();
        return new WordDocument(doc.getFileName(), fileSize, doc.getOfficeVersion(), doc.getAuthor(), doc.getContent(), template);
    }
}
