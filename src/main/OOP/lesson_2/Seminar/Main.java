package lesson_2.Seminar;

/*
1. Интерфейс ActorBehavior, который будет содержать описание возможных действий актёра в очереди/магазине
2. Абстрактный класс Actor, который хранит в себе параметры актора, включая состояние готовности сделать заказ и
факт получения заказа. Дополнение: для большего понимания у студентов, можно сделать
методы-геттеры для имени и прочих “персональных данных” abstract
3. Класс Human, который должен наследоваться от Actor и реализовывать ActorBehavior
-----------------------------------------------------------------
1. Интерфейс QueueBehaviour, который описывает логику очереди –
помещение в/освобождение из очереди, принятие/отдача заказа
2. Интерфейс MarketBehaviour, который описывает логику магазина –
приход/уход покупателей, обновление состояния магазина
3. Класс Market, который реализовывает два вышеуказанных интерфейса и хранит в списке
список людей в очереди в различных статусах
*/
public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Market mac = new Market();
        mac.acceptToMarket(human);
        mac.takeInQueue(human);
        mac.takeOrders();
        mac.giveOrders();
        mac.releaseFromQueue();
        mac.releaseFromMarket(human);
    }
}
