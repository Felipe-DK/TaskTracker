import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

public class TaskFactory {
    private static final AtomicLong idGenerator = new AtomicLong(1);

    public static Task creatTask(String description){
        long id = idGenerator.getAndIncrement();
        LocalDateTime now = LocalDateTime.now();
        return new Task(id, description, State.TODO, now, now);
    }
}
