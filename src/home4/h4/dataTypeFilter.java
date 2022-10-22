package home4.h4;

public class dataTypeFilter extends filter{
    public dataTypeFilter() {
        this.filerType = "dataType";
    }

    @Override
    public void process(Data data) {
        if(data.requestType.equals(this.filerType))
        {
            System.out.println("data type");
        }
        else
        {
            this.next.process(data);
        }
    }
}
