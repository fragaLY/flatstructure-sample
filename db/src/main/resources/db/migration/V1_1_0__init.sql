create SCHEMA IF NOT EXISTS domain;
SET search_path TO domain;

create TABLE domain
(
  id                    bigserial        NOT NULL,
  name                  VARCHAR          NOT NULL,
  created               TIMESTAMP        NOT NULL,
  updated               TIMESTAMP        NOT NULL

  CONSTRAINT "pk_domain.domain" PRIMARY KEY (id)
);
