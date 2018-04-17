package eu.openminted.workflow.api;

import java.util.List;

public class WorkflowExecutionStatusMessage {

    private String workflowExecutionID;
    private String workflowID;
    private String workflowStatus;
    private String corpusID;
    private String resultingCorpusID;
    private String userID;
    private String error;
    
    private String workflowInvocationID;
    private String workflowJobIDs;

    public WorkflowExecutionStatusMessage() {

    }

    public WorkflowExecutionStatusMessage(String workflowExecutionID, String workflowID, String corpusID,
                                          String workflowStatus, String userID) {
        super();
        this.workflowExecutionID = workflowExecutionID;
        this.workflowID = workflowID;
        this.corpusID = corpusID;
        this.workflowStatus = workflowStatus;
        this.userID = userID;
    }

    public String getWorkflowInvocationID() {
		return workflowInvocationID;
	}

	public void setWorkflowInvocationID(String workflowInvocationID) {
		this.workflowInvocationID = workflowInvocationID;
	}

	public String getWorkflowJobIDs() {
		return workflowJobIDs;
	}

	public void setWorkflowJobIDs(String workflowJobIDs) {
		this.workflowJobIDs = workflowJobIDs;
	}

	public String getResultingCorpusID() {
        return resultingCorpusID;
    }

    public void setResultingCorpusID(String resultingCorpusID) {
        this.resultingCorpusID = resultingCorpusID;
    }

    public String getWorkflowExecutionID() {
        return workflowExecutionID;
    }

    public void setWorkflowExecutionID(String workflowExecutionID) {
        this.workflowExecutionID = workflowExecutionID;
    }

    public String getWorkflowID() {
        return workflowID;
    }

    public void setWorkflowID(String workflowID) {
        this.workflowID = workflowID;
    }

    public String getCorpusID() {
        return corpusID;
    }

    public void setCorpusID(String corpusID) {
        this.corpusID = corpusID;
    }

    public String getWorkflowStatus() {
        return workflowStatus;
    }

    public void setWorkflowStatus(String workflowStatus) {
        this.workflowStatus = workflowStatus;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}