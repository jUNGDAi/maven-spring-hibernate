/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wacoal.service;

import com.wacoal.dao.RegionDao;
import com.wacoal.model.Region;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author wien
 */
@Service
public class RegionService {

  @Autowired
  private RegionDao regionDao;

  @Transactional
  public void add(Region region) {
    regionDao.add(region);
  }

  @Transactional
  public void update(Region region) {
    regionDao.update(region);
  }

  @Transactional
  public void delete(Region region) {
    regionDao.delete(region);
  }

  public List<Region> listRegions() {
    return regionDao.listRegions();
  }

  public Region findRegion(Integer id) {
    return regionDao.findRegion(id);
  }

  public List listByName(String name) {
    return regionDao.listByName(name);
  }

}
