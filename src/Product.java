public class Product {
    private int ProductId;
    private String ProductName;
    private double ProductPrice;
    private String ProductDescription;

    private Category ProductCategory;

    public Product(int productId, String productName, double productPrice, String productDescription, Category productCategory) {
        ProductId = productId;
        ProductName = productName;
        ProductPrice = productPrice;
        ProductDescription = productDescription;
        ProductCategory = productCategory;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public double getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(double productPrice) {
        ProductPrice = productPrice;
    }

    public String getProductDescription() {
        return ProductDescription;
    }

    public void setProductDescription(String productDescription) {
        ProductDescription = productDescription;
    }

    public Category getProductCategory() {
        return ProductCategory;
    }

    public void setProductCategory(Category productCategory) {
        ProductCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product: {" +
                "Product Id = " + ProductId +
                ", Product Name: '" + ProductName + '\'' +
                ", Product Price = " + ProductPrice +
                ", Product Description: '" + ProductDescription +
                "', Product Category: '" + ProductCategory.getCategoryName() +
                "'}";
    }
}
