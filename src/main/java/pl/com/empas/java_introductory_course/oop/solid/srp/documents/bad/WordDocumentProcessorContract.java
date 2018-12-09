package pl.com.empas.java_introductory_course.oop.solid.srp.documents.bad;

import pl.com.empas.java_introductory_course.oop.solid.common.WordDocument;
import pl.com.empas.java_introductory_course.oop.solid.common.XmlDocument;

public interface WordDocumentProcessorContract {

    WordDocument changeTemplate(WordDocument document, WordDocument template);
    WordDocument applyStyle(WordDocument document, String styleName);
    XmlDocument convertToXml(WordDocument document);
    boolean deleteDocument(WordDocument document);
    boolean save(WordDocument document);

}
