package home4.h2;

public class tool1 extends Itool{

    tool1(Itool itool1) {
        super(itool1);
    }
    tool1(){}
    @Override
    public void genHeader(){
        this.content="tool1H" + this.getContent();
    }
    @Override
    public void genTail(){
        this.content = this.getContent() +"tool1T";
    }
}
