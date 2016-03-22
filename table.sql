

CREATE TABLE usuario
(
  idusuario integer NOT NULL, -- Es el id del usuario.
  scorreo character varying(32) NOT NULL, -- Es el correo asociado al usuario, este debe de ser unico en la tabla.
  snombreusuario character varying(32) NOT NULL, -- Es el nombre del usuario el cual debe de ser unico en la tabla.
  CONSTRAINT "USUARIO_pkey" PRIMARY KEY (idusuario),
  CONSTRAINT "USUARIO_scorreo_key" UNIQUE (scorreo),
  CONSTRAINT "USUARIO_snombreusuario_key" UNIQUE (snombreusuario)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE usuario
  OWNER TO esmeralda;
COMMENT ON TABLE usuario
  IS 'Representa a la tabla que contiene la informacion del usuario, en particular su correo y su nombre de usuario.';
COMMENT ON COLUMN usuario.idusuario IS 'Es el id del usuario.';
COMMENT ON COLUMN usuario.scorreo IS 'Es el correo asociado al usuario, este debe de ser unico en la tabla.';
COMMENT ON COLUMN usuario.snombreusuario IS 'Es el nombre del usuario el cual debe de ser unico en la tabla.';


CREATE TABLE contrasenha
(
  idusuario integer, -- Atributo que sirve como llave foranea a la tabla Usuarios, la cual liga un usuario a una contrasenha.
  scontrasenha character varying(32) NOT NULL, -- Es el valor actual de la contrasenha, en esta primera iteracion no se lleva un registro de las contrasenhas pasadas.
  idcontrasenha integer NOT NULL, -- Representa el id del registro.
  CONSTRAINT "pf_CONTRASENHA_IDCONTRASENHA" PRIMARY KEY (idcontrasenha),
  CONSTRAINT "Fk_CONTRASENHA_IDUSUARIO" FOREIGN KEY (idusuario)
      REFERENCES usuario (idusuario) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE contrasenha
  OWNER TO esmeralda;
COMMENT ON TABLE contrasenha
  IS 'Define la tabla que contiene la contrasenha de los usuarios.';
COMMENT ON COLUMN contrasenha.idusuario IS 'Atributo que sirve como llave foranea a la tabla Usuarios, la cual liga un usuario a una contrasenha.';
COMMENT ON COLUMN contrasenha.scontrasenha IS 'Es el valor actual de la contrasenha, en esta primera iteracion no se lleva un registro de las contrasenhas pasadas.';
COMMENT ON COLUMN contrasenha.idcontrasenha IS 'Representa el id del registro.';


