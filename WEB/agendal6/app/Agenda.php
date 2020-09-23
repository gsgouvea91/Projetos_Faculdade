<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Agenda extends Model
{
    protected $TABLE = "agendas";
    protected $fillable =[
        'nome',
        'fone_res',
        'fone_cel',
        'dt_nasc',
        'email',
        'facebook',
        'twitter',
        'instagram'
    ];

    protected $dates = [
        
        'dt_nasc',
        'created_at',
        'updated_at'
    ];
}
