<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/grey200"
    tools:context=".Update.items.delivery.Wilayah">

    <RelativeLayout
        android:id="@+id/header"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:layout_alignParentTop="true"
        android:background="@color/purpleRACE">

        <ImageView
            android:id="@+id/side_menu"
            android:layout_width="100dp"
            android:layout_height="60dp"
            android:layout_centerVertical="true"
            android:layout_marginLeft="1dp"
            android:paddingLeft="10dp"
            android:paddingTop="10dp"
            android:paddingRight="10dp"
            android:paddingBottom="10dp"
            android:src="@drawable/ic_menu_button" />

        <ImageView
            android:layout_width="200dp"
            android:layout_height="40dp"
            android:layout_centerInParent="true"
            android:layout_centerHorizontal="true"
            android:src="@drawable/logo_race_00_warna1" />

        <ImageView
            android:id="@+id/contact"
            android:layout_width="100dp"
            android:layout_height="50dp"
            android:layout_alignBottom="@+id/side_menu"
            android:layout_alignParentRight="true"
            android:paddingTop="10dp"
            android:paddingBottom="10dp"
            android:src="@drawable/ic_cs_white" />
    </RelativeLayout>


    <ScrollView

        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_above="@+id/cvConfirm"
        android:layout_below="@+id/header"
        android:layout_marginBottom="10dp"
        android:background="@color/grey200">


        <LinearLayout
            android:id="@+id/llWilayah"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orie