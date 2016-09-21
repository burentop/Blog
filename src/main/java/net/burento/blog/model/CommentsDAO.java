package net.burento.blog.model;

import java.util.List;

public class CommentsDAO implements CommentDAO {

    @Override
    public boolean addComment(Comment comment) {
        return false;
    }

    @Override
    public List<Comment> findAll() {
        return null;
    }
}
