package bitcamp.project.test;

import bitcamp.project.test.service.BoardService;
import bitcamp.project.test.service.MemberServiceKi;

public class App {
  public String getGreeting() {
    return "Hello world.";
  }

  public static void main(String[] args) {
    BoardService b = new BoardService();
    b.count();
    System.out.println("-------------------");
    for (int i = 1; i < 10; i++) {
      System.out.print(i +",");
    }
    
    System.out.println("-------------------");
    MemberServiceKi m = new MemberServiceKi();
    m.list();
    System.out.println("-------------------");
    
  }
}
