import java.util.Scanner;

//1
class temperature{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in degrees celcius");
        double temperature = input.nextDouble();
        double farenheit = (9.0/5) * temperature + 32;
        
        System.out.println(farenheit);

    

    }
}
//2
class volume{
    public static void main(String[] args) {
        Scanner scanRadius = new Scanner(System.in);
        Scanner scanLength = new Scanner(System.in);

        System.out.print("Enter radius");
        double radius = scanRadius.nextDouble();
        System.out.print("Enter length");
        double length = scanLength.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.println(("The area is ") + area + ("The volume is ") + volume);

    }
}
//3
class feet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length in feet:");
        double feet = input.nextDouble();
        double meters = feet / 3.281;
        
        System.out.println(meters);
    }
}
//4
class lb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds:");
        double lb = input.nextDouble();
        double kg = lb / 2.205;
        
        System.out.println(kg);
    }
}
//5
class tips{
    public static void main(String[] args) {
        Scanner inputS = new Scanner(System.in);
        Scanner inputG = new Scanner(System.in);

        System.out.print("Enter Subtotal:");
        double subtotal = inputS.nextDouble();
        System.out.print("Enter Gratuity rate:");
        double rate = inputG.nextDouble();

        double gratuity = subtotal * (rate/100);
        double total = subtotal + gratuity;

        System.out.println(("The gratuity is ") + gratuity + ("The total is ") + total);

    }
}
//6
class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number (1-999):");
        int number = input.nextInt();

        int digit = number % 10;
        int digits = number/10;
        int digits1 = digits %10;
        int digit1 = digits/10;

        System.out.println(digit);
        System.out.println(digit1);
        System.out.println(digits1);

        int sum = digit + digit1  + digits1;

        System.out.println(sum);
    }
}
//7
class years {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes:");
        int minutes = input.nextInt();


        int year = minutes / 525600;
        int remainingMinutes = minutes % 525600;
        int day = remainingMinutes / 1440;

System.out.println(minutes + " minutes is approximately " + year + " years and " + day + " days.");

    }
}
//8
class heat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount of water in kilograms: ");
		double kilograms = input.nextDouble();
		
		System.out.print("Enter the initial temperature: ");
		double initialTemperature = input.nextDouble();
	
		System.out.print("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();

		double energy = kilograms * (finalTemperature - initialTemperature) * 4184;

		System.out.println("The energy needed is " + energy);
    }
}

//9
class saving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		System.out.print("Enter monthly savings: ");
		double saving = input.nextDouble();
		
	
		double m1 = 100 * (1 + 0.00417);
        double m2 = (100 + m1) * (1 + 0.00417);
        double m3 = (100 + m2) * (1 + 0.00417);
        double m4 = (100 + m3) * (1 + 0.00417);
        double m5 = (100 + m4) * (1 + 0.00417);
        double m6 = (100 + m5) * (1 + 0.00417);
        


		System.out.println("The total value of savings after six months is " + m6);
    }
}
//10
class bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in lb:");
        double pounds = input.nextDouble();
        System.out.println("Enter height in inches:");
        double inches = input.nextDouble();

        double kg = pounds * 0.45359237;
        double meters = inches * 0.0254;

        double bmi = kg / (meters * meters);

        System.out.println("your bmi is " + bmi);

    }
}