package CW8;
import java.util.Scanner;


public class RationalNumber{
    private int numerator;
    private int denominator;

    public RationalNumber() {}

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public RationalNumber[] input_numbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of fractions: ");

        int n = sc.nextInt();
        RationalNumber[] mass = new RationalNumber[n];

        for (int i = 0; i < mass.length; i++){
            System.out.println("Enter numerator of fraction: ");
            int num = sc.nextInt();

            System.out.println("Enter denominator of fraction: ");
            int denom = sc.nextInt();

            mass[i] = new RationalNumber(num, denom);
        }
        return mass;
    }

    public RationalNumber add(RationalNumber other) {
        int res_denominator = IntegerNumber.lcm(this.denominator, other.denominator);
        int res_nominator = this.numerator * (res_denominator / this.denominator) +
                other.numerator * (res_denominator / other.denominator);
        return new RationalNumber(res_nominator, res_denominator);
    }
    public static RationalNumber add(RationalNumber self, RationalNumber other){
        int res_denominator = IntegerNumber.lcm(self.denominator, other.denominator);
        int res_nominator = self.numerator * (res_denominator / self.denominator) +
                other.numerator * (res_denominator / other.denominator);
        return new RationalNumber(res_nominator, res_denominator);
    }

    public int get_numerator() {
        return this.numerator;
    }

    @Override
    public String toString() {
        return "RationalNumber{" + "numerator=" + numerator + ", denominator=" + denominator + '}';
    }
}
