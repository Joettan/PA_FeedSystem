package org.jinyutan.feedsystem.coreplatform.usermanage;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName org.jinyutan.feedsystem.coreplatform.usermanage.userDTO
 * @Description
 * @Version 0.01
 * @Author Joe
 * Created by user on 2021-12-18 00:38:58
 **/
@Data
@Builder
public class userDTO {

    private int userId;

    private String userName;

}
