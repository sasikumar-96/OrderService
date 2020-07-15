package com.order.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDER_DETAILS")
public class OrderEntity {
	
	@Id
	@Column(name="ORDER_ID")
	private Integer orderId;
	
	@Column(name="SERIES_ID")
	private Integer seriesId;
	
	@Column(name="MODEL_ID")
	private Integer modelId;
	
	@Column(name="COLOR_ID")
	private Integer colorId;
	
	@Column(name="ACESSORY_ID")
	private Integer accessoryId;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(Integer seriesId) {
		this.seriesId = seriesId;
	}

	public Integer getModelId() {
		return modelId;
	}

	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}

	public Integer getColorId() {
		return colorId;
	}

	public void setColorId(Integer colorId) {
		this.colorId = colorId;
	}

	public Integer getAccessoryId() {
		return accessoryId;
	}

	public void setAccessoryId(Integer accessoryId) {
		this.accessoryId = accessoryId;
	}

	public OrderEntity(Integer orderId, Integer seriesId, Integer modelId, Integer colorId, Integer accessoryId) {
		super();
		this.orderId = orderId;
		this.seriesId = seriesId;
		this.modelId = modelId;
		this.colorId = colorId;
		this.accessoryId = accessoryId;
	}

	public OrderEntity() {
		super();
	}
	
	

}
