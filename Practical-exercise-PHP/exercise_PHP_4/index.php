<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>
<body>

  <?php

  $array = array('Gelcimar','Durotham','Tenerus','Durotham', 'Maltalor','Malfurion');
  $arrayRepetido = array();

for($i = 0; $i < count($array);$i++){
  $valorAtual = $array[$i];
  if(!isset($arrayRepetido[$valorAtual])){
    $arrayRepetido[$valorAtual] = 0;
    
  }else{
      $arrayRepetido[$valorAtual]++;
    }
}
foreach($arrayRepetido as $key => $value) {
    echo $key;
    echo $value;
    echo '<br>';
  }

  ?>


</body>
</html>