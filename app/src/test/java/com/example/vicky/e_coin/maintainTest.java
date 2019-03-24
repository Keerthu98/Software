package com.example.vicky.e_coin;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class maintainTest {

    private static final String FAKE_STRING = "Valid";
    private static final String FAIL_STRING = "Invalid";

    @Test
    public void mail_check() {
        String result;
        if (maintain.mail_check("name@email.com"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));
    }
    @Test
    public void Test2(){
        String result;
        if(maintain.mail_check("name@email.in.in"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));
    }

    @Test
    public void Test3(){
        String result;
        if(maintain.mail_check("name@email"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));
    }

    @Test
    public void Test4(){
        String result;
        if(maintain.mail_check("name@email..com"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));
    }

    @Test
    public void test5(){
        String result;
        if(maintain.mail_check("@email.com"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));
    }

    @Test
    public void test6(){
        String result;
        if(maintain.mail_check(""))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));
    }



    @Test
    public void phone_check1() {
        String result;
        if(maintain.phone_check("1234567890"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void phone_check2() {
        String result;
        if(maintain.phone_check("2245634989"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }
    @Test
    public void phone_check3() {
        String result;
        if(maintain.phone_check("9024563489"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void phone_check4() {
        String result;
        if(maintain.phone_check("224563t989"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void phone_check5() {
        String result;
        if(maintain.phone_check("224563345989"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void phone_check6() {
        String result;
        if(maintain.phone_check("9224563489"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }
    @Test
    public void phone_check7() {
        String result;
        if(maintain.phone_check("2245"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }


    @Test
    public void upi_check1() {
        String result;
        if(maintain.upi_check("word@word"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }

    @Test
    public void upi_check2() {
        String result;
        if(maintain.upi_check("123@word"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }
    @Test
    public void upi_check3() {
        String result;
        if(maintain.upi_check("123@123"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }
    @Test
    public void upi_check4() {
        String result;
        if(maintain.upi_check("123@"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void upi_check5() {
        String result;
        if(maintain.upi_check("@"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void upi_check6() {
        String result;
        if(maintain.upi_check("word@123"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }
    @Test
    public void upi_check7() {
        String result;
        if(maintain.upi_check(""))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void upi_check8() {
        String result;
        if(maintain.upi_check("word@word@word"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void upi_check9() {
        String result;
        if(maintain.upi_check("@word"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
}