---- Criando a tabela Listas
--CREATE TABLE Listas (
--    id BIGINT AUTO_INCREMENT PRIMARY KEY,
--    nome VARCHAR(255) NOT NULL
--);
--
---- Criando a tabela Itens
--CREATE TABLE Itens (
--    id BIGINT AUTO_INCREMENT PRIMARY KEY,
--    descricao VARCHAR(255) NOT NULL,
--    estado VARCHAR(50) NOT NULL,
--    prioridade VARCHAR(50) NOT NULL,
--    lista_id BIGINT,
--    CONSTRAINT fk_lista
--        FOREIGN KEY (lista_id) REFERENCES Listas(id)
--        ON DELETE CASCADE
--);
-- Criando a tabela Listas
CREATE TABLE Listas (
    id UUID PRIMARY KEY,
    nome VARCHAR(255) NOT NULL
);

-- Criando a tabela Itens
CREATE TABLE Itens (
    id UUID PRIMARY KEY,
    descricao VARCHAR(255) NOT NULL,
    estado VARCHAR(50) NOT NULL,
    prioridade VARCHAR(50) NOT NULL,
    lista_id UUID,
    CONSTRAINT fk_lista
        FOREIGN KEY (lista_id) REFERENCES Listas(id)
        ON DELETE CASCADE
);
