import javax.swing.*;

public class CalculadoraIMC {

    public static void main(String[] args) {

        // Entradas:
        double masa;
        double estatura;
        double imc; // índice de masa corporal

        // 18.9  "18.9"
        masa = Double.parseDouble(JOptionPane.showInputDialog("Escribe tu masa (kg): "));
        estatura = Double.parseDouble(JOptionPane.showInputDialog("Escribe tu estatura (m): "));

        // Calculos:
        imc = masa / Math.pow(estatura,2);

        // Salidas:
        JOptionPane.showMessageDialog(
                null,
                String.format("Tu índice de masa corporal es: %.3f",imc),
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE
        );

    }

}
