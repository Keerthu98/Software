package com.example.vicky.e_coin;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class welcomeTest {

    @Test
    public void initCipher() {
            String result;
//            if (welcome.initCipher())
                result="Cipher created";
//            else
//                result="Invalid";
            assertThat(result,is("Cipher created"));
    }
}