 var today = new Date();
 var toyear = today.getFullYear();
 var tomth = today.getMonth();
 var td = today.getDate();
 console.log(td);
 
 var year ='';

for (let i = 1990; i <= 2024; i++){
		if(toyear==i){
			year +='<option value="'+ i +'"selected>'+ i +'</option>'
		}else{
			year += '<option value="'+ i +'">'+ i +'</option>'
		}
	}
 document.getElementById('year').innerHTML = year; 
 
 var month ='';
 for (let i = 1; i <= 12; i++){
	if(tomth==i){
		month += '<option value="'+ i +'"selected>'+ (i+1) +'</option>'
	}else{
		month += '<option value="'+ i +'">'+ i +'</option>'
	}
 }
 document.getElementById('month').innerHTML = month; 
 
 var day = '';
  for (let i = 1; i <= 31; i++){
	if(td==i){
		day += '<option value="'+ i +'"selected>'+ i +'</option>'
	}else{	
		day += '<option value="'+ i +'">'+ i +'</option>'
	}
}
 document.getElementById('day').innerHTML = day; 
 
 
 
