package Factory;

public class Demo {
    //only call contructor even if declared multiple times
    public static void main(String[] args) {
        PhoneFactory phoneFactory=new PhoneFactory();
        Phone phone=phoneFactory.getPhone(PhoneType.SAMSUNG);
        phone.ShowInfo();
    }
}
