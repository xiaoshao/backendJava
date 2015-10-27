package com.xiaoshao.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;

@RunWith(MockitoJUnitRunner.class)
public class FirstControllerSpec {

    private FirstController firstController;

    @Before
    public void before() {
        firstController = new FirstController();
    }

    @Test
    public void shouldGetAuthorNameCorrectly() {
        Assert.assertThat(firstController.getAuthorName(), is("xiaoshao"));
    }
}