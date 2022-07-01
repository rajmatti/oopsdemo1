/*
 * Java Program to get the following Output
 * 
 *  5	4	3	2	1
 *  5	4	3	2
 *  5	4	3 
 *  5	4
 *  5
 */
public class NestedLoopDemo2 {

	public static void main(String[] args) {
		
		 int i,j;
		        for(i=1;i<=5;i++)
		        {
		            for(j=5;j>=i;j--)
		                System.out.print(j+"\t");
		            System.out.println();
		        }
	}

}
