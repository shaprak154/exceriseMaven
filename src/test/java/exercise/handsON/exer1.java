package exercise.handsON;

import java.util.ArrayList;
import java.util.Iterator;

public class exer1 {

	public static void main(String[] args) {

ArrayList<String> arr = new ArrayList<String>();

ArrayList<Integer> arint = new ArrayList<Integer>();

arr.add("holla");
arr.add("HENRY");
arr.add("walter");


Iterator<String> it = arr.iterator();

while (it.hasNext())
{
	String rss = it.next();
	System.out.println(rss);
	
	
}
		
		

	}

}
