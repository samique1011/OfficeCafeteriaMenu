package com.example.OfficeCafeteriaMenu.schema;

import java.time.LocalDate;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table (name = "Menu")
@SQLDelete (sql = "Update Menu set deleted_at = CURRENT_TIMESTAMP where id = ?")
@SQLRestriction ("deleted_at is null")
public class Menu extends BaseSchemaEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "restaurant_id")
    private Restaurant restaurant;

    @Column (name = "date" , nullable = false)
    private LocalDate date;

    @Column (name = "meal_type" , nullable = false)
    private MealType mealType;
}
