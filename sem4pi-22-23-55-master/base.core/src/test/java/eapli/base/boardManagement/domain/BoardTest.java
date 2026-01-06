package eapli.base.boardManagement.domain;

import eapli.base.coursemanagement.domain.Capacity;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.domain.Edition;
import eapli.base.coursemanagement.domain.Status;
import eapli.base.coursemanagement.dto.CourseDTO;
import eapli.base.teacherManagement.domain.Acronym;
import eapli.base.teacherManagement.domain.TaxNumber;
import eapli.base.teacherManagement.domain.Teacher;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.domain.model.*;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {
        public static SystemUser dummyUser(final String username, final Role... roles) {
            final SystemUserBuilder userBuilder = new SystemUserBuilder(new NilPasswordPolicy(), new PlainTextEncoder());
            return userBuilder.with(username, "duMMy1", "dummy", "dummy", "a@b.ro").withRoles(roles).build();
        }
        Rows row1 = new Rows("linha1",1);
        Rows row2 = new Rows("linha2",2);

        Set<Rows> rowsSet = new HashSet<>();
        Column column1 = new Column("coluna1",1);
        Column column2 = new Column("coluna2",2);

       Set<Column> columnSet = new HashSet<>();

       Set<SystemUser> systemUsers = new HashSet<>();
    private SystemUser owner() {
        return dummyUser("user", BaseRoles.ADMIN);
    }

    public void prepare(){
        rowsSet.add(row1);
        rowsSet.add(row2);
        columnSet.add(column1);
        columnSet.add(column2);
        systemUsers.add(owner());
    }
    Board board = new Board("Titulo",rowsSet,columnSet,null,owner(),systemUsers);
        @Test
        void sameAs() {
            Board board1 = new Board("Titulo",rowsSet,columnSet,null,owner(),systemUsers);
            assertTrue(board1.sameAs(board));
        }

        @Test
        void sameAsInstance() {
            assertFalse(board.sameAs(owner()));
        }

        @Test
        void testEquals() {
            Board board1 = new Board("Titulo",rowsSet,columnSet,null,owner(),systemUsers);
            assertTrue(board1.equals(board));
        }

        @Test
        void failTestEquals() {
            Board board1 = new Board("Diferente",rowsSet,columnSet,null,owner(),systemUsers);
            assertFalse(board1.equals(board));
        }


        @Test
        void title() {
            String expected = "Titulo";
            assertEquals(expected, board.getBoardTitle());
        }

    @Test
    void failtitle() {
        String expected = "Diferente";
        assertNotEquals(expected, board.getBoardTitle());
    }



    }

