package org.jinyutan.feedsystem.coreplatform.feedManage;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName org.jinyutan.feedsystem.coreplatform.feedManage.feedDTO
 * @Description
 * @Version 0.01
 * @Author Joe
 * Created by user on 2021-12-18 00:42:26
 **/
@Data
@Builder
public class feedDTO {
    private int feedId;

    private String feedName;

    private String feedUrl;
}
