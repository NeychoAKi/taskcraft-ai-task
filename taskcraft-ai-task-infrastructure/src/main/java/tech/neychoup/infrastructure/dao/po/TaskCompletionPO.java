package tech.neychoup.infrastructure.dao.po;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Neycho
 * @version 1.0
 * @date 2024-11-24
 * @description 任务完成情况PO
 */
@Data
@Builder
public class TaskCompletionPO {
    /**
     * 任务完成记录ID
     */
    private Long id;

    /**
     * 任务ID
     */
    private Long taskId;

    /**
     * 用户ID
     */
    private String walletAddress;

    /**
     * 用户提交的文字内容
     */
    private String textContent;

    /**
     * 用户提交的图片URL
     */
    private String imageUrl;

    /**
     * 任务提交反馈
     */
    private String feedback;

    /**
     * 任务完成分数
     */
    private Integer score;

    /**
     * 是否完成
     */
    private Boolean completed;

    /**
     * 是否失败
     */
    private Boolean failed;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
