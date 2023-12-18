// public class Main {
//   public static void main(String[] args) {
//     MyClass myClass = new MyClass();      //MyClassインスタンスの作成

//     myClass.hello();       //MyClassインスタンスのhelloメソッドにアクセス
//   }
// }


// public class Main {      //最初に実行するクラス
//   public static void main(String[] args) {
//     MyClass myClass = new MyClass();
//     MyClass iroha = new MyClass();
//     MyClass sensei = new MyClass();     //各インスタンスの作成

//     myClass.hello();
//     iroha.hello();
//     sensei.hello();      //各インスタンスのhelloメソッドにアクセス
//   }
// }


// public class Main {      //最初に実行するクラス
//   public static void main(String[] args) {
//     MyClass myClass = new MyClass();
//     MyClass iroha = new MyClass();
//     MyClass sensei = new MyClass();     //各インスタンスの作成

//     iroha.myName = "いろは";
//     sensei.myName = "センセイ";     //各インスタンスのmyNameフィールドに値を

//     myClass.hello();
//     iroha.hello();
//     sensei.hello();      //各インスタンスのhelloメソッドにアクセス
//   }
// }


// public class Main {      //最初に実行するクラス
//   public static void main(String[] args) {
//     CalcQuiz q = new CalcQuiz();       //クイズを出すインスタンス

//     System.out.println(q.getQuestion());       //問題を出す
//     System.out.println(q.getAnswer());        //答えをいう
//   }
// }


public class Main {
  public static void main(String[] args) {
    int quizNum = 5;      //問題数
    CalcQuiz [] quiz = new CalcQuiz[quizNum];      //問題を作るインスタンスを入れる配列

    for (int i = 0; i < quizNum; i++) {       //問題を作るインスタンスを作る
      quiz[i] = new CalcQuiz();
    }
    for (int i = 0; i < quizNum; i++) {
      System.out.println("問" + i + ":" + quiz[i].getQuestion());      //すべての問題を表示する
    }
    System.out.println("--------------");
    for (int i = 0; i < quizNum; i++) {
      System.out.println("答" + i + ":" + quiz[i].getAnswer());
    }
  }
}
