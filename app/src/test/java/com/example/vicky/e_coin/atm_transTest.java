package com.example.vicky.e_coin;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class atm_transTest {

    @Test
    public void pin_check() {
        String result;
        if (atm_trans.pin_check(0000))
            result="Invalid pin";
        else
            result="Valid pin";
        assertThat(result,is("Valid pin"));
    }
    @Test
    public void Test1() {
        String result;
        if (atm_trans.pin_check(1211))
            result="Invalid pin";
        else
            result="Valid pin";
        assertThat(result,is("Valid pin"));
    }

    @Test
    public void Test2() {
        String result;
        if (atm_trans.pin_check(10000))
            result="Invalid pin";
        else
            result="Valid pin";
        assertThat(result,is("Invalid pin"));
    }
}