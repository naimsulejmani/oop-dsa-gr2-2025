package oop.enums.ushtrime;

public enum RamTypes {
    SDRAM(1999),
    DDR2(2006),
    DDR3(2007),
    DDR4(2014),
    DDR5(2020);

    private final int yearIntroduced;

    RamTypes(int yearIntroduced) {
        this.yearIntroduced = yearIntroduced;
    }

    public int getYearIntroduced() {
        return yearIntroduced;
    }
}
