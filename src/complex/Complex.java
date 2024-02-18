package complex;

public class Complex implements Addable, Multipliable, Dividable {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public Complex add(Complex cmplx2) {
        return new Complex(this.real + cmplx2.real, this.imaginary + cmplx2.imaginary);
    }

    @Override
    public Complex multiply(Complex cmplx2) {
        double multipliedReal = this.real * cmplx2.real - this.imaginary * cmplx2.imaginary;
        double multipliedImaginary = this.real * cmplx2.imaginary + this.imaginary * cmplx2.real;
        return new Complex(multipliedReal, multipliedImaginary);
    }

    @Override
    public Complex divide(Complex cmplx2) {
        double dividedReal = (this.real * cmplx2.real + this.imaginary * cmplx2.imaginary) / (cmplx2.real * cmplx2.real + cmplx2.imaginary * cmplx2.imaginary);
        double dividedImaginary = (this.imaginary * cmplx2.real - this.real * cmplx2.imaginary) / (cmplx2.real * cmplx2.real + cmplx2.imaginary * cmplx2.imaginary);
        return new Complex(dividedReal, dividedImaginary);
    }

    @Override
    public String toString () {
        if (real == 0.0) {
            return String.format("%d*i", imaginary);
        } else if (imaginary == 0.0) {
            return String.format("%d", real);
        } else if (imaginary < 0.0) {
            return String.format("%d %d*i", real, imaginary);
        } else { return String.format("%d + %d*i", real, imaginary); }
    }
}