package defpackage;

import android.os.Build;
import android.widget.RemoteViews;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؗۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4693e {
    public static void ad(RemoteViews remoteViews, int i, AbstractC7107e abstractC7107e) {
        if (Build.VERSION.SDK_INT < 31) {
            throw new IllegalArgumentException("setClipToOutline is only available on SDK 31 and higher".toString());
        }
        remoteViews.setBoolean(i, "setClipToOutline", true);
        if (abstractC7107e instanceof C7191e) {
            remoteViews.setViewOutlinePreferredRadius(i, ((C7191e) abstractC7107e).ad, 1);
        } else if (abstractC7107e instanceof C17740e) {
            remoteViews.setViewOutlinePreferredRadiusDimen(i, ((C17740e) abstractC7107e).ad);
        } else {
            throw new IllegalStateException(("Rounded corners should not be " + abstractC7107e.getClass().getCanonicalName()).toString());
        }
    }

    public static void metrica(RemoteViews remoteViews, int i, AbstractC7107e abstractC7107e) {
        if (abstractC7107e instanceof C9133e) {
            remoteViews.setViewLayoutWidth(i, -2.0f, 0);
        } else if (abstractC7107e instanceof C9361e) {
            remoteViews.setViewLayoutWidth(i, 0.0f, 0);
        } else if (abstractC7107e instanceof C7191e) {
            remoteViews.setViewLayoutWidth(i, ((C7191e) abstractC7107e).ad, 1);
        } else if (abstractC7107e instanceof C17740e) {
            remoteViews.setViewLayoutWidthDimen(i, ((C17740e) abstractC7107e).ad);
        } else {
            if (!abstractC7107e.equals(C6705e.ad)) {
                throw new C14803e(10);
            }
            remoteViews.setViewLayoutWidth(i, -1.0f, 0);
        }
        Unit unit = Unit.INSTANCE;
    }

    public static void vip(RemoteViews remoteViews, int i, AbstractC7107e abstractC7107e) {
        if (abstractC7107e instanceof C9133e) {
            remoteViews.setViewLayoutHeight(i, -2.0f, 0);
        } else if (abstractC7107e instanceof C9361e) {
            remoteViews.setViewLayoutHeight(i, 0.0f, 0);
        } else if (abstractC7107e instanceof C7191e) {
            remoteViews.setViewLayoutHeight(i, ((C7191e) abstractC7107e).ad, 1);
        } else if (abstractC7107e instanceof C17740e) {
            remoteViews.setViewLayoutHeightDimen(i, ((C17740e) abstractC7107e).ad);
        } else {
            if (!abstractC7107e.equals(C6705e.ad)) {
                throw new C14803e(10);
            }
            remoteViews.setViewLayoutHeight(i, -1.0f, 0);
        }
        Unit unit = Unit.INSTANCE;
    }
}
