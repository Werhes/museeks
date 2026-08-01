package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۛۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17264e {
    public static C17264e metrica;
    public static final PorterDuff.Mode vip = PorterDuff.Mode.SRC_IN;
    public C17694e ad;

    public static synchronized C17264e ad() {
        C17264e c17264e;
        synchronized (C17264e.class) {
            try {
                if (metrica == null) {
                    license();
                }
                c17264e = metrica;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c17264e;
    }

    public static void appmetrica(Drawable drawable, C0142e c0142e, int[] iArr) {
        PorterDuff.Mode mode = C17694e.yandex;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = c0142e.f1374e;
        if (z || c0142e.f1376e) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z ? (ColorStateList) c0142e.f1373e : null;
            PorterDuff.Mode mode2 = c0142e.f1376e ? (PorterDuff.Mode) c0142e.f1375e : C17694e.yandex;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilter = C17694e.yandex(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [eٗۛۛ, java.lang.Object] */
    public static synchronized void license() {
        synchronized (C17264e.class) {
            if (metrica == null) {
                ?? obj = new Object();
                metrica = obj;
                obj.ad = C17694e.license();
                metrica.ad.smaato(new C2532e(3));
            }
        }
    }

    public static synchronized PorterDuffColorFilter metrica(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter yandex;
        synchronized (C17264e.class) {
            yandex = C17694e.yandex(i, mode);
        }
        return yandex;
    }

    public final synchronized Drawable vip(Context context, int i) {
        return this.ad.purchase(context, i);
    }
}
