package pl.com.empas.java_introductory_course.oop.solid.lsp.documents.good;

public class WordDocument extends OfficeDocument {

    private String author;

    private OfficeVersion officeVersion;

    private WordDocument template;

    public WordDocument(String fileName, long fileSize, OfficeVersion version, String author, byte [] content, OfficeVersion officeVersion, WordDocument template) {
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
}
