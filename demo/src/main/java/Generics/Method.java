package Generics;

import java.util.ArrayList;

public class Method {
    //khai bao phuong thuc kieu lop
    public static <E> E getFistElement(ArrayList<E> arrayLists){
        if(arrayLists.isEmpty()){
            return null;
        }
        E first=arrayLists.get(0);
        return  first;
    }

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(Method.getFistElement(list));

    }

}
