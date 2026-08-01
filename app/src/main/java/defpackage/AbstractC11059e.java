package defpackage;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.drawable.Icon;
import android.widget.RemoteViews;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُّ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11059e {
    public static final void Signature(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setIntDimen(i, str, i2);
    }

    public static final void ad(RemoteViews remoteViews, int i, String str, BlendMode blendMode) {
        remoteViews.setBlendMode(i, str, blendMode);
    }

    public static final void adcel(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setColorStateListAttr(i, str, i2);
    }

    public static final void admob(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setIntDimenAttr(i, str, i2);
    }

    public static final void advert(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setFloatDimen(i, str, i2);
    }

    public static final void amazon(RemoteViews remoteViews, int i, String str, Icon icon, Icon icon2) {
        remoteViews.setIcon(i, str, icon, icon2);
    }

    public static final void appmetrica(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setColorAttr(i, str, i2);
    }

    public static final void billing(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setColorStateList(i, str, i2);
    }

    public static final void license(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setColor(i, str, i2);
    }

    public static final void loadAd(RemoteViews remoteViews, int i, String str, float f, int i2) {
        remoteViews.setIntDimen(i, str, f, i2);
    }

    public static final void metrica(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setCharSequenceAttr(i, str, i2);
    }

    public static final void mopub(RemoteViews remoteViews, int i, String str, float f, int i2) {
        remoteViews.setFloatDimen(i, str, f, i2);
    }

    public static final void purchase(RemoteViews remoteViews, int i, String str, int i2, int i3) {
        remoteViews.setColorInt(i, str, i2, i3);
    }

    public static final void smaato(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setFloatDimenAttr(i, str, i2);
    }

    public static final void startapp(RemoteViews remoteViews, int i, String str, ColorStateList colorStateList, ColorStateList colorStateList2) {
        remoteViews.setColorStateList(i, str, colorStateList, colorStateList2);
    }

    public static final void vip(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setCharSequence(i, str, i2);
    }

    public static final void yandex(RemoteViews remoteViews, int i, String str, ColorStateList colorStateList) {
        remoteViews.setColorStateList(i, str, colorStateList);
    }
}
