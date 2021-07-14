package learning.comparison_example;

import java.util.ArrayList;
import java.util.Collections;

// Driver class
class ExecuteComparison
{
	public static void main(String[] args)
	{
		comparable();
		comparator();
		 
			
	 
	}
	
	public static void comparable() {
		System.out.println("############## comparable ######################");
		ArrayList<MovieComparableExample> list = new ArrayList<MovieComparableExample>();
		list.add(new MovieComparableExample("Force Awakens", 8.3, 2015));
		list.add(new MovieComparableExample("Star Wars", 8.7, 1977));
		list.add(new MovieComparableExample("Empire Strikes Back", 8.8, 1980));
		list.add(new MovieComparableExample("Return of the Jedi", 8.4, 1983));

		Collections.sort(list);

		System.out.println("Movies after sorting : ");
		for (MovieComparableExample movie: list)
		{
			System.out.println(movie.getName() + " " +
							movie.getRating() + " " +
							movie.getYear());
		}
		
	}
	
	public static void comparator() {
		System.out.println("############## comparator ######################");
		ArrayList<MovieComparatorExample> list = new ArrayList<MovieComparatorExample>();
		list.add(new MovieComparatorExample("Force Awakens", 8.3, 2015));
		list.add(new MovieComparatorExample("Star Wars", 8.7, 1977));
		list.add(new MovieComparatorExample("Empire Strikes Back", 8.8, 1980));
		list.add(new MovieComparatorExample("Return of the Jedi", 8.4, 1983));

		// Sort by rating : (1) Create an object of ratingCompare
		//				 (2) Call Collections.sort
		//				 (3) Print Sorted list
		System.out.println("Sorted by rating");
		RatingCompare ratingCompare = new RatingCompare();
		Collections.sort(list, ratingCompare);
		for (MovieComparatorExample movie: list)
			System.out.println(movie.getRating() + " " +
							movie.getName() + " " +
							movie.getYear());


		// Call overloaded sort method with RatingCompare
		// (Same three steps as above)
		System.out.println("\nSorted by name");
		NameCompare nameCompare = new NameCompare();
		Collections.sort(list, nameCompare);
		for (MovieComparatorExample movie: list)
			System.out.println(movie.getName() + " " +
							movie.getRating() + " " +
							movie.getYear());

		// Uses Comparable to sort by year
		System.out.println("\nSorted by year");
		Collections.sort(list);
		for (MovieComparatorExample movie: list)
			System.out.println(movie.getYear() + " " +
							movie.getRating() + " " +
							movie.getName()+" ");
	}
	}
 
