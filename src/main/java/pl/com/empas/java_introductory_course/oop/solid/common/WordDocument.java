package pl.com.empas.java_introductory_course.oop.solid.common;

import java.util.Arrays;
import java.util.Random;

public class WordDocument extends OfficeDocument {

    private String author;

    private OfficeVersion officeVersion;

    private WordDocument template;

    public WordDocument(String fileName, long fileSize, OfficeVersion version, String author, byte [] content, WordDocument template) {
        super(fileName, fileSize, version, content);
        this.author = author;
        this.officeVersion = officeVersion;
        this.template = template;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public OfficeVersion getOfficeVersion() {
        return officeVersion;
    }

    public void setOfficeVersion(OfficeVersion officeVersion) {
        this.officeVersion = officeVersion;
    }

    public WordDocument getTemplate() {
        return template;
    }

    public void setTemplate(WordDocument template) {
        this.template = template;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        WordDocument that = (WordDocument) o;

        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (officeVersion != that.officeVersion) return false;
        return template != null ? template.equals(that.template) : that.template == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (officeVersion != null ? officeVersion.hashCode() : 0);
        result = 31 * result + (template != null ? template.hashCode() : 0);
        return result;
    }

    //YAGNI violation!
    public WordDocument concat(WordDocument other) {
        long fileSize = this.getFileSize() + other.getFileSize();
        byte [] newContent = new byte[this.content.length + other.content.length];
        //and obviously do the actual concatenation which is out of scope of this example
        return new WordDocument(this.fileName, fileSize, this.officeVersion, this.author, newContent, this.template);
    }

    public int getPagesNumber() {
        //Actual Word document operations should go here
        return new Random(System.currentTimeMillis()).nextInt();
    }

    @Override
    public String toString() {
        return "WordDocument{" +
                "author='" + author + '\'' +
                ", officeVersion=" + officeVersion +
                ", template=" + template +
                ", fileName='" + fileName + '\'' +
                ", content=" + Arrays.toString(content) +
                ", fileSize=" + fileSize +
                ", officeVersion=" + officeVersion +
                '}';
    }
}
