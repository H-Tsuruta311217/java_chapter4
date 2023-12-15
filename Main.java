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


public class Main {      //最初に実行するクラス
  public static void main(String[] args) {
    MyClass myClass = new MyClass();
    MyClass iroha = new MyClass();
    MyClass sensei = new MyClass();     //各インスタンスの作成
    
    iroha.myName = "いろは";
    sensei.myName = "センセイ";     //各インスタンスのmyNameフィールドに値を
    
    myClass.hello();
    iroha.hello();
    sensei.hello();      //各インスタンスのhelloメソッドにアクセス
  }
}