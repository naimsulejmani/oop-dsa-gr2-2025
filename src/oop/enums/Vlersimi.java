package oop.enums;

public enum Vlersimi {

    DOBET(1, "Dobet"),
    MJAFTUESHEM(2, "Mjaftueshem"),
    MIRE(3, "Mire"),
    SHUME_MIRE(4, "Shume Mire"),
    SHKELQYESHEM(5, "Shkelqyeshem");
    private int nota;
    private String pershkrimi;

    private Vlersimi(int nota, String pershkrimi) {
        this.nota = nota;
        this.pershkrimi = pershkrimi;
    }

    public int getNota() {
        return nota;
    }

    public String getPershkrimi() {
        return pershkrimi;
    }


    @Override
    public String toString() {
        return String.format("%d - %s", nota, pershkrimi);
    }
}
