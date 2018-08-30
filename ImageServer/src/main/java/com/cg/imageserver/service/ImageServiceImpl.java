package com.cg.imageserver.service;


import javax.persistence.PersistenceContext;
import java.io.*;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.imageserver.model.ImageModel;
import com.cg.imageserver.repository.ImageRepository;
@Service
@PersistenceContext
public class ImageServiceImpl implements ImageService{
	@Autowired
	ImageRepository imageRepository;
	
	@Autowired
	ImageModel model;
	@Transactional
	@Override
	public void addImage(ImageModel image) throws Exception {
		/*ClassPathResource backImgFile = new ClassPathResource("D:\\imagehtml\\Chrysanthemum.jpg");
		byte[] arrayPic = new byte[(int) backImgFile.contentLength()];
		backImgFile.getInputStream().read(arrayPic);*/
		//ImageModel image = new ImageModel(1, "JSA-ABOUT-IMAGE-BLACK-BACKGROUND", "png", arrayPic);
		
		//File file = new File("D:\\imagehtml\\Chrysanthemum.jpg");
		//BufferedImage image1 = image;
		
		//image = ImageIO.read(file);
        
        //ImageIO.write(image, "jpg", new File("I:/output.jpg"));
		//ImageModel image = new ImageModel(1, "Chrysanthemum", "jpg", arrayPic);
		
	//	model.setPic("D:\\imagehtml\\Chrysanthemum.jpg");
		
		imageRepository.save(image);
		
	}
	

}
