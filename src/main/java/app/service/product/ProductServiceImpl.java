package app.service.product;

import app.dao.ProductDAO;
import app.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional

public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDAO;


    public void save(Product assortment) {
        productDAO.save(assortment);
    }

    public List<Product> findAll() {
        return productDAO.findAll();
    }

    public Product findOne(int id) {
        return productDAO.findOne(id);
    }
}
