public class D {
    private int D1;
    private int D2;

    public int MD1(){ 
        int soma = D1 + D2;
        return soma;
    }

    public int MD2(){ 
        if (D1 > D2){
            return D1;
        }
        else if (D2 > D1) {
            return D2;
        }
        else {
            return 0;
        }
    }

    public void MD3(){
        System.out.prinln("Método: MD3");
    }
}
