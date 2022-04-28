package com.example.explastmain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExpRepository extends JpaRepository<Exp,Long> {

    @Query(" select e from Exp e where e.date between '2022/04/01' and '2022/04/30' ")
    public List<Exp> findExpByDateBetweenAnd();
    @Query(" select e from Exp e where e.date between '2022/05/01' and '2022/05/31' ")
    public List<Exp> findByMai();
    @Query(" select e from Exp e where e.date between '2022/06/01' and '2022/06/30' ")
    public List<Exp> findByJuin();
    @Query(" select e from Exp e where e.date between '2022/07/01' and '2022/07/31' ")
    public List<Exp> findByJuly();
    @Query(" select e from Exp e where e.date between '2022/08/01' and '2022/08/31' ")
    public List<Exp> findByAout();
    @Query(" select e from Exp e where e.date between '2022/9/01' and '2022/9/30' ")
    public List<Exp> findBySeptember();
    @Query(" select e from Exp e where e.date between '2022/10/01' and '2022/10/31' ")
    public List<Exp> FindByOctober();









}
