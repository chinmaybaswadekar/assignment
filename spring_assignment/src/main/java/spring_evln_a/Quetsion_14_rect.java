package spring_evln_a;

public class Quetsion_14_rect implements Quest_14_shape {
float length;
float breadth;
public float getLength() {
	return length;
}
public void setLength(float length) {
	this.length = length;
}
public float getBreadth() {
	return breadth;
}
public void setBreadth(float breadth) {
	this.breadth = breadth;
}

public void area() {
	float area=length*breadth;
	System.out.println("area of rectangle :" +area);
}

public void sides() {
	System.out.println("sides of the rectangle :" +4);
}
}
