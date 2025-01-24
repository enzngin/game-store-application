package com.alibou.store.gameRequest;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GameRequestEntity {

    private String title;
    @Enumerated(EnumType.STRING)
    private RequestStatus status;
}
