package eapli.base.boardManagement.domain;

import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.Column;
import javax.persistence.*;
import java.util.Calendar;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class PostIt implements AggregateRoot<Integer> {

    @ManyToOne
    private Board board;
    @Column
    private Integer lastVersionId;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    @Temporal(TemporalType.DATE)
    private Calendar date;

    //@OneToOne
    private Cell cell;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private boolean active;

    public PostIt(Calendar date, Board board, Cell cell, String title, String content, boolean active, Integer lastVersionId) {
        //super(board, cell);
        this.date = date;
        //this.board = board;
        //this.cell = cell;
        this.title = title;
        this.content = content;
        this.active = active;
        this.lastVersionId = lastVersionId;
        cell.setHasPostIt(true);

    }

    public PostIt() {

    }

    public PostIt(Cell cell, String title, String content, Board board, Integer lastVersionId) {
        this.date = Calendar.getInstance();
        //this.board = cell.;
        this.title = title;
        this.content = content;
        this.active = true;
        this.cell = cell;
        this.board = board;
        this.lastVersionId = lastVersionId;
        cell.setHasPostIt(true);
    }

    @Override
    public boolean sameAs(Object other) {
        return false;
    }

    @Override
    public Integer identity() {
        return id;
    }

    public void changeTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Board getBoard() {
        return board;
    }

    public Integer getLastVersionId() {
        return lastVersionId;
    }

    public Integer getId() {
        return id;
    }

    public Calendar getDate() {
        return date;
    }

    public Cell getCell() {
        return cell;
    }

    public String getContent() {
        return content;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

