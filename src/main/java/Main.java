public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(5, 7));
        System.out.println(intsCalc.mult(15, 27));
        System.out.println(intsCalc.pow(2, 2));
    }
}