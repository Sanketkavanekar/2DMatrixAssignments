import java.util.*;
class Additionmatrix{
    public static void main(String args[]){
		Scanner st=new Scanner (System.in);
		int a[][]=new int [3][3];
		int b[][]=new int [3][3];
		int AplusB[][]=new int [3][3];
		
		System.out.println("enter  a");
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				a[i][j]=st.nextInt();
			}
		}
		System.out.println("enter  b:"); 
		
		for(int i=0;i<3;i++ ){
			for(int j=0;j<3;j++){
				b[i][j]=st.nextInt();
			}
		}
		
		
		for(int i=0;i<3;i++ ){
			for(int j=0;j<3;j++){
				AplusB[i][j]=a[i][j] + b[i][j] ;
			}
		}
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(AplusB[i][j]+" ");
			}
		System.out.println();
		}

}
}