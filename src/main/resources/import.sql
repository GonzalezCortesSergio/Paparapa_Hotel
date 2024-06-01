insert into usuario(id, nombre, apellidos, email, username, password, admin, premium) values (1, 'admin', 'admin', 'admin@gmail.com', 'admin', '{noop}admin', true, true);
insert into usuario(id, nombre, apellidos, email, username, password, admin, premium) values (2, 'user', 'user', 'user@gmail.com', 'user', '{noop}1234', false, true);

ALTER SEQUENCE usuario_seq RESTART WITH 52;

insert into tipo_habitacion(id, nombre, precio_por_noche) values (1, 'Suite', 245.65);
insert into tipo_habitacion(id, nombre, precio_por_noche) values (2, 'Junior Suite', 122.82);
insert into tipo_habitacion(id, nombre, precio_por_noche) values (3, 'Individual', 42.35);
insert into tipo_habitacion(id, nombre, precio_por_noche) values (4, 'Doble', 84.24);
insert into tipo_habitacion(id, nombre, precio_por_noche) values (5, 'Cuádruple', 230.21);
insert into tipo_habitacion(id, nombre, precio_por_noche) values (6, 'Familiar', 322.23);

ALTER SEQUENCE tipo_habitacion_seq RESTART WITH 56;

insert into habitacion(num_habitacion, tipo_id, descripcion, planta, num_camas) values (1, 4, 'Habitación doble, para todos aquellos que quieran disfrutar de una buena estancia con un amigo, un familiar, o su pareja', 1, 2);
insert into habitacion(num_habitacion, tipo_id, descripcion, planta, num_camas) values (2, 1, 'Habitación suite, para que usted pueda disfrutar de una estancia de lujo con alguien', 1, 2);
insert into habitacion(num_habitacion, tipo_id, descripcion, planta, num_camas) values (3, 6, 'Habitación familiar, para que venga con su familia y se tome un descanso entre todos, disfrutando de los placeres del hotel', 1, 5);

ALTER SEQUENCE habitacion_seq RESTART WITH 53;