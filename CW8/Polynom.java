package CW8;
import CW8.RationalNumber;
import java.util.Arrays;


public class Polynom {
    private RationalNumber[] coefficients;

    public Polynom() {}

    public Polynom(RationalNumber[] coefficients) {
        this.coefficients = coefficients;
    }

    public int get_pol_len(){
        return this.coefficients.length;
    }

    public Polynom add(Polynom other) {
        int pol_len = get_pol_len();
        RationalNumber[] res_coeffs = new RationalNumber[pol_len];
        int not_null_number = 0;

        for (int i = 0; i < pol_len; i++){
            res_coeffs[i] = RationalNumber.add(this.coefficients[i], other.coefficients[i]);

            if (res_coeffs[i].get_numerator() != 0){
                not_null_number++;
            }
        }
        return new Polynom(res_coeffs);
    }

    @Override
    public String toString() {
        return "Polynom{" + "coefficients=" + Arrays.toString(coefficients) + '}';
    }
}
