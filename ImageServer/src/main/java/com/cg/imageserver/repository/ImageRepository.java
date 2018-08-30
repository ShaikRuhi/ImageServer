package com.cg.imageserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.cg.imageserver.model.ImageModel;


@Repository
public interface ImageRepository extends JpaRepository<ImageModel, Long> {
	/*@Query("INSERT INTO image_model(id, name, type,url,pic) values(:id,:name,:type,:url,:pic)")
	public void addImage(ImageModel model);*/
}
