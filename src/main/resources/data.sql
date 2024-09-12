---- Inserindo dados na tabela Listas
--INSERT INTO Listas (id, nome) VALUES ('101', 'Lista de Compras');
--INSERT INTO Listas (id, nome) VALUES ('102', 'Lista de Tarefas Diárias');
--
---- Inserindo dados na tabela Itens
--INSERT INTO Itens (id, descricao, estado, prioridade, lista_id) VALUES ('1', 'Comprar leite', 'Pendente', 'Alta', '101');
--INSERT INTO Itens (id, descricao, estado, prioridade, lista_id) VALUES ('2', 'Comprar pão', 'Concluída', 'Média', '101');
--INSERT INTO Itens (id, descricao, estado, prioridade, lista_id) VALUES ('3', 'Estudar Spring Boot', 'Pendente', 'Alta', '102');
--INSERT INTO Itens (id, descricao, estado, prioridade, lista_id) VALUES ('4', 'Ir à academia', 'Pendente', 'Baixa', '102');
-- Inserindo dados na tabela Listas
INSERT INTO Listas (id, nome) VALUES ('550e8400-e29b-41d4-a716-446655440000', 'Lista de Compras');
INSERT INTO Listas (id, nome) VALUES ('550e8400-e29b-41d4-a716-446655440001', 'Lista de Tarefas Diárias');

-- Inserindo dados na tabela Itens
INSERT INTO Itens (id, descricao, estado, prioridade, lista_id) VALUES ('550e8400-e29b-41d4-a716-446655440002', 'Comprar leite', 'Pendente', 'Alta', '550e8400-e29b-41d4-a716-446655440000');
INSERT INTO Itens (id, descricao, estado, prioridade, lista_id) VALUES ('550e8400-e29b-41d4-a716-446655440003', 'Comprar pão', 'Concluída', 'Média', '550e8400-e29b-41d4-a716-446655440000');
INSERT INTO Itens (id, descricao, estado, prioridade, lista_id) VALUES ('550e8400-e29b-41d4-a716-446655440004', 'Estudar Spring Boot', 'Pendente', 'Alta', '550e8400-e29b-41d4-a716-446655440001');
INSERT INTO Itens (id, descricao, estado, prioridade, lista_id) VALUES ('550e8400-e29b-41d4-a716-446655440005', 'Ir à academia', 'Pendente', 'Baixa', '550e8400-e29b-41d4-a716-446655440001');
