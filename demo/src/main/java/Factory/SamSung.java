package Factory;

//subclasses implements to phone
public class SamSung implements Phone {
    @Override
    public void ShowInfo() {
        System.out.println("This is a phone SamSung");
    }
}
