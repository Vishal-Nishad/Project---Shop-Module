package com.shopentity.shoppingmall;

import jakarta.persistence.*;

  @Entity
  @Table(name = "shopmodule")
public class Shop {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int shopId;
	    private String shopCategory;
	    private String shopName;
	    private String customers;
	    private String shopStatus;
	    private String leaseStatus;
	    private int shopEmployeeId;

	    // Constructors
	    public Shop() {
	    }
	   public Shop(int shopId,String shopCategory, String shopName, String customers) {
		   this.shopId=shopId;
		   this.shopCategory=shopCategory;
		   this.shopName=shopName;
		   this.customers=customers;
	   };
	    
	    // Getters and setters
	    public int getShopId() {
	        return shopId;
	    }

	    public void setShopId(int shopId) {
	        this.shopId = shopId;
	    }

	    public String getShopCategory() {
	        return shopCategory;
	    }

	    public void setShopCategory(String shopCategory) {
	        this.shopCategory = shopCategory;
	    }

	    public String getShopName() {
	        return shopName;
	    }

	    public void setShopName(String shopName) {
	        this.shopName = shopName;
	    }

	    public String getCustomers() {
	        return customers;
	    }

	    public void setCustomers(String customers) {
	        this.customers = customers;
	    }

	    public String getShopStatus() {
	        return shopStatus;
	    }

	    public void setShopStatus(String shopStatus) {
	        this.shopStatus = shopStatus;
	    }

	    public String getLeaseStatus() {
	        return leaseStatus;
	    }

	    public void setLeaseStatus(String leaseStatus) {
	        this.leaseStatus = leaseStatus;
	    }

	    public int getShopEmployeeId() {
	        return shopEmployeeId;
	    }

	    public void setShopEmployeeId(int shopEmployeeId) {
	        this.shopEmployeeId = shopEmployeeId;
	    }
		@Override
		public String toString() {
			return "Shop [shopId=" + shopId + ", shopCategory=" + shopCategory + ", shopName=" + shopName
					+ ", customers=" + customers + ", shopStatus=" + shopStatus + ", leaseStatus=" + leaseStatus
					+ ", shopEmployeeId=" + shopEmployeeId + "]";
		}
	

	
}
