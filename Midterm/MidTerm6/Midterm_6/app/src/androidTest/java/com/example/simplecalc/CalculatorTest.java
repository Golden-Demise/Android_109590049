package com.example.simplecalc;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.closeTo;

import static org.junit.Assert.assertThat;

import androidx.test.filters.SmallTest;

/**
 * JUnit4 unit tests for the calculator logic. These are local unit tests; no device needed
 */
@RunWith(JUnit4.class)
@SmallTest
public class CalculatorTest {

    private Calculator mCalculator;

    /**
     * Set up the environment for testing
     */
    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    /**
     * Test for Homework
     */
    @Test
    public void pow1(){
        double result = mCalculator.pow(0d,2d);
        assertThat(result, is(equalTo(0d)));
    }
    @Test
    public void pow2(){
        double result = mCalculator.pow(1d,3d);
        assertThat(result, is(equalTo(1d)));
    }
    @Test
    public void pow3(){
        double result = mCalculator.pow(-4d,0d);
        assertThat(result, is(equalTo(1d)));
    }
    @Test
    public void pow4(){
        double result = mCalculator.pow(-2d,1d);
        assertThat(result, is(equalTo(-2d)));
    }
    @Test
    public void pow5(){
        double result = mCalculator.pow(2d,-2d);
        assertThat(result, is(closeTo(0.25d,0.001d)));
    }
}
