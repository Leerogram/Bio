package com.Bio.silee.domain.posts;

import javafx.geometry.Pos;
import org.apache.tomcat.jni.Local;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanUp() {
        postsRepository.deleteAll();
    }

    @Test
    public void jpaSave() {
        //given
        String title= "테스트 게시글" ;
        String content = "테스트본문";

        postsRepository.save(Posts.builder()
                .title(title)
                .content(content)
                .author("test@gmail.com")
                .build());
        //when
        List<Posts> postList = postsRepository.findAll();

        //then
        Posts posts = postList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);

    }
    //p 122
    @Test
    public void BaseTimeTntity_regi() {
        //given
        LocalDateTime now = LocalDateTime.of(2020,1,9,0,0,0);
        postsRepository.save(Posts.builder().title("title").content("content").author("author").build());
        //when
        List<Posts> postsList = postsRepository.findAll();
        //then
        Posts posts = postsList.get(0);

        System.out.println(">>>createDate ="+posts.getCreatdDate()+", modifiedData = " + posts.getModifiedDate());
        assertThat(posts.getCreatdDate()).isAfter(now);
        assertThat(posts.getModifiedDate()).isAfter(now);
    }

}
