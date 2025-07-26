
public class Task92 {
		public static void main (String [] args) {
			boolean flag =true;
			int x=10;
			for(int i=2;i<x;i++)
			{
				for(int j=2;j<=i/2;j++)
				{
					if(i%j == 0)
					{
						flag=false;
						break;
					}
				}
				if(!flag)
		        {
		           flag=true;
		        }
		        else
		        {
		        	System.out.println(i);
		        }
				
			}
		}

}
