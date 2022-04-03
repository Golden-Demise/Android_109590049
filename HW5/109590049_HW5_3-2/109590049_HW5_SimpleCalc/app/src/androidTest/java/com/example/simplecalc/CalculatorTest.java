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
    public void powPostive(){
        double result = mCalculator.pow(2d,10d);
        assertThat(result, is(equalTo(1024d)));
    }

    @Test
    public void powNegative(){
        double result = mCalculator.pow(-2d,9d);
        assertThat(result, is(equalTo(-512d)));
    }

    @Test
    public void powNegative2(){
        double result = mCalculator.pow(2d,-2d);
        assertThat(result, is(closeTo(0.25,0.01)));
    }

    @Test
    public void powZeroPositive(){
        double result = mCalculator.pow(0,2d);
        assertThat(result, is(equalTo(0d)));
    }

    @Test
    public void powZeroSecond(){
        double result = mCalculator.pow(10,0);
        assertThat(result, is(equalTo(1d)));
    }

    @Test
    public void powZeroNegative() {
        double result = mCalculator.pow(0,-1);
        assertThat(result, is(equalTo(Double.POSITIVE_INFINITY)));
    }

    @Test
    public void powZeroNegative2() {
        double result = mCalculator.pow(-0,-1);
        assertThat(result, is(equalTo(Double.POSITIVE_INFINITY)));
    }

}
