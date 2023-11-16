class PrintTable {
  public static void main(String[] args) {
     System.out.println("a   a^2   a^3");
     System.out.println((1)+("   ")+(1*1)+("   ")+(1*1*1));
     System.out.println((2)+("   ")+(2*2)+("   ")+(2*2*2));
     System.out.println((3)+("   ")+(3*3)+("   ")+(3*3*3));
     System.out.println((4)+("   ")+(4*4)+("   ")+(4*4*4));
  }
}

  class ComputeArea {
  public static void main(String[] args) {
    double radius; // Declare radius
    double area; // Declare area

    // Assign a radius
    radius = 5.5; 

    // Compute area
    area = radius * radius * 3.14159;

    // Display results
    System.out.println("The area for the circle of radius " +
      radius + " is " + area);
  }
}

class AreaPerimeter {
  public static void main(String[] args) {
    double area;
    double perimeter;

    perimeter = 4.5 + 7.9;

    area = 4.5 * 7.9;

    System.out.println("The perimeter of the rectangle is " + perimeter + " and the area is " + area);
  }
}

class Speed {
  public static void main(String[] args) {
    double kmph;
    double miles;

    kmph = (14 * 45.5) / 60;
    miles = 1.6;

    System.out.println("The runner's average speed is " + kmph/miles + " mph.");


  }
}

class Speed2 {
  public static void main(String[] args) {
    double miles;
    double km;
    double hours;

    miles = 24;
    km = 1/1.6;
    hours = 1 + (40.583/60);

    System.out.println("The runner's average speed is " + (miles * km) / hours + " ");


  }
}