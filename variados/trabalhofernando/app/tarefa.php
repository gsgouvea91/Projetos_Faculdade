<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class tarefa extends Model
{
    protected $TABLE = "tarefas";
    protected $fillable = [
        'titulo',
        'descricao',
        'data_inicio',
        'data_fim',
        'hora_inicio',
        'hora_fim'
    ];
    protected $dates = [
        'data_inicio',
        'data_fim',
        'hora_inicio',
        'hora_fim',
        'created_at',
        'updated_at'
    ];
}
