package org.example.domain;

public class Product {
    private int productId;
    private String productName;
    private String ProductColour;

    public Product(int productId, String productName, String productColour) {
        this.productId = productId;
        this.productName = productName;
        ProductColour = productColour;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductColour() {
        return ProductColour;
    }

    public void setProductColour(String productColour) {
        ProductColour = productColour;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", ProductColour='" + ProductColour + '\'' +
                '}';
    }
}

