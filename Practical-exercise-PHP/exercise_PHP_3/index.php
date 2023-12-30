<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>
<body>

  <?php
  //2 ARRAYS E VAMOS VERIFICAR OS NÚMEROS EM COMUM.

  $array_0 = array(0,1,2,3,4,6,8);
  $array_1 = array(10,90,23,8,6);

  //Rodar dois looping e verificar se existe em um e no outro.
  $em_comum = [];
  for($i = 0; $i < count($array_0); $i++){
    for($n = 0; $n < count($array_1); $n++){
      if($array_0[$i] == $array_1[$n]){
        //Número em comum
        $em_comum[] = $array_0[$i];
      }
    }
  }

  foreach ($em_comum as $key => $value) {
    echo $value;
    echo '<br>';
  }

  ?>


</body>
</html>