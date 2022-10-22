package home4.h1;

public class client {
    public static void main(String[] args) {
        group group1 = new group();
        group group2 = new group();
        member member1 = new member();
        member member2 = new member();
        member member3 = new member();

        group1.addMember(member1);
        group2.addMember(member2);
        group2.addMember(member3);
        group1.addMember(group2);
        group1.senMsg("sssssss");

    }
}
