package eapli.base.boardManagement.domain;

import com.ibm.icu.impl.Row;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.time.util.CurrentTimeCalendars;

import javax.persistence.*;
import java.util.*;

@Entity
public class Board implements AggregateRoot<Integer> {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @OneToOne
    private SystemUser creator;

    @OneToMany
    private Set<SystemUser> users;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar lastUpdate;

    //@Column(nullable = false)
    private String boardTitle;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Rows> rows;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Column> columns;

    @ElementCollection()
    @javax.persistence.Column(unique = true)
    private Set<Cell> cell;

    @OneToMany(cascade = CascadeType.ALL)
    private List<BoardHistoryUpdates> updates;

    public Board(String boardTitle, Set<Rows> rows, Set<Column> columns, Set<Cell> cell, SystemUser creator, Set<SystemUser> users) {
        this.boardTitle = boardTitle;
        this.rows = rows;
        this.columns = columns;
        this.cell = cell;
        this.users = users;
        this.creator = creator;
        this.updates = new ArrayList<>();
        this.active = true;
    }

    public List<BoardHistoryUpdates> getUpdates() {
        return updates;
    }


    @Temporal(TemporalType.DATE)
    private Calendar archivedOn;


    private boolean active;


    public void archiveBoard(final Calendar archivedOn) {
        if (!isArchived()) {
            this.archivedOn = archivedOn;
            this.active = false;
        } else {
            throw new UnsupportedOperationException("Board is already been archived!");
        }
    }

    public SystemUser getOwner() {
        return creator;
    }

    public boolean isArchived() {
        return !this.active;
    }

    public void updateBoard() {
        this.lastUpdate = CurrentTimeCalendars.now();
    }

    protected Board() {

    }

    /*public void addRow(Row row) {
        rows.add(row);
    }

    public Set<Row> getRows() {
        return rows;
    }*/
    public String getBoardTitle() {
        return boardTitle;
    }

    public int numberOfColumns() {
        return columns.size();
    }

    public int numberOfRows() {
        return rows.size();
    }

    public Set<Rows> getRows() {
        return rows;
    }

    public Set<Column> getColumns() {
        return columns;
    }

    public Set<Cell> cells() {
        return cell;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public Cell getCell(Cell cell) {
        Cell[] cells = cells().toArray(new Cell[0]);
        for (Cell c : cells) {
            if (c.equals(cell)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return Objects.equals(boardTitle, board.boardTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boardTitle);
    }

    @Override
    public boolean sameAs(Object other) {
        return DomainEntities.areEqual(this, other);
    }

    @Override
    public Integer identity() {
        return this.id;
    }

    public void setUsers(Set<SystemUser> users) {
        this.users = users;
    }

    public Set<SystemUser> getUsers() {
        return users;
    }

    public Set<SystemUser> addUser(SystemUser user) {
        Set<SystemUser> users = getUsers();
        users.add(user);
        return users;
    }
}
