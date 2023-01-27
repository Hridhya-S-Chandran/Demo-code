public class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
    public int substract(int c,int d){
        return c - d;
    }
    public int multiply(int e,int f){
        return e * f;
    }
    public int division(int e,int f) {
        return e / f;
    }
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        System.out.println(+arithmetic.add(2, 3));
        System.out.println(+arithmetic.substract(2, 3));
        System.out.println(+arithmetic.multiply(2, 3));
        System.out.println(+arithmetic.division(9, 3));
    }
}