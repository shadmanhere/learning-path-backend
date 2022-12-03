package com.learningpath;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class LearningPathController {

    @RequestMapping("/learningpaths")
    public List<LearningPath> retrieveAllPaths() {
        return Arrays.asList(
            new LearningPath(1, "Learn Java", "xsxsxs"),
            new LearningPath(1, "Learn Java", "xsxsxs"),
            new LearningPath(1, "Learn React", "ali"),
            new LearningPath(1, "Learn React", "ali"),
            new LearningPath(1, "Learn React", "shadman")
        );
    }
}
