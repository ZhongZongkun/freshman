package com.zzk.freshman.repository;

import com.zzk.freshman.entity.Stewardess;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StewardessRepository extends JpaRepository<Stewardess, Integer>{


    //通过身份证号查询新生信息
    public Stewardess findByIdentity(String identity);
}
