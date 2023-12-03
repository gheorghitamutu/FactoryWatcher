import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FlightsContentComponent } from './flights-content.component';

describe('FlightsContentComponent', () => {
  let component: FlightsContentComponent;
  let fixture: ComponentFixture<FlightsContentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FlightsContentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FlightsContentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
