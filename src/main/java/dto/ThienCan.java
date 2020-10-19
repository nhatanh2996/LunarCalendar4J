package dto;

public enum ThienCan {
    GIAP("Giáp"),
    AT("Ất"),
    BINH("Bính"),
    DINH("Đinh"),
    MAU("Mậu"),
    KY("Kỷ"),
    CANH("Canh"),
    TAN("Tân"),
    NHAM("Nhâm"),
    QUY("Quý"),
    ;

    ThienCan(String name) {
        this.name = name;
    }

    private final String name;

    public String getName() {
        return name;
    }
}
