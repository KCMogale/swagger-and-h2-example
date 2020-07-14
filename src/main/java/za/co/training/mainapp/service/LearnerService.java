package za.co.training.mainapp.service;

import za.co.training.mainapp.entity.Learner;

public interface LearnerService {

    Iterable<LearnerService> getAllLearners();
    Learner getLearnerByAge(int age);
    Learner saveLearner(Learner learner);
    void deleteLearnerRecord(int id);
}
