package pl.com.empas.java_introductory_course.oop.solid.lsp.documents.good;


public abstract class TextDocument {

    protected final String fileName;
    protected String content;
    protected long fileSize;

    public TextDocument(String fileName, long fileSize, String content) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TextDocument that = (TextDocument) o;

        if (fileSize != that.fileSize) return false;
        if (fileName != null ? !fileName.equals(that.fileName) : that.fileName != null) return false;
        return content != null ? content.equals(that.content) : that.content == null;
    }

    @Override
    public int hashCode() {
        int result = fileName != null ? fileName.hashCode() : 0;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (int) (fileSize ^ (fileSize >>> 32));
        return result;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFileName() {
        return fileName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }
}
