package ekstep.societal.sdk.persistence.dao;



import androidx.room.Dao;
import androidx.room.Insert;

import ekstep.societal.sdk.persistence.entity.RequestedStatusEntity;

/**
 * Created by Sujeet_Jaiswal on 4/13/2018.
 */

@Dao
public interface RequestedStatusDao {

    @Insert
    void insertAll(RequestedStatusEntity... requestedStatusEntities);
}
