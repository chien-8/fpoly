1+1
<br>

<?php
    $num=10;
    $x="chien";
    echo "gia tri bien num=$num";
    
    echo "gia tri bien num=$x";


    $name="ta minnh chien";
    $age=19;
    $birthDate="2002-11-15";
    $isMarried=false;
    
    $fa21=[
        'php1'=>[
            'web2013.1'
        ],
        'web1013'=>[
            'ec17202','ec17203'
        ],
        'pr01014'=>[
            'we16301','we26302'
        ]
    ];
    foreach($fa21 as $key=>$value){
        echo "<p> tên lớp: $key</p><br>";
        echo "<p> danh sách lớp:</p>";
        
        foreach($value as $k=>$v){
            echo "<li>tên môn:$v</li>";
        }
            
    }


?>