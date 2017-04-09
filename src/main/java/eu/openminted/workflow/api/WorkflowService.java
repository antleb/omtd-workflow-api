package eu.openminted.workflow.api;

/**
 * <p>
 * This service is called by the registry (and external users through a REST API) to manage the execution of workflows.
 * In essence, it is the OpenMinTeD wrapper around Galaxy workflow engine, hiding the Galaxy specific details.
 *</p>
 *
 * <p>
 * The service is executing the workflow jobs asynchronously and provides the users with the means to manage the
 * execution (pause, resume or cancel) and query its progress.
 * </p>
 *
 * <p>
 * The progress of the execution of a workflow is broadcast by the service using JMS. The service is also monitoring JMS
 * for changes in the registry and updates the galaxy tool shed accordingly. The topic names and message
 * payloads are described <a href="https://docs.google.com/document/d/1eZ4YHruWUe25goCKrMG6jcoCJOpSiQIgUYOHhxwge4Q/edit" target="_blank">here</a>
 * </p>
 */
public interface WorkflowService {

    public String execute(WorkflowJob workflowJob) throws WorkflowException;

    public void cancel(String workflowExecutionId)  throws WorkflowException;

    public void pause(String workflowExecutionId) throws WorkflowException;

    public void resume(String workflowExecutionId) throws WorkflowException;

    public ExecutionStatus getExecutionStatus(String workflowExecutionId) throws WorkflowException;
}
