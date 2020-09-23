<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Cadastrar</title>
    <?php
    //Chama arquivo biblioteca bootstrap ../ = diretorio anterior
    include('../css/bootstrap.php');
    ?>

</head>

<body>
    <?php
        //Chama arquivo que desenha navbar
        include('menu.php');
    ?>

    <div class="panel panel-default">
        <div class="panel-heading">
            Formulario de Cadastro de Contatos
        </div>
        <!--Corpo Paninel-->
        <div class "panel-body">
            <form action="">
                <div class="form-group col-md-6 col-xs-6">
                <label for="nome">Nome: </label><span class="text-red"> *</span> 
                <input type="text" name="nome" id="nome" required class="form-control" placeholder="Nome">
                </div>

                <div class ="form-group col-md-6 col-xs-6">
                    <label for="genero">Genero</label> <span class="text-red"> *</span> 
                        <select name="genero" id="genero" class= "form-control">
                        <option value="M">Masculino</option>
                        <option value="F">Feminino</option>
                        <option value="O">Outros</option>
                    </select>
                </div>

                <div class="form-group col-md-6 col-xs-6">
                <label for="nome">Tel. Res: </label>
                <input type="text" name="fone_res" id="fone_res" class="form-control" placeholder="(00) 0000-0000">      
                </div>

                <div class="form-group col-md-6 col-xs-6">
                <label for="nome">Tel. Celular: </label><span class="text-red"> *</span> 
                <input type="text" name="fone_cel" id="fone_cel" required class="form-control" placeholder="(00) 0000-0000">      
                </div>

                <div class="form-group col-md-6 col-xs-6">
                <label for="nome">Data de Nascimento: </label>
                <input type="text" name="dt_nasc" id="dt_nasc" class="form-control" placeholder="00/00/0000">      
                </div>  
                
                <div class="form-group col-md-6 col-xs-6">
                <label for="nome">E-Mail: </label>
                <input type="text" name="email" id="email" class="form-control" placeholder="exemplo@ex.com">      
                </div>

                <div class="form-group col-md-5">
                <label for="nome">Edereço: </label><span class="text-red"> *</span> 
                <input type="text" name="endereco" id="endereco" required class="form-control" placeholder="Rua: Clodovaldo 77 ap: 35">      
                </div>

                <div class="form-group col-md-3">
                <label for="nome">Bairro: </label><span class="text-red"> *</span> 
                <input type="text" name="bairro" id="bairro" required class="form-control" placeholder="Bairro">      
                </div>
        
                <div class="form-group col-md-3">
                <label for="nome">Cep: </label> <span class="text-red"> *</span>
                <input type="text" name="cep" id="cep" required class="form-control" placeholder="12345-678">      
                </div>
            
                <div class="form-group col-md-1">
                <label for="nome">UF: </label><span class="text-red"> *</span> 
                <input type="text" name="uf" id="uf" required class="form-control" placeholder="UF">      
                </div>

                <div class="form-group col-md-4">
                <label for="nome">Facebook: </label>
                <input type="text" name="facebook" id="facebook" class="form-control">      
                </div>
        
                <div class="form-group col-md-4">
                <label for="nome">Twitter: </label>
                <input type="text" name="twitter" id="twitter" class="form-control">      
                </div>

                <div class="form-group col-md-4">
                <label for="nome">Instagram: </label>
                <input type="text" name="instagram" id="instagram" class="form-control">      
                </div>
            </form>
        </div>

        <!-- Rodapé Painel-->
        <div class ="panel-footer">
            <button type="button" class="btn btn-default btn-lg">
            <i class="fa fa-arrow-circle-left" aria-hidden="true"></i> Voltar</button>

            <button type="submit" class="btn btn-success btn-lg">
            <i class="fa fa-save" aria-hidden="true"></i> Gravar</button>
        </div>
    </div>

    <?php
        //Chama arquivo biblioteca bootstrap ../ = diretorio anterior
        include('../js/bootstrap.php');
    ?> 

</body>

</html>