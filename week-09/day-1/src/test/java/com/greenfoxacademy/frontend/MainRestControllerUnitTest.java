package com.greenfoxacademy.frontend;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.*;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;




import com.greenfoxacademy.frontend.controllers.MainRestController;


@RunWith(SpringRunner.class)
@WebMvcTest(MainRestController.class)
public class MainRestControllerUnitTest {

    @Autowired
    MockMvc mockMvc;


    @Test
    public void doubling_10_Returns_20() throws Exception {
        this.mockMvc.perform(get("/doubling?=input=10"))
                .andExpect(jsonPath("$.result", is(20)));
    }


    @Test
    public void doubling_error_message() throws Exception {
        this.mockMvc.perform(get("/doubling"))
                .andExpect(jsonPath("$.error", is("Please provide an input!")));

    }


    @Test
    public void greeter_Test_With_Name_And_Title() throws Exception {
        this.mockMvc.perform(get("/greeter?name=Bence&title=doktor"))
                .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Bence, my dear doktor!")));
    }


    @Test
    public void greeter_Test_With_Name_Without_Title() throws Exception {
        this.mockMvc.perform(get("/greeter?name=Bence"))
                .andExpect(jsonPath("$.error", is("Please provide a title!")));

    }


    @Test
    public void greeter_Test_With_Title_Without_Name() throws Exception {
        this.mockMvc.perform(get("/greeter?title=doktor"))
                .andExpect(jsonPath("$.error", is("Please provide a name!")));
    }


    @Test
    public void greeter_Test_Without_Title_Without_Name() throws Exception {
        this.mockMvc.perform(get("/greeter"))
                .andExpect(jsonPath("$.error", is("Please provide a name and a title!")));
    }



}