package br.com.seuze.store.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.seuze.store.api.model.Product;
import br.com.seuze.store.api.model.ProductSold;

public interface ProductSoldRepository  extends JpaRepository<ProductSold, Long> {

}
