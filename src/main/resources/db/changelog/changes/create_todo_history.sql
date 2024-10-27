--liquibase formatted sql
--changeset java:create-task_history-table
CREATE TABLE task_history
(
    id           bigint auto_increment primary key
);
--rollback DROP TABLE task_history;