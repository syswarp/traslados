-- begin TRASLADOS_EMPRESAS
create unique index IDX_TRASLADOS_EMPRESAS_UK_RAZONSOCIAL on TRASLADOS_EMPRESAS (RAZONSOCIAL) where DELETE_TS is null ^
-- end TRASLADOS_EMPRESAS
-- begin TRASLADOS_LANCHAS
create unique index IDX_TRASLADOS_LANCHAS_UK_NAME on TRASLADOS_LANCHAS (NAME) where DELETE_TS is null ^
-- end TRASLADOS_LANCHAS
-- begin TRASLADOS_PRACTICOS
alter table TRASLADOS_PRACTICOS add constraint FK_TRASLADOS_PRACTICOS_ON_EMPRESA foreign key (EMPRESA_ID) references TRASLADOS_EMPRESAS(ID)^
create unique index IDX_TRASLADOS_PRACTICOS_UK_NAME on TRASLADOS_PRACTICOS (NAME) where DELETE_TS is null ^
create index IDX_TRASLADOS_PRACTICOS_ON_EMPRESA on TRASLADOS_PRACTICOS (EMPRESA_ID)^
-- end TRASLADOS_PRACTICOS
-- begin TRASLADOS_TRIPULACION
create unique index IDX_TRASLADOS_TRIPULACION_UK_NAME on TRASLADOS_TRIPULACION (NAME) where DELETE_TS is null ^
-- end TRASLADOS_TRIPULACION
-- begin TRASLADOS_PUERTOS
create unique index IDX_TRASLADOS_PUERTOS_UK_NAME on TRASLADOS_PUERTOS (NAME) where DELETE_TS is null ^
-- end TRASLADOS_PUERTOS
-- begin TRASLADOS
alter table TRASLADOS add constraint FK_TRASLADOS_ON_LANCHA foreign key (LANCHA_ID) references TRASLADOS_LANCHAS(ID)^
alter table TRASLADOS add constraint FK_TRASLADOS_ON_PUERTO foreign key (PUERTO) references TRASLADOS_PUERTOS(ID)^
alter table TRASLADOS add constraint FK_TRASLADOS_ON_PRACTICO foreign key (PRACTICO_ID) references TRASLADOS_PRACTICOS(ID)^
create index IDX_TRASLADOS_ON_LANCHA on TRASLADOS (LANCHA_ID)^
create index IDX_TRASLADOS_ON_PUERTO on TRASLADOS (PUERTO)^
create index IDX_TRASLADOS_ON_PRACTICO on TRASLADOS (PRACTICO_ID)^
-- end TRASLADOS
