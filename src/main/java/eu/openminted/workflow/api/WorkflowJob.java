package eu.openminted.workflow.api;

import eu.openminted.registry.domain.Component;

/**
 * Created by antleb on 07/04/2017.
 */
public class WorkflowJob {

    private Component workflow;
    private String corpusId;

    // TBD: private UserInfo userInfo;


    public WorkflowJob() {
    }

    public WorkflowJob(Component workflow, String corpusId) {
        this.workflow = workflow;
        this.corpusId = corpusId;
    }

    public Component getWorkflow() {
        return workflow;
    }

    public void setWorkflow(Component workflow) {
        this.workflow = workflow;
    }

    public String getCorpusId() {
        return corpusId;
    }

    public void setCorpusId(String corpusId) {
        this.corpusId = corpusId;
    }
}
