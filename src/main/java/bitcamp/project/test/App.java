package bitcamp.project.test;

import bitcamp.project.test.service.BoardService;

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
    
    Member member = MemberService();
    
=======
    BoardService b = new BoardService();
    b.count();
    System.out.println("-------------------");
    for (int i = 1; i < 10; i++) {
      System.out.print(i +",");
    }
>>>>>>> branch 'master' of https://github.com/kmincheol/bitcamp-project-test.git
  }
} 
