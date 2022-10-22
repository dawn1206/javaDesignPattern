package home4.h1;

public class member implements entity{

    eType type = eType.member;
    @Override
    public void senMsg(String e) {
        System.out.println(e + type);

    }
}
