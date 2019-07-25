package io.cucumber.skeleton.Support;

import java.util.Random;

public class CpfGenerator {

    public String valid() {
        return generateCPF(true);
    }

    /**
     * Return invalid and formatted
     *
     * @return an invalid CPF
//     * @see com.github.javafaker.shared.CPFUtils#unformatCPF(String) to unformat
     */
    public String invalid() {
        return generateCPF(false);
    }

    public static String calculateVerificationDigit(String num) {
        Integer primDig, segDig;
        int sum = 0, peso = 10;
        for (int i = 0; i < num.length(); i++)
            sum += Integer.parseInt(num.substring(i, i + 1)) * peso--;

        if (sum % 11 == 0 | sum % 11 == 1)
            primDig = new Integer(0);
        else
            primDig = new Integer(11 - (sum % 11));

        sum = 0;
        peso = 11;
        for (int i = 0; i < num.length(); i++)
            sum += Integer.parseInt(num.substring(i, i + 1)) * peso--;

        sum += primDig.intValue() * 2;
        if (sum % 11 == 0 | sum % 11 == 1)
            segDig = new Integer(0);
        else
            segDig = new Integer(11 - (sum % 11));

        return primDig.toString() + segDig.toString();
    }

    public static String generateCPF(boolean valid) {
        String partial = "";
        String cpf = "";
        Integer number;

        for (int i = 0; i < 9; i++) {
            number = new Integer((int) (Math.random() * 10));
            partial += number.toString();
        }

        if (valid) {
            cpf = partial + calculateVerificationDigit(partial);
        } else {
            Random random = new Random();
            long elevenDigits = (random.nextInt(1000000000) + (random.nextInt(90) + 10) * 1000000000L);
            cpf = String.valueOf(elevenDigits);
        }

        return formatCPF(cpf);
    }

    private static String formatCPF(String cpf) {
        String block1 = cpf.substring(0, 3);
        String block2 = cpf.substring(3, 6);
        String block3 = cpf.substring(6, 9);
        String block4 = cpf.substring(9, 11);

        return String.format("%s.%s.%s-%s", block1, block2, block3, block4);
    }

}
