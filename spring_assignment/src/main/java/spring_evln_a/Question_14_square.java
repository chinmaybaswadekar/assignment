package spring_evln_a;

public class Question_14_square implements Quest_14_shape{
float side1;
float side2;
public float getSide1() {
	return side1;
}
public void setSide1(float side1) {
	this.side1 = side1;
}
public float getSide2() {
	return side2;
}
public void setSide2(float side2) {
	this.side2 = side2;
}
public void area() {
	float area=side1*side2;
}

public void sides() {
	System.out.println("sides of quare is :" +4);
}
}
