package org.shop.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.shop.entity.Complaint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-hibernate.xml" })
public class ReportServiceImplTest {
	
	@Autowired
	private ReportService report;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLoad() {
		fail("Not yet implemented");
	}

	@Test
	public void testGet() {
		
		Complaint com = report.get(1);
		System.out.println(com.getXdata());
	}

	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}

}
