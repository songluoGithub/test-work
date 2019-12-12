package com.string.util;

import org.apache.commons.lang3.StringUtils;

public class StringUtilTest {
    public static void main(String[] args){
        Boolean flag = StringUtils.isBlank(""); // true
        System.out.print(flag);
        StringUtils.isBlank(" "); // true
        StringUtils.isBlank("     "); // true
        StringUtils.isBlank("\t"); // true
        StringUtils.isBlank("\r"); // true
        StringUtils.isBlank("\n"); // true
        StringUtils.isBlank(null); // true

        StringUtils.isEmpty(""); // true
        StringUtils.isEmpty(" "); // false
        StringUtils.isEmpty("     "); // false
        StringUtils.isEmpty("\t"); // false
        StringUtils.isEmpty("\r"); // false
        StringUtils.isEmpty("\n"); // false
        StringUtils.isEmpty(null); // true

        StringUtils.isWhitespace(""); // true
        StringUtils.isWhitespace(" "); // true
        StringUtils.isWhitespace("    "); // true
        StringUtils.isWhitespace("\t"); // true
        StringUtils.isWhitespace("\r"); // true
        StringUtils.isWhitespace("\n"); // true
        StringUtils.isWhitespace(null); // false
    }
}
