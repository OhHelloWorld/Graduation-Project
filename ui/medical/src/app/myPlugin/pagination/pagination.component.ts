import { Component, OnInit,Input,Output,EventEmitter,OnChanges,DoCheck,SimpleChanges} from '@angular/core';

@Component({
  selector: 'app-pagination',
  templateUrl: './pagination.component.html',
  styleUrls: ['./pagination.component.css']
})
export class PaginationComponent implements OnInit,OnChanges{

  //数据总数量
  @Input() private dataNums:number;
  @Output()  currentPage:EventEmitter<number> = new EventEmitter();

  private dataNumsInPage:number = 24;
  //共有几页
  private allPageNum:number;
  //用于存放全部页码的数组
  private pages:Array<number>;
  //当前页码
  private pageCurrent:number = 1;
  constructor() { }

  ngOnInit() {
    this.currentPage.emit(this.pageCurrent);
  }

  //当输入分页组件的数据数量发生变化，重新改变页码
  ngOnChanges(changes:SimpleChanges):void{
    this.pages = [];
    this.allPageNum = (+this.dataNums)%(+this.dataNumsInPage) == 0?(+this.dataNums)/(+this.dataNumsInPage):Math.floor((+this.dataNums)/(+this.dataNumsInPage))+1;
    for(let i = 1;i<=this.allPageNum;i++){
      this.pages.push(i);
    }
  }

  //获取当前显示页
  getPage(page){
    this.pageCurrent = page;
    this.currentPage.emit(this.pageCurrent);
  }

  //显示下一页
  next(){
    if(this.pageCurrent != this.pages[this.pages.length - 1]){
      this.pageCurrent = this.pageCurrent + 1;
    }else{
      this.pageCurrent = this.pages[this.pages.length - 1];
    }
    this.currentPage.emit(this.pageCurrent);
  }

  //显示上一页
  previous(){
    if(this.pageCurrent != 1){
      this.pageCurrent = this.pageCurrent - 1;
    }else{
      this.pageCurrent = 1;
    }
    this.currentPage.emit(this.pageCurrent);
  }





}
