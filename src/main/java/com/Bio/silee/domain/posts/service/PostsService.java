package com.Bio.silee.domain.posts.service;

import com.Bio.silee.domain.posts.Posts;
import com.Bio.silee.domain.posts.PostsRepository;
import com.Bio.silee.web.dto.PostsUpdateRequestDto;
import com.Bio.silee.web.dto.PostsResponseDto;
import com.Bio.silee.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;
    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }


    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto) {
        Posts posts = postsRepository.findById(id)
                .orElseThrow(() ->new IllegalArgumentException("해당사용자가 없습니다. id=" + id));
      posts.update(requestDto.getTitle(), requestDto.getContent());
        return id;
    }

    public PostsResponseDto findById(Long id) {
        Posts entity = postsRepository.findById(id)
                .orElseThrow(() ->new IllegalArgumentException("해당사용자가 없습니다. id=" + id));
        return  new PostsResponseDto(entity);
    }
}
