package Factory;

//subclasses implements to phone
public class Nokia implements  Phone {
    @Override
    public void ShowInfo() {
        System.out.println("This is a phone Nokia");
    }
}
