import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int total = 0;
		int N = Integer.parseInt(br.readLine());
		
		boolean[][] arr = new boolean [101][101]; // int 생각햇엇는데 boolean으로 방문판별
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for(int j = x; j < x+10; j++) {
				for(int k = y; k < y+10; k++) {
					if(arr[j][k] == false) {
						arr[j][k] = true;
						total ++;
					}
				}
			}
			
		}
		System.out.println(total);
	}

}
