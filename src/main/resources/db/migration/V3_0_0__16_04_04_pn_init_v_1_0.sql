/**
 * Script de correction du schema importer de la prod pour le passage a flyway : contenait une colonne supplémentaire qui bloque les ajouts de membres
 */

ALTER TABLE team_member DROP COLUMN is_postulant;