package com.devsuperior.dslist.Projections;

public interface GameMinProjection {
	//Sempre deixar após o get a 1a.letra em maiuscula
	Long getId();
	String getTitle();
	Integer getYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
	
}
