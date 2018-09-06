import { Component, OnInit, Input } from '@angular/core';

@Component({
    selector: 'card',
    templateUrl: './card.component.html',
})
export class CardComponent implements OnInit {
    @Input() track: string;
    @Input() album: string;
    @Input() date: string;
    @Input() artist: string;
    @Input() img: string;

    constructor() { }

    ngOnInit(): void { }
}
