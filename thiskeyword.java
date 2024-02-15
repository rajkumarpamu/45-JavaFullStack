
this keyword:
------------

this  refers to current class object  -Employee
this is a reference variable that refers to current class object 

Employee emp = new Employee();


package com.demo;

this reference on varibales:
----------------------------

public class Employee {
	int a;
	int b;
	public void add(int a, int b) {
		this.a= a;
		this.b = b;
		System.out.println(a + b);
	}
	public void sub() {
		System.out.println(x - y);
	}
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.add(10, 20);
		emp.sub();
	}
}

package com.demo;
public class Employee {
	
	public Employee() {
		this(10);
		System.out.println("Employee cons is called");
	}
	
	public Employee(int a) {
		System.out.println("Employee cons is called of a:"+a);
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();

	}

}


package com.demo;
public class Employee {
	
	public Employee() {
		
		System.out.println("Employee cons is called");
		this(10);
	}
	
	public Employee(int a) {
		System.out.println("Employee cons is called of a:"+a);
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();

	}

}


Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Constructor call must be the first statement in a constructor

	at com.demo.Employee.<init>(Employee.java:7)
	at com.demo.Employee.main(Employee.java:15)



package com.demo;
public class Employee {
	
	public Employee() {
		this(10);
		this(10.9);
		System.out.println("Employee cons is called");
	}
	
	public Employee(int a) {

		System.out.println("Employee cons is called of a:"+a);
	}
	
	public Employee(double a) {
		System.out.println("Employee cons is called of a:"+a);
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();

	}

}



Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Constructor call must be the first statement in a constructor

	at com.demo.Employee.<init>(Employee.java:6)
	at com.demo.Employee.main(Employee.java:20)

package com.demo;
public class Employee {
	
	int a=10;
	public void test() {
		int a=20;
		System.out.println(a);
		System.out.println(this.a);
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.test();

	}

}



package com.demo;
public class Employee {
	
	
	public void m1() {
		this.m2();
		System.out.println("we are in m1");
	}
 
	public void m2() {
		System.out.println("we are in m2");
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.m1();

	}

}


package com.demo;
public class Employee {
	
	int a;
	int b;
	
	public Employee() {
		this.a=10;
		this.b=20;
	}
	
	public Employee m1() {
		return this;
	}
 
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		Employee emp1 = emp.m1();
		System.out.println(emp1.a);
		System.out.println(emp1.b);
		

	}

}


package com.demo;

public class Employee {

	int a;
	int b;

	public Employee() {
		a = 10;
		b = 20;
	}

	public Employee m1() {
		return m2(this);
	}

	public Employee m2(Employee emp) {
		return emp;
	}

	public static void main(String[] args) {
		Employee emp = new Employee();

		Employee emp1 = emp.m1();
		System.out.println(emp1.a);
		System.out.println(emp1.b);

	}

}


package com.demo;

public class Employee {

	int a;
	int b;

	public Employee() {
		this(this)
		a = 10;
		b = 20;
	}
	

	public Employee(Employee emp) {
		System.out.println(emp.a);
		System.out.println(emp.b);
	}



	public static void main(String[] args) {
		Employee emp = new Employee();



	}

}


Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	Cannot refer to 'this' nor 'super' while explicitly invoking a constructor
	Syntax error on token ")", ; expected after this token

	at com.demo.Employee.<init>(Employee.java:9)
	at com.demo.Employee.main(Employee.java:23)


