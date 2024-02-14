package com.demo;

public class Addition {

	public void add(int a, int b) {
		System.out.println(a + b);
	}
	public static void diplayOperation() {
		System.out.println("Addition");
	}
	public static void main(String[] args) {
		
		Addition a1 = new Addition();
		Addition.diplayOperation();
		a1.add(10, 20);
		Addition.diplayOperation();
		a1.add(10, 20);
		Addition.diplayOperation();
		a1.add(10, 20);
		Addition.diplayOperation();
		a1.add(10, 20);
		
	}

}



package com.demo;

public class Addition {

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		
		Addition a1 = new Addition();
		a1.add(10, 20);
	}

}

   n-1          (n-1)
-2       0   2          -1

-128   0 127

Character:
0-65535


package com.demo;

public class Addition {

	public static void main(String[] args) {

		System.out.println(Short.MAX_VALUE);
		System.out.println(Character.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);

	}

}
int
double
char 
boolean


package com.demo;

public class Addition {
	public static void main(String[] args) {
		System.out.println(10);
	}

}


public class Addition {
	public static void main(String[] args) {
		int a;
		System.out.println(a);
	}

}


Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The local variable a may not have been initialized
	at com.demo.Addition.main(Addition.java:9)


//concerte method
returntype methodName(){

}



package com.demo;

public class Addition {

	public int add(int a,int b) {
		int c=a+b;
		return c;
		
	}

	public static void main(String[] args) {

     Addition a = new Addition();
     int result  =a.add(10, 20);
     System.out.println("Result is :"+result);
		
	}

}


package com.demo;

public class Addition {

	public void add(int a, int b) {
		if (a > b) {
			return;
		} else {
			System.out.println(a+b);
		}

		System.out.println("Recched here");
	}

	public static void main(String[] args) {

		Addition a = new Addition();
		a.add(30, 20);
		

	}

}
