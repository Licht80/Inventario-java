public class Resta {

    public static int restar(int minuendo, int sustraendo) {
        return minuendo - sustraendo;
    }

    public static void main(String[] args) {
        int minuendo = 120;
        int sustraendo = 46;

        System.out.println(minuendo + " - " + sustraendo + " = " + restar(minuendo, sustraendo));
    }
}
