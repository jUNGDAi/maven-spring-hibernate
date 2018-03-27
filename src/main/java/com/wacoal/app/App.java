package com.wacoal.app;

import com.wacoal.model.Region;
import com.wacoal.service.RegionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

  public static void main(String[] args) {
    System.out.println("Hello World!");

    ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
    RegionService regionService = (RegionService) context.getBean("regionService");
    
    Region region = new Region();
    region.setId(51);
    region.setName("REGION_51_UPDATE");
//    regionService.add(region);
//    regionService.update(region);
//    regionService.delete(region);
    
//    System.out.println(regionService.listRegions());
//    System.out.println(regionService.findRegion(13));
    System.out.println(regionService.listByName("Thai"));
  }
}
