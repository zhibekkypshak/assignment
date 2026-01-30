package task3;

public class Rational extends Number implements Comparable<Rational> {

    private long numerator;
    private long denominator;

    public Rational(long numerator, long denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Rational add(Rational r) {
        long num = this.numerator * r.denominator + r.numerator * this.denominator;
        long den = this.denominator * r.denominator;
        return new Rational(num, den);
    }
    public Rational subtract(Rational r) {
        long num = this.numerator * r.denominator - r.numerator * this.denominator;
        long den = this.denominator * r.denominator;
        return new Rational(num, den);
    }

    public Rational multiply(Rational r) {
        long num = this.numerator * r.numerator;
        long den = this.denominator * r.denominator;
        return new Rational(num, den);
    }

    public Rational divide(Rational r) {
        long num = this.numerator * r.denominator;
        long den = this.denominator * r.numerator;
        return new Rational(num, den);
    }

    @Override
    public int compareTo(Rational r) {
        return Double.compare(this.doubleValue(), r.doubleValue());
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}



