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

import java.util.Set;

import eapli.base.coursemanagement.application.RegisterCourseController;
import eapli.base.coursemanagement.application.viadto.RegisterCourseViasDTOController;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.dto.CourseDTO;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.studentManagement.application.RegisterStudentController;
import eapli.base.studentManagement.domain.Student;
import eapli.base.teacherManagement.application.RegisterTeacherController;
import eapli.base.teacherManagement.domain.Teacher;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eapli.base.usermanagement.application.AddUserController;
import eapli.base.usermanagement.application.ListUsersController;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.infrastructure.authz.domain.model.Role;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Username;

public class UsersBootstrapperBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(UsersBootstrapperBase.class);

    final AddUserController userController = new AddUserController();
    final ListUsersController listUserController = new ListUsersController();

    final RegisterTeacherController registerTeacherController = new RegisterTeacherController();

    final RegisterStudentController registerStudentController = new RegisterStudentController();

    private final RegisterCourseViasDTOController theController = new RegisterCourseViasDTOController();

    public UsersBootstrapperBase() {
        super();
    }

    /**
     * @param username
     * @param password
     * @param firstName
     * @param lastName
     * @param email
     * @param roles
     */
    protected SystemUser registerUser(final String username, final String password, final String firstName,
            final String lastName, final String email, final Set<Role> roles) {
        SystemUser u = null;
        try {
            u = userController.addUser(username, password, firstName, lastName, email, roles);
            LOGGER.debug("»»» %s", username);
        } catch (final IntegrityViolationException | ConcurrencyException e) {
            // assuming it is just a primary key violation due to the tentative
            // of inserting a duplicated user. let's just lookup that user
            u = listUserController.find(Username.valueOf(username)).orElseThrow(() -> e);
        }
        return u;
    }

    protected Teacher registerTeacherUser(final SystemUser user, final String acronym, final String taxNumber, final String birthday){
       return registerTeacherController.registerNewTeacher(user,acronym,taxNumber,birthday);
    }

    protected Student registerStudentUser(final SystemUser user, final String mecanographicNumber, final String taxNumber, final String birthday){
        return registerStudentController.registerNewStudent(user,mecanographicNumber,taxNumber,birthday);
    }

    protected CourseDTO registerCourse(String code, String title, String edition,String description, Integer minCapacity, Integer maxCapacity , String status, String acronym, String taxNumber){
        final var course = new CourseDTO(code, title, edition, description, minCapacity, maxCapacity,status,acronym,taxNumber);

        return theController.registerCourse(course);
    }
}
