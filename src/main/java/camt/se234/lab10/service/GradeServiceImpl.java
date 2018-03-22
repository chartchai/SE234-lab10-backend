package camt.se234.lab10.service;

import camt.se234.lab10.entity.Grade;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {
    @Override
    public Grade getGrade(double score) {
        if (score > 80) {
            return Grade.builder().grade("A").build();
        }
        else if (score > 75){
            return Grade.builder().grade("B").build();
        }else if (score > 60){
            return Grade.builder().grade("C").build();
        }else if (score > 33) {
            return Grade.builder().grade("D").build();
        } else
            return Grade.builder().grade("F").build();

    }
}
