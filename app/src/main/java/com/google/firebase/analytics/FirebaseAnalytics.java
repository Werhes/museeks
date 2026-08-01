package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import defpackage.AbstractC1749e;
import defpackage.AbstractC9528e;
import defpackage.C12809e;
import defpackage.C14679e;
import defpackage.C14935e;
import defpackage.C17768e;
import defpackage.C2717e;
import defpackage.C4360e;
import defpackage.InterfaceC10173e;
import defpackage.InterfaceC4648e;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics vip;
    public final C17768e ad;

    public FirebaseAnalytics(C17768e c17768e) {
        AbstractC9528e.startapp(c17768e);
        this.ad = c17768e;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (vip == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (vip == null) {
                        vip = new FirebaseAnalytics(C17768e.metrica(context, null));
                    }
                } finally {
                }
            }
        }
        return vip;
    }

    @Keep
    public static InterfaceC10173e getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C17768e metrica = C17768e.metrica(context, bundle);
        if (metrica == null) {
            return null;
        }
        return new C12809e(metrica);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = C14935e.smaato;
            return (String) AbstractC1749e.vip(((C14935e) C14679e.metrica().vip(InterfaceC4648e.class)).license(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        C4360e billing = C4360e.billing(activity);
        C17768e c17768e = this.ad;
        c17768e.getClass();
        c17768e.ad(new C2717e(c17768e, billing, str, str2));
    }
}
