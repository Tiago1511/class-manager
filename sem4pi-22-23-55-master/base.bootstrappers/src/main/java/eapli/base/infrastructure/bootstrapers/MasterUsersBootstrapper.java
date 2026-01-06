/*
 * Copyright (c) 2013-2023 the original author or authors.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package eapli.base.infrastructure.bootstrapers;

import java.util.HashSet;
import java.util.Set;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.dto.CourseDTO;
import eapli.base.studentManagement.domain.Student;
import eapli.base.teacherManagement.domain.Teacher;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.actions.Action;
import eapli.framework.infrastructure.authz.domain.model.Role;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

/**
 * @author Paulo Gandra Sousa
 */
public class MasterUsersBootstrapper extends UsersBootstrapperBase implements Action {

    @Override
    public boolean execute() {
        registerAdmin("adm", TestDataConstants.PASSWORD1, "Jane", "Doe Admin",
                "jane.doe@email.local");
        registerManager("man", TestDataConstants.PASSWORD1, "Jan", "Doe Man",
                "jan.man@email.local");
       SystemUser student = registerStudent("1211551",TestDataConstants.PASSWORD2, "Mary","Ann",
                "mary.ann@email.local");
       SystemUser teacher = registerTeacher("mcp",TestDataConstants.PASSWORD3, "Marco","Polo",
                "marco.polo@email.local");

        Teacher teacherUser = registerTeacherUser(teacher,"mp","123456789","1/1/1990");

        Student studentUser = registerStudentUser(student,"1211664","253704111","19/5/2003");

        CourseDTO course1 = registerCourse("SC1","Sciences","Intro-Sciences-Sem2","Biology, Chemistry, and Physics",30,100,"OPEN",teacherUser.acronym().acronym(),teacherUser.taxNumber().taxNumber());

        CourseDTO course2 = registerCourse("HMN1","Humanities","Intro-Humanities-Sem2","History",10,100,"OPEN",teacherUser.acronym().acronym(),teacherUser.taxNumber().taxNumber());

        return true;
    }

    /**
     *
     */
    private void registerAdmin(final String username, final String password, final String firstName,
                               final String lastName, final String email) {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);

        registerUser(username, password, firstName, lastName, email, roles);
    }

    private SystemUser registerStudent(final String username, final String password, final String firstName,
                               final String lastName, final String email) {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.STUDENT);

        return registerUser(username, password, firstName, lastName, email, roles);
    }

    private SystemUser registerTeacher(final String username, final String password, final String firstName,
                                 final String lastName, final String email) {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.TEACHER);

        return registerUser(username, password, firstName, lastName, email, roles);
    }
    private void registerManager(final String username, final String password, final String firstName,
                               final String lastName, final String email) {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.MANAGER);

        registerUser(username, password, firstName, lastName, email, roles);
    }
}
