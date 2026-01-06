package eapli.base.boardManagement.application;

import eapli.base.boardManagement.domain.Board;
import eapli.base.boardManagement.repositories.BoardRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.managerManagement.domain.Manager;
import eapli.base.managerManagement.repositories.ManagerRepository;
import eapli.base.studentCourseManagment.repositories.StudentRepository;
import eapli.base.studentManagement.domain.Student;
import eapli.base.teacherManagement.domain.Teacher;
import eapli.base.teacherManagement.repositories.TeacherRepository;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;

import java.util.Scanner;

public class ShareBoardController {

   private final BoardRepository boardRepository = PersistenceContext.repositories().boards();
   private final StudentRepository studentRepository = PersistenceContext.repositories().students();
   private final TeacherRepository teacherRepository = PersistenceContext.repositories().teachers();
   private final ManagerRepository managerRepository = PersistenceContext.repositories().managers();

   private Scanner scanner = new Scanner(System.in);


   public Board selectedBoard(){
      final AuthorizationService authz = AuthzRegistry.authorizationService();

      final SystemUser systemUser = (authz.session().get().authenticatedUser());

      Scanner scanner = new Scanner(System.in);
      Iterable<Board> boards = boardRepository.findAllBoardsOwnByUser(systemUser);
      int option = 1;
      for (Board board : boards) {
         System.out.println(option + ". " + board.getBoardTitle());
         option++;
      }

      System.out.print("Select an option: ");
      int selectedOption = scanner.nextInt();

      // Find the selected board based on the selectedOption
      Board selectedboard = null;
      option = 1;
      for (Board board : boards) {
         if (option == selectedOption) {
            selectedboard = board;
            break;
         }
         option++;
      }
      return selectedboard;
   }

   public void ManagerShare(Board board) {
      Iterable<Manager> managers = managerRepository.findAll();
      int option = 1;
      for (Manager manager : managers) {
         System.out.println(option + ". " + manager.getSystemUser().name().toString());
         option++;
      }

      System.out.print("Select an option: ");
      int selectedOption = scanner.nextInt();

      // Find the selected manager based on the selectedOption
      Manager selectedManager = null;
      option = 1;
      for (Manager manager : managers) {
         if (option == selectedOption) {
            selectedManager = manager;
            break;
         }
         option++;
      }
      SystemUser user = selectedManager.getSystemUser();
      board.addUser(user);
      boardRepository.save(board);
      System.out.println("The board has successfully been shared with "+user.name().toString());

   }

   public void TeacherShare(Board board) {
      Iterable<Teacher> teachers = teacherRepository.findAll();
      int option = 1;
      for (Teacher teacher : teachers) {
         System.out.println(option + ". " + teacher.getSystemUser().name().toString());
         option++;
      }

      System.out.print("Select an option: ");
      int selectedOption = scanner.nextInt();

      // Find the selected Teacher based on the selectedOption
      Teacher selectedTeacher = null;
      option = 1;
      for (Teacher Teacher : teachers) {
         if (option == selectedOption) {
            selectedTeacher = Teacher;
            break;
         }
         option++;
      }
      SystemUser user = selectedTeacher.getSystemUser();
      board.addUser(user);
      boardRepository.save(board);
      System.out.println("The board has successfully been shared with "+user.name().toString());

   }

   public void StudentShare(Board board) {
      Iterable<Student> Students = studentRepository.findAll();
      int option = 1;
      for (Student student : Students) {
         System.out.println(option + ". " + student.getSystemUser().name().toString());
         option++;
      }

      System.out.print("Select an option: ");
      int selectedOption = scanner.nextInt();

      // Find the selected Student based on the selectedOption
      Student selectedStudent = null;
      option = 1;
      for (Student student : Students) {
         if (option == selectedOption) {
            selectedStudent = student;
            break;
         }
         option++;
      }
      SystemUser user = selectedStudent.getSystemUser();
      board.addUser(user);
      boardRepository.save(board);
      System.out.println("The board has successfully been shared with "+user.name().toString());

   }
}


