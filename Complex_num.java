

import java.util.Scanner;


/** Liczby zespolone*/
public class Complex_num {

	/** Czesc rzeczywista liczby zespolonej */
	private double X;
    /** Czesc urojona liczby zespolonej */
   	private double Y;

    /**Konstruktor dla czêœci rzeczywistej i urojonej.*/
    public Complex_num(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }
	/** Konstrukotr kopiuj¹cy*/
	public Complex_num(Complex_num cnum)
	{
		this.X = cnum.X;
		this.Y = cnum.Y;
	}
	
 
    /**
    Konstruktor dla czêœci rzeczywistej (czêœæ urojona jest równa 0). */
    public Complex_num (double X)
    {
       this(X,0);
    }
	public Complex_num (double Y)
	{
		this(0,Y);
	}

/** gettery*/
double getX() {
	return this.X;
}
double getY() {
	return this.Y;
}
/** settery */
void setX(double X)
{
	this.X = X;
}

void setY(double Y)
{
	this.Y = Y;
}


/** Addition */
public Complex_num add(Complex_num a)
{
    return new Complex_num(X+a.X, Y+a.Y);
}

/** Subtraction */
public static Complex_num subtract(Complex_num a)
{
    return new Complex_num(X-a.X, Y-a.Y) ;
}


/** Multiplication */
public static Complex_num multiply(Complex_num a)
{
    return new Complex_num(X*a.X-Y*a.Y, X*a.Y+Y*a.X) ;
}


/** Division */
public static Complex_num divide(Complex_num a)
{
    double tmp = a.X*a.X+a.Y*a.Y;
	return new Complex_num((X*a.X+Y*a.Y)/tmp,
							(Y*a.X-X*a.Y)/tmp);
    
}

public String toString(){
    return "("+X+"+"+Y+"i)";

    
    

/** 
Sprzê¿enie zespolone liczby zespolonej 
(sprzê¿enie x+i*y to xi*y).
*/ 
public Complex_num conj() {
    return new Complex_num(X,-Y);
}

