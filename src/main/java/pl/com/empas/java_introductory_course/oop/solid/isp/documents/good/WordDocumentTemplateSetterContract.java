package pl.com.empas.java_introductory_course.oop.solid.isp.documents.good;

import pl.com.empas.java_introductory_course.oop.solid.common.WordDocument;

public interface WordDocumentTemplateSetterContract {

    WordDocument setNewTemplate(WordDocument document, WordDocument template);
}
