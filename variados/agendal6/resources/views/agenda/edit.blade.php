@extends('adminlte::page')

@section('title', 'Agendal6')

@section('content_header')
<h1>Edição dos dados do Contato</h1>
@stop

@section('content')
<form action="{{route('agenda.update',$agenda->id) }}" method="POST">
    {{csrf_field()}}
	<input type="hidden" name="_method" value="PUT">
    <div class="panel panel-default">
        <div class="panel-heading">
        <p>Alteração dos dados do Contato</p>
        </div>
        <div class="panel-body"> 
            <div class="form-group"> 
                <label for="nome">Nome do Contato</label>
                <input type="text" id="nome" name="nome" class="form-control" placeholder="Nome" value="{{$agenda->nome}}">
            </div>

            <div class="form-group"> 
                <label for="fone_res">Telefone Residencial</label>
                <input type="text" id="fone_res" name="fone_res" class="form-control" value="{{$agenda->fone_res}}">
            </div>

            <div class="form-group"> 
                <label for="fone_cel">Telefone Celular</label>
                <input type="text" id="fone_cel" name="fone_cel" class="form-control"  value="{{$agenda->fone_cel}}">
            </div>

             <div class="form-group"> 
                <label for="dt_nasc">Data de Nascimento</label>
                <input type="text" id="dt_nasc" name="dt_nasc" class="form-control" value="{{$agenda->dt_nasc->format('d/m/Y')}}">
            </div>

            <div class="form-group"> 
                <label for="email">Email</label>
                <input type="email" id="email" name="email" class="form-control" value="{{$agenda->email}}">
            </div>

            <div class="form-group"> 
                <label for="facebook">Facebook</label>
                <input type="text" id="facebook" name="facebook" class="form-control" value="{{$agenda->facebook}}">
            </div>

            <div class="form-group"> 
                <label for="twitter">Twitter</label>
                <input type="text" id="twitter" name="twitter" class="form-control" value="{{$agenda->twitter}}">
            </div>

             <div class="form-group"> 
                <label for="instagram">Instagram</label>
                <input type="text" id="instagram" name="instagram" class="form-control" value="{{$agenda->instagram}}">
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