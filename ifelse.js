let science=90;
let math=66;
let nepali=60;
let computer=70;

let Percentage=(science+math+nepali+computer)*100/400;

if (Percentage>100){
    console.log("Grading Error");
}else if (Percentage>=70){
    console.log("Grade A");
}else if (Percentage>=60){
    console.log("Grade B")
}else if (Percentage>=50){
    console.log("Grade C");
}else if (Percentage>=40){
    console.log("Grade D")
}else{
    console.log("Fail")
}
