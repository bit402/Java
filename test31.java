package test;

public class test01 {
    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        for(int i=0; i<chars.length/2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length-1-i];
            chars[chars.length-1-i] = temp;
        }
        return new String(chars);
    }
    public static void main(String[] args) {
//        String s1="a"+1;
//        System.out.println(s1);
//        char s2='a'+1;
//        System.out.println(s2);
//        String s1="Hello,1 Worl2d3";
//        char[] chars=s1.toCharArray();
//        for(char c:chars){
//            if(c>=97&&c<=122){
//                System.out.println("小写字符有：");
//                System.out.print(c+"");
//            }
//            else if(c>=65&&c<=90){
//                System.out.println("大写字符有：");
//                System.out.print(c+"");
//            }
//            else if(c>=18 &&c<=57){
//                System.out.println("数字有：");
//                System.out.print(c+"");
//            }
//            else{
//                System.out.println("特殊字符有：");
//                System.out.print(c+"");
//            }
//        }
//        String s1="Hello,1 Worl2d3";
//        char[] ch=s1.toCharArray();
//        int bigCount=0,smallCount=0,numCount=0,count=0;
//        for(char c:ch){
//            if(c>='A' && c<='Z'){
//                bigCount++;
//            }
//            else if(c>='a' && c<='z'){
//                smallCount++;
//            }
//            else if(c>='0' && c<='9'){
//                numCount++;
//            }
//            else {
//                count++;
//            }
//        }
//        System.out.println("大写字符有"+bigCount+"个，"+"小写字符有"+smallCount+"个"+"，数字有"+numCount+"个，"+"其他字符有"+count+"个");
        String s1="Hello,1 Worl2d3";
        String s2=reverse(s1);
        System.out.println(s1+"反转后的字符串为："+s2);
    }
}
package test;

import org.junit.jupiter.api.Test;

public class StringMethodTest {
    @Test
    public void testReplace(){
        String s1="java,python,c";
        String s2=s1.replace("c","c++");
        System.out.println(s2);
        String s3="ab1c2d3456rr8gd5a4d6w4a5s4f5";
        System.out.println(s3.replaceAll("\\d",""));
    }
    @Test
    public void testSplit(){
        String[] strs="动11力22节33点".split("\\d");
        System.out.println(strs);
        for(String s:strs){
            System.out.println(s);
        }
        System.out.println(strs.length);
        String s2="1970-1-1";
        String[] strs2 = s2.split("-");
        for(String s:strs2){
            System.out.println(s);
        }
        System.out.println(strs2.length);
        String data="name=zhangsan&password=123456&email=zhangsan@123.com&gender=男";
        String[] strs3 = data.split("&");
        for(String s:strs3){
            System.out.println(s);
        }
        System.out.println(strs3.length);
    }
}
