package com.joslabs.jospipa.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.joslabs.jospipa.model.ProductModelJava

@Dao
interface ServicesDao {
   @Insert(onConflict = OnConflictStrategy.REPLACE)
   fun insertProduct(productModelJava: List<ProductModelJava>)

    @Query("Select * FROM productmodeljava")
    fun allProducts():LiveData<ProductModelJava>

}