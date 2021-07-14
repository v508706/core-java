package learning.Java10Features;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Bruce");
		names.add("Wayne");
		List<String> copyOfNames = List.copyOf(names);
		doNotChange(copyOfNames); // java.lang.UnsupportedOperationException at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:127)
		System.out.println(copyOfNames);
	}

	private static void doNotChange(List<String> names) {
		names.add("Mani");
	}
	
}
