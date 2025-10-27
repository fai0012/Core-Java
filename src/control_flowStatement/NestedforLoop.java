package control_flowStatement;

public class NestedforLoop {
public static void main(String[]args) {
	
	int aaa[][] = {{2,7,9},{3,6,1},{7,4,2}};
	
	for(int i = 0; i<3; i++) {
	for(int l=0; l<3; l++) {
			System.out.print(aaa[i][l]+ " ");
		}
		System.out.println();
	}
}
}