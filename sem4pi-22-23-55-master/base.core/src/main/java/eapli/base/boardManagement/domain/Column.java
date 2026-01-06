package eapli.base.boardManagement.domain;

import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Column implements AggregateRoot<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long idColumn;

    String columnTitle;

    private int position;

    public Column(String columnTitle, int position) {
        this.columnTitle = columnTitle;
        this.position=position;
    }

    public Column() {

    }

    public String getColumnTitle() {
        return columnTitle;
    }

    public void setColumnTitle(String columnTitle) {
        this.columnTitle = columnTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Column column = (Column) o;
        return position == column.position && Objects.equals(columnTitle, column.columnTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnTitle);
    }

    @Override
    public boolean sameAs(Object other) {
        return DomainEntities.areEqual(this,other);
    }

    public int position(){
        return this.position;
    }

    @Override
    public Long identity() {
        return null;
    }

}
