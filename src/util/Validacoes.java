/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;


/**
 *
 * @author luixc
 */
public class Validacoes {

    public static boolean validarCPF(String cpf) {
        // Aquiele ele vai remover caracteres especiais do CPF
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verifique se o CPF tem 11 dígitos
        if (cpf.length() != 11) {
            return false;
        } //Aquiele ele vai  verifique se todos os dígitos são iguais
        else if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }
        
        // Calculo do primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * (10 - i);
        }
        int digito1 = 11 - (soma % 11);
        if (digito1 > 9) {
            digito1 = 0;
        }

        if (digito1 != (cpf.charAt(9) - '0')) {
            return false;
        }

        
        // Calculo do segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * (11 - i);
        }

        int digito2 = 11 - (soma % 11);
        if (digito2 > 9) {
            digito2 = 0;
        }

        
        return digito2 == (cpf.charAt(10) - '0');

    }

    

    
}
