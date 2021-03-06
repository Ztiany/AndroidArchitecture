# Android App Architecture Template

## 1 download

```shell
# base
# project
git clone git@github.com:Ztiany/AndroidArchitecture.git
cd AndroidArchitecture

git submodule init
git submodule update
```

make sure the projects in the same directory.

## 2 explanation

[common modules](libraries): 

- lib_foundation: DelegateFragment, DelegateActivity.
- lib_base: common util classes and base classes, including BaseActivity, BaseFragment, BaseStateFragment, BaseListFragment, BaseAdapter, MVVM, MVP, MultiStateView, Dagger2, AAC, RxJava2, Kotlin, etc.
- lib_media_selector: gets photos or videos from system.
- lib_qrcode: library for scanning and generating qrcode.
- lib_network: RxJava + Retrofit + OkHttp.
- lib_cache:  DiskLruCache + MMKV.
- lib_upgrade: A library for checking app upgrade.

business modules: 

- app: assemble all of the business module.
- module_base: assemble all the libs.
- module_account: business module for login/register.
- module_home: business module.

## 3 feature planing

1. Network requesting
2. Data Storing
3. File Operation【Scoped Storage】
4. MVVM Templeton
5. Dialogs
6. MultiState Page
7. List Page
8. Components Communicating