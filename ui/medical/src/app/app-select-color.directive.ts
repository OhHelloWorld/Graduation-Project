import { Directive,ElementRef,HostListener,Input } from '@angular/core';

@Directive({
  selector:'[mybox]'
})
export class AppSelectColorDirective{
  constructor(private el:ElementRef){}

  @HostListener('click') selectBox(){
    if(this.el.nativeElement.style.backgroundColor == 'lightgreen'){
      this.el.nativeElement.style.backgroundColor = '';
    }else{
      this.el.nativeElement.style.backgroundColor = 'lightgreen';
    }
  } 
}