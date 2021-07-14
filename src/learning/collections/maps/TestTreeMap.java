package learning.collections.maps;

import java.util.Map.Entry;
import java.util.TreeMap;

class Dog2 implements Comparable<Dog2>{
String color;
int size;

Dog2(String c, int s) {
color = c;
size = s;
}

public String toString(){
return color + " dog";
}

@Override
public int compareTo(Dog2 o) {
return  this.size-o.size;
}
}

public class TestTreeMap {
public static void main(String[] args) {
	Dog2 d1 = new Dog2("red", 30);
	Dog2 d2 = new Dog2("black", 20);
	Dog2 d3 = new Dog2("white", 10);
	Dog2 d4 = new Dog2("white", 10);

TreeMap<Dog2, Integer> treeMap = new TreeMap();
treeMap.put(d1, 10);
treeMap.put(d2, 15);
treeMap.put(d3, 5);
treeMap.put(d4, 20);

for (Entry entry : treeMap.entrySet()) {
System.out.println(entry.getKey() + " - " + entry.getValue());
}
}
}