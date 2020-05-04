package com.automation.DockerImage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DockerTest {

	@Test
	private void DockerImageTest1() {
		System.out.println("***Docker Test 1 Running..***");
		Assert.assertEquals("Pass", "Pass");

	}
}
