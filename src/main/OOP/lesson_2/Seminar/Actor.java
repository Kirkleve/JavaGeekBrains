package lesson_2.Seminar;

public abstract class Actor implements ActorBehavior {
    protected String name;
    protected boolean makeOrder;
    protected boolean takeOrder;

    public boolean isMakeOrder(){
        return makeOrder;
    }

    public boolean isTakeOrder(){
        return takeOrder;
    }

    public abstract String getName();
}
