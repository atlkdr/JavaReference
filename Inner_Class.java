
class Parent{
  int status;
  Parent(){
    this.status=1;
    System.out.println("In Parent");
  }
  static class Child{
    int status;
    Child(){
      this.status=2;
      System.out.println("In Child");
    }
  }
}

public class Main{
  public static void main(String args[]){
    // When Child is static else Require Object Of parent 
    Parent.Child ch=new Parent.Child();

    return;
  }
}
