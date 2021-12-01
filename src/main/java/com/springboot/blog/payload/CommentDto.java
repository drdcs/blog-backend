package com.springboot.blog.payload;


import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data

public class CommentDto {

    private Long id;
    @NotEmpty
    @Size(min=2, message = "Comment name should have 2 characters")
    private String name;
    @NotEmpty
    @Email(message= "please enter a valid email.")
    private String email;
    @NotEmpty
    @Size(min=5, message = "Comment name should have 2 characters")
    private String body;
}
