package learning.comparison_example;
//A Java program to demonstrate Comparator interface
import java.io.*;
import java.util.*;

// A class 'Movie' that implements Comparable
class MovieComparatorExample implements Comparable<MovieComparatorExample>
{
	private double rating;
	private String name;
	private int year;

	// Used to sort movies by year
	public int compareTo(MovieComparatorExample m)
	{
		return this.year - m.year;
	}

	// Constructor
	public MovieComparatorExample(String nm, double rt, int yr)
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

// Class to compare Movies by ratings
class RatingCompare implements Comparator<MovieComparatorExample>
{
	public int compare(MovieComparatorExample m1, MovieComparatorExample m2)
	{
		if (m1.getRating() < m2.getRating()) return -1;
		if (m1.getRating() > m2.getRating()) return 1;
		else return 0;
	}
}

// Class to compare Movies by name
class NameCompare implements Comparator<MovieComparatorExample>
{
	public int compare(MovieComparatorExample m1, MovieComparatorExample m2)
	{
		return m1.getName().compareTo(m2.getName());
	}
}
 