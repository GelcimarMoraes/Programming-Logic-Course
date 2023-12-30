<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>

<body>

  <?php
  $helloeorld = ['H', '-', 'e', '-', 'l', '-', 'l', '-', 'o'];
  $string = '';
  for ($i = 0; $i < count($helloeorld); $i++) {
    if ($helloeorld[$i] == '-') {
      continue;
    }
    $string .= $helloeorld[$i];
  }
  echo $string;
  ?>




</body>

</html>