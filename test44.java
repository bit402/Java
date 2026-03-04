package test;

import java.util.*;

public class test01 {
//    public static long jc(int a) {
//        long ans = 1L;
//        for (int i = 1; i <= a; i++) {
//            ans *= i;
//        }
//        return ans;
//    }

    public static void main(String[] args) {
//        int[] arr={1,2,3,4};
//        List<Integer> list=new ArrayList<>();
//        for(int a :arr){
//            for(int b:arr){
//                if(a==b){
//                    continue;
//                }
//                for(int c:arr){
//                    if(a==c || b==c){
//                        continue;
//                    }
//                    list.add(a*100+b*10+c);
//                }
//            }
//        }
//        System.out.println(list.size());
//        Iterator<Integer> iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        Collection<String> names=new ArrayList<>();
//        names.add("1");
//        names.add("2");
//        names.add("3");
//        names.add("4");
//        names.add("5");
//        names.add("6");
//        Iterator<String> iterator=names.iterator();
//        while(iterator.hasNext()){
//            String name=iterator.next();
//            if("3".equals(name)){
//                names.remove(name);
//            }
//        }
//        for(int i=2000;i<=3200;i++){
//            if(i%7==0 && i%5!=0){
//                System.out.print(i+" ");
//            }
//        }
//        Scanner sc = new Scanner(System.in);
//        int[] arr=new int[3];
//        for(int i=0;i<3;i++){
//            arr[i]=sc.nextInt();
//        }
//        Arrays.sort(arr);
//        for(int i=0;i<3;i++){
//            System.out.print(arr[i]+" ");
//        }
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        int space=0;
//        int word=0;
//        int digital=0;
//        int others=0;
//        char[] chars = str.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i]==' ') {
//                space++;
//            }
//            else if('a'<=chars[i] && chars[i]<='z' || 'A'<=chars[i] && chars[i]<='Z') {
//                word++;
//            }
//            else if('0'<=chars[i] && chars[i]<='9') {
//                digital++;
//            }
//            else {
//                others++;
//            }
//        }
//        System.out.println("space:"+space+"word:"+word+"digital:"+digital+"others:"+others);
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        char[] chars = str.toCharArray();
//        int digits=0;
//        int spaces=0;
//        int letters=0;
//        int others=0;
//        for(char c : chars){
//            if(Character.isDigit(c)){
//                digits++;
//            }
//            else if(Character.isLetter(c)){
//                letters++;
//            }
//            else if(Character.isWhitespace(c)){
//                spaces++;
//            }
//            else {
//                others++;
//            }
//        }
//        System.out.println("digits: "+digits);
//        System.out.println("letters: "+letters);
//        System.out.println("spaces: "+spaces);
//        System.out.println("others: "+others);
//        sc.close();
//        long result = 0;
//        for (int i = 1; i <= 20; i++) {
//            result += jc(i);
//        }
//        System.out.println(result);
//        Collection<String> names = new ArrayList<>();
//        names.add("1");
//        names.add("2");
//        names.add("3");
//        names.add("4");
//        names.add("5");
//        names.add("6");
//        Iterator<String> iterator = names.iterator();
//        while (iterator.hasNext()) {
//            String name=iterator.next();
//            if("3".equals(name)){
//                //names.remove(name);
//                iterator.remove();
//            }
//            System.out.println(name);
//        }
//        System.out.println(names.size());
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            System.out.println(next);
//        }
//        List<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        list.add("4");
//        list.add("5");
//        list.add("6");
//        list.add(1,"a");
//        list.set(1,"b");
//        list.remove(1);
//        list.add("1");
//        int a=list.indexOf("1");
//        System.out.println("第一次出现的下标位置："+a);
//        int b=list.lastIndexOf("1");
//        System.out.println("最后一次出现的下标位置："+b);
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        System.out.println("===========================");
//        List<String> newList=list.subList(3,5);
//        for(int i=0;i<newList.size();i++){
//            System.out.println(newList.get(i));
//        }
//        List<Integer> list=List.of(1,2,3,4,5,6,7,8);
//        list.set(0,110);
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        ListIterator<String> iterator = list.listIterator();
//        System.out.println(iterator.hasPrevious());
//        while (iterator.hasNext()) {
//            String s = iterator.next();
//            System.out.println(s);
////            if("3".equals(s)){
////                iterator.add("你好");
////            }
//        }
////        System.out.println(list);
//        System.out.println(iterator.hasPrevious());
//        while (iterator.hasNext()) {
//            String s = iterator.next();
//            System.out.println(s);
//        }
//        System.out.println(iterator.previous());
//        System.out.println(iterator.previous());
//        System.out.println(iterator.previous());
//        System.out.println(iterator.previous());
//        System.out.println(iterator.previous());
//        System.out.println(iterator.previous());
//        System.out.println(iterator.hasPrevious());
//        while (iterator.hasNext()) {
//            String s = iterator.next();
//            //System.out.println(s);
//            if("3".equals(s)){
//                System.out.println(iterator.nextIndex());
//                System.out.println(iterator.previousIndex());
//            }
//        }
//        while (iterator.hasNext()) {
//            String s = iterator.next();
//            iterator.set("5");
//            System.out.println(s);
//        }
//        System.out.println(list);
//        while (iterator.hasNext()) {
//            String s = iterator.next();
//            if("3".equals(s)){
//                iterator.set("n");
//            }
//            System.out.println(s);
//        }
//        System.out.println(list);
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
            if("3".equals(s)){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}