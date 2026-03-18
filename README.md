# Sistema de Monitoramento de Sensores

Projeto em Java que simula um sistema de monitoramento industrial baseado em equipamentos e sensores.  
O sistema realiza leitura de sensores, calcula desvios em relação aos limites definidos, gera alarmes e mantém um histórico de medições que pode ser exibido em gráfico.

O objetivo do projeto é praticar conceitos de **Programação Orientada a Objetos**, **processamento de séries temporais** e **simulação de sensores industriais**.

---

## Funcionalidades

- Cadastro de **equipamentos**
- Associação de **sensores** a equipamentos
- Simulação de leituras de sensores
- Verificação automática de **desvios de limite**
- Geração e gerenciamento de **alarmes**
- Registro de **histórico de medições**
- Cálculo de estatísticas simples:
  - média das medições
  - valor máximo
  - detecção de tendência de subida
- Geração de **gráfico do histórico de medições** utilizando JFreeChart

---

## Estrutura do Projeto


Domain
├ Equipamento.java
├ Sensor.java
├ Medicao.java
└ Enum
└ TipoEstado.java

Gerenciador
└ Gerenciador.java

Simulacao
├ Test01.java
└ GraficoSensor.java


### Equipamento
Representa um equipamento industrial monitorado.

Exemplo:
- Tanque
- Gerador
- Turbina
- Evaporador

---

### Sensor
Representa um sensor associado a um equipamento.

Cada sensor possui:

- tipo (nível, pressão, temperatura, etc.)
- limite mínimo
- limite máximo
- estado (ativo ou inativo)
- histórico de medições

O sensor também calcula o **desvio em relação aos limites**.

---

### Medicao
Representa uma leitura realizada pelo sensor.

Contém:

- valor medido
- data e hora da medição

Essas medições formam uma **série temporal** utilizada para análise e geração de gráficos.

---

### Gerenciador
Responsável por:

- receber leituras dos sensores
- registrar medições
- verificar desvios
- gerar e listar alarmes

---

### Simulação

A classe `Test01` executa uma simulação de sensores:

- gera valores aleatórios
- registra medições
- verifica alarmes
- mantém histórico
- exibe gráfico ao final da execução

Exemplo simplificado:


for (int i = 0; i < 20; i++) {

gerenciador.VerificaSensor(sensor1, 80 + Math.random()*20);
gerenciador.VerificaSensor(sensor2, 80 + Math.random()*40);

Thread.sleep(1000);

}


---

## Gráfico de Histórico

O projeto utiliza a biblioteca **JFreeChart** para gerar um gráfico de histórico das medições do sensor.

O gráfico utiliza:

- eixo X → tempo
- eixo Y → valor medido

Isso permite visualizar o comportamento do sensor ao longo da simulação.

---

## Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos
- Java Streams
- JFreeChart
- Coleções (`List`, `ArrayList`)

---

## Possíveis Evoluções do Projeto

- simulação de sensores em tempo real
- exportação de histórico para CSV
- integração com banco de dados
- integração com ferramentas de monitoramento (ex: Grafana)
- geração de dashboards
- detecção de falhas ou sensores travados

---

## Objetivo Educacional

Este projeto foi desenvolvido com foco em aprendizado, simulando conceitos utilizados em sistemas de:

- monitoramento industrial
- automação
- IoT
- análise de dados de sensores
