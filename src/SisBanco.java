//package sistemabanco;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Gustavo Lange
 */

public class SisBanco {

    
    public static void main(String[] args) {
        
        Scanner scan_int = new Scanner(System.in);
        
        ContaNormal normal = new ContaNormal();
        ContaPoupanca poupanca = new ContaPoupanca();
        Conta5Estrelas estrelas = new Conta5Estrelas();
        
        System.out.println("**********************************************************");
        System.out.println("*              BEM VINDO AO CAIXA ELETRÔNICO             *");
        //System.out.println("*                 Digite 1 para continuar                *");
        System.out.println("**********************************************************\n");
        //int num = scan_int.nextInt();
        
        System.out.println("*****************************************");
        System.out.println("*   Digite 1 para cadastrar uma conta   *");
        System.out.println("*****************************************");
        int num2 = scan_int.nextInt();
        
        System.out.println("\n******************************************************************************");
        System.out.println("*     Temos algumas opções de contas, escolha uma delas a seguir:            *");
        System.out.println("*                                                                            *");
        System.out.println("*    (1) Conta Normal: Crédito no valor de R$100,00 (cem reais)              *");
        System.out.println("*    (2) Conta Poupança: Crédito no valor de R$0,0 (zero reais)              *");
        System.out.println("*    (3) Conta 5 Estrelas: Crédito no valor de R$500,00 (quinhentos reais)   *");
        System.out.println("*                                                                            *");
        System.out.println("*     Digite o número correspondente à conta que deseja criar:               *");
        System.out.println("******************************************************************************\n");
        int num5 = scan_int.nextInt();
        
        if (num5 == 1) {
            normal.criarConta();
        } else if (num5 == 2){
            poupanca.criarConta();
        } else if (num5 == 3){
            estrelas.criarConta();
        } else {
            System.out.println("\n***************************");
            System.out.println("*      Valor Inválido     *");
            System.out.println("*     Tente novamente!    *");
            System.out.println("***************************\n");
        }
        
        while (num2 != 0){
            
            switch (num2){
                case 1:
                    if (num2 == 1) {
                        
                            if (num5 == 1) {
                                                                
                                System.out.println("\n*********************************************");
                                System.out.println("*    (1) Visualizar o saldo de sua conta    *");
                                System.out.println("*    (2) Realizar um depósito em conta      *");
                                System.out.println("*    (3) Visualizar seu crédito especial    *");
                                System.out.println("*    (4) Sacar dinheiro                     *");
                                System.out.println("*    (5) Visualizar dados de sua conta      *");
                                System.out.println("*    (6) Realizar uma transferência         *");
                                System.out.println("*********************************************\n");
                                int num3 = scan_int.nextInt();

                                if (num3 == 1) {
                                    normal.verificaSaldo();
                                } else if (num3 == 2) {
                                    normal.depositarDinheiro();
                                } else if (num3 == 3){
                                    normal.credito();
                                } else if (num3 == 4){
                                    normal.sacarDinheiro();
                                } else if (num3 == 5){
                                    normal.imprimeDados();
                                } else if (num3 == 6) {
                                    normal.transferencia();
                                } else {
                                System.out.println("\n***************************");
                                System.out.println("*      Valor Inválido     *");
                                System.out.println("*     Tente novamente!    *");
                                System.out.println("***************************\n");
                                }
                            } else if (num5 == 2) {
                                                                
                                System.out.println("\n*********************************************");
                                System.out.println("*    (1) Visualizar o saldo de sua conta    *");
                                System.out.println("*    (2) Realizar um depósito em conta      *");
                                System.out.println("*    (3) Visualizar seu crédito especial    *");
                                System.out.println("*    (4) Sacar dinheiro                     *");
                                System.out.println("*    (5) Visualizar dados de sua conta      *");
                                System.out.println("*    (6) Realizar uma transferência         *");
                                System.out.println("*********************************************\n");
                                int num3 = scan_int.nextInt();

                                if (num3 == 1) {
                                    poupanca.verificaSaldo();
                                } else if (num3 == 2){
                                    poupanca.depositarDinheiro();
                                } else if (num3 == 3){
                                    System.out.println("Você não possui crédito especial!");
                                } else if (num3 == 4){
                                    poupanca.sacarDinheiro();
                                } else if (num3 == 5){
                                    poupanca.imprimeDados();
                                } else if (num3 == 6){
                                    poupanca.transferencia();
                                } else {
                                System.out.println("\n***************************");
                                System.out.println("*      Valor Inválido     *");
                                System.out.println("*     Tente novamente!    *");
                                System.out.println("***************************\n");
                                }
                            } else if (num5 == 3){
                                                                
                                System.out.println("\n*********************************************");
                                System.out.println("*    (1) Visualizar o saldo de sua conta    *");
                                System.out.println("*    (2) Realizar um depósito em conta      *");
                                System.out.println("*    (3) Visualizar seu crédito especial    *");
                                System.out.println("*    (4) Sacar dinheiro                     *");
                                System.out.println("*    (5) Visualizar dados de sua conta      *");
                                System.out.println("*    (6) Realizar uma transferência         *");
                                System.out.println("*********************************************\n");
                                int num3 = scan_int.nextInt();

                                if (num3 == 1) {
                                    estrelas.verificaSaldo();
                                } else if (num3 == 2) {
                                    estrelas.depositarDinheiro();
                                } else if (num3 == 3){
                                    estrelas.credito();
                                } else if (num3 == 4){
                                    estrelas.sacarDinheiro();
                                } else if (num3 == 5){
                                    estrelas.imprimeDados();
                                } else if (num3 == 6){
                                    estrelas.transferencia();
                                } else {
                                System.out.println("\n***************************");
                                System.out.println("*      Valor Inválido     *");
                                System.out.println("*     Tente novamente!    *");
                                System.out.println("***************************\n");
                                }
                            } else {
                                System.out.println("\n***************************");
                                System.out.println("*      Valor Inválido     *");
                                System.out.println("*     Tente novamente!    *");
                                System.out.println("***************************\n");
                            }       
                    } else {
                       System.out.println("\n***************************");
                       System.out.println("*      Valor Inválido     *");
                       System.out.println("*     Tente novamente!    *");
                       System.out.println("***************************\n"); 
                    }
                    break;
                default:
            }
            
            System.out.println("\n*********************************************");
            System.out.println("*            Digite 0 para sair             *");
            System.out.println("*            Ou 1 para continuar            *");
            System.out.println("*********************************************\n");
            int numr = scan_int.nextInt();
                    if (numr == 0) {
                        System.out.println("\n************************");
                        System.out.println("* Programa Finalizado! *");
                        System.out.println("************************\n");
                        System.exit(0);
                    } else if (numr == 1){
                    
                    }
            
        }    
        System.exit(0);
    
    }
}
