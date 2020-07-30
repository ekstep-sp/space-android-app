package ekstep.societal.sdk.models;

import ekstep.societal.sdk.persistence.entity.ContentEntity;
import ekstep.societal.sdk.persistence.entity.DownloadStatusEntity;

import java.util.ArrayList;

public class ContentDownloadEntity {
    public ArrayList<ContentEntity> contentEntities;
    public ArrayList<DownloadStatusEntity> downloadStatusEntities;

    public ContentDownloadEntity() {
        this.contentEntities = new ArrayList<>();
        this.downloadStatusEntities = new ArrayList<>();
    }
}
