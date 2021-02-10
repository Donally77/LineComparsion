import java.util.Scanner;
public class LinecomparisonUC2 {
        public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 and y1 values");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter x2 and y2 values");
                int x2 = sc.nextInt();
                int y2 = sc.nextInt();
		double length1 = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		System.out.println("length1: "+length1);


		System.out.println("Enter a1 and b1 values");
                int a1 = sc.nextInt();
                int b1 = sc.nextInt();
                System.out.println("Enter a2 and b2 values");
                int a2 = sc.nextInt();
                int b2 = sc.nextInt();
		double length2 = Math.sqrt(Math.pow(a2-a1,2)+Math.pow(b2-b1,2));
		System.out.println("length2: "+length2);
		if ( length1==length2)
			System.out.println("length is equal");
		else
			System.out.println("length is not equal");
        }
}
