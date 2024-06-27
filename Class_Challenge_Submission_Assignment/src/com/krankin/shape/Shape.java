package com.krankin.shape;

public class Shape {
	public String color;
	public double getArea() {
		return 0;
	}
}
class Rectangle extends Shape {
	public double height;
	public double width;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public double getArea() {
		return width * height;
	}
}
class Triangle extends Shape {
	public double base;
	public double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	public double getArea() {
		return 0.5 * base * height;
	}
	}
class Circle extends Shape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI * radius * radius;
	}

	public static void main(String[] args) {
			
		Rectangle rectangle = new Rectangle(20, 30);
			System.out.println("Rectangle Area: " + rectangle.getArea());
			
			Triangle triangle = new Triangle(6, 10);
			System.out.println("Triangle Area: " + triangle.getArea());
		
		Circle circle = new Circle(6);
		System.out.println("Circle Area: " + circle.getArea());
		
	}
}