package com.hana.api.worldcup.entity;

import com.hana.api.challenge.entity.wakeupChallenge;
import com.hana.api.groupMember.entity.GroupMember;
import com.hana.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "worldcup")
@Table(name = "worldcup")
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@ToString
@Getter
public class Worldcup extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "worldcup_id")
    private long id;

    @Column(nullable = false)
    private String worldTitle;

    @Column(nullable = false)
    private String worldCategory;

    @Column(nullable = false)
    private String worldImg;

    @Column(nullable = false)
    private String worldDescription;
}
