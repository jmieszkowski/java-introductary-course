package pl.com.empas.java_introductory_course.oop.solid.isp.documents.bad;

import pl.com.empas.java_introductory_course.oop.solid.common.OfficeDocument;
import pl.com.empas.java_introductory_course.oop.solid.common.OfficeVersion;
import pl.com.empas.java_introductory_course.oop.solid.common.WordDocument;

public class WordDocumentProcessor implements OfficeDocumentProcessorContract {

    @Override
    public void upgradeDocumentToOfficeVersion(OfficeDocument doc, OfficeVersion newVersion) {
        doc.setOfficeVersion(newVersion);
        //Actually, we would do some additional magic, but this would involve LOTS of work :)
    }

    @Override
    public OfficeDocument reevaluateFormulas(OfficeDocument doc) {
        throw new WrongDocumentTypeException("Unable to reevaluate formulas for a Word document!");
    }

    @Override
    public OfficeDocument setNewTemplate(OfficeDocument doc, WordDocument template) {
        if(!doc.getClass().equals(WordDocument.class))
            throw new WrongDocumentTypeException("Cannot set a template on a file that is not a Word document!");
        WordDocument wordDoc = (WordDocument) doc;
        long fileSize = wordDoc.getFileSize() - wordDoc.getTemplate().getFileSize() + template.getFileSize();
        return new WordDocument(wordDoc.getFileName(), fileSize, wordDoc.getOfficeVersion(), wordDoc.getAuthor(), doc.getContent(), template);
    }
}
