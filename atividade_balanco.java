 class BalancoTrimestral{
    public static void main(String [] args) {
        // declaração e inicialização das variaveis de cada mês 
            int gastosjaneiro = 15000;
            int gastosfevereiro = 23000;
            int gastosmarço = 17000;

            //soma dos gastos no trimestre 
            int gastostrimestre = gastosjaneiro + gastosfevereiro + gastosmarço;
            
            //resultado dos gastos total trimestral
            System.out.println("O gasto total no primeiro trimestre foi: " + gastostrimestre + " reais");
    }
}