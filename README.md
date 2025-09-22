[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=20643166)
# unit-2-5-assignment

## API and Documentation
Documentation for the shape classes can be found [here](https://coderunner.projectstem.org/docs/shapes/index.html).

## Git Config
```
git config user.name "user"
git config user.email "email"
```

## Compiling and Running Java Programs
Note that since the shape classes are separate classes, you will need to compile ALL the files (at least one time).  You can do this by running
```
javac *.java
```
The star means to compile every file that is a Java file type.

Run your code by running
```
java Main.java
```

After you compile the shape classes, you only need to compile and run `Main.java` as usual.

## Problem 1
[Look at the documentation for the `Circle` class here.](https://coderunner.projectstem.org/docs/shapes/index.html)

Write code which creates three circles with radius 10.1, 14 and 20.5 respectively. The code should then print the three circles, one on each line, in the order given (i.e. the one with radius 10.1 first and the one with radius 20.5 last). To print the results, use the `toString()` method for the `Circle` class.

For example
```java
Circle circ1 = /* code not shown */
System.out.println(circ1.toString());  // produces desired output

// alternatively
String output = circ1.toString();
System.out.println(output);
```

Sample run:
```
circle with radius 10.1
circle with radius 14.0
circle with radius 20.5
```

## Problem 2
[Look at the documentation for the `Rectangle` class here.](https://coderunner.projectstem.org/docs/shapes/index.html)

Write code which takes three decimal inputs from the user, creates a rectangle with length and width equal to the first input and a rectangle with length and width equal to the second and third input respectively, then prints both of these shapes. To print the results, use the `toString()` method for the `Rectangle` class. 

Sample run:
```
Type a number for length and width:
2.6
Type a length:
10.4
Type a width:
28.9
rectangle with length 2.6, width 2.6
rectangle with length 10.4, width 28.9
```
## Problem 3
[Look at the documentation for the `RegularPolygon` class here.](https://coderunner.projectstem.org/docs/shapes/index.html)

Write code which asks for a side length from the user and creates an equilateral triangle and square with that length. The output that you are printing must utilize the `toString` method inside `RegularPolygon` Class.

Sample run:
```
Type a side length:
7.5
equilateral triangle with side length 7.5
square with side length 7.5
```
Hint: Make sure you use the right data types when taking user input.

## Sample Solutions
```java
import java.util.Scanner;

public class Prob1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// Part A
		System.out.println("Problem 1\n");
		
		Circle c1 = new Circle(10.1);
		Circle c2 = new Circle(14.0);
		Circle c3 = new Circle(20.5);

		System.out.println(c1.toString() + "\n" + c2.toString() + "\n" + c3.toString());

		// Part B
		System.out.println("\nProblem 2\n");

		double lenWid;
		double len;
		double wid;
		Rectangle r1;
		Rectangle r2;

		System.out.println("Type a number for length and width:");
		lenWid = sc.nextDouble();
		
		System.out.println("Type a length:");
		len = sc.nextDouble();

		System.out.println("Type a width:");
		wid = sc.nextDouble();

		r1 = new Rectangle(lenWid);
		r2 = new Rectangle(len, wid);

		System.out.println(r1.toString() + "\n" + r2.toString());

		// Part C
		System.out.println("\nProblem 3\n");

		double side;
		RegularPolygon rp1;
		RegularPolygon rp2;
		
		System.out.println("Type a side length:");
		side = sc.nextDouble();

		rp1 = new RegularPolygon(side);
		rp2 = new RegularPolygon(4, side);

		System.out.println(rp1.toString() + "\n" + rp2.toString());
	}
}
```
