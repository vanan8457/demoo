package Singleton;

public class Category {
    int id;
    String catName;

    //no-argument constructor
    public Category() {
    }

    //constructor with argument
    public Category(int id, String catName) {
        this.id = id;
        this.catName = catName;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}
