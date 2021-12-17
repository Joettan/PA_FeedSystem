package org.jinyutan.feedsystem.coreplatform.followmanage;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName org.jinyutan.feedsystem.coreplatform.followmanage.followDTO
 * @Description
 * @Version 0.01
 * @Author Joe
 * Created by user on 2021-12-18 00:40:53
 **/
@Data
@Builder
public class followDTO {

    private int authorId;

    private int followerId;

}
