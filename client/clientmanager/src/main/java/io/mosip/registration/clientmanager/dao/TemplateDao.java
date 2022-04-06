package io.mosip.registration.clientmanager.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import io.mosip.registration.clientmanager.entity.Template;

@Dao
public interface TemplateDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Template template);
}
