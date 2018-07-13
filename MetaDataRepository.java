package com.tprojects.project1.repositories;

import com.tprojects.project1.models.metadata.MetaData;
import com.tprojects.project1.models.user.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.jpa.repository.Temporal;
import org.springframework.stereotype.Repository;

import javax.persistence.TemporalType;
import java.time.LocalDateTime;
import java.util.List;


@Repository
public interface MetaDataRepository extends JpaRepository<MetaData, String>{

    public List<MetaData> findAllByUserOrderByTimeCreatedDesc(User user, Pageable pageable);

    public List<OnlyNameAndUserId> findAllByTimeCreatedBetweenOrderByUserAsc(LocalDateTime start, LocalDateTime end);

    public MetaData findOneByUserAndName(User user, String name);

}
