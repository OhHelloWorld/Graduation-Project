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

  alBone:{
    lv:string,
    lvT:string,
    fn:string,
    fnT:string,
    br:string,
    brT:string,
    th:string,
    thT:string,
    diagnosis:string
  }

  alLiver:{
    li:string,
    ih:string,
    pi1:string,
    pi2:string,
    rc:string,
    hbsAg:string,
    hbcAg:string,
    hcv:string,
  }

  alAih:{
    anasma1:string,
    anasma2:string,
    antiLkm:string,
    antiSla:string,
    igg:string,
    liverHistology:string,
    excludeViralHepatitis:string
  }

  alFinal:{
    pbc:string,
    aih:string,
    special:string
  }

  mlFour:{
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
  }

  mlAllergy:{
    allergy:string,
    allergen:string,
    remark:string
  }

  mlDrink:{
    history:string,
    species:string,
    time:string
  }

  mlBlood:{
    wbc:string,
    hb:string,
    thc:string,
    plt:string,
    n:string,
    e:string,
  }

  mlDisease:{
    other:string,
    one:string,
    tour:string,
  }

  mlBiochemical:{
    alt:string,
    ast:string,
    ggt:string,
    alp:string,
    acid:string,
    tbil:string,
    dbil:string,
    tp:string,
    alb:string,
    scr:string,
    un:string,
    fbg:string,
    pt:string,
    inr:string,
    afp:string,
  }

  mlLiver:{
    option1:string,
    option2:string,
    option3:string,
    option4:string,
    option5:string,
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

    this.alBone = {
      lv:undefined,
      lvT:undefined,
      fn:undefined,
      fnT:undefined,
      br:undefined,
      brT:undefined,
      th:undefined,
      thT:undefined,
      diagnosis:undefined
    };

    this.alLiver = {
      li:undefined,
      ih:undefined,
      pi1:undefined,
      pi2:undefined,
      rc:undefined,
      hbsAg:undefined,
      hbcAg:undefined,
      hcv:undefined,
    }


    this.alAih = {
      anasma1:undefined,
      anasma2:undefined,
      antiLkm:undefined,
      antiSla:undefined,
      igg:undefined,
      liverHistology:undefined,
      excludeViralHepatitis:undefined
    };

    this.alFinal = {
      pbc:undefined,
      aih:undefined,
      special:undefined
    };

    this.mlFour = {
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

    this.mlAllergy = {
      allergy:undefined,
      allergen:undefined,
      remark:undefined
    };

    this.mlBlood = {
      wbc:undefined,
      hb:undefined,
      thc:undefined,
      plt:undefined,
      n:undefined,
      e:undefined,
    };

    this.mlDisease = {
      other:undefined,
      one:undefined,
      tour:undefined,
    };

    this.mlBiochemical = {
      alt:undefined,
      ast:undefined,
      ggt:undefined,
      alp:undefined,
      acid:undefined,
      tbil:undefined,
      dbil:undefined,
      tp:undefined,
      alb:undefined,
      scr:undefined,
      un:undefined,
      fbg:undefined,
      pt:undefined,
      inr:undefined,
      afp:undefined,
    };

    this.mlLiver = {
      option1:undefined,
      option2:undefined,
      option3:undefined,
      option4:undefined,
      option5:undefined,
    };

    this.mlDrink = {
      history:undefined,
      species:undefined,
      time:undefined
    };


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
        this.getAlBone();
        this.getAlLiver();
        this.getAlAih();
        this.getAlFinal();
        this.getMlFour();
        this.getMlAllergy();
        this.getMlBlood();
        this.getMlDisease();
        this.getMlBiochemical();
        this.getMlLiver();
        this.getMlDrink();
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
    ).subscribe(() => {
      location.reload();
    });
  }

  uncollect(){
    this.http.get<any>('/api/user/uncollectPerson/',
      {
        headers:new HttpHeaders().set('userId',localStorage['id']),
        params:new HttpParams().set('personId',''+this.case.id)
      }
    ).subscribe(() => {
      location.reload();
    });
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
      params:new HttpParams().set('personId',''+this.case.id)
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
      params:new HttpParams().set('personId',''+this.case.id)
    }).subscribe(data => {
      if(data != null){
        this.alPcInsHb = data;
      }
    });
  }

  //alBone
  getAlBone(){
    this.http.get<any>('/api/alBone',{
      params:new HttpParams().set('personId',''+this.case.id)
    }).subscribe(data => {
      if(data != null){
        this.alBone = data;
      }
    });
  }

  //alLiver
  getAlLiver(){
    this.http.get<any>('/api/alLiver',{
      params:new HttpParams().set('personId',''+this.case.id)
    }).subscribe(data => {
      if(data != null){
        this.alLiver = data;
      }
    });
  }

  //alAih
  getAlAih(){
    this.http.get<any>('/api/alAih',{
      params:new HttpParams().set('personId',''+this.case.id)
    }).subscribe(data => {
      if(data != null){
        this.alAih = data;
      }
    });
  }

  //alFinal
  getAlFinal(){
    this.http.get<any>('/api/alFinal',{
      params:new HttpParams().set('personId',''+this.case.id)
    }).subscribe(data => {
      if(data != null){
        this.alFinal = data;
      }
    });
  }

  //mlFour
  getMlFour(){
    this.http.get<any>('/api/mlFour',{
      params:new HttpParams().set('personId',''+this.case.id)
    }).subscribe(data => {
      if(data != null){
        this.mlFour = data;
      }
    });
  }

  //mlAllergy
  getMlAllergy(){
    this.http.get<any>('/api/mlAllergy',{
      params:new HttpParams().set('personId',''+this.case.id)
    }).subscribe(data => {
      if(data != null){
        this.mlAllergy = data;
      }
    });
  }

  //mlBlood
  getMlBlood(){
    this.http.get<any>('/api/mlBlood',{
      params:new HttpParams().set('personId',''+this.case.id)
    }).subscribe(data => {
      if(data != null){
        this.mlBlood = data;
      }
    });
  }

  //mlDisease
  getMlDisease(){
    this.http.get<any>('/api/mlDisease',{
      params:new HttpParams().set('personId',''+this.case.id)
    }).subscribe(data => {
      if(data != null){
        this.mlDisease = data;
      }
    });
  }

  //mlBiochemic
  getMlBiochemical(){
    this.http.get<any>('/api/mlBiochemical',{
      params:new HttpParams().set('personId',''+this.case.id)
    }).subscribe(data => {
      if(data != null){
        this.mlBiochemical = data;
      }
    });
  }

  //mlLiver
  getMlLiver(){
    this.http.get<any>('/api/mlLiver',{
      params:new HttpParams().set('personId',''+this.case.id)
    }).subscribe(data => {
      if(data != null){
        this.mlLiver = data;
      }
    });
  }

  //mlDrink
  getMlDrink(){
    this.http.get<any>('/api/mlDrink',{
      params:new HttpParams().set('personId',''+this.case.id)
    }).subscribe(data => {
      if(data != null){
        this.mlDrink = data;
      }
    });
  }
}
