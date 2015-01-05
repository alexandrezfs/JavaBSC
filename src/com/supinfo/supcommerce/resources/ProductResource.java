package com.supinfo.supcommerce.resources;

import com.supinfo.supcommerce.dao.DaoFactory;
import com.supinfo.supcommerce.dao.ProductDao;
import com.supinfo.supcommerce.entity.Product;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by alexandrenguyen on 05/01/15.
 */

@Path("/products")
public class ProductResource {

    private ProductDao productDao;

    public ProductResource() {
        this.productDao = DaoFactory.getProductDao();
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Product> getAllProductsInXml() {
        return this.productDao.getAll();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> getAllProductsInJson(String payload) {
        return this.productDao.getAll();
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("{productId}")
    public Product getProductInXml(@PathParam("productId") Long productId) {
        return this.productDao.getById(productId);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{productId}")
    public Product getProductInJson(@PathParam("productId") Long productId) {
        return this.productDao.getById(productId);
    }

    @DELETE
    @Path("{productId}")
    public void removeProduct(@PathParam("productId") Long productId) {
        this.productDao.delete(
                this.productDao.getById(productId)
        );
    }
}
