package com.gordonlu.fadeanimation;

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
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import java.lang.Object;
import android.view.animation.AnimationSet;

@DesignerComponent(
        version = 1,
        description = "A non-visible extension that applies fade in and fade out animations to your visible components.",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,
        iconName = "https://docs.google.com/drawings/d/e/2PACX-1vQCI87PHLBF0jb8QWyYmIRQSjjNW3EFXf-qpsWCvBYkUQ9vEgPAB8SpxcMpblxNpbIYrjCjLrRLIU2c/pub?w=16&h=16")

@SimpleObject(external = true)
//Libraries
@UsesLibraries(libraries = "")
//Permissions
@UsesPermissions(permissionNames = "")

public class FadeAnimation extends AndroidNonvisibleComponent {

    //Activity and Context
    private Context context;
    private Activity activity;

    public FadeAnimation(ComponentContainer container){
        super(container.$form());
        this.activity = container.$context();
        this.context = container.$context();
    }

    @SimpleFunction(description = "Applies fade-in animation for the given component.")
    public void FadeIn(AndroidViewComponent component, int duration) {
        View view = component.getView(); 
        Animation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setInterpolator(new DecelerateInterpolator()); //add this
        fadeIn.setDuration(duration);
        view.startAnimation(fadeIn);
    }

    @SimpleFunction(description = "Applies fade-out animation for the given component.")
    public void FadeOut(AndroidViewComponent component, int duration, int startOffset) {
        View view = component.getView(); 
        Animation fadeOut = new AlphaAnimation(1, 0);
        fadeOut.setInterpolator(new AccelerateInterpolator()); //add this
        fadeOut.setDuration(duration);
        fadeOut.setStartOffset(startOffset);
        view.startAnimation(fadeOut);
    }

    @SimpleFunction(description = "Stops all of the animation applied to the given component.")
    public void StopAnimations(AndroidViewComponent component) {
    View view = component.getView();
    view.clearAnimation();
    }
}
