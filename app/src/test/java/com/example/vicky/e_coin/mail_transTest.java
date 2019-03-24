package com.example.vicky.e_coin;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class mail_transTest {
    private static final String FAKE_STRING = "Valid mail";
    private static final String FAIL_STRING = "Invalid";
    @Test
    public void onCreateView() {
        String result;
        if (mail_trans.mail_check("name@email.com"))
            result="Valid mail";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));
    }
    @Test
    public void Test2(){
        String result;
        if(mail_trans.mail_check("name@email.in.in"))
            result="Valid mail";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));
    }

    @Test
    public void Test3(){
        String result;
        if(mail_trans.mail_check("name@email"))
            result="Valid mail";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));
    }

    @Test
    public void Test4(){
        String result;
        if(mail_trans.mail_check("name@email..com"))
            result="Valid mail";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));
    }

    @Test
    public void test5(){
        String result;
        if(mail_trans.mail_check("@email.com"))
            result="Valid mail";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));
    }

    @Test
    public void test6(){
        String result;
        if(mail_trans.mail_check(""))
            result="Valid mail";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));
    }
}