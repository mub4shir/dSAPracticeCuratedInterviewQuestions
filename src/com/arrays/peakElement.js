
const ans =peakElement([441,272,65,289],4);
console.log(ans);

function peakElement(arr, n){

    for(let i = 0 ; i<n; i++){
        if(arr[i]>arr[(i-1+n)%n]&&arr[i]>arr[(i+1) % n]) return i;
    }
}


