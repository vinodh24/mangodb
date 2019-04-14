package com.velankani.nocvue.unity.ms.common.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unchecked")
@Repository
public abstract class AbstractGenericDao<E> implements GenericDao<E> {

	private Class<E> entityClass;
	@Autowired
    MongoTemplate mongoTemplate;

	public AbstractGenericDao() {
		this.entityClass = (Class<E>) (this.getClass().getGenericSuperclass());
	}
	public E save(E entity) {
		// TODO Auto-generated method stub
		return mongoTemplate.insert(entity, "");
	}
	public E saveOrUpdate(E entity) {
		return mongoTemplate.save(entity, "");
		
	}
	/*public E delete(E entity) {
		DeleteResult a=mongoTemplate.remove(entity);
		return null;
		
	}*/
	/*public void deleteAll() {
		mongoTemplate.remove(new Query(),"");
		
	}*/
	public List<E> findAll() {
		// TODO Auto-generated method stub
		return mongoTemplate.findAll(entityClass, "");
	}
	public List<E> findAllByExample(E entity) {
		// TODO Auto-generated method stub
		return null;
	}
	public E findById(int id) {
		// TODO Auto-generated method stub
		return mongoTemplate.findById(id, entityClass);
	}

}
