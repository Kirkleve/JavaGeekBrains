package lesson_2.Seminar;

public interface MarketBehavior {
    void acceptToMarket(Actor human);
    void releaseFromMarket(Actor human);
    void update();
}
