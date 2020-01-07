package com.Bio.silee.web;

import com.Bio.silee.domain.posts.service.PostsService;
import com.Bio.silee.web.dto.PostsUpdateRequestDto;
import com.Bio.silee.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * PostsApiControllerTest
 * @author 이상일
 * @version 1.0
 * (2020.01.07) 이상일, 최초 작성
 */
@RequiredArgsConstructor
@RestController
public class PostsApiController {
    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PostMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }
}
