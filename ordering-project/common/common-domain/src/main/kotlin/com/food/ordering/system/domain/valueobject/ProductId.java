package com.food.ordering.system.domain.valueobject;

import java.util.*;

public class ProductId extends BaseId<UUID> {
    public ProductId(UUID value) {
        super(value);
    }
}