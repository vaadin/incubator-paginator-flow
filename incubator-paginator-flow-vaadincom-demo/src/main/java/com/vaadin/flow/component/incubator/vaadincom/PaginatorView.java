package com.vaadin.flow.component.incubator.vaadincom;

import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.incubator.Paginator;
import com.vaadin.flow.demo.DemoView;
import com.vaadin.flow.router.Route;

@Route("vaadin-incubator-paginator")
public class PaginatorView extends DemoView {

    @Override
    protected void initView() {

        H3 h3 = new H3("");

        Paginator paginator = new Paginator(10, 5, "beginning", "end");
        paginator.addChangeSelectedPageListener(event -> {
            h3.setText("Page: " + event.getPage());
        });

        h3.setText("Page: " + paginator.getCurrentPage());

        addCard("Basic Paginator", h3, paginator);
    }
}
