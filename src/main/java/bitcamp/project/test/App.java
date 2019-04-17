package bitcamp.project.test;

import bitcamp.project.test.service.BoardService;
import bitcamp.project.test.service.MemberServiceKi;
import bitcamp.project.test.service.PhotoBoardService;

public class App {
  public String getGreeting() {
    return "Hello world.";
  }

  public static void main(String[] args) {
    System.out.println("******************************");
    BoardService board = new BoardService();
    board.list();
    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    
    MemberServiceKi member = new MemberServiceKi();
    member.list();

    PhotoBoardService photoBoard = new PhotoBoardService();
    photoBoard.list();

    BoardService b = new BoardService();
    b.count();
    System.out.println("-------------------");
    for (int i = 1; i < 10; i++) {
      member.list();
      System.out.print(i +",");
    }
    
    System.out.println("-------------------");
    MemberServiceKi m = new MemberServiceKi();
    m.list();
    System.out.println("-------------------");
    
  }
}
