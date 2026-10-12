package com.example.OfficeCafeteriaMenu.schema;

import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@Entity 
@AllArgsConstructor 
@NoArgsConstructor 
@Table (name = "menu_menuitem")
@SQLDelete (sql = "Update menu_menuitem set deleted_at = CURRENT_TIMESTAMP where id = ?")
@SQLRestriction ("deleted_at is null")
public class Menu_MenuItem extends BaseSchemaEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn  (name = "menu_id")
    private Menu menu;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn  (name = "menuitem_id")
    private MenuItem menuItem;

}
