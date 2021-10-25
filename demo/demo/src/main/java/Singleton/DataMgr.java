package Singleton;

import java.util.ArrayList;
import java.util.List;

public class DataMgr {
    List<Category>categories;
    List<Product>products;

    //all object return about instance and static declare only once
    private static DataMgr instance=null;


    private DataMgr() {
        categories=new ArrayList<>();
        products= new ArrayList<>();
        System.out.println("Init object from class object DataMgr");
    }

    public  static  DataMgr getInstance(){
        if(instance==null){
            instance= new DataMgr();

        }
        return  instance;
    }
}
