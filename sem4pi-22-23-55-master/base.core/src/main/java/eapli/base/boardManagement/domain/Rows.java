package eapli.base.boardManagement.domain;


import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Rows implements AggregateRoot<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long idRow;

    private String rowTitle;
    private int position;

    public Rows(String rowTitle, int position) {

        this.rowTitle = rowTitle;
        this.position = position;
    }

    protected Rows(){

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rows rows = (Rows) o;
        return position == rows.position && Objects.equals(rowTitle, rows.rowTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rowTitle);
    }

    @Override
    public boolean sameAs(Object other) {
        return DomainEntities.areEqual(this,other);
    }

    public String rowTitle() {
        return rowTitle;
    }

    public void setRowTitle(String rowTitle) {
        this.rowTitle = rowTitle;
    }

    public int position(){
        return this.position;
    }

    @Override
    public Long identity() {
        return null;
    }
}
