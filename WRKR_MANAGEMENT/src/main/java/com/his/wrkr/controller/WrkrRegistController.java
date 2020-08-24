
  package com.his.wrkr.controller;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.stereotype.Controller; import
  org.springframework.web.bind.annotation.PostMapping;
  
  import com.his.wrkr.model.Name; import com.his.wrkr.model.Worker; import
  com.his.wrkr.service.Admin_Wrkr_Regist_Service_Impl;
  
  @Controller public class WrkrRegistController {
  
  @Autowired private Admin_Wrkr_Regist_Service_Impl regservice;
  
  @PostMapping("/reg") public String regWrkr(Worker wrkr) { Worker model = new
  Worker();
  
  model.setGender('m'); model.setIsDelete('y'); model.setIsLock('y');
 
  
  
  String sucess =regservice.regWrkr(model); System.out.println(sucess); return
  sucess; }
  
  }
 