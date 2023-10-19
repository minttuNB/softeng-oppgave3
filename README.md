# softeng-oppgave3

1. Oppretta repo
2. La inn filene fra oppgave 2 og pusha til repoen
3. Gikk til fanen Actions i Github-repoen og valgte *Java with Maven* i "New Workflow" som template.
4. Fylte inn prosjekt-spesifikke detaljer som Java-versjonen.
5. Gikk til innstillinger for repoen, og trykka på *Read and write permissions* under Actions->General->Workflow permissions
6. Redigerte maven.yml for å legge til actions for testing
7. La til Maven Surefire Plugin til pom-fila for at test reporter kunne lese rapportene fra den og sende dem som rapport på Github Actions
8. Gikk til fanen Actions og starta jobben om igjen.
