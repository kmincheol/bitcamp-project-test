package bitcamp.project.test;

import bitcamp.project.test.service.BoardService;

import bitcamp.project.test.service.MemberService;

public class App {
  public String getGreeting() {
    return "Hello world.";
  }

  public static void main(String[] args) {
    System.out.println("******************************");
    BoardService board = new BoardService();
    board.list();
    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
  }
  public static void main(String[] args) {
    System.out.println("버억");
    MemberService s = new MemberService ();
    s.list();
    System.out.println("버억");
  }
}
