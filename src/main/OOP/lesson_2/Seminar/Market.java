package lesson_2.Seminar;

import java.util.*;

public class Market implements QueueBehavior, MarketBehavior {
    List<Actor> actorList = new ArrayList<>();
    Queue<Actor> queueList = new LinkedList<>();

    @Override
    public void acceptToMarket(Actor human) {
        actorList.add(human);
    }

    @Override
    public void releaseFromMarket(Actor human) {
        actorList.remove(human);
    }

    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Actor human) {
        queueList.add(human);
    }

    @Override
    public void takeOrders() {
        queueList.peek().setTakeOrder();
    }

    @Override
    public void giveOrders() {
        queueList.peek().setMakeOrder();
    }

    @Override
    public void releaseFromQueue() {
        queueList.poll();
    }
}
