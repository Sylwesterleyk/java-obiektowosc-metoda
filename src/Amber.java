public class Amber {
    char[] color;
    double hardness;
    double consistency;
    int meltingInCelsius;

    Amber(char[] color, double hardness, double consistency, int meltingInCelsius) {
        this.color = color;
        this.hardness = hardness;
        this.consistency = consistency;
        this.meltingInCelsius = meltingInCelsius;
    }

    double meltingInFahrenheit() {
        return 2 * (meltingInCelsius - 0.1 * meltingInCelsius) + 32;
    }
    void increseConsistency(double a){
        consistency+=a;
    }
}
