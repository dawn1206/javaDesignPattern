package home4.h4;

public class charSetFilter extends filter{
    public charSetFilter() {
        this.filerType = "charSet";
    }

    @Override
    public void process(Data data) {
        if(data.requestType.equals(this.filerType))
        {
            System.out.println("char set");
        }
        else
        {
            this.next.process(data);
        }
    }
}
