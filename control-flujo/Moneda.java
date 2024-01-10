public class Moneda {

    public static void main(String[] args) {

        int moneda; // 0 o 1
        moneda = (int)(Math.random()*2);

        //System.out.printf("\n\t Moneda: %d",moneda);

        if(moneda==0){
            System.out.print("\n\t Sooool!");
        }else {
            System.out.print("\n\t Aguilaa!");
        }


    }

}

/*
    Math.random() genera números desde 0.00000000 hasta 0.99999999
    Math.random()*2 genera números desde 0.0000000 hasta 1.89999999
    (int)(Math.random()*2) genera números: 0 o 1

 */
