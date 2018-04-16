import { Component, OnInit } from '@angular/core';
import { Router,ActivatedRoute,ParamMap } from '@angular/router';
import { HttpClient,HttpHeaders,HttpParams } from '@angular/common/http';

@Component({
  selector: 'app-case-detail',
  templateUrl: './case-detail.component.html',
  styleUrls: ['./case-detail.component.css']
})
export class CaseDetailComponent implements OnInit {

  case:{id:number,name:string};
  hasCollect:boolean;

  alFour:{
    fatigue:string,
    itch:string,
    dry:string,
    vague:string,
    depress:string,
    angry:string,
    insomnia:string,
    wake:string,
    tinnitus:string,
    thirst:string
  };

  alTongue:{
   tongueQuality:string,
   tongueBody:string,
   mossyQuality:string,
   mossyColor:string,
   varice:string,
   tongueLeft:string,
   tongueRight:string,
  }

  alPcInsLiver:{
    albumin:string,
    globulin:string,
    alt:string,
    ast:string,
    ggt:string,
    alp:string,
  }

  alPcInsKidney:{
    bun:string,
    cr:string,
  }

  alPcInsCoa:{
    pt:string,
    int:string,
  }

  alPcInsBlood:{
    rbc:string,
    hb:string,
    wbc:string,
    neutrophil:string,
    lymphocyte:string,
  }

  alPcInsHb:{
    hbsAg:string,
    hbsAb:string,
    hbeAg:string,
    hbeAb:string,
    hbcAb:string,
    hbvRna:string,
  }

  constructor(private router:Router,private route:ActivatedRoute,private http:HttpClient) { }

  ngOnInit() {

    this.case = {id:-1,name:undefined};

    this.alFour = {
      fatigue:undefined,
      itch:undefined,
      dry:undefined,
      vague:undefined,
      depress:undefined,
      angry:undefined,
      insomnia:undefined,
      wake:undefined,
      tinnitus:undefined,
      thirst:undefined
    };

    this.alTongue = {
      tongueQuality:undefined,
      tongueBody:undefined,
      mossyQuality:undefined,
      mossyColor:undefined,
      varice:undefined,
      tongueLeft:undefined,
      tongueRight:undefined,
    };

    this.alPcInsLiver = {
      albumin:undefined,
      globulin:undefined,
      alt:undefined,
      ast:undefined,
      ggt:undefined,
      alp:undefined,
    };

    this.alPcInsKidney = {
      bun:undefined,
      cr:undefined,
    };

    this.alPcInsCoa = {
      pt:undefined,
      int:undefined,
    };

    this.alPcInsBlood = {
      rbc:undefined,
      hb:undefined,
      wbc:undefined,
      neutrophil:undefined,
      lymphocyte:undefined,
    };

    this.alPcInsHb = {
      hbsAg:undefined,
      hbsAb:undefined,
      hbeAg:undefined,
      hbeAb:undefined,
      hbcAb:undefined,
      hbvRna:undefined,
    };

    this.alPcInsLiver = 

    this.route.paramMap.subscribe((params:ParamMap) => {
      this.http.get<any>('/api/person/' + params.get('id')).subscribe(data => {
        this.case = data;

        this.getAlFour();
        this.getAlTongue();
        this.getAlPcInsLiver();
        this.getAlPcInsKidney();
        this.getAlPcInsCoa();
        this.getAlPcInsBlood();
        this.getAlInsHb();
      });
      this.http.get<any>('/api/person/hasCollect',{
        headers:new HttpHeaders().set('userId',localStorage['id']),
        params:new HttpParams().set('personId',params.get('id'))
      }).subscribe(data =>{
        this.hasCollect = data;
      })
    })
  }

  collect(){
    this.http.get('/api/user/collection/' + this.case.id,
      {
        headers:new HttpHeaders().set('userId',localStorage['id'])
      }
    ).subscribe();
  }

  uncollect(){
    this.http.get<any>('/api/user/uncollectPerson/',
      {
        headers:new HttpHeaders().set('userId',localStorage['id']),
        params:new HttpParams().set('personId',''+this.case.id)
      }
    ).subscribe();
  }

  //根据personId得到alFour
  getAlFour(){
    this.http.get<any>('/api/alFour',{
      params:new HttpParams().set('personId',''+this.case.id)
    }).subscribe(data => {
      if(data != null){
        this.alFour = data;
      }
    });
  }

  //alTongue
  getAlTongue(){
    this.http.get<any>('/api/alTongue',{
      params:new HttpParams().set('personId',''+this.case.id)
    }).subscribe(data => {
      if(data != null){
        this.alTongue = data;
      }
    });
  }

  //alPcInsLiver
  getAlPcInsLiver(){
    this.http.get<any>('/api/alPcIns/liver',{
      params:new HttpParams().set('personId',''+this.case.id)
    }).subscribe(data => {
      if(data != null){
        this.alPcInsLiver = data;
      }
    });
  }

  //alPcInsKidney
  getAlPcInsKidney(){
    this.http.get<any>('/api/alPcIns/kidney',{
      params:new HttpParams().set('personId',''+this.case.id)
    }).subscribe(data => {
      if(data != null){
        this.alPcInsKidney = data;
      }
    });
  }

  //alPcInsCoa
  getAlPcInsCoa(){
    this.http.get<any>('/api/alPcIns/coa',{
      params:new HttpParams().set('personId',''+this.case.id)
    }).subscribe(data => {
      if(data != null){
        this.alPcInsCoa = data;
      }
    })
  }

  //alPcInsBlood
  getAlPcInsBlood(){
    this.http.get<any>('/api/alPcIns/blood',{
      params:new HttpParams().set('personId',''+this.case.id)
    }).subscribe(data => {
      if(data != null){
        this.alPcInsBlood = data;
      }
    });
  }

  //alPcInsHb
  getAlInsHb(){
    this.http.get<any>('/api/alPcIns/hb',{
      params:new HttpParams().set('personId',''+this.case.id)
    }).subscribe(data => {
      if(data != null){
        this.alPcInsHb = data;
      }
    });
  }

}
