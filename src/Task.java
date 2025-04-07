import javax.sound.midi.Soundbank;
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
    public void markInProgess(){
        if (status != State.INPROGRESS){
            this.status = State.INPROGRESS;
            this.updateAt = LocalDateTime.now();
        }
    }

    public void markInDone(){
       if (status != State.INPROGRESS && status != State.DONE){
           this.status = State.DONE;
           this.updateAt = LocalDateTime.now();
       }
    }




    //getters and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public State getStatus() {
        return status;
    }

    public void setStatus(State status) {
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
