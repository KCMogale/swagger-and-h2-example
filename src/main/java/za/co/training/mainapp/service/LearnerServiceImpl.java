package za.co.training.mainapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.training.mainapp.entity.Learner;
import za.co.training.mainapp.repository.LearnerRepository;

@Service
public class LearnerServiceImpl implements LearnerService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private LearnerRepository learnerRepository;

    @Autowired
    public void setLearnerRepository(LearnerRepository learnerRepository) {
        this.learnerRepository = learnerRepository;
    }

    @Override
    public Iterable<LearnerService> getAllLearners() {
        logger.info("getAllLearners method");
        return learnerRepository.findAll();
    }

    @Override
    public Learner getLearnerByAge(int age) {
        logger.info("getLearnerByAge method");
        return null;
    }

    @Override
    public Learner saveLearner(Learner learner) {
        logger.info("saveLearner method");
        return null;
    }

    @Override
    public void deleteLearnerRecord(int id) {
        logger.info("deleteLearnerRecord method");
    }
}
