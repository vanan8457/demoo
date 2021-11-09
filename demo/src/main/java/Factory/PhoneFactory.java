package Factory;

public class PhoneFactory {
//use getphone method to get object of type phone
    public Phone getPhone(PhoneType phoneType) {
        Phone phoneCreated = null;
        switch (phoneType) {
            case SAMSUNG:
                phoneCreated = new SamSung();
                break;
            case APPLE:
                phoneCreated = new Apple();
                break;
            case NOKIA:
                phoneCreated = new Nokia();
                break;
        }
        return phoneCreated;
    }
}

