package pl.com.empas.java_introductory_course.oop.solid.lsp.documents.bad;

public abstract class AbstractDocument {

    protected final String fileName;

    protected Object content;

    protected long fileSize;

    protected final DocumentFormatType formatType;

    public AbstractDocument(String fileName, long fileSize, Object content, DocumentFormatType formatType) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.content = content;
        this.formatType = formatType;
    }

    public abstract Object getContent();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractDocument that = (AbstractDocument) o;

        if (fileSize != that.fileSize) return false;
        if (fileName != null ? !fileName.equals(that.fileName) : that.fileName != null) return false;
        return formatType == that.formatType;
    }

    @Override
    public int hashCode() {
        int result = fileName != null ? fileName.hashCode() : 0;
        result = 31 * result + (int) (fileSize ^ (fileSize >>> 32));
        result = 31 * result + (formatType != null ? formatType.hashCode() : 0);
        return result;
    }

    public String getFileName() {
        return fileName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public DocumentFormatType getFormatType() {
        return formatType;
    }

    public enum DocumentFormatType {
        BINARY, TEXT
    }
}
