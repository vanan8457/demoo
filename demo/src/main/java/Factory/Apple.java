package Factory;

//subclasses implements to phone
public class Apple implements Phone {
    @Override
    public void ShowInfo() {
        System.out.println("This is a phone Aplle");
    }
}
