package test;

public class Address {
    private String street;

    public Address(String street) {
        this.street = street;
    }

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Address) {
            Address address = (Address) obj;
            if (this.street.equals(address.street)) {
                return true;
            }
        }
        return false;
    }
}
package test;

public class User {
    private String name;
    private Address address;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User user = (User) obj;
            if(this.name==user.name && this.address.getStreet()==user.address.getStreet()) {
                return true;
            }
        }
        return false;
    }

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
package test;

public class User2 implements java.lang.Cloneable {
    private int age;

    public User2(int age) {
        this.age = age;
    }

    public User2() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User2 [age=" + age + "]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
package test;

public class Address2 implements Cloneable {
    private String street;
    private String city;

    public Address2(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public Address2() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address2{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
package test;

public class User3 implements Cloneable {
    private String name;
    private Address2 address;

    public User3(String name, Address2 address) {
        this.name = name;
        this.address = address;
    }

    public User3() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address2 getAddress() {
        return address;
    }

    public void setAddress(Address2 address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User3{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Address2 ad=(Address2)this.getAddress().clone();
        User3 copyuser=(User3) super.clone();
        copyuser.setAddress(ad);
        return copyuser;
    }
}
package test;

public class test01 {

    public static void main(String[] args) throws CloneNotSupportedException {
//        String s1="hello";
//        String s2="hello";
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//        System.out.println("hello");
//        String s3=new String("hello");
//        String s4=new String("hello");
//        System.out.println(s3 == s4);
//        System.out.println(s3.equals(s4));
//        System.out.println(s1==s3);
//        System.out.println(s1.equals(s3));
//        Address address = new Address("北京怀远路2386号");
//        Address address2 = new Address("北京怀远路2386号");
//        User user=new User("小明",address);
//        User user2=new User("小明",address2);
//        System.out.println(user==user2);
//        System.out.println(user.equals(user2));
//        test01 t = new test01();
//        int i=t.hashCode();
//        System.out.println(i);
//        test01 t1 = new test01();
//        int i1=t1.hashCode();
//        System.out.println(i1);
//        User2 user = new User2(20);
//        System.out.println(user);
//        Object obj =user.clone();
//        System.out.println(obj);
//        User2 user2 = (User2)obj;
//        user2.setAge(30);
//        System.out.println("克隆"+user2);
//        System.out.println("原值："+user);
        Address2 address = new Address2("怀远路2386","北京");
        User3 user3=new User3("小明",address);
        Object obj=user3.clone();
        User3 user31=(User3)obj;
        System.out.println(user31);
        System.out.println(user3);
        user31.getAddress().setCity("天津");
        user31.setName("李耀");
        System.out.println(user31);
        System.out.println(user3);
        
    }
}