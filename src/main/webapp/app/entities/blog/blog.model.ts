import { BaseEntity } from './../../shared';

export class Blog implements BaseEntity {
    constructor(
        public id?: number,
        public name?: string,
        public constent?: string,
        public createdAt?: any,
        public categoryId?: number,
    ) {
    }
}
