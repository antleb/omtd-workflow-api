package eu.openminted.workflow.api;

public class WorkflowExecutionStatusMessage {
	
	// the ID (or name) of the workflow
	private String workflowID;

	// the ID given to the execution of the workflow by the workflow service
	private String workflowExecutionID;

	// the current status of the workflow execution. This is a simple label such
	// as pending, running, failed etc.
	private String workflowStatus;

	// the ID of the corpus we are processing
	private String corpusID;

	// the ID of the corpus that holds the output annotations
	private String resultingCorpusID;

	// the ID of the user who requested this execution
	private String userID;

	// a description of an error if one has occurred
	private String error;

	// the Galaxy ID of the invocation of the workflow
	private String workflowInvocationID;

	// a | separated list of the Galaxy job IDs equating to the steps of this
	// invocation of the workflow
	private String workflowJobIDs;

	// a description of the current status which adds more information over the
	// simple status label
	private String workflowStatusDescription;

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

	public String getWorkflowStatusDescription() {
		return workflowStatusDescription;
	}

	public void setWorkflowStatusDescription(String workflowStatusDescription) {
		this.workflowStatusDescription = workflowStatusDescription;
	}

}