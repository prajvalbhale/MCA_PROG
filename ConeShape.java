package com.prajval.JAVA;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	abstract class ConeShape{
		 abstract public void calc_area();
		 abstract public void calc_volume();
		 final float pi=3.14f;
		}
	
	class Cone extends ConeShape{
		 double h,r,area,volume;

		 public void accept() throws IOException{
		  System.out.println("ENTER RADIUS & HEIGHT OF CONE :--> ");
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  r=Double.parseDouble(br.readLine());
		  h=Double.parseDouble(br.readLine());
		 }
		 
		 public void calc_area(){ 
		  double sq=h*h+r*r;
		  area=pi*r*(r+java.lang.Math.sqrt(sq));
		 }
		 
		 public void calc_volume(){
		  double d=h/3;
		  volume=pi*r*r*d;
		 }
		 
		 public void display(){
		  calc_area();
		  calc_volume();
		  System.out.println("The area of Cone is: "+area);
		  System.out.println("The volume of Cone is: "+volume);
		 }
	
	public static void main(String [] args)throws IOException{
		  
		Cone co = new Cone();
		co.accept();
		co.display();		  
		 }
}
