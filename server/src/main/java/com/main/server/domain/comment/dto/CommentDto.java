package com.main.server.domain.comment.dto;


import lombok.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

//        commentId	INT
//        content	VARCHAR(45)
//        createdAt	DATETIME
//        memberId	INT
//      boardId	INT
@Getter
@Setter
@AllArgsConstructor
public class CommentDto { //서비스는 엔티티에서 받아온 애를 직접 가공x, 서비스는 데이터 dto로 옮겨서


    @Getter
    @AllArgsConstructor
    public static class Post {
        private String content;
        private long memberId; //멤버를 식별하기 위함
        private long boardId;
        private long parentId;

    }

    @Getter
    @Setter
    @AllArgsConstructor
    public static class Put {
        private String content;
        private Long commentId;

    }

    @Getter
    @Setter
    @AllArgsConstructor
    public static class Response { //닉네임,사진 추가
        private String nickname;

        private String userPhoto;
        private String content;
        private Timestamp createdAt;

        private Long commentId;
        private Long parentId;

        public Response(){
        }

    }


    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MyPageResponse { //마이페이지 겟요청할때 필요. 보드아이디는 보드 찾아들어갈것, 내용은 보여줄것
        private Long boardId;
        private String content;

    }

}




