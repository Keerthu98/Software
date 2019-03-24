package com.example.vicky.e_coin;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class postpaidTest {

    private static final String FAKE_STRING = "Valid";
    private static final String FAIL_STRING = "Invalid";

    @Test
    public void entry_ok() {
        String result;
        if(postpaid.entry_ok("1234567890","Carrier","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));
    }

    @Test
    public void entry_ok2() {
        String result;
        if(postpaid.entry_ok("2245634989","Carrier","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }
    @Test
    public void entry_ok3() {
        String result;
        if(postpaid.entry_ok("9024563489","Carrier","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void etry_ok4() {
        String result;
        if(postpaid.entry_ok("224563t989","Carrier","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void entry_ok5() {
        String result;
        if(postpaid.entry_ok("224563345989","Carrier","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void entry_ok6() {
        String result;
        if(postpaid.entry_ok("9224563489","Carrier","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAKE_STRING));

    }
    @Test
    public void entry_ok7() {
        String result;
        if(postpaid.entry_ok("2245","Carrier","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void entry_ok8() {
        String result;
        if(postpaid.entry_ok("1234567890","","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));
    }

    @Test
    public void entry_ok9() {
        String result;
        if(postpaid.entry_ok("2245634989","","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void entry_ok10() {
        String result;
        if(postpaid.entry_ok("9024563489","","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void entry_ok11() {
        String result;
        if(postpaid.entry_ok("224563t989","","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void entry_ok12() {
        String result;
        if(postpaid.entry_ok("224563345989","","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void entry_ok13() {
        String result;
        if(postpaid.entry_ok("9224563489","","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void entry_ok14() {
        String result;
        if(postpaid.entry_ok("2245","","12345"))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void entry_ok15() {
        String result;
        if(postpaid.entry_ok("1234567890","Carrier",""))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));
    }

    @Test
    public void entry_ok16() {
        String result;
        if(postpaid.entry_ok("2245634989","Carrier",""))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void entry_ok17() {
        String result;
        if(postpaid.entry_ok("9024563489","Carrier",""))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void entry_ok18() {
        String result;
        if(postpaid.entry_ok("224563t989","Carrier",""))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void entry_ok19() {
        String result;
        if(postpaid.entry_ok("224563345989","Carrier",""))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }

    @Test
    public void entry_ok20() {
        String result;
        if(postpaid.entry_ok("9224563489","Carrier",""))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
    @Test
    public void entry_ok21() {
        String result;
        if(postpaid.entry_ok("2245","Carrier",""))
            result="Valid";
        else
            result="Invalid";
        assertThat(result,is(FAIL_STRING));

    }
}