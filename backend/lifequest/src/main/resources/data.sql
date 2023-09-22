INSERT INTO categories (idcategories, description, name)
VALUES
    (1, 'Bienestar fisico y mental para una vida plena.', 'Salud'),
    (2, 'Aprendizaje y desarrollo intelectual a lo largo de la vida.', 'Educacion'),
    (3, 'Avance y exito en la trayectoria laboral.', 'Carrera Profesional'),
    (4, 'Relaciones y apoyo en el ambito familiar.', 'Familia'),
    (5, 'Manejo responsable y crecimiento economico personal.', 'Finanzas'),
    (6, 'Eleccion y disfrute de un modo de vida equilibrado.', 'Estilo de Vida');

    -- Inserting both roles
INSERT INTO roles (idrole, role) VALUES (1, 'ROLE_ADMIN'),(2, 'ROLE_USER');


-- Inserting users
INSERT INTO users (iduser, email, password) 
VALUES ( 1, 'admin@lifequest.com', '$2a$12$yIi.e/Dv/aJC6D7KNjVz/O3JAenUSF2n0I/c52Tb3xq6SF1HsRcLW'),
(2,'user1@lifequest.com', '$2a$12$Gb4yKjA1sAhh8TAWE2beTudwFrdYcX9osoYZzVyypiBnfiQDLGhV.'),(3,'user2@lifequest.com','$2a$12$WYGHiNAszcko0FBf3cSj.epOR9W7acTgKNtfKyvyKYgBabGupkcNG');

-- Inserting relation into role_users
INSERT INTO roles_users (user_id, roles_id) VALUES (1,1),(2,2),(3,2);
-- Insertar objetivos de prueba
INSERT INTO objetives (idobjetive, fk_user, fk_category, title, description, limit_date)
VALUES (1, 2, 1, 'Objetivo de prueba 1', 'Descripcion del objetivo 1', '2023-09-30');

INSERT INTO objetives (idobjetive, fk_user, fk_category, title, description, limit_date)
VALUES (2, 3, 2, 'Objetivo de prueba 2', 'Descripcion del objetivo 2', '2023-10-15');

-- Insertar un comentario de prueba
INSERT INTO comments (idcomment, fk_user, fk_objetive, content, date)
VALUES (1, 2, 1, 'Este es un comentario de prueba.', CURRENT_TIMESTAMP);

-- Otros comentarios ficticios
INSERT INTO comments (idcomment, fk_user, fk_objetive, content, date)
VALUES (2, 3, 2, 'Otro comentario ficticio.', '2023-09-13 12:00:00'),
(3, 2, 2, 'Otro comentario ficticio nº 2.', '2023-09-13 12:00:00');

-- Insertar registros de objetivos de prueba
INSERT INTO registers (idregister, fk_objetive, register_date, description)
VALUES (1, 1, '2023-09-15 10:00:00', 'Descripcion del registro 1');

INSERT INTO registers (idregister, fk_objetive, register_date, description)
VALUES (2, 2, '2023-09-20 14:30:00', 'Descripcion del registro 2'),
(3, 1, '2023-09-20 14:30:00', 'Descripcion del registro 3');

