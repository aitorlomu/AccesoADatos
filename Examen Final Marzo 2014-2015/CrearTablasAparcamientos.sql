--------------------------------------------------------
-- Archivo creado  - sÃ¡bado-marzo-07-2015   
--------------------------------------------------------
DROP TABLE "APCLIENTES" cascade constraints;
DROP TABLE "APENTRADASSALIDAS" cascade constraints;
DROP TABLE "APPLAZAS" cascade constraints;
DROP TABLE "APPLAZASVEHIC" cascade constraints;
DROP TABLE "APPROVINCIAS" cascade constraints;
DROP TABLE "APVEHICULOS" cascade constraints;
--------------------------------------------------------
--  DDL for Table APCLIENTES
--------------------------------------------------------

  CREATE TABLE "APCLIENTES" 
   (	"IDCLIENTE" NUMBER(8,0), 
	"DNI" VARCHAR2(9), 
	"APELLIDOS" VARCHAR2(80), 
	"NOMBRE" VARCHAR2(40), 
	"DIRECCION" VARCHAR2(80), 
	"POBLACION" VARCHAR2(40), 
	"IDPROVINCIA" NUMBER(8,0), 
	"MOVIL" NUMBER(9,0), 
	"EMAIL" VARCHAR2(100), 
	"ELIMINADO" NUMBER(1,0)
   );
--------------------------------------------------------
--  DDL for Table APENTRADASSALIDAS
--------------------------------------------------------

  CREATE TABLE "APENTRADASSALIDAS" 
   (	"IDENTSAL" NUMBER(8,0), 
	"IDVEHICULO" NUMBER(8,0), 
	"FECHA" NUMBER(8,0), 
	"HORA" NUMBER(2,0), 
	"MINUTO" NUMBER(2,0), 
	"TIPO" VARCHAR2(1), 
	"ELIMINADO" NUMBER(1,0)
   );
--------------------------------------------------------
--  DDL for Table APPLAZAS
--------------------------------------------------------

  CREATE TABLE "APPLAZAS" 
   (	"IDPLAZA" NUMBER(8,0), 
	"PLANTA" NUMBER(2,0), 
	"NUMERO" NUMBER(3,0), 
	"METROS" NUMBER(3,0), 
	"PRECIOMES" NUMBER(4,0), 
	"DISPONIBLE" VARCHAR2(1), 
	"ELIMINADO" NUMBER(1,0)
   );
--------------------------------------------------------
--  DDL for Table APPLAZASVEHIC
--------------------------------------------------------

  CREATE TABLE "APPLAZASVEHIC" 
   (	"IDPLAZAVEHIC" NUMBER(8,0), 
	"IDVEHICULO" NUMBER(8,0), 
	"IDPLAZA" NUMBER(8,0), 
	"FECHAALQUILER" NUMBER(8,0), 
	"FECHABAJA" NUMBER(8,0), 
	"ELIMINADO" NUMBER(1,0)
   );
--------------------------------------------------------
--  DDL for Table APPROVINCIAS
--------------------------------------------------------

  CREATE TABLE "APPROVINCIAS" 
   (	"IDPROVINCIA" NUMBER(8,0), 
	"PROVINCIA" VARCHAR2(30)
   );
--------------------------------------------------------
--  DDL for Table APVEHICULOS
--------------------------------------------------------

  CREATE TABLE "APVEHICULOS" 
   (	"IDVEHICULO" NUMBER(8,0), 
	"MATRICULA" VARCHAR2(7), 
	"MARCA" VARCHAR2(50), 
	"MODELO" VARCHAR2(50), 
	"ANIO" NUMBER(4,0), 
	"COLOR" VARCHAR2(30), 
	"TIPOVEHICULO" VARCHAR2(1), 
	"IDCLIENTE" NUMBER(8,0), 
	"ELIMINADO" NUMBER(1,0)
   );
   
REM INSERTING into APCLIENTES
SET DEFINE OFF;
Insert into APCLIENTES (IDCLIENTE,DNI,APELLIDOS,NOMBRE,DIRECCION,POBLACION,IDPROVINCIA,MOVIL,EMAIL,ELIMINADO) values ('1','1A','APELLIDO 1','NOMBRE 1','DIR,1','POBLA1','21',null,null,'0');
Insert into APCLIENTES (IDCLIENTE,DNI,APELLIDOS,NOMBRE,DIRECCION,POBLACION,IDPROVINCIA,MOVIL,EMAIL,ELIMINADO) values ('2','2A','APELLIDO 2','NOMBRE 2','DIR,1','POBLA2','13',null,'AAA@AA.AA','1');
Insert into APCLIENTES (IDCLIENTE,DNI,APELLIDOS,NOMBRE,DIRECCION,POBLACION,IDPROVINCIA,MOVIL,EMAIL,ELIMINADO) values ('3','2B','APELLIDO 3','NOMBRE 3','DIR,3','POBLA1','21','600600600',null,'0');
REM INSERTING into APENTRADASSALIDAS
SET DEFINE OFF;
REM INSERTING into APPLAZAS
SET DEFINE OFF;
Insert into APPLAZAS (IDPLAZA,PLANTA,NUMERO,METROS,PRECIOMES,DISPONIBLE,ELIMINADO) values ('1','1','1','11','11','S','0');
Insert into APPLAZAS (IDPLAZA,PLANTA,NUMERO,METROS,PRECIOMES,DISPONIBLE,ELIMINADO) values ('2','1','2','12','12','S','0');
Insert into APPLAZAS (IDPLAZA,PLANTA,NUMERO,METROS,PRECIOMES,DISPONIBLE,ELIMINADO) values ('3','2','1','21','21','N','0');
Insert into APPLAZAS (IDPLAZA,PLANTA,NUMERO,METROS,PRECIOMES,DISPONIBLE,ELIMINADO) values ('4','2','2','22','22','S','0');
Insert into APPLAZAS (IDPLAZA,PLANTA,NUMERO,METROS,PRECIOMES,DISPONIBLE,ELIMINADO) values ('5','2','3','23','23','N','1');
Insert into APPLAZAS (IDPLAZA,PLANTA,NUMERO,METROS,PRECIOMES,DISPONIBLE,ELIMINADO) values ('6','2','4','24','24','S','1');
REM INSERTING into APPLAZASVEHIC
SET DEFINE OFF;
REM INSERTING into APPROVINCIAS
SET DEFINE OFF;
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('13','CIUDAD REAL');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('2','ALBACETE');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('3','ALICANTE/ALACANT');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('4','ALMERÍA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('1','ARABA/Ã�LAVA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('33','ASTURIAS');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('5','ÁVILA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('6','BADAJOZ');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('7','BALEARS, ILLES');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('8','BARCELONA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('48','BIZKAIA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('9','BURGOS');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('10','CÁCERES');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('11','CÁDIZ');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('39','CANTABRIA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('12','CASTELLÓNN/CASTELLÓ');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('51','CEUTA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('14','CÓRDOBA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('15','CORUÑA, A');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('16','CUENCA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('20','GIPUZKOA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('17','GIRONA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('18','GRANADA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('19','GUADALAJARA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('21','HUELVA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('22','HUESCA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('23','JAÉN');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('24','LEÓN');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('27','LUGO');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('25','LLEIDA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('28','MADRID');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('29','MÁLAGA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('52','MELILLA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('30','MURCIA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('31','NAVARRA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('32','OURENSE');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('34','PALENCIA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('35','PALMAS, LAS');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('36','PONTEVEDRA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('26','RIOJA, LA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('37','SALAMANCA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('38','SANTA CRUZ DE TENERIFE');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('40','SEGOVIA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('41','SEVILLA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('42','SORIA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('43','TARRAGONA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('44','TERUEL');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('45','TOLEDO');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('46','VALENCIA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('47','VALLADOLID');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('49','ZAMORA');
Insert into APPROVINCIAS (IDPROVINCIA,PROVINCIA) values ('50','ZARAGOZA');
REM INSERTING into APVEHICULOS
SET DEFINE OFF;
Insert into APVEHICULOS (IDVEHICULO,MATRICULA,MARCA,MODELO,ANIO,COLOR,TIPOVEHICULO,IDCLIENTE,ELIMINADO) values ('1','M1','MARCA 1','MODELO 1','2010','NNEGRO','P','1','0');
Insert into APVEHICULOS (IDVEHICULO,MATRICULA,MARCA,MODELO,ANIO,COLOR,TIPOVEHICULO,IDCLIENTE,ELIMINADO) values ('2','M2','MARCA 2','MODELO 2','2013','BLANCO','M','1','0');
Insert into APVEHICULOS (IDVEHICULO,MATRICULA,MARCA,MODELO,ANIO,COLOR,TIPOVEHICULO,IDCLIENTE,ELIMINADO) values ('3','M3','MARCA 1','MODELO 3','2014','ROJO','F','2','0');
Insert into APVEHICULOS (IDVEHICULO,MATRICULA,MARCA,MODELO,ANIO,COLOR,TIPOVEHICULO,IDCLIENTE,ELIMINADO) values ('4','M4','MARCA 3','MODELO 4','2009','AMARILLO','G','3','1');

  ALTER TABLE "APCLIENTES" ADD CONSTRAINT "ACLIENTES_PK" PRIMARY KEY ("IDCLIENTE") ENABLE;
 
  ALTER TABLE "APCLIENTES" ADD CONSTRAINT "ACLIENTES_UK1" UNIQUE ("DNI") ENABLE;
 
  ALTER TABLE "APCLIENTES" MODIFY ("IDCLIENTE" NOT NULL ENABLE);
 
  ALTER TABLE "APCLIENTES" MODIFY ("DNI" NOT NULL ENABLE);
 
  ALTER TABLE "APCLIENTES" MODIFY ("APELLIDOS" NOT NULL ENABLE);
 
  ALTER TABLE "APCLIENTES" MODIFY ("NOMBRE" NOT NULL ENABLE);
 
  ALTER TABLE "APCLIENTES" MODIFY ("ELIMINADO" NOT NULL ENABLE);

  ALTER TABLE "APENTRADASSALIDAS" ADD CONSTRAINT "APENTRADASSALIDAS_PK" PRIMARY KEY ("IDENTSAL") ENABLE;
 
  ALTER TABLE "APENTRADASSALIDAS" ADD CONSTRAINT "APENTRADASSALIDAS_UK1" UNIQUE ("IDVEHICULO", "FECHA", "HORA", "MINUTO", "TIPO") ENABLE;
 
  ALTER TABLE "APENTRADASSALIDAS" MODIFY ("IDENTSAL" NOT NULL ENABLE);
 
  ALTER TABLE "APENTRADASSALIDAS" MODIFY ("IDVEHICULO" NOT NULL ENABLE);
 
  ALTER TABLE "APENTRADASSALIDAS" MODIFY ("FECHA" NOT NULL ENABLE);
 
  ALTER TABLE "APENTRADASSALIDAS" MODIFY ("HORA" NOT NULL ENABLE);
 
  ALTER TABLE "APENTRADASSALIDAS" MODIFY ("MINUTO" NOT NULL ENABLE);
 
  ALTER TABLE "APENTRADASSALIDAS" MODIFY ("TIPO" NOT NULL ENABLE);
 
  ALTER TABLE "APENTRADASSALIDAS" MODIFY ("ELIMINADO" NOT NULL ENABLE);

  ALTER TABLE "APPLAZAS" ADD CONSTRAINT "APLAZAS_PK" PRIMARY KEY ("IDPLAZA") ENABLE;
 
  ALTER TABLE "APPLAZAS" ADD CONSTRAINT "APLAZAS_UK1" UNIQUE ("PLANTA", "NUMERO") ENABLE;
 
  ALTER TABLE "APPLAZAS" MODIFY ("IDPLAZA" NOT NULL ENABLE);
 
  ALTER TABLE "APPLAZAS" MODIFY ("PLANTA" NOT NULL ENABLE);
 
  ALTER TABLE "APPLAZAS" MODIFY ("NUMERO" NOT NULL ENABLE);
 
  ALTER TABLE "APPLAZAS" MODIFY ("PRECIOMES" NOT NULL ENABLE);
 
  ALTER TABLE "APPLAZAS" MODIFY ("DISPONIBLE" NOT NULL ENABLE);
 
  ALTER TABLE "APPLAZAS" MODIFY ("ELIMINADO" NOT NULL ENABLE);

  ALTER TABLE "APPLAZASVEHIC" ADD CONSTRAINT "APPLAZASVEHIC_PK" PRIMARY KEY ("IDPLAZAVEHIC") ENABLE;
 
  ALTER TABLE "APPLAZASVEHIC" ADD CONSTRAINT "APPLAZASVEHIC_UK1" UNIQUE ("IDVEHICULO", "IDPLAZA", "FECHAALQUILER") ENABLE;
 
  ALTER TABLE "APPLAZASVEHIC" MODIFY ("IDPLAZAVEHIC" NOT NULL ENABLE);
 
  ALTER TABLE "APPLAZASVEHIC" MODIFY ("IDVEHICULO" NOT NULL ENABLE);
 
  ALTER TABLE "APPLAZASVEHIC" MODIFY ("IDPLAZA" NOT NULL ENABLE);
 
  ALTER TABLE "APPLAZASVEHIC" MODIFY ("FECHAALQUILER" NOT NULL ENABLE);
 
  ALTER TABLE "APPLAZASVEHIC" MODIFY ("ELIMINADO" NOT NULL ENABLE);

  ALTER TABLE "APPROVINCIAS" ADD CONSTRAINT "APROVINCIAS_PK" PRIMARY KEY ("IDPROVINCIA") ENABLE;
 
  ALTER TABLE "APPROVINCIAS" MODIFY ("IDPROVINCIA" NOT NULL ENABLE);

  ALTER TABLE "APVEHICULOS" ADD CONSTRAINT "APVEHICULOS_UK1" UNIQUE ("MATRICULA") ENABLE;
 
  ALTER TABLE "APVEHICULOS" ADD CONSTRAINT "APVEHICULOS_PK" PRIMARY KEY ("IDVEHICULO") ENABLE;
 
  ALTER TABLE "APVEHICULOS" MODIFY ("IDVEHICULO" NOT NULL ENABLE);
 
  ALTER TABLE "APVEHICULOS" MODIFY ("MATRICULA" NOT NULL ENABLE);
 
  ALTER TABLE "APVEHICULOS" MODIFY ("MARCA" NOT NULL ENABLE);
 
  ALTER TABLE "APVEHICULOS" MODIFY ("MODELO" NOT NULL ENABLE);
 
  ALTER TABLE "APVEHICULOS" MODIFY ("IDCLIENTE" NOT NULL ENABLE);
 
  ALTER TABLE "APVEHICULOS" MODIFY ("ELIMINADO" NOT NULL ENABLE);

  ALTER TABLE "APCLIENTES" ADD CONSTRAINT "ACLIENTES_FK1" FOREIGN KEY ("IDPROVINCIA")
	  REFERENCES "APPROVINCIAS" ("IDPROVINCIA") ENABLE;

  ALTER TABLE "APENTRADASSALIDAS" ADD CONSTRAINT "APENTRADASSALIDAS_FK1" FOREIGN KEY ("IDVEHICULO")
	  REFERENCES "APVEHICULOS" ("IDVEHICULO") ENABLE;

  ALTER TABLE "APPLAZASVEHIC" ADD CONSTRAINT "APPLAZASVEHIC_FK1" FOREIGN KEY ("IDVEHICULO")
	  REFERENCES "APVEHICULOS" ("IDVEHICULO") ENABLE;
 
  ALTER TABLE "APPLAZASVEHIC" ADD CONSTRAINT "APPLAZASVEHIC_FK2" FOREIGN KEY ("IDPLAZA")
	  REFERENCES "APPLAZAS" ("IDPLAZA") ENABLE;

  ALTER TABLE "APVEHICULOS" ADD CONSTRAINT "APVEHICULOS_FK1" FOREIGN KEY ("IDCLIENTE")
	  REFERENCES "APCLIENTES" ("IDCLIENTE") ENABLE;