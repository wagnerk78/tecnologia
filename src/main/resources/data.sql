INSERT INTO Listas (id, nome) VALUES ('550e8400-e29b-41d4-a716-446655440000', 'Lista de Compras');
INSERT INTO Listas (id, nome) VALUES ('550e8400-e29b-41d4-a716-446655440001', 'Lista de Tarefas Diárias');

INSERT INTO Itens (id, descricao, estado, prioridade, lista_id) VALUES ('550e8400-e29b-41d4-a716-446655440002', 'Comprar leite', 'Pendente', 'Alta', '550e8400-e29b-41d4-a716-446655440000');
INSERT INTO Itens (id, descricao, estado, prioridade, lista_id) VALUES ('550e8400-e29b-41d4-a716-446655440003', 'Comprar pão', 'Concluída', 'Média', '550e8400-e29b-41d4-a716-446655440000');
INSERT INTO Itens (id, descricao, estado, prioridade, lista_id) VALUES ('550e8400-e29b-41d4-a716-446655440004', 'Estudar Spring Boot', 'Pendente', 'Alta', '550e8400-e29b-41d4-a716-446655440001');
INSERT INTO Itens (id, descricao, estado, prioridade, lista_id) VALUES ('550e8400-e29b-41d4-a716-446655440005', 'Ir à academia', 'Pendente', 'Baixa', '550e8400-e29b-41d4-a716-446655440001');
