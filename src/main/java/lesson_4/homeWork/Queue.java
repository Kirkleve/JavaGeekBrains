package lesson_4.homeWork;

public class Queue<T> {
    private T[] array;
    private int head;
    private int tail ;

    public Queue (int length) {
        this.array = (T[]) new Object[length];
        this.head = -1;
        this.tail = -1;
    }

    public int size() {
        if (this.empty())
            return 0;
        if (this.head >= this.tail)
            return this.head - this.tail + 1;
        return this.array.length - this.tail + this.head + 1;
    }

    public boolean empty() {
        return this.head == -1;
    }

    public boolean offer (T item) {
        if (this.empty()) {
            this.head = 0;
            array[this.head] = item;
            this.tail = this.head;
            return true;
        }
        int offerIndex = (this.head + 1) % this.array.length;
        if (offerIndex != this.tail) {
            this.head = offerIndex;
            array[this.head] = item;
            return true;
        } else
            return false;
    }

    public T poll() {
        if(this.empty()) {
            return null;
        }
        T item=this.array[tail];
        if(this.tail == this.head) {
            this.tail=-1;
            this.head=-1;
        }
        else
            this.tail = (this.tail + 1) % this.array.length;
        return item;
    }

    public T peek () {
        return (this.empty()) ? null : this.array[tail];
    }

    public static void main (String[] args) {
        Queue <Integer> queue = new Queue<>(10);
        System.out.println(queue);
        int randomLength = 7;
        for (int i = 1; i < randomLength; i++) {
            queue.offer(i);
        }
        System.out.println("Длинна = " + queue.size());
        System.out.println("Первым вошёл '" + queue.peek() + "'");
        System.out.println("Длинна = " + queue.size());
        System.out.println(queue.poll());
        System.out.println("Длинна = " + queue.size());
    }
}
