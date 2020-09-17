package com.ld.edu.resolver;


import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.ld.edu.entity.Author;
import com.ld.edu.entity.AuthorInput;
import org.springframework.stereotype.Component;


/**
 * @Author Ling dong.
 * @Date 2020/7/10 - 14:35
 */
@Component
public class AuthorMutationResolver implements GraphQLMutationResolver {
    public Author createAuthor(AuthorInput authorInput) {
        System.out.println(authorInput);
        Author author = Author.builder().id(1)
                .name("小鸟")
                .age(12)
                .build();
        return author;
    }

    public Author updateAuthor(String id, AuthorInput authorInput){
        System.out.println(id+":"+authorInput);
        Author author = Author.builder().id(1)
                .name("小鸟")
                .age(12)
                .build();
        return author;
    }

    public String deleteAuthor(String id){
        System.out.println(id);
        return "删除成功";
    }
}
