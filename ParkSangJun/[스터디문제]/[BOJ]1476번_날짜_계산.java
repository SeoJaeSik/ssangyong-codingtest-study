import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int e=1, s=1, m=1, year=1;
		
		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();
		
		while(true) {
			if(e==E && s==S&& m==M) {
				break;
			}			
			e++;
			s++;
			m++;
			if(e>15)
				e=1; 
			
			if(s>28)
				s=1;
			if(m>19)
				
				m=1; 
			
			year++; 
			
		}
		System.out.println(year);
		sc.close();
		
					
    }
}