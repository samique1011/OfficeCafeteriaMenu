package com.example.OfficeCafeteriaMenu.schema;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tools.jackson.core.ObjectReadContext.Base;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

@Data 
@Builder 
@AllArgsConstructor 
@NoArgsConstructor 
@Entity 
@Table (name = "MenuItem")
@SQLDelete (sql = "Update MenuItem set deleted_at = CURRENT_TIMESTAMP where id = ?")
@SQLRestriction ("deleted_at is null")
public class MenuItem extends BaseSchemaEntity  {
    @Column (name = "name" , nullable = false)
    private String name;

    @Column (name = "description" , nullable = false)
    private String description;

    @Column (name = "price" , nullable = false)
    private Double price;

    @Column (name = "vegeterian" , nullable = false)
    private Boolean vegetarian;

    @Column (name = "Category" , nullable = false)
    private MenuItemCategory menuItemCategory;

}
