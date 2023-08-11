package escolati7.controleparental.interfaces;

import org.springframework.data.repository.CrudRepository;

import escolati7.controleparental.model.UserModel;

public interface UserRepository extends CrudRepository<UserModel,Integer>{}
