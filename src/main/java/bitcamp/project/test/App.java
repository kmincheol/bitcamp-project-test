package bitcamp.project.test;

import bitcamp.project.test.service.BoardService;
<<<<<<< HEAD
import bitcamp.project.test.service.MemberService;
import bitcamp.project.test.service.PhotoBoardService;
=======
import bitcamp.project.test.service.MemberServiceKi;
>>>>>>> branch 'master' of https://github.com/kmincheol/bitcamp-project-test.git

public class App {
  public String getGreeting() {
    return "Hello world.";
  }

  public static void main(String[] args) {
<<<<<<< HEAD
    System.out.println("******************************");
    BoardService board = new BoardService();
    board.list();
    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

    MemberService member = new MemberService();
    member.list();

    PhotoBoardService photoBoard = new PhotoBoardService();
    photoBoard.list();

=======
>>>>>>> branch 'master' of https://github.com/kmincheol/bitcamp-project-test.git
    BoardService b = new BoardService();
    b.count();
    System.out.println("-------------------");
    for (int i = 1; i < 10; i++) {
      System.out.print(i +",");
    }
<<<<<<< HEAD
=======
     
    System.out.println("-------------------");
    MemberServiceKi m = new MemberServiceKi();
    m.list();
    System.out.println("-------------------");
    
>>>>>>> branch 'master' of https://github.com/kmincheol/bitcamp-project-test.git
  }
}
