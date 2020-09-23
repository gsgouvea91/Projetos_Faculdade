<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreateProprietariosTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('proprietarios', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->string('nome',70);
            $table->date('dt_nasc');
            $table->double('cpf');
            $table->string('email',50)->nullable();
            $table->string('fone_res',15)->nullable();
            $table->string('fone_cel',15);
            $table->string('fone_com',15)->nullable();
            $table->integer('qtd_parcela');
            $table->double('valor_aluguel');
            $table->double('valor_parcela');
            $table->double('valor_financiado')->nullable();
            $table->string('financeira',15)->nullable();
            $table->boolean('debito_automatico')->nullable();
            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('proprietarios');
    }
}
