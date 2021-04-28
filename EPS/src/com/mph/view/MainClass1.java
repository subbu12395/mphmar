package com.mph.view;

public class MainClass1 {


		int y=150;
		static int z=200;
		public void display()
		{
			System.out.println("display hii");
		}
		public int sum()
		{
			System.out.println("from the sum");
			return (2+3);
		}
		
		public static void main(String[] args){
			int x=100;
			System.out.println("Hello"+100);
			System.out.println("static variable:"+z);
			
			MainClass1 m = new MainClass1(); //Instantiation of class
			System.out.println("Instance Variable"+m.y);
			
			m.display();
			System.out.println(m.sum());
		}

	}


