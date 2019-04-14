package com.velankani.nocvue.unity.ms.common.dao;

import java.util.List;

public interface GenericDao<E> {
	/**
	 * 
	 * @param entity:
	 *            entity to save
	 * @return Identifier of saved entity
	 */
	public E save(E entity);
	
	/**
	 * 
	 * @param entity:
	 *            entity to save or update
	 */
	public E saveOrUpdate(E entity);

	/**
	 * 
	 * @param entity: entity to delete
	 */
    public E delete( E entity );
    
    /**
     * Delete all records
     */
    void deleteAll();
    
    /**
     * Find all records
     * @return
     */
    List<E> findAll();
    
    /**
     * Find all records matching provided entity
     * @param entity: entity object used for search
     * @return
     */
    List<E> findAllByExample( E entity );
    
    /**
     * Find by primary key
     * @param id
     * @return unique entity 
     */
    E findById( int id );

}
