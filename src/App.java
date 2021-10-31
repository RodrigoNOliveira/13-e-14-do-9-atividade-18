import javax.swing.JOptionPane;

class App {
    public static void main(String[] args) {

        String alturaS = JOptionPane.showInputDialog(null, "Digite a sua altura", "Classificação", JOptionPane.QUESTION_MESSAGE);
        double altura = Double.parseDouble(alturaS);

        String pesoS = JOptionPane.showInputDialog(null, "Digite o seu peso", "Classificação",
                JOptionPane.QUESTION_MESSAGE);
        int peso = Integer.parseInt(pesoS);

        if (altura < 1.20 && peso <= 60) {
            JOptionPane.showMessageDialog(null, "Sua categoria é: A", "Classificação",
                    JOptionPane.QUESTION_MESSAGE);

        } else if (altura >= 1.20 && altura <=1.70 && peso <= 60) {
            JOptionPane.showMessageDialog(null, "Sua categoria é: B", "Classificação",
                    JOptionPane.QUESTION_MESSAGE);
        } else if (altura > 1.70 && peso <= 60) {
            JOptionPane.showMessageDialog(null, "Sua categoria é: C", "Classificação",
                    JOptionPane.QUESTION_MESSAGE);
        }
        else if (altura < 1.20 && peso > 60 && peso<=90) {
            JOptionPane.showMessageDialog(null, "Sua categoria é: D", "Classificação",
                    JOptionPane.QUESTION_MESSAGE);
        }
        else if (altura < 1.20 && peso > 90) {
            JOptionPane.showMessageDialog(null, "Sua categoria é: G", "Classificação",
                    JOptionPane.QUESTION_MESSAGE);
        }

        else if (altura >= 1.20 && altura <= 1.70 && peso > 60 && peso<=90) {
            JOptionPane.showMessageDialog(null, "Sua categoria é: E", "Classificação",
                    JOptionPane.QUESTION_MESSAGE);
        }
        else if (altura > 1.70 && peso > 60 && peso<=90) {
            JOptionPane.showMessageDialog(null, "Sua categoria é: F", "Classificação",
                    JOptionPane.QUESTION_MESSAGE);
        }
        else if (altura >=1.20 && altura <=1.70 && peso > 90) {
            JOptionPane.showMessageDialog(null, "Sua categoria é: H", "Classificação",
                    JOptionPane.QUESTION_MESSAGE);
        }

        else if (altura >1.70 && peso > 90) {
            JOptionPane.showMessageDialog(null, "Sua categoria é: I", "Classificação",
                    JOptionPane.QUESTION_MESSAGE);
        }




    }
}