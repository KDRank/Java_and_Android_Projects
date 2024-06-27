package com.krankin.dog;

public class Dog {
	private String breed;
	private String color;
	private int height;
	private int weight;

	public Dog(String breed, String color, int height, int weight) {
	this.breed = breed;
	this.color = color;
	this.height = height;
	this.weight = weight;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	void shake(int height) {
		if (height > 1) {
			System.out.println("Good boy!");
		} else {
			System.out.println("Shake!");
		}
	}
	
	void sit(int weight) {
		if (weight == 60) {
			System.out.println("Good boy!");
		} else {
			System.out.println("Sit!");
		}
	}
	
	void layDown(int height) {
		if (height == 2) {
			System.out.println("Sleepy boy!");
		} else {
			System.out.println("Go lay down!");
		}
	}
	
	public static void main(String[] args) {
		Dog dog1 = new Dog("Hound", "Brown", 2, 60);
		
		System.out.println("The " + dog1.getBreed() + " is " + dog1.getColor() + ", " + dog1.getHeight() + "ft tall, and weighs " + dog1.getWeight() + " pounds." );
		dog1.shake(2);
		dog1.sit(60);
		dog1.layDown(2);
	}
}