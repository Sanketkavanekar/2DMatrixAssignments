import java.util.*;
class transposematrix{
    public static void main(String args[]){
		Scanner st=new Scanner (System.in);
		int a[][]=new int [3][3];
		int b[][]=new int[3][3];
		
		System.out.println("enter a:");
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				a[i][j]=st.nextInt();
			}
		}
	    for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				
				b[j][i]=a[i][j];
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(b[i][j]+" ");
			}
		System.out.println();
		}
	}
}