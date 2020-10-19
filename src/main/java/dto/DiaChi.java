package dto;

public enum DiaChi {
    TI("Tý"),
    SUU("Sửu"),
    DAN("Dần"),
    MAO("Mão"),
    THIN("Thìn"),
    TY("Tỵ"),
    NGO("Ngọ"),
    MUI("Mùi"),
    THAN("Thân"),
    DAU("Dậu"),
    TUAT("Tuất"),
    HOI("Hợi"),
    ;

    DiaChi(String name) {
        this.name = name;
    }

    private final String name;

    public String getName() {
        return name;
    }
}
