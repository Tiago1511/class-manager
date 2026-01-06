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
package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.ClassManagement.application.repositories.ClassRepository;
import eapli.base.boardManagement.repositories.BoardRepository;
import eapli.base.boardManagement.repositories.ColumnRepository;
import eapli.base.boardManagement.repositories.PostitRepository;
import eapli.base.boardManagement.repositories.RowRepository;
import eapli.base.clientusermanagement.repositories.SignupRequestRepository;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.base.examManagement.repositories.AutomaticFormativeExamRepository;
import eapli.base.examManagement.repositories.ExamRepository;
import eapli.base.examManagement.repositories.QuestionRepository;
import eapli.base.gradeManagement.repositories.GradeRepository;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.managerManagement.repositories.ManagerRepository;
import eapli.base.meetingsManagement.repositories.MeetingRepository;
import eapli.base.meetingsManagement.repositories.MeetingsRepository;
import eapli.base.requestManagement.repositories.EnrollmentRequestRepository;
import eapli.base.studentCourseManagment.repository.StudentCourseRepository;
import eapli.base.studentCourseManagment.repositories.StudentRepository;
import eapli.base.teacherManagement.repositories.TeacherRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;
import eapli.framework.infrastructure.authz.repositories.impl.jpa.JpaAutoTxUserRepository;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

/**
 *
 * Created by nuno on 21/03/16.
 */
public class JpaRepositoryFactory implements RepositoryFactory {

    @Override
    public UserRepository users(final TransactionalContext autoTx) {
        return new JpaAutoTxUserRepository(autoTx);
    }

    @Override
    public UserRepository users() {
        return new JpaAutoTxUserRepository(Application.settings().getPersistenceUnitName(),
                Application.settings().getExtendedPersistenceProperties());
    }

    @Override
    public JpaClientUserRepository clientUsers(final TransactionalContext autoTx) {
        return new JpaClientUserRepository(autoTx);
    }

    @Override
    public JpaClientUserRepository clientUsers() {
        return new JpaClientUserRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public SignupRequestRepository signupRequests(final TransactionalContext autoTx) {
        return new JpaSignupRequestRepository(autoTx);
    }

    @Override
    public SignupRequestRepository signupRequests() {
        return new JpaSignupRequestRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public TeacherRepository teachers() {
        return new JpaTeacherRepository();
    }

    @Override
    public CourseRepository courses() {
        return new JpaCourseRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public BoardRepository boards() {
        return new JpaBoardRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public RowRepository rows() {
        return new JpaRowRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public ColumnRepository columns() {
        return new JpaColumnRepository(Application.settings().getPersistenceUnitName());
    }


    @Override
    public EnrollmentRequestRepository enrollmentRequests() {
        return new JpaEnrollmentRequestsRepository(Application.settings().getPersistenceUnitName());
    }


    @Override
    public MeetingsRepository meetingss() {
        return new JpaMeetingsRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public ClassRepository classes() {
        return new JpaClassRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public StudentRepository students() {
        return new JpaStudentRepository();
    }

    @Override
    public ManagerRepository managers() {
        return new JpaManagerRepository();
    }

    @Override
    public CourseRepository courses(final TransactionalContext autoTx) {
        return new JpaCourseRepository(autoTx);
    }

    @Override
    public BoardRepository boards(final TransactionalContext autoTx) {
        return new JpaBoardRepository(autoTx);
    }

    @Override
    public RowRepository rows(final TransactionalContext autoTx) {
        return new JpaRowRepository(autoTx);
    }

    @Override
    public ColumnRepository columns(final TransactionalContext autoTx) {
        return new JpaColumnRepository(autoTx);
    }

    @Override
    public MeetingsRepository meetingss(final TransactionalContext autoTx) {
        return new JpaMeetingsRepository(autoTx);
    }

    @Override
    public ClassRepository classes(final TransactionalContext autoTx) {
        return new JpaClassRepository(autoTx);
    }

    @Override
    public TransactionalContext newTransactionalContext() {
        return JpaAutoTxRepository.buildTransactionalContext(Application.settings().getPersistenceUnitName(),
                Application.settings().getExtendedPersistenceProperties());
    }

    @Override
    public MeetingRepository meetings( TransactionalContext autoTx) {
        return new JpaMeetingRepository(autoTx);
    }

    @Override
    public MeetingRepository meetings() {
        return new JpaMeetingRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public StudentCourseRepository studentCourses(TransactionalContext txCtx) {
        return null;
    }

    @Override
    public StudentRepository studentUsers(TransactionalContext txCtx) {
        return null;
    }

    @Override
    public EnrollmentRequestRepository enrollmentRequests(TransactionalContext txCtx) {
        return new JpaEnrollmentRequestsRepository(txCtx);
    }

    @Override
    public ExamRepository exams() {
        return new JpaExamRepository();
    }


    @Override
    public GradeRepository grades() {
        return new JpaGradeRepository();
    }

    @Override

    public QuestionRepository question() {
        return new JpaQuestionRepository();
    }

    public PostitRepository postits(final TransactionalContext autoTx) {
        return new JpaPostitsRepository(autoTx);
    }

    @Override
    public PostitRepository postits() {
        return new JpaPostitsRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public AutomaticFormativeExamRepository automaticExam() {
        return new JpaAutomaticExam();
    }

}
