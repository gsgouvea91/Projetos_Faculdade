<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreateContatostarefasTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('contatostarefas', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->unsignedBigInteger('agendas_id');
            $table->unsignedBigInteger('tarefas_id');
            $table->timestamps();
            $table->foreign('agendas_id')->references('id')->on('agendas')->onDelete('cascade');
            $table->foreign('tarefas_id')->references('id')->on('tarefas')->onDelete('cascade');
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('contatostarefas');
    }
}
