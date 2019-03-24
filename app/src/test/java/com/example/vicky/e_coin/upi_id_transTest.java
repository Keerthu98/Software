package com.example.vicky.e_coin;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class upi_id_transTest {

    private static final String FAKE_STRING = "Valid";
    private static final String FAIL_STRING = "Invalid";


    @Test
    public void upi_check1() {
        String result;
        if(upi_id_trans.upi_check("word@word"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }

    @Test
    public void upi_check2() {
        String result;
        if(upi_id_trans.upi_check("123@word"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }
    @Test
    public void upi_check3() {
        String result;
        if(upi_id_trans.upi_check("123@123"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }
    @Test
    public void upi_check4() {
        String result;
        if(upi_id_trans.upi_check("123@"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void upi_check5() {
        String result;
        if(upi_id_trans.upi_check("@"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void upi_check6() {
        String result;
        if(upi_id_trans.upi_check("word@123"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }
    @Test
    public void upi_check7() {
        String result;
        if(upi_id_trans.upi_check(""))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void upi_check8() {
        String result;
        if(upi_id_trans.upi_check("word@word@word"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void upi_check9() {
        String result;
        if(upi_id_trans.upi_check("@word"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
}