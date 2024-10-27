public class A {
    private int A1;
    private float A2;

    public int getA1(){
        return A1;
    }

    public float A2(){
        return A2;
    }

    public void  setA1(int novoA1){
        A1 = novoA1;
    }

    public void setA2(float novoA2){
        A2 = novoA2;
    }

    public void MA1(){
        System.out.println("Método: MA1");
    }
    
    public void MA2(){
        System.out.println("Método: MA2");
    }

    public void MA3(){
        System.out.println("Alteração a classe A partir do clone");
    }

    // Contribuição de DJhuan :)
    public int getSoma(int a, int b){
        return a + b;
    }
}