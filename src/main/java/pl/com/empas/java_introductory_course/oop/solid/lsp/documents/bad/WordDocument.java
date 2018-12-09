package pl.com.empas.java_introductory_course.oop.solid.lsp.documents.bad;

public class WordDocument extends AbstractDocument {

    private String author;

    private WordVersion wordVersion;

    private WordDocument template;

    public WordDocument(String fileName, long fileSize, String author, byte [] content, WordVersion wordVersion, WordDocument template) {
        super(fileName, fileSize, content, DocumentFormatType.BINARY);
        this.author = author;
        this.wordVersion = wordVersion;
        this.template = template;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public WordVersion getWordVersion() {
        return wordVersion;
    }

    public void setWordVersion(WordVersion wordVersion) {
        this.wordVersion = wordVersion;
    }

    public WordDocument getTemplate() {
        return template;
    }

    public void setTemplate(WordDocument template) {
        this.template = template;
    }

    @Override
    public byte [] getContent() {
        return (byte []) this.content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        WordDocument that = (WordDocument) o;

        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (wordVersion != that.wordVersion) return false;
        return template != null ? template.equals(that.template) : that.template == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (wordVersion != null ? wordVersion.hashCode() : 0);
        result = 31 * result + (template != null ? template.hashCode() : 0);
        return result;
    }

    public enum WordVersion {
        WORD_2013, WORD_2010, WORD_2016
    }
}
