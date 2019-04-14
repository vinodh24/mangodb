
#ssssfsfsfsgdgsg

package com.velankani.nocvue.unity.ms.common.test;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.mongodb.MongoClient;
import com.velankani.nocvue.unity.ms.common.model.Common;
@EnableMongoRepositories
@Repository
public class MongoTest {

	
	public static void main(String args[]) {

		 MongoTemplate	mongoOps = new MongoTemplate(new SimpleMongoDbFactory(new MongoClient("localhost", 27017), "test"));
			System.out.println("mongoOps::::::::"+mongoOps);
		

		 	
			Common common=new Common();
			common.setId("vinodh");
			common.setPortName("vinodh prot name");
			common.setSubscriberId("vinodh12345");
			common.setTechnology("microservices");
			System.out.println("common:::::::"+common);
			try {
			mongoOps.insert(common,"vinodh");
			}catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			//System.out.println(mongoOps.findAll(Common.class));
			
 /*       AbstractApplicationContext context = new AnnotationConfigApplicationContext(MongoConfig.class);
        CarService carService = (CarService) context.getBean("carService");
        // Delete All cars
        carService.deleteAll();
 
        Car polo = new Car("Volkswagen", "Polo");
        carService.create(polo);
 
        Car jetta = new Car("Volkswagen", "Jetta");
        carService.create(jetta);
 
        Car swift = new Car("Maruti Suzuki", "Swift");
        carService.create(swift);
 
        Car ertiga = new Car("Maruti Suzuki", "Ertiga");
        carService.create(ertiga);
 
        Car i10 = new Car("Hyundai", "i10");
        carService.create(i10);
 
        Car i20 = new Car("Hyundai", "i20");
        carService.create(i20);
 
        System.out.println("Find One:- " + carService.find(swift));
 
        System.out.println("Find All!!");
 
        List < Car > cars = carService.findAll();
        for (Car car: cars) {
            System.out.println(car);
        }
        System.out.println();
        carService.delete(swift);
 
        System.out.println();
        i10.setModel("i10 Nxt");
        carService.update(i10);
 
        System.out.println("Find All After Update!!");
 
        cars = carService.findAll();
        for (Car car: cars) {
            System.out.println(car);
        }
 
        context.close();*/
    }

}
