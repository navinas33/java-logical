package demo_logic;


public class Number {
	public static int findNumber(int input1,int input2)
	{
		int temp=0;
		if(input2==1)
		{
			if(input1<10)
			{
				temp=1;
			}
			else
			{
				temp=(input1/10)%10;
			}
		}
		else if(input2==2)
		{
			if(input1<100)
			{
				temp=2;
			}
			else
			{
				temp=(input1/100)%10;
			}
		}
		return temp;
	}
	public static void main(String[] args) {
		int input1=723;
		int input2=6;
		int input3=39;
		int input4=2;
		int t1;
		int t2;
		int t3;
		int sum=0;
		if(input4==0)
		{
			sum=input1%10+input2%10+input3%10;
			System.out.println(sum);
		}
		else if(input4==1)
		{
			t1=findNumber(input1,input4);
			t2=findNumber(input2,input4);
			t3=findNumber(input3,input4);
			sum=t1+t2+t3;
			System.out.println(sum);
		}
		else if(input4==2)
		{
			t1=findNumber(input1,input4);
			t2=findNumber(input2,input4);
			t3=findNumber(input3,input4);
			sum=t1+t2+t3;
			System.out.println(sum);
		}
	}
}
