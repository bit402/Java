package test;

public class MyLinked <E>{
   private int size;
    private Node<E> head;

    public MyLinked() {
    }
    private class Node<E>{
        E data;
        Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
    public void add(E e) {
        if (head == null) {
            head=new Node<>(e,null);
            size++;
            return;
        }
        findLastNode().next=new Node<E>(e,null);
        size++;
    }
    private Node<E> findLastNode(){
        Node<E> lastNode=head;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
        }
        return lastNode;
    }
    public void add(int index, E e) {
        if(index<0||index>size){
            throw new IndexOutOfBoundsException();
        }
        else if(head==null){
            add(e);
        }
        else if(index==0){
            Node<E> temp=new Node<>(e,null);
            temp.next=head;
            head=temp;
            size++;
        } else if (index==size) {
            add(e);
        }
        else{
            Node<E> temp=new Node<>(e,null);
            temp.next=findIndexNode(index);
            findIndexNode(index-1).next=temp;
            size++;
        }
    }
    private Node<E> findIndexNode(int index){
        Node<E> temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void remove(int index){
        if(index<0||index>=size){
            throw new IndexOutOfBoundsException();
        }
        else if(index==0){
            head=head.next;
            size--;
        }
        else if(index==size-1){
            findIndexNode(index-1).next=null;
            size--;
        }
        else{
            Node<E> prevNode = findIndexNode(index - 1);
            // 修复2：正确赋值为被删节点的next，而非next.next
            Node<E> deleteNode = prevNode.next;
            prevNode.next = deleteNode.next;
            // 断开被删节点的引用（可选，帮助GC）
            deleteNode.next = null;
            size--;
        }
    }
    public void set(int index, E e){
        if(index<0||index>=size){
            throw new IndexOutOfBoundsException();
        }
        else if(index==0){
            head.data=e;
        }
        else{
            findIndexNode(index).data=e;
        }
    }
    public E get(int index){
        if(index<0||index>=size){
            throw new IndexOutOfBoundsException();
        }
        else if(index==0){
            return head.data;
        }
        else{
            return findIndexNode(index).data;
        }
    }

    public int getSize() {
        return size;
    }
    public void print(){
        for(Node<E> temp=head;temp!=null;temp=temp.next){
            System.out.print(temp.data+" ");
        }
    }
}
package test;

import java.util.*;

public class test01 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        String[] names = new String[n];
//        int[] dir=new int[n];
//        int index=0;
//        for(int i=0;i<n;i++){
//            dir[i]=sc.nextInt();
//            names[i]=sc.next();
//        }
//        for(int i=0;i<m;i++){
//            int a=sc.nextInt();
//            int s=sc.nextInt();
//            int d=dir[index];
//            if(d==0){
//                if(a==1){
//                    index+=s;
//                }
//                if(a==0){
//                    index-=s;
//                }
//                index = (index % n + n) % n;
//            }
//            else if(d==1){
//                if(a==0){
//                    index+=s;
//                }
//                if(a==1){
//                    index-=s;
//                }
//                index=(index+n)%n;
//            }
//        }
//        System.out.println(names[index]);
//        sc.close();
//        MyLinked ml = new MyLinked();
//        String s1="a";
//        String s2="b";
//        int n1=1;
//        int n2=2;
//        char c1='a';
//        char c2='b';
//        double d1=3.14;
//        float f1=3.14f;
//        boolean b1=true;
//        boolean b2=false;
//        ml.add(s1);
//        ml.add(s2);
//        ml.add(n1);
//        ml.add(n2);
//        ml.add(c1);
//        ml.add(c2);
//        ml.add(d1);
//        ml.add(f1);
//        ml.add(b1);
//        ml.add(b2);
//        System.out.println(ml);
//        ml.print();
//        ml.add(2,8);
//        System.out.println();
//        ml.print();
//        ml.add(0,'E');
//        System.out.println();
//        ml.print();
//        System.out.println(ml.getSize());
//        ml.add(12,"E");
//        ml.print();
//        System.out.println();
//        ml.set(8,1.0);
//        ml.set(0,'Y');
//        ml.print();
//        System.out.println();
//        System.out.println(ml.get(0));
//        System.out.println(ml.get(ml.getSize()-1));
//        System.out.println(ml.get(3));
//        ml.print();
//        System.out.println();
//        ml.remove(0);
//        ml.remove(ml.getSize()-1);
//        ml.remove(3);
//        ml.print();
//        Stack<String> stack1 = new Stack<>();
//        LinkedList<String> stack2 = new LinkedList<>();
//        ArrayDeque<String> stack3 = new ArrayDeque<>();
//        stack1.push("a");
//        stack1.push("b");
//        stack1.push("c");
//        stack1.push("d");
//        stack1.push("e");
//        System.out.println("c的位置："+stack1.search("c"));
//        System.out.println(stack1.pop());
//        System.out.println(stack1.pop());
//        System.out.println(stack1.pop());
//        System.out.println(stack1.pop());
//        System.out.println(stack1.pop());
//        //System.out.println(stack1.pop());
//        System.out.println(stack1);
//        System.out.println("*************************");
//        stack2.push("a");
//        stack2.push("b");
//        stack2.push("c");
//        stack2.push("d");
//        stack2.push("e");
//        System.out.println(stack2.pop());
//        System.out.println(stack2.pop());
//        System.out.println(stack2.pop());
//        System.out.println(stack2.pop());
//        System.out.println(stack2.pop());
////        System.out.println(stack2.pop());
//        System.out.println(stack2);
//        stack3.push("a");
//        stack3.push("b");
//        stack3.push("c");
//        stack3.push("d");
//        stack3.push("e");
//        //System.out.println("c的位置："+stack3.search("c"));
//        System.out.println(stack3);
//        System.out.println(stack3.pop());
//        System.out.println(stack3.pop());
//        System.out.println(stack3.pop());
//        System.out.println(stack3);
//        System.out.println("此时栈顶元素是："+stack3.peek());
//        Queue<String> queue=new ArrayDeque<>();
//        queue.add("a");
//        queue.add("b");
//        queue.add("c");
//        queue.add("d");
//        queue.add("e");
//        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue);
//        System.out.println(queue.poll());
//        Queue<String> queue2=new LinkedList<>();
//        queue2.add("a");
//        queue2.add("b");
//        queue2.add("c");
//        queue2.add("d");
//        queue2.add("e");
//        System.out.println(queue2);
//        System.out.println(queue2.poll());
//        System.out.println(queue2);
//        System.out.println(queue2.poll());
//        System.out.println(queue2);
//        System.out.println(queue2.poll());
//        System.out.println(queue2);
//        System.out.println(queue2.poll());
//        System.out.println(queue2);
//        System.out.println(queue2.poll());
//        System.out.println(queue2);
//        System.out.println(queue2.poll());
        Deque<String> deque=new ArrayDeque<>();
        //队尾进，队头出：
        deque.offer("a");
        deque.offer("b");
        deque.offer("c");
        deque.offer("d");
        deque.offer("e");
        System.out.println(deque.poll());
        System.out.println(deque.poll());
        System.out.println(deque.poll());
        System.out.println(deque.poll());
        System.out.println(deque.poll());
        System.out.println(deque);
        deque.clear();
        System.out.println(deque);
        //队头进队尾出：
        deque.offerFirst("a");
        deque.offerFirst("b");
        deque.offerFirst("c");
        deque.offerFirst("d");
        deque.offerFirst("e");
//        System.out.println(deque.pollLast());
//        System.out.println(deque.pollLast());
//        System.out.println(deque.pollLasofferFirst()
//        System.out.println(deque.pollLast());
//        System.out.println(deque.pollLast());
        System.out.println(deque.pollLast());
        System.out.println(deque.pollLast());
        System.out.println(deque.pollLast());
        System.out.println(deque.pollLast());
        System.out.println(deque.pollLast());
        System.out.println("********************");
        Deque<String> deque2=new LinkedList<>();
        deque2.offer("a");
        deque2.offer("b");
        System.out.println(deque2.poll());
        System.out.println(deque2.poll());
        deque2.offerFirst("c");
        deque2.offerFirst("d");
        System.out.println(deque2.pollLast());
        System.out.println(deque2.pollLast());
        
    }
}
