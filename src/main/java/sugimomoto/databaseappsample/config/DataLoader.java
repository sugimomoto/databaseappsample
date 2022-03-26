package sugimomoto.databaseappsample.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import sugimomoto.databaseappsample.model.*;
import sugimomoto.databaseappsample.repository.*;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Component
public class DataLoader implements ApplicationRunner {

    private final CommentRepository repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        var comment = new Comment();
        comment.setContent("Hello");
        repository.save(comment);

        var testComment = new Comment();
        testComment.setContent("World");
        repository.save(testComment);
    }
}
