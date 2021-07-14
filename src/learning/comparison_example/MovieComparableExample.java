package learning.comparison_example;
// A Java program to demonstrate use of Comparable
import java.io.*;
import java.util.*;

// A class 'Movie' that implements Comparable
class MovieComparableExample implements Comparable<MovieComparableExample>
{
	private double rating;
	private String name;
	private int year;

	// Used to sort movies by year
	public int compareTo(MovieComparableExample m)
	{
		return this.year - m.year;
	}

	// Constructor
	public MovieComparableExample(String nm, double rt, int yr)
	{
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}

	// Getter methods for accessing private data
	public double getRating() { return rating; }
	public String getName() { return name; }
	public int getYear()	 { return year; }
}

