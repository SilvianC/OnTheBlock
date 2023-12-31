package com.ontheblock.www.session.dto;

import lombok.Data;

@Data
public class SessionRequest {
    Long memberId;
    Long instrumentId;
    Integer volume;
    Integer totalFrame;
    Integer startPoint;
    String sessionPosition;
}
