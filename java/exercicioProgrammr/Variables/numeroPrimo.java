import java.util.Scanner; 
 
class numeroPrimo { 
 
	public static void main(String[] args) { 
 
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Enter your input number:"); 
		int n = scanner.nextInt();
        
        //{ write your code here
        
        if (n%2==0 && n !=2) {
            System.out.println("Input number is not a prime number");
        }else {
            for (int i=3;i<n;i++) {
                if (n%i ==0) {
                    System.out.println("Input number is not a prime number");
                }
            }
            System.out.println("Input number is a prime number");
        }
        
        
        //}
} 
 
}
