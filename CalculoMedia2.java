public class CalculoMedia2 {
    public static void main(String[] args) {
        
        // Notas fixas (você pode alterar os valores)
        double nota1 = 8.5;
        double nota2 = 7.0;
        double nota3 = 6.5;
        
        // Cálculo da média
        double media = (nota1 + nota2 + nota3) / 3;
        
        // Exibição da média
        System.out.println("A média final é: " + media);
        
        // Condição para aprovação
        if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
