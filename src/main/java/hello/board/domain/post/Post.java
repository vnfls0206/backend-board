package hello.board.domain.post;


import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class Post {
    private Long id;
    private String postName;
    private String postContents;
    private Integer[] comment;


    public Post(Long id, String postName, String postContents, Integer[] comment) {
        this.id = id;
        this.postName = postName;
        this.postContents = postContents;
        this.comment = comment;
    }

}
