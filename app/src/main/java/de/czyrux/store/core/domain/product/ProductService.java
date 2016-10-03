package de.czyrux.store.core.domain.product;

import rx.Observable;

public class ProductService {

    private final ProductDataSource productDataSource;

    public ProductService(ProductDataSource productDataSource) {
        this.productDataSource = productDataSource;
    }

    public Observable<ProductResponse> getAllCatalog() {
        return productDataSource.getAllCatalog()
                .map(ProductResponse::new);
    }
}
