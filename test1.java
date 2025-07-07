public class helloworld
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
**********************************************************************************************************
/**
* helloworld2是一个问世程序，这个程序演示了中文乱码问题。
* @author 张三
* @version 1.0
* @since 1.0
*/
public class helloworld2
{
	/**
	* 这是main方法是程序的入口，程序就是从这里开始执行的。
	* @param args 这个是main方法的参数
	*/
	public static void main(String[] args){
		System.out.println("hello,world");
	}
}
class x
{
	public static void main(String args[]){
		System.out.println("x执行了");
	}
}
class y
{
	public static void main(String args[]){
		System.out.println("Y方法执行了");
	}
}
class z
{
	public static void main(String[] args){
		System.out.println("z执行了");
	}
}
********************************************************************************************
/*public class practice
{
	public static void main(String args[]){
		System.out.println("姓名：阳光男孩");
		System.out.println("年龄：25");
		System.out.println("性别：男");
		System.out.println("家庭住址：上海市");
		System.out.println("联系电话：88888888888");
	}
}
class rhombus
{
	public static void main(String args[]){
		int i=0;
		int j=4;
		for(i=0;i<5;i++)
		{
			for(j=4-i;j>0;j--)
			{
				System.out.print(' ');
			}
			for(j=0;j<2*i+1;j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		for(i=0;i<4;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(' ');
			}
			for(j=0;j<2*(3-i)+1;j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
class print
{
	public static void main(String args[])
	{
		System.out.println("product\t\tprice\t\tstock");
		System.out.println("Apple\t\t10\t\t50");
		System.out.println("Banana\t\t50\t\t90");
		System.out.println("Orange\t\t10\t\t90");
		System.out.println("watermelon\t\t100\t\t100");
		System.out.println("grape\t\t88\t\t88");
	}
}
class jinzhi
{
	public static void main(String args[])
	{
		//int a=0b10001100;
		//System.out.println(a);
		//int b=0b11110100;
		//System.out.println(b);
		int a = 0b11111111_11111111_11111111_11111111; // -1的补码
System.out.println(a); // 输出：-1
	}
}*/
public class practice
{
	public static void main(String args[])
	{
		//double f1=3.14;
		//float f2=3.14f;
		/*double a=1.23;
		double b=0.23;
		double c=.23;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		double d=0.123E2;//12.3
		double e=123.34e-2;//1.2334
		System.out.println(d);
		System.out.println(e);*/
		/*double a=6.9;
		double b=3.0;
		double c=a/b;
		System.out.println("c="+c);
		System.out.println(c==2.3);
		if(c==2.3)
		{
			System.out.println("相等");
		}
		if(c-2.3<0.00000001)
		{
			System.out.println("xiangdeng");
		}
		char e='\u0000';
		System.out.print(e+"abc");*/
		/*char c1='t';
		char c2='\t';
		System.out.println("abc"+c2+"def");
		System.out.println("\"黎明到达之前，必须要有人稍稍照亮黑暗\"");
		System.out.println('"'+"黎明到达之前，必须要有人稍稍照亮黑暗"+'"');
		System.out.println("\\");
		System.out.println("\\\\");*/
		/*char a='A';
		char b='\u0041';
		System.out.println(a);
		System.out.println(b);
		char x=97;
		System.out.println(x);*/
		//System.out.println('a'+1);
		//char c='a'+1;
		//System.out.println(c);
		//byte a=1;
		//short b=1;
		//char c=1;
		//short num=a+b+c;,程序报错
		//int num=a+b+c;
		/*short num=(short)(a+b+c);
		System.out.println(num);
		short m=100;
		int n=200;
		long  z=300l;
		double x=400.0;
		double result=m+n+z+x;
		System.out.println(result);*/
		/*boolean flag=true;
		boolean gender=true;
		if(gender==true)
		{
			System.out.println("男士");
		}
		else
		{
			System.out.println("女士");
		}
		int a=10;
		int b=20;
		System.out.println(b>a);
		if(b>a)
		{
			System.out.println(a+"<"+b);
		}
		else
		{
			System.out.println(a+">"+b);
		}*/
		/*String name1="张三";
		String name2="李四";
		int age1=20;
		int age2=30;
		char sex1='男';
		char sex2='女';
		String num1="88888888";
		String num2="99999999";
		System.out.println("姓名\t年龄\t性别\t联系电话");
		System.out.println(name1+"\t"+age1+"\t"+sex1+"\t"+num1);
		System.out.println(name2+"\t"+age2+"\t"+sex2+"\t"+num2);*/
		/*int a=100;
		int b=200;
		int tmp=0;
		tmp=a
		a=b;
		b=tmp;
		System.out.println(a+"+"+b+"="+(a+b));*/
		//int a=10;
		//int b=-3;
		//System.out.println(a+"-("+b+")="+(a-b));
		/*int a=10;
		int b=3;
		System.out.println(a+"%"+b+"="+(a%b));//1
		int x=-10;
		int y=3;
		System.out.println(x+"%"+y+"="+(x%y));//-1
		int m=10;
		int n=-3;
		System.out.println(m+"%"+n+"="+(m%n));//1*/
		/*java.util.Scanner scaner=new java.util.Scanner(System.in);
		System.out.print("请输入一个数字");
		int num=scaner.nextInt();
		System.out.println("您输入的数字是："+num);
		System.out.print("请输入一个浮点型的数字");
		double a=scaner.nextDouble();
		System.out.println("您输入的数字是："+a);
		System.out.print("请输入您的姓名");
		String name=scaner.next();
		System.out.println("您的姓名是："+name);
		scaner.nextLine();
		System.out.print("请输入您的姓名2：");
		String name2=scaner.nextLine();
		System.out.println("新的姓名2是："+name2);*/
		/*java.util.Scanner scanf=new java.util.Scanner(System.in);
		System.out.print("请输入第一个数字：");
		int num1=scanf.nextInt();
		System.out.print("请输入第二个数字：");
		int num2=scanf.nextInt();
		System.out.println("他们之和为："+(num1+num2));*/
		//int y=10;
		//System.out.println(y++);
		//System.out.println(++y);
		/*java.util.Scanner scanf=new java.util.Scanner(System.in);
		System.out.print("请输入一个百位数：");
		int a=scanf.nextInt();
		System.out.println("个位数为："+(a%10)+",十位数为："+(a%100/10)+"，百位数为："+(a/100));
		scanf.close();*/
		/*int time=681;
		int hour=time/60;
		int minutes=time-hour*60;
		System.out.println("681分钟中有："+hour+"小时，有"+minutes+"分钟");*/
		/*int x=99;
		int y=100;
		System.out.println(x>y & x>y++);
		System.out.println(y);
		int a=99;
		int b=100;
		System.out.println(a>b && a>b++);
		System.out.println(b);*/
		/*byte b=-128;
		System.out.println(b>>>2);
		System.out.println((byte)(b>>>2));
		System.out.println(b>>2);*/
		/*int a=2147483647;
		int key=888;
		int num=a^key;
		System.out.println(num);
		int password=num^key;
		System.out.println(password);*/
		/*int num=0b01110;
		int flag=1;
		System.out.println(num&(~(flag<<3)));*/
		/*int a=20;
		a=a+10;
		System.out.println(a);
		int b=20;
		b+=10;
		System.out.println(b);*/
		//int i=20;
		//i+=888;
		//System.out.println(i);
		//boolean sex=true;
		//System.out.println(sex?"男":"女");
		//char c=sex?'男':"女";
		int a=100;
		int b=200;
		System.out.println(a>b?a:b);
	}
}
