package com.stephanie.mycapec.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "apdb")
@Entity
public class Apdb implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "Abstraction", nullable = false)
    private String Abstraction;

    @Column(name = "Consequences")
    private String Consequences;

    @Column(name = "Description")
    private String Description;

    @Column(name = "Example_Instances")
    private String exampleInstances;

    @Column(name = "Execution_Flow")
    private String executionFlow;

    @Column(name = "FIELD21")
    private String FIELD21;

    @Id
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    @Column(name = "Indicators")
    private String Indicators;

    @Column(name = "Likelihood_Of_Attack")
    private String likelihoodOfAttack;

    @Column(name = "Mitigations")
    private String Mitigations;

    @Column(name = "Name", nullable = false)
    private String Name;

    @Column(name = "Notes")
    private String Notes;

    @Column(name = "Prerequisites")
    private String Prerequisites;

    @Column(name = "Related_Attack_Patterns")
    private String relatedAttackPatterns;

    @Column(name = "Related_Weaknesses")
    private String relatedWeaknesses;

    @Column(name = "Resources_Required")
    private String resourcesRequired;

    @Column(name = "Skills_Required")
    private String skillsRequired;

    @Column(name = "Status", nullable = false)
    private String Status;

    @Column(name = "Taxonomy_Mappings")
    private String taxonomyMappings;

    @Column(name = "Typical_Severity")
    private String typicalSeverity;

    public String getAbstraction() {
        return Abstraction;
    }

    public void setAbstraction(String Abstraction) {
        this.Abstraction = Abstraction;
    }

    public String getConsequences() {
        return Consequences;
    }

    public void setConsequences(String Consequences) {
        this.Consequences = Consequences;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getExampleInstances() {
        return exampleInstances;
    }

    public void setExampleInstances(String exampleInstances) {
        this.exampleInstances = exampleInstances;
    }

    public String getExecutionFlow() {
        return executionFlow;
    }

    public void setExecutionFlow(String executionFlow) {
        this.executionFlow = executionFlow;
    }

    public String getFIELD21() {
        return FIELD21;
    }

    public void setFIELD21(String FIELD21) {
        this.FIELD21 = FIELD21;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getIndicators() {
        return Indicators;
    }

    public void setIndicators(String Indicators) {
        this.Indicators = Indicators;
    }

    public String getLikelihoodOfAttack() {
        return likelihoodOfAttack;
    }

    public void setLikelihoodOfAttack(String likelihoodOfAttack) {
        this.likelihoodOfAttack = likelihoodOfAttack;
    }

    public String getMitigations() {
        return Mitigations;
    }

    public void setMitigations(String Mitigations) {
        this.Mitigations = Mitigations;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    public String getPrerequisites() {
        return Prerequisites;
    }

    public void setPrerequisites(String Prerequisites) {
        this.Prerequisites = Prerequisites;
    }

    public String getRelatedAttackPatterns() {
        return relatedAttackPatterns;
    }

    public void setRelatedAttackPatterns(String relatedAttackPatterns) {
        this.relatedAttackPatterns = relatedAttackPatterns;
    }

    public String getRelatedWeaknesses() {
        return relatedWeaknesses;
    }

    public void setRelatedWeaknesses(String relatedWeaknesses) {
        this.relatedWeaknesses = relatedWeaknesses;
    }

    public String getResourcesRequired() {
        return resourcesRequired;
    }

    public void setResourcesRequired(String resourcesRequired) {
        this.resourcesRequired = resourcesRequired;
    }

    public String getSkillsRequired() {
        return skillsRequired;
    }

    public void setSkillsRequired(String skillsRequired) {
        this.skillsRequired = skillsRequired;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getTaxonomyMappings() {
        return taxonomyMappings;
    }

    public void setTaxonomyMappings(String taxonomyMappings) {
        this.taxonomyMappings = taxonomyMappings;
    }

    public String getTypicalSeverity() {
        return typicalSeverity;
    }

    public void setTypicalSeverity(String typicalSeverity) {
        this.typicalSeverity = typicalSeverity;
    }

    public String toString() {
        return "Apdb{Abstraction=" + Abstraction +
                ", Consequences=" + Consequences +
                ", Description=" + Description +
                ", exampleInstances=" + exampleInstances +
                ", executionFlow=" + executionFlow +
                ", FIELD21=" + FIELD21 +
                ", ID=" + ID +
                ", Indicators=" + Indicators +
                ", likelihoodOfAttack=" + likelihoodOfAttack +
                ", Mitigations=" + Mitigations +
                ", Name=" + Name +
                ", Notes=" + Notes +
                ", Prerequisites=" + Prerequisites +
                ", relatedAttackPatterns=" + relatedAttackPatterns +
                ", relatedWeaknesses=" + relatedWeaknesses +
                ", resourcesRequired=" + resourcesRequired +
                ", skillsRequired=" + skillsRequired +
                ", Status=" + Status +
                ", taxonomyMappings=" + taxonomyMappings +
                ", typicalSeverity=" + typicalSeverity +
                "}";
    }
}