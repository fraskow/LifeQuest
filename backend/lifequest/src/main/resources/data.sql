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
VALUES ( 1, 'admin@lifequest.com', 'passwordAdmin'),
(2,'user1@lifequest.com', 'password1'),(3,'user2@lifequest.com','password2');

-- Inserting relation into role_users
INSERT INTO roles_users (user_id, roles_id) VALUES (1,1),(2,2),(3,2);