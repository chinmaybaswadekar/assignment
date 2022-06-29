package assignment_evln;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;



public class q6_7 {

	int itemid;
	String itemname;
	Double itemprice;



	public q6_7(int itemid, String itemname, Double itemprice) {
		super();
		this.itemid = itemid;
		this.itemname = itemname;
		this.itemprice = itemprice;

	}



	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", itemname=" + itemname + ", itemprice=" + itemprice + "]";
	}



	public static void main(String[] args) 
	{
		List<q6_7>fd=new ArrayList<q6_7>();
		fd.add(new q6_7(1,"mobile",12000.0d));
		fd.add(new q6_7(2,"headphone",1000.0d));
		fd.add(new q6_7 (3,"charger",3000.9d));
		fd.add(new q6_7(4,"smartwatch",5000.0d));

		Double gfare = fd.stream().collect(Collectors.averagingDouble(sl->sl.itemprice));
		System.out.println("avg price " +gfare);
		
		q6_7 it=fd.stream().min((c1,c2)->c1.itemprice.compareTo(gfare)).get();
		System.out.println("lowest item price is : " + it.itemname);
		
		Set<String> id=fd.stream().filter(e->e.itemprice%2==0).map(p->p.itemname).collect(Collectors.toSet());
		System.out.println("even prices from the list is : " +id);
		
		List<String> ap=fd.stream().filter(e->e.itemprice<gfare).map(p->p.itemname).collect(Collectors.toList());
		System.out.println((ap));

} 
}