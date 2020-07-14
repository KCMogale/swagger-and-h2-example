package za.co.training.mainapp.repository;

import org.springframework.data.repository.CrudRepository;
import za.co.training.mainapp.service.LearnerService;

public interface LearnerRepository extends CrudRepository<LearnerService, Integer> {
}
