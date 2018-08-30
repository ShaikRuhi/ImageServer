package com.cg.imageserver.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.imageserver.model.ImageModel;
import com.cg.imageserver.service.ImageService;

@RestController
public class ImageController {
@Autowired
ImageService service;
@RequestMapping(value="/save",method=RequestMethod.POST)
 public void saveImage(ImageModel image) {
	 try {
		service.addImage(image);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}
