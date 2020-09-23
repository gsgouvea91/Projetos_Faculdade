<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreateImoveisTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('imoveis', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->string('logradouro',50);
            $table->string('complementos',50);
            $table->string('cep',9);
            $table->string('bairro',15);
            $table->string('cidade',20);
            $table->double('perimetroTotal');
            $table->double('areaConstruida');
            $table->integer('qtd_quartos');
            $table->integer('qtd_banheiros');
            $table->double('valor_casa');
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
        Schema::dropIfExists('imoveis');
    }
}
