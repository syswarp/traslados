-- begin TRASLADOS_EMPRESAS
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
)^
-- end TRASLADOS_EMPRESAS
-- begin TRASLADOS_LANCHAS
create table TRASLADOS_LANCHAS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(50) not null,
    --
    primary key (ID)
)^
-- end TRASLADOS_LANCHAS
-- begin TRASLADOS_PRACTICOS
create table TRASLADOS_PRACTICOS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    EMPRESA_ID uuid not null,
    NAME varchar(255),
    EMAIL varchar(255),
    CELULAR varchar(255),
    --
    primary key (ID)
)^
-- end TRASLADOS_PRACTICOS
-- begin TRASLADOS_TRIPULACION
create table TRASLADOS_TRIPULACION (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(100),
    CARGO varchar(50),
    --
    primary key (ID)
)^
-- end TRASLADOS_TRIPULACION
-- begin TRASLADOS_PUERTOS
create table TRASLADOS_PUERTOS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(100) not null,
    --
    primary key (ID)
)^
-- end TRASLADOS_PUERTOS
-- begin TRASLADOS
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
    LANCHA_ID uuid,
    PUERTO uuid not null,
    PRACTICO_ID uuid not null,
    BUQUE varchar(50),
    --
    primary key (ID)
)^
-- end TRASLADOS
