package dto;

import java.util.Arrays;

public enum DiaChi {
    TI(1, "Tý"),
    SUU(2, "Sửu"),
    DAN(3, "Dần"),
    MAO(4, "Mão"),
    THIN(5, "Thìn"),
    TY(6, "Tỵ"),
    NGO(7, "Ngọ"),
    MUI(8, "Mùi"),
    THAN(9, "Thân"),
    DAU(10, "Dậu"),
    TUAT(11, "Tuất"),
    HOI(12, "Hợi"),
    ;

    DiaChi(int code, String name) {
        this.name = name;
        this.code = code;
    }

    private final String name;
    private final int code;

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public static DiaChi fromCode(int code) {
        return Arrays.stream(values()).filter(diaChi -> diaChi.getCode() == code).findFirst().orElse(null);
    }

}
