package home4.h1;

import java.util.ArrayList;
import java.util.List;

public class group implements entity{
    List<entity> groupMember = new ArrayList<>();
    eType type = eType.group;

    public void addMember(entity e)
    {
        this.groupMember.add(e);
    }

    @Override
    public void senMsg(String msg) {
        for (entity e:this.groupMember)
        {
            e.senMsg(msg);
        }
        System.out.println("msg" + this.type);
    }
}
