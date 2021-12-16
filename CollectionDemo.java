import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("Apple");
		list.add("Google");
		list.add("Oracle");
		list.add(2,"Microsoft");
		
		System.out.println("---Traversing over Arraylist using for..loop");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
				
		System.out.println("--Traversing over ArrayList usin iterator");
		Iterator<String>itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
			
		System.out.println("--Traversing over ArrayList using for..each");
		for(String s:list)
			System.out.println(s);
		
		LinkedList<String>link=new LinkedList<String>();
		link.add("Tesla");
		link.addFirst("Apache");
		link.add("Apple");
		link.add("Meta");
		
		list.addAll(link); //Mapping linked list into Arraylist
		System.out.println("---Traversing over updated arraylist using for..each");
		for(String s:list)
			System.out.println(s);
		
		//Convert Arraylist into hashset
		HashSet<String>set=new HashSet<String>(list);
		System.out.println("-- Traversing over Set");
		for (String elem : set) 
			System.out.println(elem);
		
		TreeSet<String> tree = new TreeSet<String>(set);
		System.out.println("-- Traversing over TreeSet");
		for (String elem : tree) 
			System.out.println(elem);
	}

}