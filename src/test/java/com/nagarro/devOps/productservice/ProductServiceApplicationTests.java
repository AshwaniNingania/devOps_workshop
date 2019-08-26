package com.nagarro.devops.productservice;

import com.nagarro.devops.productservice.beans.Products;
import com.nagarro.devops.productservice.controller.ProductServiceController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void test_getProducts_Fail() {
		List<Products> list = new ArrayList<>();
		Assert.assertNotNull(list);
	}

	@Test
	public void test_getProducts_Success() {
		ProductServiceController controller = new ProductServiceController();
		List<Products> list = controller.fetchProductsList();
		Assert.assertNotNull(list);
	}

}
