import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String, String>();
		map.put("jack", "jill");
		map.put("scott", "tiger");
		map.put("polo", "lili");
		map.put("jack", "rose");
		
		System.out.println("Scott: "+map.get("scott"));
		System.out.println("polo: "+map.get("polo"));
		System.out.println("jack: "+map.get("jack"));
		
		//scott = tiger
		for(String i: map.keySet())
		System.out.println(i + " = " + map.get(i));
	}
}