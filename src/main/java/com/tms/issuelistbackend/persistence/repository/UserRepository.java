package com.tms.issuelistbackend.persistence.repository;

import com.tms.issuelistbackend.domain.User;
import com.tms.issuelistbackend.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
