package oop.provimi.moster_tjeter;

public class TrekendeshiKendrejte {
    private double katetiA;
    private double katetiB;
    //private double hipotenusa; // optional, can be calculated

    public TrekendeshiKendrejte(double katetiA, double katetiB) {
//        if (katetiA < 0 || katetiB < 0) {
//            throw new IllegalArgumentException("Katetet nuk mund te jene negative.");
//        }
//        this.katetiA = katetiA;
//        this.katetiB = katetiB;
        setKatetiA(katetiA);
        setKatetiB(katetiB);
    }

    public double getKatetiA() {
        return katetiA;
    }

    public void setKatetiA(double katetiA) {
        if (katetiA < 0) {
            throw new IllegalArgumentException("Kateti A nuk mund te jete negativ.");
        }
        this.katetiA = katetiA;
    }

    public double getKatetiB() {
        return katetiB;
    }

    public void setKatetiB(double katetiB) {
        if (katetiB < 0) {
            throw new IllegalArgumentException("Kateti B nuk mund te jete negativ.");
        }
        this.katetiB = katetiB;
    }

    public double getHipotenusa() {
        return Math.sqrt(katetiA * katetiA + katetiB * katetiB);
    }

    @Override
    public String toString() {
        return "TrekendeshiKendrejte{" +
                "katetiA=" + katetiA +
                ", katetiB=" + katetiB +
                ", hipotenuza=" + getHipotenusa() +
                '}';
    }
}
