package com.swarna.cj.basics;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1
		  for(int i=1;i<=3;i++){
			  System.out.print(i++);
			 }
//13
		*/
		
		/* 2
		 * int i;
		 for(i=1;i<=3;i++);
		  System.out.print(i+" ");
		  //4
*/
		/*  3
		 int i;
		  for(i=1;i<=3;i++)
		   System.out.print(i+" ");
		   
		   1 2 3
		   */
		
		/*4
		  for(int i=1,j=2;i<=2;i++,j--){
			  System.out.println(i+" "+j--);
			 }
		1 2
		2 0 */
		
		/*5
		 int n=10,i,j;
		  for(i=1;i<=n;i++){
		    int count=0;
		  for( j=1;j<=i;j++){
		   if(i%j==0)
		   count++;
		  }
		         if(count==2)
		      if(i%2!=0)
		   System.out.print(i+" ");
		  }
		  
		  3 5 7*/
		
		/* 6
		 int i=0,j=1;
		 System.out.print(i+" "+j);
		 for(int k=1;k<=3;k++){
		  int sum=i+j;
		         System.out.print(" "+sum);
		  i=j;
		  j=sum;
		 }
		 
		 0 1 1 2 3 */
		
		/*7
		 int k=1;
		 for(int i=1;i<3;i++){
		  for(int j=1;j<=3;j++){
		   System.out.print(k+++" ");
		  }
		  System.out.println();
		 }
		 1 2 3
		 4 5 6 */
		
		/*8
		 for(int i=1;i<=2;i++){
			  for(int j=1;j<=5;j++){
			          if(i%2==0 && j%2==0) 
			   System.out.println(i+" "+j);
			  }
			 }
		 2 2
		 2 4 */
		
		/*9
		int i, j, k, l;
		  for (i = 1; i <= 3; i++) {
		   for (j = 1; j <= 3 - i; j++)
		    System.out.print(" ");
		   for (k = 1; k <= i; k++)
		    System.out.print(k);
		   for (l = k - 2; l >= 1; l--)
		    System.out.print(l);
		   System.out.println();
		  }
		  
		  1
		  121
		 12321 */
		
		
		 int i, j, k, l, count = 0;
		 for (i = 1; i <= 3; i++) {
		  count++;
		  for (j = 1; j <= 3 - i; j++)
		   count++;
		  for (k = 1; k <= i; k++) {
		   count++;
		   break;
		  }
		  for (l = k - 2; l >= 1; l--)
		   count++;
		 }
		 System.out.println(count);
		 
		  
		
		/* int i,j,count=0;
		 for(i=1;i<=3;i++){
		    for(j=1;j<=3;j++,count++);
		 }
		 System.out.println(count);

*/

		  

	}

}
