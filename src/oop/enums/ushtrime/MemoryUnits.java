package oop.enums.ushtrime;

public enum MemoryUnits {
    BYTES(1, "B"),
    KILOBYTES(1024, "KB"),
    MEGABYTES(KILOBYTES.getBytes() * KILOBYTES.getBytes(), "MB"),
    GIGABYTES(MEGABYTES.getBytes() * KILOBYTES.getBytes(), "GB"),
    TERABYTES(GIGABYTES.getBytes() * KILOBYTES.getBytes(), "TB"),
    PETABYTES(TERABYTES.getBytes() * KILOBYTES.getBytes(), "PB"),
    ;

    public final long bytes;
    private final String description;

    MemoryUnits(long bytes, String description) {
        this.bytes = bytes;
        this.description = description;
    }

    public long getBytes() {
        return bytes;
    }

    public String getDescription() {
        return description;
    }

    public long getKilobytes() {
        return bytes / KILOBYTES.getBytes();
    }

}
