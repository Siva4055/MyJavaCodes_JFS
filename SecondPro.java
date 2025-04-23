package com.learn.java;

import com.impo.java.Trans;    // to import write package name and class name to import

public class SecondPro {
       int id=5;       //instance variable
       static float marks=67.5f; //static variable
       public static void main(String[] args) {
		char grade='A';                     // instance variable
		SecondPro obj=new SecondPro();
		Trans t = new Trans();
		System.out.println(grade);
		System.out.println(obj.id);
		System.out.println(marks);        
		System.out.println(Trans.rollNo);      // static variable imported from Trans class by import package 
		System.out.println(Trans.name);        //as same as rollNo variableit is imported
        System.out.println(t.number);        // instance  variable imported from Trans class by import method
	}
}
