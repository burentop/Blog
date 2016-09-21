package net.burento.blog.model;

import java.util.List;

public interface CommentDAO {

    boolean addComment(Comment comment);

    List<Comment> findAll();


}
