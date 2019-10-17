package edu.gcccd.java;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;
public class PiTest {

    @Test
    public void approx() {
        Assert.assertEquals(Pi.approx(100000000), 3.141, 0.0009);
    }
}