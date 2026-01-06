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
package eapli.base.persistence.impl.inmemory;

import eapli.base.ClassManagement.application.repositories.ClassRepository;
import eapli.base.boardManagement.repositories.BoardRepository;
import eapli.base.boardManagement.repositories.ColumnRepository;
import eapli.base.boardManagement.repositories.PostitRepository;
import eapli.base.boardManagement.repositories.RowRepository;
import eapli.base.clientusermanagement.repositories.ClientUserRepository;
import eapli.base.clientusermanagement.repositories.SignupRequestRepository;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.base.examManagement.repositories.AutomaticFormativeExamRepository;
import eapli.base.examManagement.repositories.ExamRepository;
import eapli.base.examManagement.repositories.QuestionRepository;
import eapli.base.gradeManagement.repositories.GradeRepository;
import eapli.base.infrastructure.bootstrapers.BaseBootstrapper;
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
import eapli.framework.infrastructure.authz.repositories.impl.inmemory.InMemoryUserRepository;

/**
 *
 * Created by nuno on 20/03/16.
 */
public class InMemoryRepositoryFactory implements RepositoryFactory {

    static {
        // only needed because of the in memory persistence
        new BaseBootstrapper().execute();
    }

    @Override
    public UserRepository users(final TransactionalContext tx) {
        return new InMemoryUserRepository();
    }

    @Override
    public UserRepository users() {
        return users(null);
    }

    @Override
    public ClientUserRepository clientUsers(final TransactionalContext tx) {

        return new InMemoryClientUserRepository();
    }

    @Override
    public ClientUserRepository clientUsers() {
        return clientUsers(null);
    }

    @Override
    public SignupRequestRepository signupRequests() {
        return signupRequests(null);
    }

    @Override
    public TeacherRepository teachers() {
        return new InMemoryTeacherRepository();
    }

    @Override
    public CourseRepository courses() {
        return courses(null);
    }

    @Override
    public BoardRepository boards(){return boards(null);}

    @Override
    public RowRepository rows(){return rows(null);}

    @Override
    public ColumnRepository columns(){return columns(null);}

    @Override
    public EnrollmentRequestRepository enrollmentRequests() {
        return enrollmentRequests(null);
    }

    @Override
    public MeetingsRepository meetingss() {
        return meetingss(null);
    }

    @Override
    public StudentRepository students() {
        return new InMemoryStudentRepository();
    }

    @Override
    public ManagerRepository managers() {
        return new InMemoryManagerRepository();
    }

    @Override
    public CourseRepository courses(final TransactionalContext tx) {
        return new InMemoryCourseRepository();
    }

    @Override
    public BoardRepository boards(final TransactionalContext tx) {
        return new InMemoryBoardRepository();
    }

    @Override
    public RowRepository rows(final TransactionalContext tx) {
        return new InMemoryRowRepository();
    }

    @Override
    public ColumnRepository columns(final TransactionalContext tx) {
        return new InMemoryColumnRepository();
    }
    @Override
    public MeetingsRepository meetingss(final TransactionalContext tx) {
        return new InMemoryMeetingsRepository();
    }

    public ClassRepository classes(TransactionalContext autoTx) {
        return new InMemoryClassRepository();
    }

    @Override
    public ClassRepository classes() {
        return classes(null);
    }

    @Override
    public SignupRequestRepository signupRequests(final TransactionalContext tx) {
        return new InMemorySignupRequestRepository();
    }

    @Override
    public TransactionalContext newTransactionalContext() {
        // in memory does not support transactions...
        return null;
    }

    @Override
    public MeetingRepository meetings (final TransactionalContext tx) {
        return new InMemoryMeetingRepository();
    }


    @Override
    public MeetingRepository meetings () {
        return meetings(null);
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
    public EnrollmentRequestRepository enrollmentRequests(final TransactionalContext tx) {
        return new InMemoryEnrollmentRequestsRepository();
    }

    @Override
    public ExamRepository exams(/*TransactionalContext autoTx*/) {
        return new InMemoryExamRepository();
    }

    @Override
    public GradeRepository grades() {
        return new InMemoryGradeRepository();
    }

    @Override
    public QuestionRepository question() {
        return new InMemoryAddQuestionRepository();
    }

    public PostitRepository postits(TransactionalContext autoTx) {
        return new InMemoryPostitRepository();
    }

    @Override
    public PostitRepository postits() {
        return postits(null);

    }

    @Override
    public AutomaticFormativeExamRepository automaticExam() {
        return null;
    }

}
