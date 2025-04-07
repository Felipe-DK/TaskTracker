import java.time.LocalDateTime;

public class Task {
    private long id;
    private String description;
    private State status;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

    //constructors
    public Task(long id, String description, State status, LocalDateTime createdAt, LocalDateTime updateAt) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    //methods
    public void createTasks(){

    }

    public void listTasks(){

    }

    public void deleteTask(){

    }

    public long getId() {
        return id;
    }

    //getters and setters

}
