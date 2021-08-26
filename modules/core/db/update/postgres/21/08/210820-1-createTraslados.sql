create table TRASLADOS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FECHA timestamp not null,
    LANCHA_ID name,
    PUERTO uuid not null,
    PRACTICO_ID uuid not null,
    BUQUE varchar(50),
    --
    primary key (ID)
);