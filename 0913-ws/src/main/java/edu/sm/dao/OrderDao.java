package edu.sm.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDao {
    private int id;
    private String custId;
    private Date orderDate;
    private int totalPrice;
}
