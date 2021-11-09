package Singleton;

public class Product {
    int id, idCat;
    String title;
    float price;

    //no-argument constructor
    public Product() {
    }

    //constructor with argument
    public Product(int id, int idCat, String title, float price) {
        this.id = id;
        this.idCat = idCat;
        this.title = title;
        this.price = price;
    }

    //method get va set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
