import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethods{
	public static void main(String args[]){
		Collection<String> coll = new ArrayList<>();
		Collection<String> coll2 = new ArrayList<>();
		
		//add() method to add elements
		coll.add("First");
		coll.add("Second");
		coll.add("Third");
		coll.add("Fourth");
		
		coll2.add("Fifth");
		coll2.add("Sixth");
		
		//printing an collection
		//Iterator Interface
		Iterator itr = coll.iterator();
		while(itr.hasNext()){	//hasNext() method to checck if there is a next element
			System.out.println(itr.next());	//next() method to get next element
		}
		
		//addAll() method to add a collection to another
		coll.addAll(coll2);
		
		//remove() method to remove elements
		coll.remove("Fourth");
		
		//removeAll() method to remove a collection from another
		coll.removeAll(coll2);
		
		//removeIf() method to remove elements on the basis of a specific condition
		coll.removeIf(n -> (n == "Fourth"));
			
		//retainAll() method to delete all element except the ones given
		coll.retainAll(coll);
		
		//size() method to get size of collection
		System.out.println("Size is: "+coll.size());
		
		//isEmpty() method to check if the collection is empty
		if(coll.isEmpty())
			System.out.println("Collection is empty");
		else
			System.out.println("Collection is not empty");
		
		//contains() method to check if an element is in a collection
		System.out.println("Contains 'First':"+ coll.contains("First"));
		
		//containsAll() method to check if an element is in a collection
		System.out.println("Contains all:"+ coll.containsAll(coll2));
		
		//equals() method to compare two collection
		if(coll.equals(coll2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		
		//clear() method to clear an collection
		coll.clear();
		System.out.println("Size after clear(): "+coll.size());		
	}
}