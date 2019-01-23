package org.launchcode.models.data;

import org.launchcode.models.Category;
import org.launchcode.models.Cheese;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface CheeseDao extends CrudRepository<Cheese, Integer> {

        public List<Cheese> findByCategory(Category category);
}
