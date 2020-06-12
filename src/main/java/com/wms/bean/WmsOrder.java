package com.wms.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WmsOrder {
	
	@JsonProperty("order_id")
	private String orderId;

	@JsonProperty("shipment_id")
    private String shipmentId;

	@JsonProperty("order_line_id")
    private String orderLineId;

	@JsonProperty("product_id")
    private String productId;

	@JsonProperty("payment_mode")
    private String paymentMode;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getShipmentId() {
		return shipmentId;
	}

	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}

	public String getOrderLineId() {
		return orderLineId;
	}

	public void setOrderLineId(String orderLineId) {
		this.orderLineId = orderLineId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	@Override
	public String toString() {
		return "WmsOrder [orderId=" + orderId + ", shipmentId=" + shipmentId + ", orderLineId=" + orderLineId
				+ ", productId=" + productId + ", paymentMode=" + paymentMode + "]";
	}

}
