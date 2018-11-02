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
  public static void cal(int... Arr){
    for(int i=1;i<Arr.length;i++)
    Arr[0]+=Arr[i];
    System.out.println("Sum is:"+String.valueOf(Arr[0]));
  }
  // Static Methord can be called without the requirement of Object Formation 
  public static void main(String args[]){
    // Integer : Wrapper class for int allows functions 
    int x=10_000;
    switch_FUNC(x);
    // Jagged Array
    int[][] Arr={{1,2,3},{1,2},{1}};
    for(int i=0;i<Arr.length;i++){
      for(int j=0;j<Arr[i].length;j++)
      System.out.print(Arr[i][j]+" ");
      System.out.println();
    }
    cal(1,2,3,4);
    return;
  }
}
