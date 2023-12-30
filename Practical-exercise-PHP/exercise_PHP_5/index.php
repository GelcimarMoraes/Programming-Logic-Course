<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>
<body>

  <?php
  //Preencher arry sem números repetidos.
  $arr =[];
  for($i = 0; $i < 5; $i++){
    $arr[$i] = rand(1,5);
    while(inArrayCustom($i,$arr[$i], $arr)){
      $arr[$i] = rand(1,5);
    }
  }

  print_r($arr);
  function inArrayCustom($indice,$valor,$arr){
    for($i = 0; $i <count($arr); $i++){
      if($arr[$i] == $valor && $i != $indice){
        echo 'repetiu!<br>';
        return true;
      }
    }
    return false;
  }


  ?>


</body>
</html>