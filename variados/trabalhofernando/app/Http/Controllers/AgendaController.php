<?php

namespace App\Http\Controllers;

use App\Agenda;
use Illuminate\Http\Request;
use App\Http\Controllers\Controller;
use Illuminate\Support\Facades\DB;



class AgendaController extends Controller
{
    
    /**
     * index: exibe uma lista dos registros da tabela
     * create: exibe um formulario para cadastrar dados
     * store: recebe os dados do form e envia para o Model gravar na tabela (Instert)
     * edit: exibe o formulario para alteração de dados de um registro
     * update: recebe os dados do form e envia para o Model atualizar na tabela (Update)
     * show: exibe em detalhes os dados de um registro
     * destroy: deleta um registro
     */

    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        $contatos = Agenda::all();
        return view('agenda.index',compact('contatos'));
    }

    /**
     * Show the form for creating a new resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function create()
    {
        return view('agenda.create');
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
     
        //$dt_nasc= $this-> formata_data($request->dt_nasc);
        
        DB::table('agendas')->insert([

            'nome'=> $request->nome,
            'fone_res'=> $request->fone_res,
            'fone_cel'=> $request->fone_cel,
            'dt_nasc'=> $request->dt_nasc,
            'email'=> $request->email,
            'facebook'=> $request->facebook,
            'twitter'=> $request->twitter,
            'instagram'=> $request->instagram

        ]);

        //Agenda::create($request->all());
        //return view('agenda.index');
        return redirect()->route('agenda.index');
    }
    public function formata_data($data){

        //dd/mm/aaaa
        $d = substr($data, 6, 4) . "-" . substr($data, 3, 2) . "-" . substr($data, 0, 2);
       
        return $d;

    }

    /**
     * Display the specified resource.
     *
     * @param  \App\Agenda  $agenda
     * @return \Illuminate\Http\Response
     */
    public function show(Agenda $agenda)
    {
        //
    }

    /**
     * Show the form for editing the specified resource.
     *
     * @param  \App\Agenda  $agenda
     * @return \Illuminate\Http\Response
     */
    public function edit(Agenda $agenda)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  \App\Agenda  $agenda
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, Agenda $agenda)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  \App\Agenda  $agenda
     * @return \Illuminate\Http\Response
     */
    public function destroy(Agenda $agenda)
    {
        //
    }
}
