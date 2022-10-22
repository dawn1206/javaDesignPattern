package home4.h2;

public class client {
    public static void main(String[] args) {
        Itool itool = new tool1();
        itool.setContent("sadadasdasdas");

        itool.genHeader();
        itool.getContent();
        itool.genTail();
        System.out.println(itool.getContent());
        Itool itool1 = new tool2(itool);

        itool1.genHeader();
        itool1.getContent();
        itool1.genTail();
        System.out.println(itool1.getContent());
    }
}
