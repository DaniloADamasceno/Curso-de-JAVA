# Título do Projeto

![GitHub repo size](https://img.shields.io/github/repo-size/DaniloADamasceno/Curso-de-JAVA?style=for-the-badge)
![GitHub language count](https://img.shields.io/github/languages/count/DaniloADamasceno/Curso-de-JAVA?style=for-the-badge)

[![wakatime](https://wakatime.com/badge/user/e7f2e494-878d-4290-9a2b-cc473da48b8a/project/e88985b4-8245-413f-9f38-e22a5fec5ee6.svg)](https://wakatime.com/badge/user/e7f2e494-878d-4290-9a2b-cc473da48b8a/project/e88985b4-8245-413f-9f38-e22a5fec5ee6)

<p> O JDBC (Java Database Connectivity) é uma API (Application Programming Interface) padrão em Java para acessar bancos de dados relacionais. Com o JDBC, você pode se conectar a um banco de dados, enviar consultas (queries) e atualizar registros (registries) usando a linguagem de programação Java.</p>
<p> Para acessar um banco de dados usando JDBC, você precisa seguir os seguintes passos:</p>
<br>
<p>-      Importar as classes necessárias do pacote java.sql, que é o pacote padrão para acesso a banco de dados em Java.</p>

```java
import java.sql.*;
```

<br>
 
<p>-      Registrar o driver JDBC a ser utilizado. O driver JDBC é um arquivo JAR que contém as classes necessárias para se conectar a um banco de dados específico. Você pode registrar o driver usando o método Class.forName(). Por exemplo, para registrar o driver do MySQL:</p>

```java
Class.forName("com.mysql.cj.jdbc.Driver");
```

<br>

<p>-      Estabelecer a conexão com o banco de dados usando a classe Connection. Você precisa fornecer o URL do banco de dados, nome de usuário e senha.</p>

```java

String url = "jdbc:mysql://localhost:3306/nome_do_banco_de_dados";
String username = "seu_usuario";
String password = "sua_senha";
Connection conn = DriverManager.getConnection(url, username, password);
```

<br>
<p>-      Criar uma declaração (statement) SQL usando a classe Statement ou PreparedStatement. Por exemplo, para selecionar todos os registros de uma tabela:</p>

```java

Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM nome_da_tabela");
```

<br>

<p>-      Processar os resultados usando a classe ResultSet. Por exemplo, para imprimir o conteúdo do resultado: </p>

```java
while (rs.next()) {
    System.out.println(rs.getString("nome_da_coluna"));
}
```

<br>

<p>-      Fechar a conexão, declaração e resultado usando os métodos close().</p>

```java
rs.close();
stmt.close();
conn.close();
```

<br>

<p>-      Lembre-se de tratar exceções adequadamente em todas as etapas do processo de acesso ao banco de dados. O JDBC pode ser usado com vários bancos de dados relacionais, como MySQL, Oracle, PostgreSQL, entre outros.</p>

## Stack utilizada

**Front-end:**

**Back-end:** Java

## Autores

- [@DaniloADamasceno](https://github.com/DaniloADamasceno/)
