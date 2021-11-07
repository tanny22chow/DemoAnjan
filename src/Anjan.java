public class Anjan {

    private int age=23;
    private String name="Hagi4";
    private float money;


    private void printData(){
        System.out.println(age+name+money);
    }
    private boolean isVoter(int age){
        if(age<18){
            System.out.println("is not a voter");
            method1();
            return false;
        }else {
            System.out.println("is a voter");
            return true;
        }
    }

    private void method1() {
        System.out.println("dummy called method");
    }

    public static void main(String agrs[]){
        Anjan a=new Anjan();
  //      a.printData();
       boolean b= a.isVoter(12);
        System.out.println(b);
    }
}
