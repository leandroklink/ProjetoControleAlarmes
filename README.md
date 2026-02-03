# Sistema de Monitoramento de Sensores e Alarmes

Projeto em Java que simula um sistema de monitoramento industrial, baseado em
equipamentos e sensores reais de uma usina.

O sistema avalia leituras de sensores, calcula desvios e gerencia alarmes de
forma dinâmica, evitando duplicidade e mantendo sempre a severidade correta
de acordo com o valor atual do processo.

---

## Objetivo

- Simular sensores industriais (nível, temperatura, pressão)
- Associar sensores a equipamentos
- Avaliar leituras em tempo de execução
- Criar, atualizar ou remover alarmes automaticamente
- Evitar alarmes duplicados
- Atualizar severidade conforme o valor medido

---

## Estrutura do Projeto

### Equipamento
Representa um equipamento industrial monitorado.
Contém identificação, nome e setor.

### Sensor
Representa um sensor ligado a um equipamento.
Possui:
- Tipo
- Valor de referência
- Tolerância
- Estado (ATIVO ou INATIVO)
- Equipamento associado

### Gerenciador
Classe responsável por:
- Receber leituras dos sensores
- Calcular desvio
- Definir severidade
- Criar, remover ou atualizar alarmes
- Listar alarmes ativos

### Alarme
Representa um alarme gerado a partir de um sensor.
Contém:
- Equipamento
- Sensor
- Severidade
- Estado
- Valor medido

---

## Lógica de Alarmes

A cada chamada do método `VerificaSensor`:

1. O alarme anterior do sensor (se existir) é removido
2. O valor atual é reavaliado
3. Um novo alarme é criado com a severidade correta, se necessário
4. Se o valor estiver dentro do limite, nenhum alarme permanece ativo

Essa abordagem garante que:
- Não existam alarmes duplicados
- A severidade possa aumentar ou diminuir
- Alarmes sejam removidos automaticamente quando a condição normaliza

---

## Exemplo de Uso

A classe `Test01` simula leituras reais:

gerenciador.VerificaSensor(sensor5, 225);
gerenciador.VerificaSensor(sensor5, 380);
gerenciador.VerificaSensor(sensor5, 82);

O mesmo sensor pode gerar alarmes diferentes ao longo do tempo,
sempre refletindo o estado atual do processo.

---

## Listagem de Alarmes

Ao final da simulação, o método `ListarAlarmes` exibe apenas os alarmes ativos,
já ordenados por severidade.

---

## Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos
- Enum
- Collections (ArrayList, Comparator)

---

## Observações

Projeto com foco educacional, aplicando conceitos utilizados em sistemas
industriais de monitoramento, automação e supervisão.
