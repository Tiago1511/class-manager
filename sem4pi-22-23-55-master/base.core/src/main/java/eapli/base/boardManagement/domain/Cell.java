package eapli.base.boardManagement.domain;

import javax.persistence.Embeddable;
import javax.persistence.OneToOne;

@Embeddable
public class Cell {
    //private Board boardId;

   /* @OneToOne
    private Rows row;

    @OneToOne
    private Column column;*/
    private int linha;
    private int coluna;

    private boolean hasPostIt;

   /*
    private PostIt postIt;
*/

    public Cell(/*Board boardId,*/ int row, int column, boolean hasPostIt) {
        //this.boardId = boardId;
        this.hasPostIt = hasPostIt;
        this.linha = row;
        this.coluna = column;
    }

    protected Cell() {

    }

   /* public Board getBoardId() {
        return boardId;
    }

    public void setBoardId(Board boardId) {
        this.boardId = boardId;
    }*/

   /* public Rows getRow() {
        return row;
    }

    public void setRow(Rows row) {
        this.row = row;
    }

    public Column getColumn() {
        return column;
    }

    public void setColumn(Column column) {
        this.column = column;
    }*/

    public boolean isHasPostIt() {
        return hasPostIt;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public void setHasPostIt(boolean hasPostIt) {
        this.hasPostIt = hasPostIt;
    }
}
