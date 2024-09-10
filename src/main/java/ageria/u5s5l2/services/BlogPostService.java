package ageria.u5s5l2.services;

import ageria.u5s5l2.controllers.BlogController;
import ageria.u5s5l2.entities.BlogPost;
import lombok.Getter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class BlogPostService {

    @Getter
    List<BlogPost> blogPostList = new ArrayList<>();

    public BlogPost findPostById(int id){
        BlogPost found = null;
        for(BlogPost blogPost : blogPostList){
            if(blogPost.getId() == id) found = blogPost;
        }
        return found;
    }

    public void saveBlogPost(BlogPost body){
        Random random = new Random();
        body.setId(random.nextInt(1,1000000));
        body.setCover("https://localhost:8080/" + body.getTitle());
        this.blogPostList.add(body);
    }

    public BlogPost updateBlogPost(int blogPostId, BlogPost body){
        BlogPost found = null;
        for(BlogPost blogPost : blogPostList){
            if(blogPost.getId() == blogPostId){
                found = body;
                found.setCover("https://localhost:8080/" + body.getTitle());
                found.setTitle(body.getTitle());
                found.setCategory(body.getCategory());
                found.setContenuto(found.getContenuto());
                found.setReadingTime(body.getReadingTime());
            }
        }
        return found;
    }

    public void findyByIdAndDelete(int blogPostId){
        BlogPost found = null;
        for (BlogPost blogPost : blogPostList){
            if(blogPost.getId() == blogPostId) found = blogPost;
        }
        this.blogPostList.remove(found);
    }


}
