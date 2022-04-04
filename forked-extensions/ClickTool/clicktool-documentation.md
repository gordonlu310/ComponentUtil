# ClickTool
An App Inventor non-visible extension that detects clicks and long clicks for visible components that does not have the Click or LongClick events.

NOTE: This extension was originally a part of this repo.

https://github.com/GordonL0049/ClickTool

:date: **Release date:** March 23, 2022 16:00 (Asia/Hong_Kong)

**:package: Package name:** com.gordonlu.clicktool.aix

**:clock4: Version:** 3

**:open_book: Documentation**

***Event blocks***

>
>**GotFocus**
>
>![image](https://user-images.githubusercontent.com/88015331/159605913-25b827db-ebfb-488c-8310-eba956c3021a.png)
>
>This event is fired when a registered component is focused.
>
>*Parameters:* component = component

>
>**LostFocus**
>
>![image](https://user-images.githubusercontent.com/88015331/159605924-40999606-9569-4649-b0ad-21601b7e2387.png)
>
>This event is fired when a registered component has losen focus.
>
>*Parameters:* component = component

>
>**OnClick**
>
>![image](https://user-images.githubusercontent.com/88015331/159605941-d7b3c225-7e51-4dfe-bce6-687dc725b2f3.png)
>
>This event is fired when a registered component is clicked.
>
>*Parameters:* component = component

>
>**OnLongClick**
>
>![image](https://user-images.githubusercontent.com/88015331/159605952-01ead2f7-ffe7-4ed3-b059-0590dd4e8f30.png)
>
>This event is fired when a registered component is long clicked.
>
>*Parameters:* component = component

***Method blocks***

>
>**PerformClick**
>
>![image](https://user-images.githubusercontent.com/88015331/159605964-a8a28453-d8cb-47a3-bd1b-872196853103.png)
>
>Performs a click for the given component.
>
>*Parameters:* component = component

>
>**PerformLongClick**
>
>![image](https://user-images.githubusercontent.com/88015331/159605969-56cb18d3-72b0-4549-ac21-8ed247e511cd.png)
>
>Performs a long click for the given component.
>
>*Parameters:* component = component

>
>**RegisterClick**
>
>![image](https://user-images.githubusercontent.com/88015331/159605978-3187bcb6-6b67-4980-a093-4da27537deec.png)
>
>Registers the component so that when the user clicks the component, it will fire the OnClick event.
>
>*Parameters:* component = component

>
>**RegisterFocus**
>
>![image](https://user-images.githubusercontent.com/88015331/159605993-e7035a43-75c0-44ca-a269-f32473072ac2.png)
>
>Registers the component so that when the user focuses or removes focus for the component, it will fire the respective event.
>
>*Parameters:* component = component

>
>**RegisterLongClick**
>
>![image](https://user-images.githubusercontent.com/88015331/159606008-9d7205bc-6d56-45a0-ac9b-acf13634a1d7.png)
>
>Registers the component so that when the user clicks the component, it will fire the OnLongClick event.
>
>*Parameters:* component = component

>
>**UnregisterClick**
>
>![image](https://user-images.githubusercontent.com/88015331/159606017-cdc168e5-5688-4442-bee0-115ac0790ffc.png)
>
>Unregisters the component so that when it is clicked, the extension will not fire the OnClick event.
>
>*Parameters:* component = component

>
>**UnregisterFocus**
>
>![image](https://user-images.githubusercontent.com/88015331/159606032-5d273f1f-07e9-4060-b60e-960f62879c9e.png)
>
>Unregisters the component so that when the user has focused or removed focus this component, it will not fire the respective event.
>
>*Parameters:* component = component

>
>**UnregisterLongClick**
>
>![image](https://user-images.githubusercontent.com/88015331/159606042-a377392a-0da5-4016-8dd3-18ccbfc72da4.png)
>
>Unregisters the component so that when it is clicked, the extension will not fire the OnLongClick event.
>
>*Parameters:* component = component
