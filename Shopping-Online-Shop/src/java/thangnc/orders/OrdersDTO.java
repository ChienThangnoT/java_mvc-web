/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thangnc.orders;

import java.sql.Date;

/**
 *
 * @author Chien Thang
 */
public class OrdersDTO {
    private String id;
    private Date dateBuy;
    private String username;

    public OrdersDTO() {
    }

    public OrdersDTO(String id, Date dateBuy, String username) {
        this.id = id;
        this.dateBuy = dateBuy;
        this.username = username;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the dateBuy
     */
    public Date getDateBuy() {
        return dateBuy;
    }

    /**
     * @param dateBuy the dateBuy to set
     */
    public void setDateBuy(Date dateBuy) {
        this.dateBuy = dateBuy;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
}
