package armstrong;


public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
   int n= 154;
   int t1 = n;
   int leng = 0;
   while(t1>0) {
	   leng = leng + 1;
	   t1 = t1/10;
   }
	int t2=n;
	int arm = 0;
	int mul=1;
	int rem=0;
	while(t2>0) {
		for(int i=1;i<=leng;i++)
		{
		 rem = rem * mul;
		}
	arm= arm+mul;
	
	
	t2= t2/10;
			}
	if(arm==n) {
		System.out.println(n +"arm");
	}
	else {
		System.out.println(n + "not");
	}
	}

}
