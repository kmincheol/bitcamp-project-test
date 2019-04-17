package bitcamp.project.test;

import bitcamp.project.test.service.BoardService;
import bitcamp.project.test.service.MemberService;
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

    MemberService member = new MemberService();
    member.list();

    PhotoBoardService photoBoard = new PhotoBoardService();
    photoBoard.list();

    BoardService b = new BoardService();
    b.count();
    System.out.println("-------------------");
    for (int i = 1; i < 10; i++) {
      System.out.print(i +",");
    }
  }
}
