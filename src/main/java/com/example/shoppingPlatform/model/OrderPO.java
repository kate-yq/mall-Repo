package com.example.shoppingPlatform.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Order")
public class OrderPO {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private long usrId;
  private long productId;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT-8")
  private Date createTime;
  private int orderAmt;
  private double shippingFee;

  // order status: 0-> pending payment; 1-> pending shipping; 2->shipped;
  // 3->delivered; 4->received; 5->cancelled")
  private Integer status;
  private String deliveryTrackingNumber;
  private String receiverName;
  private String receiverPhone;
  private String receiverAddress;
  private String note;
  private Date paymentTime;
  private Date deliveryTime;
  private Date receiveTime;
}
