package io.github.follyfields;

import io.github.follyfields.models.Product;
import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;

public interface ProductResource extends PanacheEntityResource<Product, Long> {
    
}
