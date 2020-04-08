<snippet>
        
        [![](https://jitpack.io/v/mudassar1/SearchableSpinner.svg)](https://jitpack.io/#mudassar1/SearchableSpinner)



# Searchable Spinner

![Demo SearchableSpinner](https://github.com/michaelprimez/searchablespinner/blob/master/searchablespinner.gif) 


## Usage

Add the dependency to your build.gradle.
```xml
implementation 'com.androidtrip.plugins.searchablespinner:SearchableSpinner:1.0.0'
```

Usage on layout
```xml
<com.androidtrip.plugins.searchablespinner.SearchableSpinner
        android:id="@+id/SearchableSpinner"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="24dp"
        android:layout_marginLeft="24dp"
        android:layout_marginRight="24dp"
        android:layout_marginStart="24dp"
        android:layout_marginEnd="24dp"
        android:gravity="center_horizontal"
        app:StartSearchTintColor="@android:color/white"
        app:DoneSearchTintColor="@android:color/holo_purple"
        app:RevealViewBackgroundColor="@android:color/holo_purple"
        app:SearchViewBackgroundColor="@android:color/secondary_text_dark"
        app:ShowBorders="false"
        app:RevealEmptyText="Touch to select"
        app:SpinnerExpandHeight="300dp"/>
```
## Contributing
1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request :D ## History

## History
#### Version 1.0.0
* Thanks to https://github.com/michaelprimez/searchablespinner
* Just removed animations of above mentioned library
* due to this change it can be used in API Level 16 and above.
* Initial Release

# LICENSE 

```
Copyright (C) 2017 Michael Keskinidis

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
</snippet>

