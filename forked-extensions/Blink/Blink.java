package com.gordonlu.blink;

import android.app.Activity;
import android.content.Context;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;

import android.view.animation.Animation;
import com.google.appinventor.components.runtime.AndroidViewComponent;
import android.view.View;
import android.view.animation.AlphaAnimation;

@DesignerComponent(
        version = 1,
        description = "An extension that applies blink animation to components.<br><br>Made by Gordon Lu (AICODE).",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,
        iconName = "https://docs.google.com/drawings/d/e/2PACX-1vQCI87PHLBF0jb8QWyYmIRQSjjNW3EFXf-qpsWCvBYkUQ9vEgPAB8SpxcMpblxNpbIYrjCjLrRLIU2c/pub?w=16&h=16")

@SimpleObject(external = true)
//Libraries
@UsesLibraries(libraries = "")
//Permissions
@UsesPermissions(permissionNames = "")

public class Blink extends AndroidNonvisibleComponent {

    //Activity and Context
    private Context context;
    private Activity activity;

    public Blink(ComponentContainer container){
        super(container.$form());
        this.activity = container.$context();
        this.context = container.$context();
    }

    @SimpleFunction(description = "Applies blink animation to a component, given a specific duration and a component.")
    public void ApplyBlink(AndroidViewComponent component, int duration, int startOffset) {
    View view = component.getView();
    // https://stackoverflow.com/a/11991516/17802442 
    Animation anim = new AlphaAnimation(0.0f, 1.0f);
    anim.setDuration(duration); 
    anim.setStartOffset(startOffset);
    anim.setRepeatMode(Animation.REVERSE);
    anim.setRepeatCount(Animation.INFINITE);
    view.startAnimation(anim);
    }
    @SimpleFunction(description = "Stops the blink animation of the given component.")
    public void StopBlink(AndroidViewComponent component) {
    View view = component.getView();
    view.clearAnimation();
    }
}
