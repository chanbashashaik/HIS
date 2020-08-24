package com.his.wrkr.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.his.wrkr.entity.WorkerEntity;


public interface Reg_Wrkr_Repository extends JpaRepository<WorkerEntity, Serializable> {

}
