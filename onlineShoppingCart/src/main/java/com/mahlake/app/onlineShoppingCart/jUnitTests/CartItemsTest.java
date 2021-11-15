package com.mahlake.app.onlineShoppingCart.jUnitTests;

//@DataJpaTest
//@AutoConfigureTestDatabase(replace = Replace.NONE)
//@Rollback(false)
public class CartItemsTest {

   /*@Autowired
    private CartRepo cartRepo;

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private ProductRepo productRepo;

    @Test
    public void addToCart(){

        Product product = testEntityManager.find(Product.class, 2);
        Customer customer = testEntityManager.find(Customer.class, 1);

        Cart newCart = new Cart();
        newCart.setCustomer(customer);
        newCart.setProduct(product);
        newCart.setCartId(3);
        newCart.setQuantity(2);
        newCart.setPrice(50.00);
        newCart.setTotal(100.00);
        Cart saveCart = cartRepo.save(newCart);
        assertTrue(saveCart.getCartId() > 0);
    }

    @Test
    public void addProduct()
    {
        Product product = new Product();
        product.setProductName("Evening Dress");
        product.setProductDescription("Silky long cocktail evening dress");
        product.setQuantity(25);
        product.setNumberSold(5);

        Product saveProduct = productRepo.save(product);
       assertTrue(saveProduct.getProductId() > 0);
    }*/

}
