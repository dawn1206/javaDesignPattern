package home4.h4;

public class dataCheckFilter extends filter{
    public dataCheckFilter() {
        this.filerType = "dataCheck";
    }

    @Override
    public void process(Data data) {
        if(data.requestType.equals(this.filerType))
        {
            System.out.println("data check");
        }
        else
        {
            this.next.process(data);
        }
    }
}
