public class Main {
    public static void main(String[] args) {
        char[] blue = {'b', 'l', 'u', 'e'};
        char[] yellow = {'y', 'e', 'l', 'l', 'o', 'w'};
        char[] red = {'r', 'e', 'd'};

        Amber a1 = new Amber(blue, 2.1, 1.05, 289);
        Amber a2 = new Amber(red, 2.3, 1.07, 298);
        Amber a3 = new Amber(yellow, 2.2, 1.06, 295);

        System.out.println(a1.meltingInFahrenheit());

        a1.increseConsistency(0.01);
        System.out.println(a1.consistency);

    }
}
