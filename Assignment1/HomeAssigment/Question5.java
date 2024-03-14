import java.util.Random;
import java.util.Scanner;
public class  Question5 {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int[][] m = new int[4][4];
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = rand.nextInt(2); 
            }
        }
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
		int maxRowIndex = 0;
		int max = 0;
		for (int i = 0; i < m.length; i++) {
			int count = 0;
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 1)
					count++;
			}
			if (count > max) {
				max = count;
				maxRowIndex = i;
			}
		}
	
		int maxColumnIndex = 0;
        int maxs=0;
		for (int col = 0; col < m[0].length; col++) {
			int count = 0;
			for (int row = 0; row < m.length; row++) {
				if (m[row][col] == 1)
					count++;
			}
			if (count > maxs) {
				maxs = count;
				maxColumnIndex = col;
			}
		}
		System.out.println("The largest row index: " + maxRowIndex);
		System.out.println("The largest row column: " + maxColumnIndex);

	}
}