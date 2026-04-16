## Functional Requirements
- FR001: O sistema deve permitir que o servidor público realize a solicitação de férias;
- FR002: O sistema deve permitir que o servidor público modifique o período de férias;
- FR003: O sistema deve permitir que o gestor aprove ou reprove as solicitações de férias;
- FR004: O sistema deve permitir que o gestor faça a interrupção do período de férias do servidor;
- FR005: O sistema deve permitir que o servidor público visualize os pagamentos recebidos;
- FR006: O sistema deve permitir que o gestor realize a manutenção do acesso dos servidores públicos ao sistema;
- FR007: O sistema deve permitir que o servidor consulte quantos dias de férias ele ainda possui de cada período aquisitivo (ex: 2024, 2025).
- FR008: O sistema deve notificar o servidor público sobre a aprovação ou reprovação da solicatação de férias;
- FR009: O sistema deve notificar o servidor público sobre a interrupção das férias;

## Non-functional Requirements
- NFR001 (Segurança): Todos os usuários do sistema devem está autenticados para poder utilizá-lo.
- NFR002 (Segurança/LGPD): O sistema deve estar em conformidade com a LGPD, garantindo que os dados pessoais e financeiros sejam acessíveis apenas pelo titular e administradores autorizados.
- NFR003 (Sincronização): O aplicativo deve funcionar em modo offline para consulta de solicitações já baixadas, mas exigir conexão para novos pedidos.
- NFR004 (Usabilidade): A interface deve seguir padrões de acessibilidade (importante para o Gov.br)

## Business Rules
- BR001: O servidor público deve tirar férias uma vez por ano ou cada 12 meses (Lei 8.112/90); 
- BR002: As férias podem ser divididas em até três períodos de no minímo 10 dias cada (Lei 8.112/90);
- BR003: O pagamento referente ao período de férias deve ser pago com até dois dias de antecedência ao seu início (Lei 8.112/90);
- BR004: Servidores que trabalham com substâncias radioativas tem direito a 20 dias consecutivos de férias a cada 6 meses de trabalho, não podendo haver acumulo (Lei 8.112/90);
- BR005: O servidor público deve tirar 30 dias/ano de férias, podendo acumular por até dois anos sem tirar férias caso os seus serviços sejam requeridos (Lei 8.112/90);
- BR006: É necessário 12 meses de trabalho para que o servidor possa tirar férias pela primeira vez (Lei 8.112/90);
- BR007: O servidor público recebe um adicional de 1/3 (um terço) do salário devido ao período de férias, havendo ou não a solicitação de férias (Lei 8.112/90);
- BR008: As férias do servidor público podem ser interrompidas (Lei 8.112/90);
- BR009: O 13º (décimo terceiro) salário (também chamado de gratificação natalina) será pago até o dia 20 do mês de dezembro de cada ano (Lei 8.112/90) (Lei 8.112/90);
- BR010: Ao solicitar as férias o servidor público também pode realizar o adiantamento do pagamento da gratificação natalina;
- BR011: O servidor público pode alterar os dados da solicitação de férias desde que ela não esteja homologada;
