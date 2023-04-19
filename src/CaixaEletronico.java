//package sistemabanco;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Gustavo Lange
 */
public class CaixaEletronico {
    private int numero_conta;
    private String nome;
    private double saldo;
    private double credito;
    private double deposito;
    private int idade;
    private double saque;
    private String aux_nome;
    private double aux_valor;
    private int aux_nconta;
    private String senha;
    
    Scanner scan_int = new Scanner (System.in);
    Scanner scan_string = new Scanner (System.in);
    Scanner scan_double = new Scanner (System.in);
    Random nconta = new Random();
    ArrayList<String> teste123 = new ArrayList<>();

    int conta = nconta.nextInt(9999);
    int digito = nconta.nextInt(9);
    

    public CaixaEletronico() {
    }

    public CaixaEletronico(int numero_conta, String nome, double saldo, double credito, double deposito, int idade, double saque, String aux_nome, double aux_valor, int aux_nconta, String senha) {
        this.numero_conta = numero_conta;
        this.nome = nome;
        this.saldo = saldo;
        this.credito = credito;
        this.deposito = deposito;
        this.idade = idade;
        this.saque = saque;
        this.aux_nome = aux_nome;
        this.aux_valor = aux_valor;
        this.aux_nconta = aux_nconta;
        this.senha = senha;
        
    }

    public int getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(int numero_conta) {
        this.numero_conta = numero_conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public String getAux_nome() {
        return aux_nome;
    }

    public void setAux_nome(String aux_nome) {
        this.aux_nome = aux_nome;
    }

    public double getAux_valor() {
        return aux_valor;
    }

    public void setAux_valor(double aux_valor) {
        this.aux_valor = aux_valor;
    }

    public int getAux_nconta() {
        return aux_nconta;
    }

    public void setAux_nconta(int aux_nconta) {
        this.aux_nconta = aux_nconta;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    public void criarConta(){
        
        System.out.println("Digite seu nome: ");
        setNome(scan_string.nextLine());
        
        System.out.println("Digite sua idade: ");
        setIdade(scan_int.nextInt());
        
        System.out.println("Cadastre uma senha: ");
        setSenha(scan_string.nextLine());

        System.out.println("\n\n*****************************************************\n\n");

        
        System.out.println("*******************************");
        System.out.println("*     Cadastro Realizado!     *");
        System.out.println("*******************************\n\n");

        System.out.println("Dados da sua conta: ");
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("Senha: "+getSenha());
        System.out.print("Conta: "+conta);
        System.out.print("-");
        System.out.println(+digito);
        System.out.println(" \n");

    }
    
    public void depositarDinheiro(){
        Scanner scan_double = new Scanner (System.in);
        
        System.out.println("Digite o valor que deseja depositar: ");
        setDeposito(scan_double.nextDouble());
        
        saldo = saldo + deposito;
        
        System.out.println("******************************************");
        System.out.println("*            Saldo atualizado!           *");
        System.out.println("******************************************");
        
    }
    
    public void sacarDinheiro(){
        Scanner scan_double = new Scanner (System.in);
        
        System.out.println("Digite o valor que deseja sacar: ");
        setSaque(scan_double.nextDouble());
        
        saldo = saldo - saque;
        
        System.out.println("******************************************");
        System.out.println("*            Saque realizado!            *");
        System.out.println("******************************************");
        
    }
    
    public void verificaSaldo(){
        System.out.println("Seu saldo atual é: R$"+getSaldo());
        
    }
    
    public void imprimeDados(){
        System.out.print("Número da conta: ");
        System.out.print(+conta);
        System.out.print("-");
        System.out.println(+digito);
        System.out.println("Nome do proprietário: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("Seu saldo é: "+getSaldo());
    }
    
    public void transferencia(){
        System.out.println("************************************************");
        System.out.println("*  Digite o número da conta que deseja         *");
        System.out.println("*  realizar a movimentação: (Sem o dígito)     *");
        System.out.println("************************************************");
        setAux_nconta(scan_int.nextInt());

        System.out.println("************************************************");
        System.out.println("*          Digite o dígito da conta:           *");
        System.out.println("************************************************");
        setNumero_conta(scan_int.nextInt());
        
        System.out.println("**********************************************************");
        System.out.println("*  Digite o nome do proprietário da conta destinatária:  *");
        System.out.println("**********************************************************");
        setAux_nome(scan_string.nextLine());
        
        System.out.println("*******************************************");
        System.out.println("*  Digite o valor que deseja transferir:  *");
        System.out.println("*******************************************");
        setAux_valor(scan_double.nextDouble());
        
        saldo = saldo - aux_valor;
        
        System.out.println("*********** Conta Remetente *************");
        System.out.println("Nome: "+getNome());
        System.out.print("Número da Conta: ");
        System.out.print(+conta);
        System.out.print("-");
        System.out.println(+digito);
        System.out.println("Valor transferido: R$"+getAux_valor());
        System.out.println("Saldo atual: R$"+getSaldo());
        System.out.println("*****************************************\n");
        System.out.println("********** Conta Destinatária ***********");
        System.out.println("Nome: "+getAux_nome());
        System.out.print("Número da conta: ");
        System.out.print(+getAux_nconta());
        System.out.print("-");
        System.out.println(+getNumero_conta());
        System.out.println("Valor recebido: R$"+getAux_valor());
        System.out.println("                                         ");
        System.out.println("*****************************************");
        System.out.println("*        Transferencia realizada!       *");
        System.out.println("*****************************************");
        
    }
    
    public void credito(){
        System.out.println("Seu crédito especial é: R$"+getCredito());
        System.out.println(" ");
        System.out.println("*******************************************");
        System.out.println("*  Deseja utilizar seu crédito especial?  *");
        System.out.println("*            (1)Sim ou (2)Não             *");
        System.out.println("*******************************************");
        int num6 = (scan_int.nextInt());
        
        if (num6 == 1) {
            saldo = saldo + credito;
            credito = 0;
            
            System.out.println("***********************************");
            System.out.println("*        Saldo Atualizado!        *");
            System.out.println("***********************************");
            
        } else if (num6 == 2){
            System.out.println("*************************************");
            System.out.println("*   Retornando ao menu principal!   *");
            System.out.println("*************************************");
        }
    }
}
