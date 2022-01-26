package Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction Sum(Fraction fraction){
        return new Fraction(this.numerator * fraction.denominator + fraction.numerator * this.denominator,
                this.denominator * fraction.denominator);
    }
    public Fraction Sub(Fraction fraction){
        return new Fraction(this.numerator * fraction.denominator - fraction.numerator * this.denominator,
                this.denominator * fraction.denominator);
    }
    public Fraction Mult(Fraction fraction){
        return new Fraction(this.numerator*fraction.numerator,this.denominator*fraction.denominator);
    }
    public Fraction Div(Fraction fraction){
        return new Fraction(this.numerator*fraction.denominator,fraction.numerator*this.denominator);
    }
}

