import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

import { Test2CategoryModule } from './category/category.module';
import { Test2BlogModule } from './blog/blog.module';
/* jhipster-needle-add-entity-module-import - JHipster will add entity modules imports here */

@NgModule({
    imports: [
        Test2CategoryModule,
        Test2BlogModule,
        /* jhipster-needle-add-entity-module - JHipster will add entity modules here */
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class Test2EntityModule {}
