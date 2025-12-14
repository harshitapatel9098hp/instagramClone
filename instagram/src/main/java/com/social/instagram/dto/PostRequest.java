package com.social.instagram.dto;



import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostRequest {

    private String imageUrl;
    private String caption;
}
