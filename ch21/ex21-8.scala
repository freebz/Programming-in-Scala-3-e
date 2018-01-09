// 리스트 21.8  예제 코드에 타임 검사와 암시적 변환이 더해진 상태

$ scalac -Xprint:typer mocha.scala
[[syntax trees at end of typer]]// Scala source: mocha.scala
package <empty> {
  final object Mocha extends java.lang.Object with Application
      with ScalaObject {

    // ...

    private[this] val pref: Mocha.PreferredDrink =
      new Mocha.this.PreferredDrink("mocha");
    implicit <stable> <accessor>
      def pref: Mocha.PreferredDrink = Mocha.this.pref;
    def enjoy(name: String)
        (implicit drink: Mocha.PreferredDrink): Unit = {
      scala.this.Predef.print("Welcome, ".+(name));
      scala.this.Predef.print(". Enjoy a ");
      scala.this.Predef.print(drink.preference);
      scala.this.Predef.println("!")
    };
    Mocha.this.enjoy("reader")(Mocha.this.pref)
  }
}
