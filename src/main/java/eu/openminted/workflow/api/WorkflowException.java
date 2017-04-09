package eu.openminted.workflow.api;

/**
 * Created by antleb on 07/04/2017.
 */
public class WorkflowException extends Exception {

    public WorkflowException(String message) {
        super(message);
    }

    public WorkflowException(String message, Throwable cause) {
        super(message, cause);
    }

    public WorkflowException(Throwable cause) {
        super(cause);
    }
}
