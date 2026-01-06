package eapli.base.boardManagement.domain;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import eapli.framework.infrastructure.authz.domain.model.*;

public class RowsTest {
    Rows row = new Rows("linha",1);

    @Test
    public void equals(){
        Rows row1 = new Rows("linha",1);
        assertEquals(row1,row);
    }

    @Test
   public void equalsFails(){
        Rows row1 = new Rows("diferente",2);
        assertNotEquals(row1,row);
    }
    @Test
    public void equalsFailsTitle(){
        Rows row1 = new Rows("diferente",1);
        assertNotEquals(row1,row);
    }

    @Test
    public void equalsFailsPosition(){
        Rows row1 = new Rows("linha",2);
        assertNotEquals(row1,row);
    }

    @Test
    public void sameAs() {
        Rows row1=new Rows("linha",1);
        assertTrue(row1.sameAs(row));
    }

    @Test
     public void sameAsInstance() {
        String ex = "example";
        assertFalse(row.sameAs(ex));
    }

    @Test
    public void rowTitle(){
        String expected = "linha";
        assertEquals(expected,row.rowTitle());
    }
    @Test
    public void rowTitleFails(){
        String expected = "coluna";
        assertNotEquals(expected,row.rowTitle());
    }

    @Test
    public void position(){
        int expected = 1;
        assertEquals(expected,row.position());
    }
    @Test
    public void positionFails(){
        int expected = 5;
        assertNotEquals(expected,row.position());
    }
}
