package lesson_2.Seminar;

public interface QueueBehavior {
    void takeInQueue(Actor human);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}
