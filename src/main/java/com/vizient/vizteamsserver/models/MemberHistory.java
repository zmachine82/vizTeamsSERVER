package com.vizient.vizteamsserver.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vizient.vizteamsserver.helpers.OffsetDateTimeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class MemberHistory {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private Long memberId;

    private Long teamId;

    private OffsetDateTime startedOnTeam;

    private OffsetDateTime leftTeam;

}
