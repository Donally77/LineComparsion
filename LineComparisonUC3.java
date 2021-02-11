import java.util.Scanner;
public class LinecomparisonUC3 {
        public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 and y1 values");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter x2 and y2 values");
                int x2 = sc.nextInt();
                int y2 = sc.nextInt();
		double len1 = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		System.out.println("len1: "+len1);


		System.out.println("Enter a1 and b1 values");
                int a1 = sc.nextInt();
                int b1 = sc.nextInt();
                System.out.println("Enter a2 and b2 values");
                int a2 = sc.nextInt();
                int b2 = sc.nextInt();
		double len2 = Math.sqrt(Math.pow(a2-a1,2)+Math.pow(b2-b1,2));
		System.out.println("len2: "+len2);
		if ( len1==len2)
			System.out.println(len1+" is equal to"+ len2);
		else if (len1 > len2)
			System.out.println(len1+" is greater than"+ len2);
		else if(len2 > len1)
			 System.out.println(len2 +"is greater than"+ len1);
		else
			System.out.println("length is not equal");

        }
}
