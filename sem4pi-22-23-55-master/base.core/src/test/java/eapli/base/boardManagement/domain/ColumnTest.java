package eapli.base.boardManagement.domain;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ColumnTest {
    Column column = new Column("coluna",1);

    @Test
    public void equals(){
        Column column1 = new Column("coluna",1);
        assertEquals(column1,column);
    }

    @Test
    public void equalsFails(){
        Column column1 = new Column("diferente",2);
        assertNotEquals(column1,column);
    }
    @Test
    public void equalsFailsTitle(){
        Column column1 = new Column("diferente",1);
        assertNotEquals(column1,column);
    }

    @Test
    public void equalsFailsPosition(){
        Column column1 = new Column("coluna",2);
        assertNotEquals(column1,column);
    }

    @Test
    public void sameAs() {
        Column column1=new Column("coluna",1);
        assertTrue(column1.sameAs(column));
    }

    @Test
    public void sameAsInstance() {
        String ex = "example";
        assertFalse(column.sameAs(ex));
    }

    @Test
    public void columnTitle(){
        String expected = "coluna";
        assertEquals(expected,column.columnTitle);
    }
    @Test
    public void columnTitleFails(){
        String expected = "linha";
        assertNotEquals(expected,column.columnTitle);
    }

    @Test
    public void position(){
        int expected = 1;
        assertEquals(expected,column.position());
    }
    @Test
    public void positionFails(){
        int expected = 5;
        assertNotEquals(expected,column.position());
    }
}