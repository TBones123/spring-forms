package app.entity;

import javax.persistence.*;

@Entity

public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String assortment;
   @ManyToOne(
           fetch = FetchType.LAZY,
           cascade = {CascadeType.ALL, CascadeType.MERGE}
   )
   @JoinTable(
           name = "user_ref_product",
           joinColumns = @JoinColumn(name = "product_id"),
           inverseJoinColumns = @JoinColumn(name = "user_id")
   )
    private User user;

    public Product() {
    }

    public Product(String assortment) {
        this.assortment = assortment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAssortment() {
        return assortment;
    }

    public void setAssortment(String assortment) {
        this.assortment = assortment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", assortment='" + assortment + '\'' +
                '}';
    }
}
