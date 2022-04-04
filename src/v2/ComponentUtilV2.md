package com.gordonlu.componentutil;

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

import android.view.Gravity;
import android.animation.ObjectAnimator;
import android.view.animation.BounceInterpolator;

import android.view.animation.Animation;
import android.view.animation.AlphaAnimation;

import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import java.lang.Object;
import android.view.animation.AnimationSet;

import android.widget.TextView;
import android.view.View;

import androidx.annotation.RequiresApi;
import android.view.View.OnScrollChangeListener;

import android.view.View.OnTouchListener;
import android.view.MotionEvent;

@DesignerComponent(
        version = 2,
        description = "A non-visible extension that provides additional tools to visible components, such as Label.",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,
        iconName = "https://docs.google.com/drawings/d/e/2PACX-1vQCI87PHLBF0jb8QWyYmIRQSjjNW3EFXf-qpsWCvBYkUQ9vEgPAB8SpxcMpblxNpbIYrjCjLrRLIU2c/pub?w=16&h=16")

@SimpleObject(external = true)
//Libraries
@UsesLibraries(libraries = "")
//Permissions
@UsesPermissions(permissionNames = "")

public class ComponentUtil extends AndroidNonvisibleComponent {

    //Activity and Context
    private Context context;
    private Activity activity;

    public ComponentUtil(ComponentContainer container){
        super(container.$form());
        this.activity = container.$context();
        this.context = container.$context();
    }

    @SimpleFunction(description = "Returns the opacity of the component.")
    public float GetOpacity(AndroidViewComponent component) {
        View view = component.getView();
        return view.getAlpha();
    }

    @SimpleFunction(description = "Return the offset of the component's text baseline from the widget's top boundary. If this component does not support baseline alignment, this method returns -1.")
    public int GetBaseline(AndroidViewComponent component) {
        View view = component.getView();
        return view.getBaseline();
    }

    @SimpleFunction(description = "Returns the bottom of this component, in pixels.")
    public int GetBottom(AndroidViewComponent component) {
        View view = component.getView();
        return view.getBottom();
    }

    @SimpleFunction(description = "Returns the component's content description.")
    public String GetContentDescription(AndroidViewComponent component) {
        View view = component.getView();
        if (view.getContentDescription() == null) {
            return "";
        } else {
            return view.getContentDescription().toString();
        }
    }

    @SimpleFunction(description = "Returns the base depth position, or elevation, of the component, in pixels.")
    public float GetElevation(AndroidViewComponent component) {
        View view = component.getView();
        return view.getElevation();
    }

    @SimpleFunction(description = "Returns the left edge of this component, in pixels.")
    public int GetLeft(AndroidViewComponent component) {
        View view = component.getView();
        return view.getLeft();
    }

    @SimpleFunction(description = "Returns the right edge of this component, in pixels.")
    public int GetRight(AndroidViewComponent component) {
        View view = component.getView();
        return view.getRight();
    }

    @SimpleFunction(description = "Returns the top edge of this component, in pixels.")
    public int GetTop(AndroidViewComponent component) {
        View view = component.getView();
        return view.getTop();
    }

    @SimpleFunction(description = "Checks whether the component can be scrolled horizontally in a right direction.")
    public boolean CanScrollRight(AndroidViewComponent component) {
        View view = component.getView();
        return view.canScrollHorizontally(1);
    }

    @SimpleFunction(description = "Checks whether the component can be scrolled horizontally in a left direction.")
    public boolean CanScrollLeft(AndroidViewComponent component) {
        View view = component.getView();
        return view.canScrollHorizontally(-1);
    }

    @SimpleFunction(description = "Checks whether the component can be scrolled vertically in a up direction.")
    public boolean CanScrollUp(AndroidViewComponent component) {
        View view = component.getView();
        return view.canScrollVertically(-1);
    }

    @SimpleFunction(description = "Checks whether the component can be scrolled vertically in a down direction.")
    public boolean CanScrollDown(AndroidViewComponent component) {
        View view = component.getView();
        return view.canScrollVertically(1);
    }

    @SimpleFunction(description = "Returns the bottom padding of this component in pixels." + 
    " If there are inset and enabled scrollbars, this value may include the space required to display the scrollbars as well.")
    public int GetPaddingBottom(AndroidViewComponent component) {
        View view = component.getView();
        return view.getPaddingBottom();
    }

    @SimpleFunction(description = "Returns the end padding of this component in pixels." + 
    " If there are inset and enabled scrollbars, this value may include the space required to display the scrollbars as well.")
    public int GetPaddingEnd(AndroidViewComponent component) {
        View view = component.getView();
        return view.getPaddingEnd();
    }

    @SimpleFunction(description = "Returns the left padding of this component in pixels." + 
    " If there are inset and enabled scrollbars, this value may include the space required to display the scrollbars as well.")
    public int GetPaddingLeft(AndroidViewComponent component) {
        View view = component.getView();
        return view.getPaddingLeft();
    }

    @SimpleFunction(description = "Returns the right padding of this component in pixels." + 
    " If there are inset and enabled scrollbars, this value may include the space required to display the scrollbars as well.")
    public int GetPaddingRight(AndroidViewComponent component) {
        View view = component.getView();
        return view.getPaddingRight();
    }

    @SimpleFunction(description = "Returns the start padding of this component in pixels." + 
    " If there are inset and enabled scrollbars, this value may include the space required to display the scrollbars as well.")
    public int GetPaddingStart(AndroidViewComponent component) {
        View view = component.getView();
        return view.getPaddingStart();
    }

    @SimpleFunction(description = "Returns the top padding of this component in pixels." + 
    " If there are inset and enabled scrollbars, this value may include the space required to display the scrollbars as well.")
    public int GetPaddingTop(AndroidViewComponent component) {
        View view = component.getView();
        return view.getPaddingTop();
    }

    @SimpleFunction(description = "Returns the y location of the point around which the component is rotated and scaled.")
    public float GetPivotY(AndroidViewComponent component) {
        View view = component.getView();
        return view.getPivotY();
    }

    @SimpleFunction(description = "Returns the x location of the point around which the component is rotated and scaled.")
    public float GetPivotX(AndroidViewComponent component) {
        View view = component.getView();
        return view.getPivotX();
    }

    @SimpleFunction(description = "Returns the degrees that the component is rotated around the pivot point.")
    public float GetRotation(AndroidViewComponent component) {
        View view = component.getView();
        return view.getRotation();
    }

    @SimpleFunction(description = "Returns the degrees that the component is rotated around the horizontal axis through the pivot point.")
    public float GetRotationX(AndroidViewComponent component) {
        View view = component.getView();
        return view.getRotationX();
    }

    @SimpleFunction(description = "Returns the degrees that the component is rotated around the vertical axis through the pivot point.")
    public float GetRotationY(AndroidViewComponent component) {
        View view = component.getView();
        return view.getRotationY();
    }

    @SimpleFunction(description = "Returns the amount that the component is scaled in x around the pivot point, as a proportion of the view's unscaled width.")
    public float GetScaleX(AndroidViewComponent component) {
        View view = component.getView();
        return view.getScaleX();
    }

    @SimpleFunction(description = "Returns the amount that the component is scaled in y around the pivot point, as a proportion of the view's unscaled height.")
    public float GetScaleY(AndroidViewComponent component) {
        View view = component.getView();
        return view.getScaleY();
    }

    @SimpleFunction(description = "Returns the scrollbar size for this component.")
    public int GetScrollBarSize(AndroidViewComponent component) {
        View view = component.getView();
        return view.getScrollBarSize();
    }

    @SimpleFunction(description = "Return the scrolled left position of this component. This is the left edge of the displayed part of your component." + 
    " You do not need to draw any pixels farther left, since those are outside of the frame of your component on screen.")
    public int GetScrollX(AndroidViewComponent component) {
        View view = component.getView();
        return view.getScrollX();
    }

    @SimpleFunction(description = "Return the scrolled top position of this component. This is the top edge of the displayed part of your component." + 
    " You do not need to draw any pixels farther top, since those are outside of the frame of your component on screen.")
    public int GetScrollY(AndroidViewComponent component) {
        View view = component.getView();
        return view.getScrollY();
    }

    @SimpleFunction(description = "Returns the horizontal location of this component relative to its left position." + 
    " This position is post-layout, in addition to wherever the object's layout placed it.")
    public float GetTranslationX(AndroidViewComponent component) {
        View view = component.getView();
        return view.getTranslationX();
    }

    @SimpleFunction(description = "Returns the horizontal location of this component relative to its top position." + 
    " This position is post-layout, in addition to wherever the object's layout placed it.")
    public float GetTranslationY(AndroidViewComponent component) {
        View view = component.getView();
        return view.getTranslationY();
    }

    @SimpleFunction(description = "Returns the depth location of this component relative to its elevation.")
    public float GetTranslationZ(AndroidViewComponent component) {
        View view = component.getView();
        return view.getTranslationZ();
    }

    @SimpleFunction(description = "Returns the visual x position of this component, in pixels. This is equivalent to the TranslationX property plus the current left property.")
    public float GetX(AndroidViewComponent component) {
        View view = component.getView();
        return view.getX();
    }

    @SimpleFunction(description = "Returns the visual y position of this component, in pixels. This is equivalent to the TranslationY property plus the current top property.")
    public float GetY(AndroidViewComponent component) {
        View view = component.getView();
        return view.getY();
    }

    @SimpleFunction(description = "Returns the visual z position of this component, in pixels. This is equivalent to the TranslationZ property plus the current elevation property.")
    public float GetZ(AndroidViewComponent component) {
        View view = component.getView();
        return view.getZ();
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

    @SimpleFunction(description = "Unregisters the component so that when the user has scrolled this component, it will not fire the OnScrollChange event.")
    public void UnregisterScroll(AndroidViewComponent component) {
        View view = component.getView();
        view.setOnScrollChangeListener(null);
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

    @SimpleFunction(description = "Indicates the activation state of this component.")
    public boolean IsActivated(AndroidViewComponent component) {
        View view = component.getView();
        return view.isActivated();
    }

    @SimpleFunction(description = "Changes the activated state of this component.")
    public void SetActivated(AndroidViewComponent component, boolean activate) {
        View view = component.getView();
        view.setActivated(activate);
    }

    @SimpleFunction(description = "Sets the opacity of this component.")
    public void SetOpacity(AndroidViewComponent component, float opacity) {
        View view = component.getView();
        view.setAlpha(opacity);
    }

    @SimpleFunction(description = "Sets the bottom position of this component relative to its parent, in pixels.")
    public void SetBottom(AndroidViewComponent component, int bottom) {
        View view = component.getView();
        view.setBottom(bottom);
    }

    @SimpleFunction(description = "Sets the left position of this component relative to its parent, in pixels.")
    public void SetLeft(AndroidViewComponent component, int left) {
        View view = component.getView();
        view.setLeft(left);
    }

    @SimpleFunction(description = "Sets the right position of this component relative to its parent, in pixels.")
    public void SetRight(AndroidViewComponent component, int right) {
        View view = component.getView();
        view.setRight(right);
    }

    @SimpleFunction(description = "Sets the top position of this component relative to its parent, in pixels.")
    public void SetTop(AndroidViewComponent component, int top) {
        View view = component.getView();
        view.setTop(top);
    }

    @SimpleFunction(description = "Sets the padding of the given component.")
    public void SetPadding(AndroidViewComponent component, int left, int top, int right, int bottom) {
        View view = component.getView();
        view.setPadding(left, top, right, bottom);
    }

    @SimpleFunction(description = "Sets the component's content description. A content description briefly " + 
    "describes the component and is primarily used for accessibility support to determine how a component should be presented to the user.")
    public void SetContentDescription (AndroidViewComponent component, String description) {
        View view = component.getView();
        view.setContentDescription(description);
    }

    @SimpleFunction(description = "Removes the component's content description.")
    public void RemoveContentDescription(AndroidViewComponent component) {
        SetContentDescription(component, null);
    }

    @SimpleFunction(description = "Sets the elevation for the given component.")
    public void SetElevation(AndroidViewComponent component, float elevation) {
        View view = component.getView();
        view.setElevation(elevation);
    }

    @SimpleFunction(description = "Sets the x location of the point around which the component is rotated and scaled. By default, the pivot point is centered on the object.")
    public void SetPivotX(AndroidViewComponent component, float pivotX) {
        View view = component.getView();
        view.setPivotX(pivotX);
    }

    @SimpleFunction(description = "Sets the y location of the point around which the component is rotated and scaled. By default, the pivot point is centered on the object.")
    public void SetPivotY(AndroidViewComponent component, float pivotY) {
        View view = component.getView();
        view.setPivotY(pivotY);
    }

    @SimpleFunction(description = "Sets the degrees that the component is rotated around the horizontal axis through the pivot point.")
    public void SetRotationX(AndroidViewComponent component, float rotationX) {
        View view = component.getView();
        view.setRotationX(rotationX);
    }

    @SimpleFunction(description = "Sets the degrees that the component is rotated around the vertical axis through the pivot point.")
    public void SetRotationY(AndroidViewComponent component, float rotationY) {
        View view = component.getView();
        view.setRotationY(rotationY);
    }

    @SimpleFunction(description = "Rotates the given component.")
    public void Rotate(AndroidViewComponent component, float degree) {
        View view = component.getView();
        view.setRotation(degree);
    }

    @SimpleFunction(description = "Sets the size of the scrollbar.")
    public void SetScrollBarSize(AndroidViewComponent component, int size) {
        View view = component.getView();
        view.setScrollBarSize(size);
    }

    @SimpleFunction(description = "Sets the horizontal location of this component relative to its left position.")
    public void SetTranslationX(AndroidViewComponent component, float translationX) {
        View view = component.getView();
        view.setTranslationX(translationX);
    }

    @SimpleFunction(description = "Sets the vertical location of this component relative to its top position.")
    public void SetTranslationY(AndroidViewComponent component, float translationY) {
        View view = component.getView();
        view.setTranslationY(translationY);
    }

    @SimpleFunction(description = "Sets the depth location of this component relative to its elevation.")
    public void SetTranslationZ(AndroidViewComponent component, float translationZ) {
        View view = component.getView();
        view.setTranslationZ(translationZ);
    }

    @SimpleFunction(description = "Sets the visual x position of this component, in pixels." + 
    " This is equivalent to setting the TranslationX property to be the difference between the x value passed in and the current left property.")
    public void SetX(AndroidViewComponent component, float x) {
        View view = component.getView();
        view.setX(x);
    }

    @SimpleFunction(description = "Sets the visual y position of this component, in pixels." + 
    " This is equivalent to setting the TranslationY property to be the difference between the y value passed in and the current top property.")
    public void SetY(AndroidViewComponent component, float y) {
        View view = component.getView();
        view.setY(y);
    }

    @SimpleFunction(description = "Sets the visual z position of this component, in pixels." + 
    " This is equivalent to setting the TranslationZ property to be the difference between the z value passed in and the current elevation property.")
    public void SetZ(AndroidViewComponent component, float z) {
        View view = component.getView();
        view.setZ(z);
    }

    @SimpleFunction(description = "Bounces the given component with the given duration and repeat counts.")
    public void Bounce(AndroidViewComponent component, long duration, int repeatCount) {
        View view = component.getView();
        ObjectAnimator animY = ObjectAnimator.ofFloat(view, "translationY", -100f, 0f);
        animY.setDuration(duration);
        animY.setInterpolator(new BounceInterpolator());
        animY.setRepeatCount(repeatCount);
        animY.start();
    }

    @SimpleFunction(description = "Clears the animation for the given component.")
    public void StopAnimation(AndroidViewComponent component) {
        View view = component.getView();
        view.clearAnimation();
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
        fadeOut.setInterpolator(new AccelerateInterpolator()); //and this
        fadeOut.setStartOffset(startOffset);
        fadeOut.setDuration(duration);
        view.startAnimation(fadeOut);
    }

    @SimpleFunction(description = "Shows the context menu for this component and fires the OnContextMenuFinish event for whether it is successful.")
    public void ShowContextMenu (AndroidViewComponent component) {
        View view = component.getView();
        boolean test = view.showContextMenu();
        OnContextMenuFinish(false, test);
    }

    @RequiresApi(api = 24)
    @SimpleFunction(description = "Shows the advanced context menu for this component and fires the OnContextMenuFinish event for whether it is successful." + 
    " What's different from ShowContextMenu is that you can specify the x and y position of the context menu. This function will require devices with Android" + 
    " versions larger or 7.0.")
    public void ShowAdvancedContextMenu (AndroidViewComponent component, float x, float y) {
        View view = component.getView();
        boolean test = view.showContextMenu(x, y);
        OnContextMenuFinish(true, test);
    }

    @SimpleEvent(description = "This event is fired when the action is completed. The isAdvanced parameter identifies whether the action is"
    + " showing an advanced context menu, and the successful parameter is whether the action is successfully completed.")
    public void OnContextMenuFinish(boolean isAdvanced, boolean successful) {
        EventDispatcher.dispatchEvent(this, "OnContextMenuFinish", isAdvanced, successful);
    }

    @SimpleFunction(description = "Registers the component so that when the user scrolls the component, it will fire the OnScroll event.")
    public void RegisterScroll(final AndroidViewComponent component) {
        View view = component.getView();
        view.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View v, int scrollX, int scrollY,  int oldScrollX, int oldScrollY) {
                OnScrollChange(component, oldScrollX, oldScrollY, scrollX, scrollY);
            }
        });
    }
    @SimpleEvent(description = "This event is fired when the user has scrolled the component. This probably only works with scrollable arrangements.")
    public void OnScrollChange(AndroidViewComponent component, int prevX, int prevY, int currentX, int currentY) {
        EventDispatcher.dispatchEvent(this, "OnScrollChange", component, prevX, prevY, currentX, currentY);
    }

    @SimpleEvent(description = "This event is fired when the user has touched a registered component")
    public void OnTouch(AndroidViewComponent component) {
        EventDispatcher.dispatchEvent(this, "OnTouch", component);
    }

    @SimpleFunction(description = "Registers the component so that when it is touched, the extension will fire the OnTouch event.")
    public void RegisterTouch(final AndroidViewComponent component) {
        View view = component.getView();
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch (View v, MotionEvent event) {
                OnTouch(component);
                return false;
            }
        });
    }

    @SimpleFunction(description = "Unregisters the component so that when it is touched, the extension will not fire the OnTouch event.")
    public void UnregisterTouch(AndroidViewComponent component) {
        View view = component.getView();
        view.setOnTouchListener(null);
    }
}
