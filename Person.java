package com.assignment2.oops;

import java.util.Comparator;

public class Person {

	
	public static void main(String[] args) {

		
		personDetails[] pd=new personDetails[9];
		pd[0]=new personDetails("neha", 25, 67000);
		pd[1]=new personDetails("anup", 28, 670000);
		pd[2]=new personDetails("nhes", 29, 697000);
		pd[3]=new personDetails("vbgt", 20, 7000);
		
		System.out.println(pd.toString());
		
		/*for (personDetails i : pd) {
			System.out.println(i + " " +i.name + " "+ i.age + " " + i.salary);

		}*/
		
		System.out.println("----------------");
		
		//Collections.sort(list,new SalaryComparator());
		
		
		/*Comparator<personDetails> Abcd  = new Comparator<personDetails>() {

			@Override
			public int compare(personDetails o1, personDetails o2) {
				return (o1.salary > o2.salary ? 1 : -1);
			}
		};
	    Arrays.sort(list, Abcd);
		for (personDetails i : list) {
			System.out.println(i + " " +i.name + " "+ i.age + " " + i.salary);

		}*/


	}

}

class personDetails implements Comparator<personDetails> {
	String name;
	int age;
	int salary;
	
	public personDetails() {
		
	}
	public personDetails(String name,int age,int salary) {

		this.name=name;
		this.age=age;
		this.salary=salary;
		
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int compare(personDetails o1) {
		// TODO Auto-generated method stub
		return this.age - o1.age ;
	}
	@Override
	public String toString() {
		return "personDetails [name=" + this.name + ", age=" + this.age + ", salary=" + this.salary + "]";
	}
	@Override
	public int compare(personDetails o1, personDetails o2) {
		// TODO Auto-generated method stub
		return o1.salary-o2.salary;
	}
	

	
}

class SalaryComparator implements Comparator<personDetails>{
	@Override
	public int compare(personDetails o1, personDetails o2) {

		if(o1.salary==o2.salary) {
			return 0;
		}
		else if( o1.salary> o2.salary) {
			return 1;
		}else
			return -1;
	}
}