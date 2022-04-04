package com.gordonlu.clicktool;

import android.app.Activity;
import android.content.Context;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;

import com.google.appinventor.components.runtime.AndroidViewComponent;
import android.view.View;
import android.view.DragEvent;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnDragListener;
import android.view.View.OnFocusChangeListener;

@DesignerComponent(
        version = 3,
        description = "A non-visible extension that is used to react to clicks and long clicks for visible components.<br><br>Made by Gordon Lu (AICODE)." + 
        " For details, please read my website: " + 
        "<a href='https://sites.google.com/view/appinventor-aicode/my-extensions/clicktool'>https://sites.google.com/view/appinventor-aicode/my-extensions/clicktool</a>.",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,
        helpUrl = "https://sites.google.com/view/appinventor-aicode/my-extensions/clicktool",
        iconName = "https://docs.google.com/drawings/d/e/2PACX-1vQCI87PHLBF0jb8QWyYmIRQSjjNW3EFXf-qpsWCvBYkUQ9vEgPAB8SpxcMpblxNpbIYrjCjLrRLIU2c/pub?w=16&h=16")

@SimpleObject(external = true)
//Libraries
@UsesLibraries(libraries = "")
//Permissions
@UsesPermissions(permissionNames = "")

public class ClickTool extends AndroidNonvisibleComponent {

    //Activity and Context
    private Context context;
    private Activity activity;

    public ClickTool(ComponentContainer container){
        super(container.$form());
        this.activity = container.$context();
        this.context = container.$context();
    }

    @SimpleFunction(description = "Registers the component so that when the user clicks the component, it will fire the OnClick event.")
    public void RegisterClick(final AndroidViewComponent component) {
        View view = component.getView();
            view.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        OnClick(component);	
        }
    });
    }

    @SimpleFunction(description = "Registers the component so that when the user long clicks the component, it will fire the OnLongClick event.")
    public void RegisterLongClick(final AndroidViewComponent component) {
        View view = component.getView();
        view.setOnLongClickListener(new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
          OnLongClick(component);
          return false;
        }
      });
    }

    @SimpleFunction(description = "Unregisters the component so that when the user has clicked this component, it will not fire the OnClick event.")
    public void UnregisterClick(AndroidViewComponent component) {
        View view = component.getView();
        view.setOnClickListener(null);
    }

    @SimpleFunction(description = "Unregisters the component so that when the user has long clicked this component, it will not fire the OnLongClick event.")
    public void UnregisterLongClick(AndroidViewComponent component) {
        View view = component.getView();
        view.setOnLongClickListener(null);
    }

    @SimpleEvent(description = "This event is fired when a registered component is clicked.")
    public void OnClick(AndroidViewComponent component){
        EventDispatcher.dispatchEvent(this, "OnClick", component);
    }

    @SimpleEvent(description = "This event is fired when a registered component is long clicked.")
    public void OnLongClick(AndroidViewComponent component){
        EventDispatcher.dispatchEvent(this, "OnLongClick", component);
    }
    @SimpleFunction(description = "Performs a click for the given component.") 
    public void PerformClick(AndroidViewComponent component) {
        View view = component.getView();
        view.performClick();
    }

    @SimpleFunction(description = "Performs a long click for the given component.") 
    public void PerformLongClick(AndroidViewComponent component) {
        View view = component.getView();
        view.performLongClick();
    }
    @SimpleFunction(description = "Registers the component so that when the user focuses or removes focus for the component, it will fire the respective event.")
    public void RegisterFocus(final AndroidViewComponent component) {
        View view = component.getView();
            view.setOnFocusChangeListener(new View.OnFocusChangeListener() {
        @Override
        public void onFocusChange(View v, boolean hasFocus) {
        if (hasFocus) {
            GotFocus(component);
        } else {
            LostFocus(component);
        }
        }
    });
    }
    @SimpleFunction(description = "Unregisters the component so that when the user has focused or removed focus this component, it will not fire the respective event.")
    public void UnregisterFocus(AndroidViewComponent component) {
        View view = component.getView();
        view.setOnFocusChangeListener(null);
    }

    @SimpleEvent(description = "This event is fired when a registered component is focused.")
    public void GotFocus(AndroidViewComponent component){
        EventDispatcher.dispatchEvent(this, "GotFocus", component);
    }
    @SimpleEvent(description = "This event is fired when a registered component has focus removed.")
    public void LostFocus(AndroidViewComponent component){
        EventDispatcher.dispatchEvent(this, "LostFocus", component);
    }
}
