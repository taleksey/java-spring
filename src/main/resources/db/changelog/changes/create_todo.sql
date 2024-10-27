--liquibase formatted sql
--changeset java:create-task-table
CREATE TABLE task
(
    id           bigint auto_increment primary key
);
--rollback DROP TABLE task;