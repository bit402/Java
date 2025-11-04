package test;

public class test01 {
//    public static String reverse(String st){
//        char[] chars = st.toCharArray();
//        char temp;
//        for(int i=0;i<chars.length/2;i++){
//            temp = chars[i];
//            chars[i] = chars[chars.length-1-i];
//            chars[chars.length-1-i] = temp;
//        }
//        return new String(chars);
//    }
//    public static String getMaxSubstring(String s1,String s2){
//        int n1 = s1.length();
//        int n2 = s2.length();
//        int maxIndex = 0;
//        int maxLen=0;
//        for(int i=0;i<n1;i++){
//            for (int j = 0; j < n2; j++) {
////                if ((i + len) < n1 && s1.charAt(i + len) == s2.charAt(j)) {
////                    len++;
////                }
//                int len=0;
//                while(i+len<n1 && j+len<n2 && s1.charAt(i+len)==s2.charAt(j+len)){
//                    len++;
//                }
//                if(len>maxLen){
//                    maxLen=len;
//                    maxIndex=i;
//                }
//            }
//        }
//        return s1.substring(maxIndex,maxIndex+maxLen);
//    }
    public static void main(String[] args) {
//        String str="AbcDefG123HIJK ,12o";
//        int bigcount=0;
//        int dcount=0;
//        int smallcount=0;
//        int count=0;
//        char[] chars=str.toCharArray();
//        for(int i=0;i<chars.length;i++){
//            if(chars[i]>='a'&&chars[i]<='z'){
//                smallcount++;
//            }
//            else if(chars[i]>='A'&&chars[i]<='Z'){
//                bigcount++;
//            }
//            else if(chars[i]>='0'&&chars[i]<='9'){
//                dcount++;
//            }
//            else{
//                count++;
//            }
//        }
//        System.out.println("大写："+bigcount+"数字"+dcount+"小写"+smallcount+"其他特殊字符"+count);
//        String str="Hello World";
//        String newStr=reverse(str);
//        System.out.println(str+"反转后的字符串为："+newStr);
//        String str="java python,java java,java,c";
//        int count=0;
//        int index=0;
//        char[] chars=str.toCharArray();
//        if(str.contains("java")){
//            while(index<chars.length){
//                index=str.indexOf("java",index);
//                if(index!=-1){
//                    count++;
//                    index+=4;
//                }
//                else if(index == -1){
//                    break;
//                }
//            }
//        }
//        else{
//            System.out.println("对不起，该字符串里面没有该字串");
//        }
//        System.out.println("该子字符串在字符串中出现了"+count+"次");
//        String str="110101199001011234";
//        System.out.println(str.length());
//        String s1=str.substring(16,17);
//        String s2=str.substring(6,14);
//        String gender="";
//        String year=s2.substring(0,4);
//        String month=s2.substring(4,6);
//        String day=s2.substring(6,8);
//        int num=(int)s1.charAt(0);
//        if(num%2==0){
//            gender="女";
//        }
//        else if(num%2==1){
//            gender="男";
//        }
//        System.out.println("根据身份证"+str+"判断出出生日期为："+year+"年"+month+"月"+day+"日"+"性别为："+gender);
//        System.out.println(s2.length());
//        String s1="nihaoyapythonjavajavajavajavajavajavacccccc";
//        String s2="helloworldnihaoyayayayajavajavajavajavajavajavapythonccc";
//        System.out.println(getMaxSubstring(s1,s2));
        StringBuilder sb=new StringBuilder();
        sb.append("hello");
        sb.append("world");
        sb.append("!");
        sb.append(100);
        sb.append(true);
        sb.append(888.888);
        System.out.println(sb);
        System.out.println(sb.length());
    }
}