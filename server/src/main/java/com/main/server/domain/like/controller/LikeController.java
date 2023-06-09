package com.main.server.domain.like.controller;

import com.main.server.domain.like.dto.LikeDto;
import com.main.server.domain.like.service.LikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("/likes")
public class LikeController { //이렇게 하려면 얘가 생성해야되는건지 아닌지 프론트에서 보내줘야해 근데 우리는 그렇게는 아니다. 빨간색인데 사용자가 눌러 빈칸이 되어야 되는데 그때 프론트에서 딜리트로
    //1이면 딜리트로 일인 상태면 0이 포스트
    private final LikeService likeService;

    @PostMapping
    public long like(@RequestBody @Valid LikeDto likeDto) {

        long a = likeService.updateLike(likeDto); //라이크카운트리턴
        return a;
    }


}