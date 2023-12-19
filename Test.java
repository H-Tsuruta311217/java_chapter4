class Test {     //同じ名前のフィールドでローカル変数があるクラスの例
  int x = 1;     //フィールドでもxを作れる
  void hello() {
    int x = 2;     //ローカル変数でもxを作れる
    System.out.println("this.x=" + this.x);       //フィールドを表示
  }
}