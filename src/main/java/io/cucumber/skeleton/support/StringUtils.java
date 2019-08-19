package io.cucumber.skeleton.support;

import java.text.Normalizer;

public class StringUtils {

    /**
     * Remove toda a acentuação da string substituindo por caracteres simples sem acento.
     * Creditos: https://gist.github.com/rponte/893494
     */
    public static String unaccent(String src) {
        return Normalizer
                .normalize(src, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "");
    }

    //retorna toda só os digitos da String
    public static String getDigits(String str){
        return str.replaceAll("\\D+","");
    }
}