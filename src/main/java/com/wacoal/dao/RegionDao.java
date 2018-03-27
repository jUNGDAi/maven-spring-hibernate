/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wacoal.dao;

import com.wacoal.model.Region;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author wien
 */
@Repository
public class RegionDao {

  @Autowired
  private HibernateTemplate hibernateTemplate;

  public void add(Region region) {
    hibernateTemplate.save(region);
  }

  public void update(Region region) {
    hibernateTemplate.update(region);
  }

  public void delete(Region region) {
    hibernateTemplate.delete(region);
  }

  public List<Region> listRegions() {
    return hibernateTemplate.loadAll(Region.class);
  }

  public Region findRegion(Integer id) {
    return hibernateTemplate.load(Region.class, id);
  }

  public List listByName(String name) {
    DetachedCriteria criteria = DetachedCriteria.forClass(Region.class);
    criteria.add(Restrictions.ilike("name", "%" + name + "%"));
    return hibernateTemplate.findByCriteria(criteria);
  }
}
