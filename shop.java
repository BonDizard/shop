
import java.util.Scanner;
 class Shop{

	public static void main(String[] args) 
		{
		// TODO Auto-generated method stub
		int ch;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name =scan.next();
		System.out.println("Enter your Email-ID :  ");
		String emailaddress = scan.next();
		String s1="mobile";
		System.out.println(1+ ". mobile");
		String s2="Laptop";
		System.out.println(2+ ". laptop");
		String s3="Electronic Appliances";
		System.out.println(3+ ". electronic appliance");
		String s4="Bike";
		System.out.println(4+ ". bike");
		System.out.println(" Enter your choice :" );
		ch=scan.nextInt();
		switch (ch)
		{
		case 1:
			System.out.println("Realme");
			System.out.println("Vivo");
			System.out.println("Oppo");
			System.out.println("Samsung");
			System.out.println("Apple iphone");
			break;
		case 2:
			System.out.println("Hewlett-packard(HP)");
			System.out.println("Apple(MACBOOk)");
			System.out.println("Microsoft");
			System.out.println("Dell");
			System.out.println("Lenovo");
	    		break;
	    case 3:
	    		System.out.println("Blender");
			System.out.println("Microwave");
			System.out.println("Freezer");
			System.out.println("Toaster");
			System.out.println("Juicer");
	    		break;
	    case 4:
	    		System.out.println("Bullet");
			System.out.println("Ktm");
			System.out.println("Revolt RV400");
			System.out.println("Passion");
			System.out.println("Dio");
	    		break;
	    default:
	    		System.out.println("Thank you for visiting and for you precious time..... !!! ");
	    		
		}
	}
}