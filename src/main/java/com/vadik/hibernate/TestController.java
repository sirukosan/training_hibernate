package com.vadik.hibernate;

import com.vadik.hibernate.model.commonexample.Post;
import com.vadik.hibernate.model.commonexample.Tag;
import com.vadik.hibernate.model.joinedtable.JoinedChild;
import com.vadik.hibernate.repository.commonexample.PostRepository;
import com.vadik.hibernate.repository.commonexample.TagRepository;
import com.vadik.hibernate.repository.joinedtable.JoinedChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class TestController {

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private TagRepository tagRepository;

    @Autowired
    private JoinedChildRepository joinedChildRepository;

    @GetMapping("test")
    public List<Post> test() {
        Post p1 = new Post("Running is good!");
        Post p2 = new Post("Veggies are great!");
        Tag t1 = new Tag("sport");
        Tag t2 = new Tag("health");
        Tag t3 = new Tag("food");

        p1.getTags().add(t1);
        p1.getTags().add(t2);
        p2.getTags().add(t2);
        p2.getTags().add(t3);

        postRepository.save(p1);
        postRepository.save(p2);

        joinedChildRepository.save(new JoinedChild("name", "childName"));
        return postRepository.findAll();
    }

}
