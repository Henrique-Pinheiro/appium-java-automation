package io.cucumber.skeleton.Support;

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

}