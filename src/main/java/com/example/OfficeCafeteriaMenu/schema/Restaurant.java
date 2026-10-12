package com.example.OfficeCafeteriaMenu.schema;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@Builder 
@AllArgsConstructor 
@NoArgsConstructor 
@Entity 
@Table (name = "Restaurant")
@SQLDelete(sql = "UPDATE Restaurant set deleted_at = CURRENT_TIMESTAMP where id = ? ")
@SQLRestriction ("deleted_at is NULL")
public class Restaurant extends BaseSchemaEntity {
    @Column (name = "name" , nullable = false)
    private String name;

    @Column (name = "location" , nullable = false)
    private String location;

}
