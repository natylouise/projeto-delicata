import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CarrinhoComponent } from './carrinho.component';

describe('CarrinhoComponent', () => {{

}
  let component: CarrinhoComponent;
  let fixture: ComponentFixture<CarrinhoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CarrinhoComponent]
    })
    .compileComponents();
    
  

  it('should create', () => {
    expect(component).toBeTruthy();
  });

})});

