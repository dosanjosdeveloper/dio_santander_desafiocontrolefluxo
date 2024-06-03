import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static void main(String[] args) {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Informe o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Informe o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            try {
                /**
                * Access the count parameter and perform validations.
                * */
                contar(parametroUm, parametroDois);

            } catch (ParametrosInvalidosException exception) {
                /**
                 * Throwing the exception
                 * */
                System.out.println(exception.getMessage());
            }

        }
        static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

            /**
             *
             * Checks whether parameters obey the rule
             * If true, perform the subtraction according to the rule and count
             * If not, the exception stops the process
             * */
            if (parametroUm > parametroDois) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
            }

            int contagem = parametroDois - parametroUm;
            /**
             * Performing the count after validations
             * */
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }

    }