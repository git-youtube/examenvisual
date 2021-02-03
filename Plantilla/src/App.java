public class App {
    public static void main(String[] args) throws Exception {
        Calc colega = new Calc();
        System.out.println(((Calc) colega).numeroEscrito("uno"));
        System.out.println(((Calc) colega).numeroEscrito(" DoS "));
        System.out.println(((Calc) colega).ValorNum("  UnO   Tress "));
        System.out.println(((Calc) colega).proporcional(new int[]{1,2,3}, 60));
    }

  
}
