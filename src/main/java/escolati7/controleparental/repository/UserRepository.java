package escolati7.controleparental.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import escolati7.controleparental.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel,Long>{}
