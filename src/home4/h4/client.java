package home4.h4;

public class client {
    public static void main(String[] args) {
        charSetFilter charSetFilter = new charSetFilter();
        charSetFilter.next = new dataCheckFilter();
        charSetFilter.next.next = new dataTypeFilter();


        Data data = new Data();
        data.setRequestType("dataCheck");
        charSetFilter.process(data);


        data.setRequestType("charSet");
        charSetFilter.process(data);


        data.setRequestType("dataType");
        charSetFilter.process(data);
    }
}
