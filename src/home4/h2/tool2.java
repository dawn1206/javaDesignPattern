package home4.h2;

public class tool2 extends Itool{
    tool2(Itool itool1) {
        super(itool1);
    }
    tool2(){}
    @Override
    public void genHeader(){
        this.content="tool2H" + this.getContent();
    }
    @Override
    public void genTail(){
        this.content = this.getContent() +"tool2T";
    }

}
