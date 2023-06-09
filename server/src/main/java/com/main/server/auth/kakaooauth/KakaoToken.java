package com.main.server.auth.kakaooauth;

import lombok.Data;

@Data
public class KakaoToken {
    //카카오 로그인시 발급되는 accessToken을 가져와 여기 kakaoToken 객체로 바꾸어주고,
    // 해당 객체를 다시 카카오쪽으로 보내어 회원 정보를 얻어올 예정.
    private String access_token;
    private String token_type;
    private String refresh_token;
    private int expires_in;
    private String scope;
    private int refresh_token_expires_in;
}