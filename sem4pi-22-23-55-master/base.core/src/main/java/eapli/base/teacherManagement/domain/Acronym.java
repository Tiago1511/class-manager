package eapli.base.teacherManagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Acronym implements ValueObject, Comparable<Acronym>  {

    @Column (name = "acronym")
    private String description;


    public Acronym(String description) {
        if (StringPredicates.isNullOrEmpty(description)||!validAcronym(description)) {
            throw new IllegalArgumentException(
                    "acronym description should neither be null nor empty and must be valid");
        }
        // TODO validate invariants,
        // expression
        this.description = description;
    }

    protected Acronym(){}
    public String acronym() {
        return this.description;
    }

    protected boolean validAcronym(String description){
        if (description.matches(".*\\d+.*")){
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Acronym o) {
        return description.compareTo(o.description);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Acronym acronym = (Acronym) o;
        return Objects.equals(description, acronym.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }

    @Override
    public String toString() {
        return description;
    }
}
