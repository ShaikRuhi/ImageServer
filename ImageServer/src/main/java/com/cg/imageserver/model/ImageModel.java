package com.cg.imageserver.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mysql.jdbc.Blob;
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Entity
@Table(name="image_model")
public class ImageModel {
	@Id
    @Column(name = "id")
    private Long id;
	
    @Column(name = "name")
	private String name;
    
    @Column(name = "type")
	private String type;
	
	
    @Column(name="url")
	private String url;
    
   
    @Column(name="pic")
    @Lob
    private byte[] pic;
    
	public ImageModel(){}
	
	
	
	public ImageModel(Long id, String name, String type, String url, byte[] pic) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.url = url;
		this.pic = pic;
	}



	public Long getId(){
		return this.id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getType(){
		return this.type;
	}
	
	public void setType(String type){
		this.type = type;
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public byte[] getPic() {
		return pic;
	}



	public void setPic(byte[] pic) {
		this.pic = pic;
	}
	
	
}

