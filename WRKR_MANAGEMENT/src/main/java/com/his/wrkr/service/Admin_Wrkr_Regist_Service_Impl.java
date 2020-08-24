
  package com.his.wrkr.service;
  
  import org.springframework.beans.factory.annotation.Autowired;
import
  org.springframework.stereotype.Service;

import com.his.wrkr.entity.WorkerEntity;
import com.his.wrkr.model.Worker;
import
  com.his.wrkr.repositories.Reg_Wrkr_Repository;
  
  @Service public class Admin_Wrkr_Regist_Service_Impl implements
  Admin_Wrkr_Regist_Service {
  
  @Autowired private Reg_Wrkr_Repository regWrkrRepo;
  
  @Override public String regWrkr(Worker wrkr) {
	  WorkerEntity wrkrEntity = new WorkerEntity();
  wrkrEntity.setGender(wrkr.getGender());
  wrkrEntity.setIsDelete(wrkr.getIsDelete());
  
  
  WorkerEntity workerEntity = regWrkrRepo.save(wrkrEntity); 
  String sucess =
  "is saved sucessfully";
  
  return sucess;
  
  }
  
  }
 