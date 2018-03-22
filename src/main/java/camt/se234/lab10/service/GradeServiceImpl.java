package camt.se234.lab10.service;

import camt.se234.lab10.entity.Grade;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {
    @Override
    public Grade getGrade(double score) {
        return Grade.builder().grade("A").build();
    }
}
