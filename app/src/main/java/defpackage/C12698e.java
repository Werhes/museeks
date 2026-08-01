package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Rect;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۘٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12698e {
    public final Object ad;

    public void ad() {
        ((AutofillManager) this.ad).commit();
    }

    public AutofillId adcel() {
        return C4403e.license(this.ad);
    }

    public void appmetrica(ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e, int i, AutofillValue autofillValue) {
        ((AutofillManager) this.ad).notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC5014e, i, autofillValue);
    }

    public void billing(ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e, int i) {
        ((AutofillManager) this.ad).notifyViewExited(viewTreeObserverOnGlobalLayoutListenerC5014e, i);
    }

    public boolean license() {
        String nameForUid;
        Context context = (Context) this.ad;
        if (Binder.getCallingUid() == Process.myUid()) {
            return AbstractC11815e.m3247class(context);
        }
        if (!AbstractC11765e.metrica() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }

    public PackageInfo metrica(int i, String str) {
        return ((Context) this.ad).getPackageManager().getPackageInfo(str, i);
    }

    public void purchase(ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e, int i, Rect rect) {
        ((AutofillManager) this.ad).notifyViewEntered(viewTreeObserverOnGlobalLayoutListenerC5014e, i, rect);
    }

    public void startapp(ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e, int i, Rect rect) {
        ((AutofillManager) this.ad).requestAutofill(viewTreeObserverOnGlobalLayoutListenerC5014e, i, rect);
    }

    public ApplicationInfo vip(int i, String str) {
        return ((Context) this.ad).getPackageManager().getApplicationInfo(str, i);
    }

    public void yandex(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            AbstractC3557e.ad(view, (AutofillManager) this.ad, i, z);
        }
    }
}
