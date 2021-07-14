package learning.collections.maps;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

class Dog3 {
String color;

Dog3(String c) {
color = c;
}

public boolean equals(Object o) {
return ((Dog3) o).color == this.color;
}

public int hashCode() {
return color.length();
}

public String toString(){
return color + " dog";
}
}

public class LinkedHashMapTest {
public static void main(String[] args) {

	Dog3 d1 = new Dog3("red");
Dog3 d2 = new Dog3("black");
Dog3 d3 = new Dog3("white");
Dog3 d4 = new Dog3("white");

LinkedHashMap<Dog3, Integer> linkedHashMap = new LinkedHashMap();
linkedHashMap.put(d1, 10);
linkedHashMap.put(d2, 15);
linkedHashMap.put(d3, 5);
linkedHashMap.put(d4, 20);

for (Entry entry : linkedHashMap.entrySet()) {
System.out.println(entry.getKey() + " - " + entry.getValue());
}
}
}
