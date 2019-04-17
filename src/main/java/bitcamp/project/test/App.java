package bitcamp.project.test;

import bitcamp.project.test.service.BoardService;
<<<<<<< HEAD

public class App {
    public String getGreeting() {
        return "Hello world.";
    }
=======
>>>>>>> branch 'master' of https://github.com/kmincheol/bitcamp-project-test.git

<<<<<<< HEAD
    public static void main(String[] args) {
        BoardService b = new BoardService();
        b.count();
        System.out.println("-------------------");
        for (int i = 1; i < 10; i++) {
          System.out.print(i +",");
        }
    }
=======
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
>>>>>>> branch 'master' of https://github.com/kmincheol/bitcamp-project-test.git
}
