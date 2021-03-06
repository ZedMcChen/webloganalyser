package com.zhimingchen.common.utils;

import org.junit.Test;

import com.zhimingchen.common.utils.JarLocator;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class JarLocatorTest {

    // in file:/usr/lib/jvm/java-8-oracle/jre/lib/rt.jar!/java/lang/String.class on Ubuntu
    @Test
    public void shouldFindStringJarPath() {
        String stringJar = JarLocator.findJar(String.class);
        assertThat(stringJar, is("rt.jar"));
    }
}
