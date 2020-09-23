@extends('adminlte::page')

@section('title', 'Agenda')

@section('content_header')
<h1><i class="fas fa-address-book"></i> Lista de Agendas</h1>
@stop

@section('content')
<div class="panel panel-default">
    <div class="panel-heading clearfix">
    Relação dos contatos da agenda 
        <div class="pull-right">
            <a href="{{ route('agenda.index') }}" class="btn btn-primary btn-sm"><i class="fas fa-sync"></i> Atualizar a tela</a>
            <a href="{{ route('agenda.create') }}" class="btn btn-success btn-sm"><i class="fas fa-plus"></i> Adcionar novo contato</a>
        </div>
    </div>
    <div class="panel-body">    
        <table id="tabela" class="table table-striped table-bordered table-hover">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nome</th>
                    <th>Celular</th>
                    <th>Email</th>
                    <th>Ações</th>
                </tr>
            </thead>
            <tbody>
                @foreach($contatos as $contato)
                <tr>
                    <td>{{$contato->id}}</td>
                    <td>{{$contato->nome}}</td>
                    <td>{{$contato->fone_cel}}</td>
                    <td>{{$contato->email}}</td>
                    <td>
                    <a href="{{ route('agenda.show', $contato->id) }}" class="btn btn-primary btn-xs">
                    <i class="fas fa-fx fa-eye"></i> </a>

                    <a href="{{ route('agenda.edit', $contato->id) }}" class="btn btn-warning btn-xs">
                    <i class="fas fa-fx fa-edit"></i> </a>
                    
                    </td>
                </tr>
                @endforeach
            </tbody>
        </table>
    </div>
</div>
@stop

@section('css')
<link rel="stylesheet" href="/css/admin_custom.css">
@stop

@section('js')
<script> 
    $(document).ready( function () {
        $("#tabela").DataTable();
    });
</script>
@stop