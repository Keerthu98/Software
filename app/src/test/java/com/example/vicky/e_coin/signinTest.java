package com.example.vicky.e_coin;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class signinTest {

    private static final String FAKE_STRING = "Login was successful";


    @Test
    public void Test1() {

        String result = "";
        // ...when the string is returned from the object under test...
        if (signin.temporary("vicky", "admin"))
            result = "Login was successful";

        // ...then the result should be the expected one.
        assertThat(result, is(FAKE_STRING));
    }
    @Test
    public void Test2() {

        String result = "";
        // ...when the string is returned from the object under test...
        if (signin.temporary("vicky", "keerthi"))
            result = "";
        else result="Login was successful";

        // ...then the result should be the expected one.
        assertThat(result, is(FAKE_STRING));
    }
}
