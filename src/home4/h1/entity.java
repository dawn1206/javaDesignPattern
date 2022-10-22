package home4.h1;

public interface entity {
    enum eType{member,group};

    eType type = null;
    public void senMsg(String e);
}
