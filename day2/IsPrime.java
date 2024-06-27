package week1.day2;



public class IsPrime {
public static void main(String[] args) {
	for (int i=4;i<=23;i++)
	{
	if(i%2==0)
	{
		System.out.println("The number "+i+" is not Prime");
	}
	else if(i%3==0)
	{
		System.out.println("The number "+i+" is not Prime");
	}
	else
	{
		System.out.println("The number "+i+" is Prime");
	}
	}
	}
}