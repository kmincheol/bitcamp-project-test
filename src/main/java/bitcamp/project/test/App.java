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
    
    MemberService member = new MemberService();
    
    System.out.println("-------------------");
    for (int i = 1; i < 10; i++) {
      member.list();
      System.out.print(i +",");
    }
  }
} 
