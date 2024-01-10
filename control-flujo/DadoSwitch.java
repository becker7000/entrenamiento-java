public class DadoSwitch {

    public static void main(String[] args) {

        // Números del 1 al 6.
        int dado;
        dado = (int)(Math.random()*6)+1;

        // System.out.println("\n\t Dado: "+dado);

        switch (dado){
            case 1 -> System.out.println(
                    """
                    * * * * * *
                    *         *
                    *    *    *
                    *         *
                    * * * * * *
                    """
            );
            case 2 -> System.out.println(
                    """
                    * * * * * *
                    *     *   *
                    *         *
                    *  *      *
                    * * * * * *       
                    """
            );
            case 3 -> System.out.println(
                    """
                    * * * * * *
                    *      *  *
                    *    *    *
                    *  *      *
                    * * * * * *        
                    """
            );
            case 4 -> System.out.println(
                    """
                    * * * * * *
                    *  *   *  *
                    *         *
                    *  *   *  *
                    * * * * * *         
                    """
            );
            case 5 -> System.out.println(
                    """
                    * * * * * *
                    *  *   *  *
                    *    *    *
                    *  *   *  *
                    * * * * * * 
                    """
            );
            case 6 -> System.out.println(
                    """
                    * * * * * *
                    *  *   *  *
                    *  *   *  *
                    *  *   *  *
                    * * * * * * 
                    """
            );
        }



    }

}
