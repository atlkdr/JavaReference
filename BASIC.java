// Public = Accessable from Outside Package , Default = Within , private = Nested(ONLY) 
// NOTE: Declaration of Different Sections has no Difference than different file.java  
public class Main{
  static void switch_FUNC(int x){
    switch(x){
      case 1:
        break;
      case 2:
        break;
      default:
        System.out.println("NOT ONE/TWO");  
    }

  }
  // Static Methord can be called without the requirement of Object Formation 
  public static void main(String args[]){
    // Integer : Wrapper class for int allows functions 
    int x=10_000;
    switch_FUNC(x);

    return;
  }
}
