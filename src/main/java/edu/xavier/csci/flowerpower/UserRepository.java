package edu.xavier.csci.flowerpower;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.Collection;

public interface UserRepository extends CrudRepository<User, Integer> {}