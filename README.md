# Desafio de Implementação: Sistema de Vendas em java 💵

**A empresa "TechMart" necessita de um sistema para gerenciar suas vendas em lojas físicas e online, envolvendo produtos eletrônicos, gadgets e acessórios.**

**ModoVenda Interface:**
Métodos: efetuarVenda(String produto, String cliente, int quantidade) e calcularDesconto().
**NotificacaoVenda Interface:**
Métodos: enviarConfirmacao(String produto, String cliente, int quantidade) e enviarRecibo().

**Classes Concretas:**
VendaLojaFisica: Implementa ModoVenda para vendas em lojas físicas.
VendaOnline: Implementa ModoVenda para vendas online.
NotificacaoEmail: Implementa NotificacaoVenda para notificar clientes por e-mail.

**Princípio de Inversão de Dependência:**
RegistroVenda: Classe responsável por registrar vendas, sem depender diretamente de implementações concretas de ModoVenda ou NotificacaoVenda.
Modifique a classe para aceitar instâncias de ModoVenda e NotificacaoVenda no construtor.

**Princípio de Responsabilidade Única:**
Na classe RegistroVenda, crie o método registrarVenda que recebe produto, cliente e quantidade como parâmetros.
Chame o método efetuarVenda do ModoVenda e, em seguida, o método enviarConfirmacao de NotificacaoVenda.
Isola responsabilidades usando instâncias de ModoVenda e NotificacaoVenda.

**No método main ou em algum ponto de inicialização do sistema:**
Crie instâncias de VendaLojaFisica ou VendaOnline para ModoVenda e NotificacaoEmail para NotificacaoVenda.
Use essas instâncias para criar uma instância de RegistroVenda.
Com a aplicação adequada dos princípios de projeto, a extensibilidade do sistema é facilitada.
