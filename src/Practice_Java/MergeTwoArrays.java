package Practice_Java;

public class MergeTwoArrays {

	public static void main(String[] args) 
	{
		int[]a= {10,20,30};
		int[]b= {40,50,60,70,80};
		
		int a_len=a.length;
		int b_len=b.length;
		int c_len=a_len + b_len;
		
		int[]c=new int[c_len];
		
		for(int i=0; i<a_len; i++)
		{
			c[i]=a[i];
		}
		for(int i=0; i<b_len; i++)
		{
			c[a_len+i]=b[i];
		}
		for(int i=0; i<c_len; i++)
		{
		System.out.print(c[i]+" ");
		}
		

	}

}
