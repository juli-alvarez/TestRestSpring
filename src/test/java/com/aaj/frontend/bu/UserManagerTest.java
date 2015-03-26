/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aaj.frontend.bu;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.util.Assert;
/**
 *
 * @author luisb
 */
public class UserManagerTest {
    
    /** The Constant log. */
    private static final Log log = LogFactory.getLog(UserManagerTest.class);

    @Before
    public void setUp() {
        log.info("SetUp ...");
    }
    
    @After
    public void tearDown() {
        log.info("tearDown ...");
    }

    @Test
    public void test1() {
        log.info("starting test1 ...");
        Assert.notNull(null);
    }
    
    @Test 
    public void test2() {
        log.info("starting test2 ...");
        Assert.isTrue(Boolean.TRUE);
    }

    @Test
    public void test3() {
        log.info("starting test3 ...");
        Assert.hasLength("test");
    }
}
