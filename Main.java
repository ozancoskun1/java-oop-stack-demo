package Examples;

import java.util.ArrayList;

import OOP_giris.Araba;


public class Main {

	public static void main(String[] args) {
		MyStack myStack= new MyStack();
		Araba carOne= new Araba();
		carOne.setMarka("Opel");
		carOne.setModel("Corsa");
		carOne.setYil(2015);
		carOne.setFiyat(780000);
		myStack.push(carOne);
		
		Araba carTwo= new Araba();
		carTwo.setMarka("Audi");
		carTwo.setModel("A3 ");
		carTwo.setYil(2019);
		carTwo.setFiyat(2100000);
		myStack.push(carTwo);
		
		Araba carThree= new Araba();
		carThree.setMarka("Fait");
		carThree.setModel("Egea");
		carThree.setYil(2021);
		carThree.setFiyat(780000);
		myStack.push(carThree);
		
		Araba carFour= new Araba();
		carFour.setMarka("Ford");
		carFour.setModel("Taunus");
		carFour.setYil(1995);
		carFour.setFiyat(325000);
		myStack.push(carFour);
		
		myStack.show();

	}

}
class MyStack{
	private ArrayList<Object> list;
	public MyStack() {
		list = new ArrayList<>();
	}
	public int howManyElement() {
		return list.size();
	}
	public boolean isItEmpty() {
		return list.isEmpty();
	}
	public Object showElement() {
		return list.get(howManyElement()-1);	
		}
	public Object pop() {
		Object employeeToBeReturned = list.get(howManyElement()-1);
		list.remove(howManyElement()-1);
		return employeeToBeReturned;
	}
	public void push(Object elementToBeAdded) {
		list.add(elementToBeAdded);
	}
	public void show() {
		System.out.println("Stack Content");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}