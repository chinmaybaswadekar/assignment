package spring_evln_a;

public class Quest_14_circle implements Quest_14_shape {
 float pi;
 float radious;
public float getPi() {
	return pi;
}
public void setPi(float pi) {
	this.pi = pi;
}
public float getRadious() {
	return radious;
}
public void setRadious(float radious) {
	this.radious = radious;
}


public void sides() {
	System.out.println("this is side method");
}
public void area() {
	float area=pi*radious;
	System.out.println("area of circle :" +area);
}



	
}

