package dto;

import java.util.Arrays;

public enum ThienCan {
    GIAP(1, "Giáp"),
    AT(2, "Ất"),
    BINH(3, "Bính"),
    DINH(4, "Đinh"),
    MAU(5, "Mậu"),
    KY(6, "Kỷ"),
    CANH(7, "Canh"),
    TAN(8, "Tân"),
    NHAM(9, "Nhâm"),
    QUY(10, "Quý"),
    ;

    ThienCan(int code, String name) {
        this.code = code;
        this.name = name;
    }

    private final String name;
    private final int code;

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public static ThienCan fromCode(int code) {
        return Arrays.stream(values()).filter(thienCan -> thienCan.getCode() == code).findFirst().orElse(null);
    }
}
