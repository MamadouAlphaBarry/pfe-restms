package it.cws.meta.cwsuserservices.dao;

import it.cws.meta.cwsuserservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    @Query("select case when count(c)>0 then true else false END from User c where c.email=?1")
    Boolean checkIfUserEmailExist();
    @Query("select c from User c where (c.firstName like :kw) " +
            "or (c.lastName like :kw) or (c.email like :kw)")
    List<User> searchCustomers(@Param("kw") String kw);
}
