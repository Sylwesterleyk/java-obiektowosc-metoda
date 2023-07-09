public class Picture {
    int n;
    char sign;

    Picture(int n, char sign) {
        this.n = n;
        this.sign = sign;
    }

    void display() {
        char[] charsArray = new char[n];
        for (int j = 0; j < charsArray.length; j++) {
            for (int i = 0; i < charsArray.length; i++) {
                System.out.print(sign);
            }
            System.out.println();
        }

    }
}

