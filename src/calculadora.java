public class calculadora {
    private double num1, num2;
 
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double calcularsoma () {
        double resultadosoma;

        resultadosoma = (num1 + num2);
        return resultadosoma;

    }

    public double calcularsub () {
        double resultadosub;

        resultadosub = (num1 - num2);
        return resultadosub;
    }

    public double calcularmult () {
         double resultadomult;
            
         resultadomult = (num1 * num2);
        return resultadomult;
     }

     public double calculardiv () {
        double resultadodiv;

        resultadodiv = (num1 / num2);
        return resultadodiv;
     }



   
}
