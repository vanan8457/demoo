package Generics;

public class main {
    public static void main(String[] args) {
        Test<String,Integer>obj=new Test<>("aaa",123);
        String name= obj.getKey();
        Integer so=obj.getValue();
        System.out.println("ten=" +name+ " " + "so="+ so);
        Integer[] integers={1,2,3,4};
        String[] strings={"a","b"};





    }
}
