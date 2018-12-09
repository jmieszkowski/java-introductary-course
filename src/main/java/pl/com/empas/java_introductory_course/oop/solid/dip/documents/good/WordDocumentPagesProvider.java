package pl.com.empas.java_introductory_course.oop.solid.dip.documents.good;

import pl.com.empas.java_introductory_course.oop.solid.common.WordDocument;

public class WordDocumentPagesProvider implements DocumentPagesProviderContract {

    private final WordDocument document;

    public WordDocumentPagesProvider(WordDocument doc) {
        this.document = doc;
    }

    @Override
    public int getPagesNumber() {
        return document.getPagesNumber();
    }
}
