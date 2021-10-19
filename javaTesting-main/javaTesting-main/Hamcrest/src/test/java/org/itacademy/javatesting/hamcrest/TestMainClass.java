package org.itacademy.javatesting.hamcrest;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

class TestMainClass {

//Nivell 2: Hamcrest
    @Test
    public void compruebaLongitudString() { 
        assertThat("Mordor", length(is(6))); 
    }
    public static Matcher<String> length(Matcher<? super Integer> matcher) {
        return new FeatureMatcher<String, Integer>(matcher, "a String of length that", "length") {
            @Override
            protected Integer featureValueOf(String actual) {
              return actual.length();
            }
        };
    }
}
