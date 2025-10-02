import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner circ = new Scanner(System.in);

    Circle circ1 = new Circle(10.1);
    Circle circ2 = new Circle(14.0);
    Circle circ3 = new Circle(20.5);

    System.out.println(circ1.toString());
    System.out.println(circ2.toString());
    System.out.println(circ3.toString());

    Scanner rec = new Scanner(System.in);
    double LenWid = 0;
    double Len = 0;
    double Wid = 0;

    System.out.println("Give me length and width, one number");
    LenWid = rec.nextDouble();

    System.out.println("Give me a length");
    Len = rec.nextDouble();

    System.out.println("Give me a width");
    Wid = rec.nextDouble();

    Rectangle rec1 = new Rectangle(LenWid);
    Rectangle rec2 = new Rectangle(Len, Wid);

    System.out.println(rec1.toString());
    System.out.println(rec2.toString());

    Scanner poly = new Scanner(System.in);
    double SideLen = 0;
    int num = 0;

    System.out.println("Give me a side length");
    SideLen = poly.nextDouble();
    System.out.println("Give me sides");
    num = poly.nextInt();

    RegularPolygon poly1 = new RegularPolygon(SideLen);
    RegularPolygon poly2 = new RegularPolygon(num, SideLen);
    System.out.println(poly1.toString());
    System.out.println(poly2.toString());

    System.out.print("Skibidi Rizz");
  }
}
