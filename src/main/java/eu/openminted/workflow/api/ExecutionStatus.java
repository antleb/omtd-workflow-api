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

    private String subArchive;
    
    private String userId;
    
    private String workflowId;
    
    private Throwable failureCause;

    // anything else to be decided. Error messages, statistics, execution metadata (dates etc)...

    public ExecutionStatus(String userID, String workflowId, String corpusId) {
        this.status = Status.PENDING;
        
        this.userId = userID;
        this.workflowId = workflowId;
        this.corpusId = corpusId;
    }
    
    public ExecutionStatus(ExecutionStatus previous, Status status) {
    	this.status = status;
    	
    	this.corpusId = previous.corpusId;
    	this.userId = previous.userId;
    	this.workflowId = previous.workflowId;
    	this.failureCause = previous.failureCause;
    }
    
    public ExecutionStatus(ExecutionStatus previous, String corpusId) {
    	this.corpusId = corpusId;
    	this.status = Status.FINISHED;
    	
    	this.userId = previous.userId;
    	this.workflowId = previous.workflowId;
    	this.failureCause = previous.failureCause;
    }
    
    public ExecutionStatus(ExecutionStatus previous, Throwable failureCause) {
    	this.failureCause = failureCause;
    	this.status = Status.FAILED;
    	
    	this.corpusId = previous.corpusId;
    	this.userId = previous.userId;
    	this.workflowId = previous.workflowId;
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

    public String getSubArchive() {
        return subArchive;
    }

    public void setSubArchive(String subArchive) {
        this.subArchive = subArchive;
    }
}


