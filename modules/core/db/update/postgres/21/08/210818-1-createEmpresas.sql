create table TRASLADOS_EMPRESAS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    RAZONSOCIAL varchar(255) not null,
    DOMICILIO varchar(255) not null,
    CUIT bigint not null,
    TELEFONO varchar(50),
    EMAIL varchar(100),
    LOGO bytea,
    --
    primary key (ID)
);