package pl.com.empas.java_introductory_course.generics.converters;

import pl.com.empas.java_introductory_course.oop.solid.common.WordDocument;
import pl.com.empas.java_introductory_course.oop.solid.common.XmlDocument;

public class WordToXmlConverter implements ConverterContract<WordDocument, XmlDocument> {


    //anonimous class implementing ConverterContract
    private ConverterContract<byte [], String> byteArrayToStringConverter = new ConverterContract<byte[], String>() {
        @Override
        public String convert(byte[] value) {
            return new String(value);
        }
    };
    @Override
    public XmlDocument convert(WordDocument wordDoc) {
        String fileName = wordDoc.getFileName().replace(".docx", ".xml");
        String content = byteArrayToStringConverter.convert(wordDoc.getContent());
        XmlDocument xmlDoc = new XmlDocument(fileName, content, wordDoc.getFileSize());
        return xmlDoc;
    }
}
