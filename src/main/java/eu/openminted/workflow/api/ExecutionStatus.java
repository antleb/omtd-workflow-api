package eu.openminted.workflow.api;

/**
 * An immutable object which records the current status of a workflow execution
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
    
    private String corpusId;
    
    private String userId;
    
    private String workflowId;
    
    private Throwable failureCause;

    // anything else to be decided. Error messages, statistics, execution metadata (dates etc)...

    public ExecutionStatus(Status status) {
        this.status = status;
    }
    
    public ExecutionStatus(String corpusId) {
    	this.corpusId = corpusId;
    	this.status = Status.FINISHED;
    }
    
    public ExecutionStatus(Throwable failureCause) {
    	this.failureCause = failureCause;
    	this.status = Status.FAILED;
    }

    public Status getStatus() {
        return status;
    }
    
    public String getCorpusID() {
    	return corpusId;
    }
    
    public void setCorpusID(String corpusId) {
    	this.corpusId = corpusId;
    }
    
    public String getUserID() {
    	return userId;
    }
    
    public void setUserID(String userId) {
    	this.userId = userId;
    }
    

    public String getWorkflowId() {
    	return workflowId;
    }
    
    public void setWorkflowId(String workflowId) {
    	this.workflowId = workflowId;
    }
    
    
    public Throwable getFailureCause() {
    	return failureCause;
    }
}


