package com.hana.api.group.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.hana.api.challenge.entity.wakeupChallenge;
import com.hana.api.groupMember.entity.GroupMember;
import com.hana.api.user.entity.User;
import com.hana.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "group")
@Table(name = "group_table")
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@ToString
@Getter
public class Group extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id")
    private long id;

    @Column(nullable = false)
    private String groupName;

    @Column(nullable = false)
    private int groupNumber;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String creatorName;

    @Column(nullable = false)
    private Boolean isPublic;

    @Column(nullable = false)
    private String wakeupTime;

    @OneToMany(mappedBy = "group", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<GroupMember> groupMembers;

    @OneToMany(mappedBy = "group", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<wakeupChallenge> wakeupChallenges;

    @ManyToOne
    @JoinColumn(name = "user_code")
    private User user;
}
