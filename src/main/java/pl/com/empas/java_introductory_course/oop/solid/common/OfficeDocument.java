package pl.com.empas.java_introductory_course.oop.solid.common;

import java.util.Arrays;

public abstract class OfficeDocument {

    protected final String fileName;

    protected byte [] content;
    protected long fileSize;
    protected OfficeVersion officeVersion;

    public OfficeDocument(String fileName, long fileSize, OfficeVersion version, byte [] content) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.content = content;
        this.officeVersion = version;
    }

    public OfficeVersion getOfficeVersion() {
        return officeVersion;
    }

    public void setOfficeVersion(OfficeVersion officeVersion) {
        this.officeVersion = officeVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OfficeDocument that = (OfficeDocument) o;

        if (fileSize != that.fileSize) return false;
        if (fileName != null ? !fileName.equals(that.fileName) : that.fileName != null) return false;
        if (!Arrays.equals(content, that.content)) return false;
        return officeVersion == that.officeVersion;
    }

    @Override
    public int hashCode() {
        int result = fileName != null ? fileName.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(content);
        result = 31 * result + (int) (fileSize ^ (fileSize >>> 32));
        result = 31 * result + (officeVersion != null ? officeVersion.hashCode() : 0);
        return result;
    }

    public byte [] getContent() {
        return this.content;
    }

    public void setContent(byte[] content) {
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
