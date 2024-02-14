package hello.board.Repository.post;

import hello.board.domain.post.Post;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;


@Repository
public class PostRepository {
    private static final Map<Long, Post> store = new HashMap<>();   //static
    private static long sequence = 0L;

//    public Post save(Post post) {
//
//    }

}
