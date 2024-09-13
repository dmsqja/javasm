package edu.sm.dao;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CartDao {
    private int id;
    private int productId;
    private String custId;
    private int quantity;
}
