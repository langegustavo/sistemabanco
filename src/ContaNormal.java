//package sistemabanco;

/**
 *
 * @author Gustavo Lange
 */
public class ContaNormal extends CaixaEletronico{
    
    public ContaNormal() {
        super.setCredito(100);
        super.setSaldo(0);
    }
    
    public ContaNormal(int numero_conta, String nome, double saldo, double credito, double deposito, int idade, double saque, String aux_nome, double aux_valor, int aux_nconta, String senha) {
        super(numero_conta, nome, saldo, credito, deposito, idade, saque, aux_nome, aux_valor, aux_nconta, senha);
        
    }
    
    public void depositarDinheiro(){
        super.depositarDinheiro();
    }
    
    public void sacarDinheiro(){
        super.sacarDinheiro();
    }
    
    public void verificaSaldo(){
        super.verificaSaldo();
    }
    
    public void imprimeDados(){
        super.imprimeDados();
    }
}
