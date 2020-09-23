@extends('adminlte::page')

@section('title', 'Agendal6')

@section('content_header')
<h1>Criação de um novo Contato</h1>
@stop

@section('content')
<form action="{{route('agenda.store') }}" method="POST">
    {{csrf_field()}}
    <div class="panel panel-default">
        <div class="panel-heading">
        <p>Preencha todos os campos obrigatórios.</p>
        </div>
        <div class="panel-body"> 
            <div class="form-group"> 
                <label for="nome">Nome do Contato</label>
                <input type="text" id="nome" name="nome" class="form-control" placeholder="Nome">
            </div>

            <div class="form-group"> 
                <label for="fone_res">Telefone Residencial</label>
                <input type="text" id="fone_res" name="fone_res" class="form-control" placeholder="(00)0000-0000">
            </div>

            <div class="form-group"> 
                <label for="fone_cel">Telefone Celular</label>
                <input type="text" id="fone_cel" name="fone_cel" class="form-control" placeholder="(00)00000-0000">
            </div>

             <div class="form-group"> 
                <label for="dt_nasc">Data de Nascimento</label>
                <input type="date" id="dt_nasc" name="dt_nasc" class="form-control">
            </div>

            <div class="form-group"> 
                <label for="email">Email</label>
                <input type="email" id="email" name="email" class="form-control" placeholder="exemplo@email.com">
            </div>

            <div class="form-group"> 
                <label for="facebook">Facebook</label>
                <input type="text" id="facebook" name="facebook" class="form-control" placeholder="Facebook">
            </div>

            <div class="form-group"> 
                <label for="twitter">Twitter</label>
                <input type="text" id="twitter" name="twitter" class="form-control" placeholder="Twitter">
            </div>

        </div>
            <div class="panel-footer clearfix">
                    <a href="{{ route('agenda.index') }}" class="btn btn-default btn-sm">
                        <i class="fas fa-reply"></i> Voltar
                    </a>

                    <button type="submit" class="btn btn-success btn-sm">
                        <i class="fas fa-save"></i> Gravar
                    </button>
            </div> 
    </div>
</form>
@stop

@section('css')
<link rel="stylesheet" href="/css/admin_custom.css">
@stop

@section('js')
<script> console.log('Hi!'); </script>
@stop