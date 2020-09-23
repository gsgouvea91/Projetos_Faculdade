# Projeto Agenda

## Motivação
Este projeto destina-se a ser uma base de ensino de desenvolvimento WEB utilizando Laravel 6.

## Pacotes Instalados

* laravel/framework: "^6.0"
* arrilot/laravel-widgets: "^3.13"
* jenssegers/date: "^3.5"
* jeroennoten/laravel-adminlte: "^2.0"
* yajra/laravel-datatables-oracle: "^9.6"
* laravel/ui: "^1.0"
* creativeorange/gravatar: "^1.0"

## Configurações iniciais necessárias (executar somente uma vez)

* Criando o banco de dados via linha de comando

```bash
mysql -e "create database agendal6;" -u root -p
```

**(Alternativa)** Caso o comando acima não funcione, utilize o HeidiSQL do laragon

* Criando o scaffolding de login e register

```bash
php artisan adminlte:install --force
```
