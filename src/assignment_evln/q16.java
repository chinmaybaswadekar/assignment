package assignment_evln;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class q16 {
	// item name, price, date of manufacturing, date of expiring, category name. 
	String itemname;
	float price;
	LocalDate dom;
	LocalDate doe;
	String Category_name;
	
	
	public q16() {
		super();
	}

	public q16(String itemname, float price, LocalDate dom, LocalDate doe, String category_name) {
		super();
		this.itemname = itemname;
		this.price = price;
		this.dom = dom;
		this.doe = doe;
		Category_name = category_name;
		
		
	}
	
	@Override
	public String toString() {
		return "Category [itemname=" + itemname + ", price=" + price + ", dom=" + dom + ", doe=" + doe
				+ ", Category_name=" + Category_name + "]";
	}

	public static void main(String[] args) {
		List <q16> ct=new ArrayList<q16>();
		ct.add(new q16("ball", 50.0f, 	LocalDate.of(2021, 9, 15), LocalDate.of(2023,10, 30), "toys"));
		ct.add(new q16("pen", 10.0f, 	LocalDate.of(2020, 4, 5), LocalDate.of(2024,12, 12), "study_material"));
		ct.add(new q16("laptop",50000.0f,LocalDate.of(2019, 10, 22), LocalDate.of(2020,2, 28), "electronics"));
		ct.add(new q16("shirt", 500.0f, 	LocalDate.of(2018, 5, 17), LocalDate.of(2021,8, 20), "clothing"));
		ct.add(new q16("paracetomol", 100.0f, 	LocalDate.of(2015, 6, 11), LocalDate.of(2017,3, 13), "pharma"));
		
		
	 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter category name:");
         sc=new Scanner(System.in);
         String cn=sc.next();
         
         //category wise printing itemdetails
         Set<q16>cd=ct.stream().filter(e->e.Category_name.equals(cn)).map(n->n).collect(Collectors.toSet());
         System.out.println(cd);
         
         //itemdetails basis of first letter of itemname
         System.out.println("Enter starting character of itemname:");
         sc=new Scanner(System.in);
         String Sc=sc.next();
         
         Set<q16>id=ct.stream().filter(e->e.itemname.startsWith(Sc)).map(n->n).collect(Collectors.toSet());
         System.out.println(id);
         
         
        
         
        //date wise itemdetails
         DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now=LocalDateTime.now();
       
        
        System.out.println("Enter date:");
         sc=new Scanner(System.in);
        String dt=sc.next();
        Set<q16>iu=ct.stream().filter(e->e.dom.equals(dt)).map(n->n).collect(Collectors.toSet());
       System.out.println(iu);

       //price wise itemdetails
         System.out.println("Enter price:");
         sc=new Scanner(System.in);
         Float ie=sc.nextFloat();
         
       
         Set<q16>u=ct.stream().filter(e->e.price==ie).map(n->n).collect(Collectors.toSet());
          System.out.println(u);
	}}
	
	

