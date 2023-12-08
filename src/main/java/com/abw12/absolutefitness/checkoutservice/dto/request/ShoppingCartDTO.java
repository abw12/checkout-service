package com.abw12.absolutefitness.checkoutservice.dto.request;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCartDTO {

    @Id
    private String cartId;
    private String userId;
    private List<ShoppingCartItemDTO> cartItem;
    private String cartCreatedAt;
    private String cartModifiedAt;
}
