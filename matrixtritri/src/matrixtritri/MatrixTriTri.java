package matrixtritri;
//in this program the user will enter inputs to fill in a matrix 3x3
//then it will be returned how many of the inputs/elements are bigger than 10 
import java.util.Locale;
import java.util.Scanner;
public class MatrixTriTri {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner(System.in);		
		int matrixA[][]= new int [3][3], l, c, b=0; //l: line    c: column   b: controller to check if an element is bigger than 10
		for(l=0;l<3;l++) {
			for(c=0;c<3;c++) {
				System.out.printf("Enter the element X[%d][%d] ",(l+1),(c+1));
				matrixA[l][c] = kb.nextInt();
				if(matrixA[l][c]>=10) {
					b++;
			}
		}
}
		System.out.printf("\n%d elements in the matrix are bigger than 10!",b);
		kb.close();
}
}