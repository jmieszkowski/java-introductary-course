package pl.com.empas.java_introductory_course.oop.solid.srp.documents.good;

import pl.com.empas.java_introductory_course.oop.solid.common.WordDocument;

public interface WordDocumentFileSystemHandlerContract {
    boolean deleteDocument(WordDocument document);
    boolean save(WordDocument document);
}
