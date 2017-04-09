package eu.openminted.workflow.api;

/**
 * Created by antleb on 07/04/2017.
 */
public class ExecutionStatus {
    public enum Status {
        PENDING,
        RUNNING,
        PAUSED,
        FINISHED,
        CANCELED,
        FAILED
    }

    private Status status;

    // anything else to be decided. Error messages, statistics, execution metadata (dates etc)...

    public ExecutionStatus() {
    }

    public ExecutionStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
