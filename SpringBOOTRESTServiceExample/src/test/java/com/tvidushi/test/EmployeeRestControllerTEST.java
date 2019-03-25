package com.tvidushi.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.apache.el.parser.AstString;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.tvidushi.EmployeeRESTController;

@RunWith(SpringRunner.class)
@WebMvcTest(value = EmployeeRESTController.class, secure = false)
public class EmployeeRestControllerTEST {
	
	 private MockMvc mockMvc;
	
	 @Autowired
	  private WebApplicationContext webApplicationContext;
	 
	 @Before
	  public void setup() {
	    mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	  }
	 
	
	
	@Test
	public void getEmployeeDetails() throws Exception {
		
		mockMvc.perform(get("/employee")).andExpect(status().isOk())
        .andExpect(content().contentType("application/json;charset=UTF-8"))
        .andExpect(jsonPath("$.firstName").value("John")).andExpect(jsonPath("$.lastName").value("Smith"))
        .andExpect(jsonPath("$.department").value("HR")).andExpect(jsonPath("$.age").value(30));
		
	}
	
	
	@Test
	public void postEmployeeDetails() throws Exception {
		
		mockMvc.perform(MockMvcRequestBuilders.post(("/postEmployee")).content("application/xml;charset=UTF-8").
				content("<employee><firstName>abc</firstName><lastName>pqr</lastName><department>CS</department><age> 27</age></employee>"))
				.andExpect(status().isCreated());

		
	}
	


}
