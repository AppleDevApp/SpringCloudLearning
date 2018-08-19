package com.ucucs.registrydiscovery;

import org.junit.Test;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class IndexTest extends BaseApiTest {

    @Test
    public void index() throws Exception {
        this.mockMvc
                .perform(
                        post("/")
                                .header("access_token", "2E14D92B-1FB1-4D04-8EA3-486DA78914BA")
                                .header("user_uuid", "05d44c79-627b-466c-940a-c62074107226")
                                .param("age", "1")
                )
                .andExpect(status().isOk())
                .andDo(document("获取所有用户接口"));
    }

}
