package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؑٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0150e implements InterfaceC3249e, InterfaceC14746e, InterfaceC13824e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C9231e f1380e;

    public /* synthetic */ C0150e(C9231e c9231e) {
        this.f1380e = c9231e;
    }

    @Override // defpackage.InterfaceC14746e
    public void crashlytics(Bundle bundle) {
        ((InterfaceC14746e) this.f1380e.vip).crashlytics(bundle);
    }

    @Override // defpackage.InterfaceC3249e
    public void license(C5985e c5985e) {
        C9231e c9231e = this.f1380e;
        synchronized (c9231e) {
            try {
                if (((InterfaceC3249e) c9231e.metrica) instanceof C12628e) {
                    ((ArrayList) c9231e.ad).add(c5985e);
                }
                ((InterfaceC3249e) c9231e.metrica).license(c5985e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [eٍؚؒ, java.lang.Object] */
    @Override // defpackage.InterfaceC13824e
    public void yandex(InterfaceC7970e interfaceC7970e) {
        C9231e c9231e = this.f1380e;
        C5438e c5438e = C5438e.f11671e;
        c5438e.subscription("AnalyticsConnector now available.");
        InterfaceC5632e interfaceC5632e = (InterfaceC5632e) interfaceC7970e.get();
        C0444e c0444e = new C0444e(interfaceC5632e);
        C16911e c16911e = new C16911e(14, false);
        C8638e c8638e = (C8638e) interfaceC5632e;
        C15802e vip = c8638e.vip("clx", c16911e);
        if (vip == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            vip = c8638e.vip("crash", c16911e);
            if (vip != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
        }
        if (vip == null) {
            c5438e.isVip("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        c5438e.subscription("Registered Firebase Analytics listener.");
        C15816e c15816e = new C15816e(4, false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        ?? obj = new Object();
        obj.f3322e = new Object();
        obj.f3323e = c0444e;
        synchronized (c9231e) {
            try {
                Iterator it = ((ArrayList) c9231e.ad).iterator();
                while (it.hasNext()) {
                    c15816e.license((C5985e) it.next());
                }
                c16911e.f33136e = c15816e;
                c16911e.f33137e = obj;
                c9231e.metrica = c15816e;
                c9231e.vip = obj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
