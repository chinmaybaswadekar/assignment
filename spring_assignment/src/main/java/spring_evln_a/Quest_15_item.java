package spring_evln_a;
/*WAP in which three beans need to be created item, category and customer. Category 
injected in item and item injected in customer. Now print all item purchased by customer.*/

public class Quest_15_item {
	int id;
	String iname;
	int price;
	Category cat;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Category getCat() {
		return cat;
	}
	public void setCat(Category cat) {
		this.cat = cat;
	}
	
	

}
