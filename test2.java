import java.util.Scanner;
import java.util.Random;
public class practice
{
	public static void main(String args[])
	{
		/*System.out.println("请输入圆的半径");
		double r=0.0;
		double Π=3.14;
		java.util.Scanner scanf=new java.util.Scanner(System.in);
		r=scanf.nextDouble();
		System.out.println("圆的周长为："+(2*Π*r));
		System.out.println("圆的面积为："+(Π*r*r));*/
		/*int a=3;
		int b=6;
		int c=9;
		int max=a>(b>c?b:c)?a:(b>c?b:c);
		System.out.println(max);*/
		/*java.util.Random random=new java.util.Random();
		int n=random.nextInt();
		System.out.println(n);
		if((n&1)==0)
		{
			System.out.println("偶数");
		}*/
		/*int a=0;
		int b=0;
		int c=0;
		java.util.Scanner scanf=new java.util.Scanner(System.in);
		System.out.println("请输入三个数的值：");
		a=scanf.nextInt();
		b=scanf.nextInt();
		c=scanf.nextInt();
		if(a>0 && b<10 && (c&1)==0)
		{
			System.out.println("三个条件都满足");
		}
		else
		{
			System.out.println("不满足所有的条件");
		}*/
		/*int year=0;
		java.util.Scanner scanf=new java.util.Scanner(System.in);
		System.out.println("请输入一个年份：");
		year=scanf.nextInt();
		if((year%4==0 && year%100!=0) || year%400==0)
		{
			System.out.println(year+"是闰年");
		}
		else
		{
			System.out.println(year+"不是闰年");
		}
		scanf.close();*/
		/*int age=0;
		System.out.print("请输入年龄：");
		Scanner scanf=new Scanner(System.in);
		age=scanf.nextInt();
		if(age>=18)
		{
			System.out.println("成年了");
		}
		else
		{
			System.out.println("未成年");
		}
		scanf.close();*/
		/*String user="";
		String password="";
		Scanner scanf=new Scanner(System.in);
		System.out.print("请输入用户名：");
		user=scanf.next();
		System.out.print("请输入密码：");
		password=scanf.next();
		if(user.equals("admin") && password.equals("88888888"))
		{
			System.out.println("登陆成功");
		}
		else
		{
			System.out.println("登陆失败");
		}
		scanf.close();*/
		/*int year=0;
		int month=0;
		Scanner scanf=new Scanner(System.in);
		System.out.print("请输入年份：");
		year=scanf.nextInt();
		System.out.print("请输入月份");
		month=scanf.nextInt();
		boolean y=(year%4==0 && year%100!=0) || (year%400==0);
		if(y&&month==2)
		{
			System.out.println("有29天");
		}
		else if((!y) && month==2)
		{
			System.out.println("有28天");
		}
		else if(month==4 || month==6 || month==9 || month==11)
		{
			System.out.println("有30天");
		}
		else
		{
			System.out.println("有31天");
		}
		scanf.close();*/
		//int month=0;
		//Scanner scanf=new Scanner(System.in);
		//System.out.print("请输入月份：");
		//month=scanf.nextInt();
		/*switch(month)
		{
			case 1:{
				System.out.println("冬季");
			break;}
			case 2:{
				System.out.println("冬季");
			break;}
			case 3:{
				System.out.println("春季");
			break;}
			case 4:
			{
				System.out.println("春季");
				break;
			}
			case 5:
			{
				System.out.println("春季");
				break;
			}
			default:
			{
				System.out.println("懒得写了");
			}
		}*/
		/*switch(month)
		{
			case 12: case 1: case 2:
			{
				System.out.println("冬季");
				break;
			}
			case 3: case 4: case 5:
			{
				System.out.println("春季");
				break;
			}
			case 6: case 7: case 8:
			{
				System.out.println("夏季");
				break;
			}
			case 9: case 10: case 11:
			{
				System.out.println("秋季");
				break;
			}
			default:
			{
				System.out.println("输入不合法");
			}
		}
		scanf.close();*/
		/*System.out.println("欢迎使用简易计算机");
		int a=0;
		int b=0;
		int result=0;
		String c="";
		Scanner scanf=new Scanner(System.in);
		System.out.print("请输入第一个数字：");
		a=scanf.nextInt();
		System.out.print("请输入运算符号+或-或*或/：");
		c=scanf.next();
		System.out.print("请输入第二个数字：");
		b=scanf.nextInt();
		switch(c)
		{
			case "+":
			{
				result=a+b;
				break;
			}
			case "-":
			{
				result=a-b;
				break;
			}
			case "*":
			{
				result=a*b;
				break;
			}
			case "/":
			{
				result=a/b;
				break;
			}
			default:
			{
				System.out.println("不支持此运算");
			}
		}
		System.out.println("运算结果是："+result);
		scanf.close();*/
		/*double a=0;
		Scanner scanf=new Scanner(System.in);
		System.out.print("请输入您的成绩：");
		a=scanf.nextDouble();
		int b=(int)(a/10);
		switch(b)
		{
			case 10: case 9:
			{
				System.out.println("优秀");
				break;
			}
			case 8: case 7:
			{
				System.out.println("良好");
				break;
			}
			case 6:
			{
				System.out.println("及格");
				break;
			}
			default:
			{
				System.out.println("不及格");
			}
			scanf.close();
		}*/
		/*int year=0;
		int month=0;
		Scanner scanf=new Scanner(System.in);
		System.out.print("请输入年份：");
		year=scanf.nextInt();
		System.out.print("请输入月份：");
		month=scanf.nextInt();*/
		/*switch(month)
		{
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			{
				System.out.println("有31天");
				break;
			}
			case 4: case 6: case 9: case 11:
			{
				System.out.println("有30天");
				break;
			}
			default:
			{
				if((year%4==0 && year%100!=0) || (year %100==0))
				{
					System.out.println("是闰年有29天");
				}
				else
				{
					System.out.println("不是闰年，有28天");
				}
			}
		}*/
		/*switch(month)
		{
			case 1,3,5,7,8,10,12 ->
			{
				System.out.println("有31天");
			}
			case 4,6,9,11 ->
			{
				System.out.println("有30天");
			}
			default ->
			{
				if((year%4==0 && year%100!=0) || (year %400==0))
				{
					System.out.println("是闰年有29天");
				}
				else
				{
					System.out.println("不是闰年，有28天");
				}
			}
		}
		scanf.close();*/
		//int i=0;
		//int sum=0;
		/*for(i=1;i<=100;i++)
		{
			if((i&1)==0)
			{
				System.out.print(i+" ");
			}
		}*/
		/*for(i=2;i<=100;i+=2)
		{
			System.out.print(i+" ");
		}*/
		/*for(i=2;i<=100;i+=2)
		{
			sum+=i;
		}
		System.out.println(sum);*/
		/*int i=0;
		for(i=100;i>=1;i-=3)
		{
			System.out.print(i+" ");
		}*/
		/*int i=0;
		int sum=0;
		for(i=1;i<=100;i+=2)
		{
			sum+=i;
		}
		System.out.println(sum);*/
		/*int n=0;
		int i=0;
		System.out.print("请输入要求的阶乘：");
		Scanner scanf=new Scanner(System.in);
		n=scanf.nextInt();
		int sum=n;
		if(n==0)
		{
			sum=1;
		}
		else
		{
			for(i=n-1;i>=1;i--)
		{
			sum=sum*i;
		}
		}
		System.out.println(sum);
		scanf.close();*/
		/*int i=0;
		int j=0;
		for(i=1;i<=9;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}*/
		/*int i=0;
		int j=0;
		for(i=2;i<=100;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					break;
				}
			}
			if(j==i)
			{
				System.out.print(i+" ");
			}
		}*/
		/*int n=5;
		int i=0;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				break;
			}
		}
		if(i==n)
		{
			System.out.println(n+"是质数");
		}*/
		/*int i=0;
		int j=0;
		int flag=0;
		for(i=2;i<=1000;i++)
		{
			for(j=2;j*j<=i;j++)
			{
				if(i%j==0)
				{
					break;
				}
			}
			if((j*j)>i)
			{
				System.out.print(i+" ");
				flag++;
				if(flag==8)
				{
					System.out.println();
					flag=0;
				}
			}
		}*/
		/*int n=0;
		int i=0;
		int sum=0;
		int j=0;
		System.out.print("请输入一个整数：");
		Scanner scanf=new Scanner(System.in);
		n=scanf.nextInt();
		for(i=1;i<=n;i++)
		{
			if((i&1)==1)
			{
				j=i;
			}
			else
			{
				j=-i;
			}
			sum+=j;
		}
		System.out.println(sum);
		scanf.close();*/
		/*int i=0;
		for(i=100;i<1000;i++)
		{
			if(((i%10)*(i%10)*(i%10)+(i/10%10)*(i/10%10)*(i/10%10)+(i/100)*(i/100)*(i/100))==i)
			{
				System.out.print(i+" ");
			}
		}*/
		/*int i=0;
		int num=0;
		int num2=0;
		int j=0;
		boolean flag=true;
		for(i=2;i<=100;i++)
		{
			for(j=2;j*j<=i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				if(num!=0)
				{
					num2=num;
				}
				num=i;
				if(num2!=0 && (num-num2)==2)
				{
					System.out.print("("+num2+","+num+")"+" ");
				}
			}
			flag=true;
		}*/
		/*int i=0;
		int j=0;
		for(i=0;i<5;i++)
		{
			for(j=0;j<8;j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}*/
		/*int i=0;
		int j=0;
		int x=4;
		for(i=0;i<5;i++)
		{
			for(x=4-i;x>0;x--)
			{
				System.out.print(" ");
			}
			for(j=0;j<8;j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}*/
		/*int i=0;
		int j=0;
		int x=0;
		for(i=0;i<5;i++)
		{
			for(x=4-i;x>0;x--)
			{
				System.out.print(" ");
			}
			for(j=2*i+1;j>0;j--)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		for(i=4;i>0;i--)
		{
			for(x=5-i;x>0;x--)
			{
				System.out.print(" ");
			}
			for(j=2*i-1;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		/*int i=0;
		int j=0;
		int x=0;
		for(i=0;i<5;i++)
		{
			for(x=4-i;x>0;x--)
			{
				System.out.print(" ");
			}
				int a=0;
				for(a=0;a<=i;a++)
				{
					System.out.print((a+1));
				}
				for(a=i;a>0;a--)
				{
					System.out.print(a);
				}
			System.out.println();
		}*/
		/*int i=0;
		int j=0;
		int k=0;
		for(i=0;i<5;i++)
		{
			for(k=i;k>0;k--)
			{
				System.out.print(" ");
			}
			for(j=2*(5-i)-1;j>0;j--)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		for(i=0;i<4;i++)
	{
		for(k=3-i;k>0;k--)
		{
			System.out.print(" ");
		}
		for(j=2*(i+1)+1;j>0;j--)
		{
			System.out.print('*');
		}
		System.out.println();
	}*/
	/*Random random =new Random();
	Scanner scanf=new Scanner(System.in);
	int a=0;
	int b=0;
	int i=10;
	a=random.nextInt(101);
	while(i>0)
		{
			System.out.print("请猜数字，共有10次机会：");
			b=scanf.nextInt();
			if(b>a)
			{
				System.out.println("猜大了");
				i--;
				System.out.println("您还有"+i+"次机会");
			}
			else if(b<a)
			{
				System.out.println("猜小了");
				i--;
				System.out.println("您还有"+i+"次机会");
			}
			else if(b==a)
			{
				System.out.println("恭喜您猜对了！！！");
				System.out.println("共用了"+(10-i+1)+"次机会");
				break;
			}
		}
		if(i==0)
		{
			System.out.println("很遗憾，挑战失败");
		}
		scanf.close();*/
		/*int i=0;
		int sum=0;
		int count=0;
		Scanner scanf=new Scanner(System.in);
		do
		{
			System.out.println("请输入整数，输入-1停止输入：");
			i=scanf.nextInt();
			if(i!=(-1))
			{
				sum+=i;
			  count++;
			}
		}
		while (i!=(-1));
		System.out.println("平均值为："+(sum/count));
		scanf.close();*/
		/*int i=1;
		int sum=0;
		int n=0;
		Scanner scanf=new Scanner(System.in);
		while(i!=0)
		{
			System.out.print("请输入一个整数。输入0则退出：");
			i=scanf.nextInt();
			if(i>0)
			{
				sum+=i;
			}
		}
		System.out.println(sum);
		scanf.close();*/
		/*int i=0;
		for(i=1;i<=100;i++)
		{
			if((i&1)==1 && (i%10)!=3)
			{
				System.out.print(i+" ");
			}
		}*/
		/*int i=0;
		while(true)
		{
			i++;
			if(i%3==2 && i%5==3 & i%7==4)
			{
				System.out.println(i);
				break;
			}
		}*/
		/*int a=1000;
		int b=2;
		int c=0;
		//sum(a,b);
		//sum(1,2);
		//sum(666,888);
		c=sum(1,2);
		System.out.println(c);
		int d=0;
		d=sum2.sum3(a,b);
		System.out.println(d);
	}
	public static int sum(int a,int b)
	{
		int c=0;
		//System.out.println(a+"+"+b+"="+(a+b));
		c=a+b;
		return c;*/
		质数.输出质数();
	}
}
/*class 质数
{
	public static void 输出质数()
	{
		int i=0;
		int j=0;
		boolean flag=true;
		for(i=2;i<=100;i++)
		{
			for(j=2;j*j<=i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.print(i+" ");
			}
			flag=true;
		}
	}
}*/