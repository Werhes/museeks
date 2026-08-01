package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ٘ٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11802e {
    public final InterfaceC10500e ad;
    public final Object vip = new Object();
    public final ArrayList metrica = new ArrayList();
    public final Object license = new Object();
    public final ArrayList appmetrica = new ArrayList();
    public final Object purchase = new Object();
    public final ArrayList billing = new ArrayList();

    public C11802e(InterfaceC10500e interfaceC10500e) {
        this.ad = interfaceC10500e;
    }

    public final boolean ad(Runnable runnable) {
        boolean add;
        synchronized (this.vip) {
            add = this.metrica.add(runnable);
        }
        return add;
    }

    public final void appmetrica() {
        synchronized (this.license) {
            try {
                Log.d("CXCP", "Shutting down scopes...");
                Iterator it = this.appmetrica.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void license() {
        synchronized (this.vip) {
            try {
                Log.d("CXCP", "Shutting down cameras...");
                Iterator it = this.metrica.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        appmetrica();
        purchase();
    }

    public final void metrica(int i, Runnable runnable) {
        boolean ad;
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            ad = ad(runnable);
        } else if (m2467class == 1) {
            ad = vip(runnable);
        } else {
            if (m2467class != 2) {
                throw new C14803e(10);
            }
            synchronized (this.purchase) {
                ad = this.billing.add(runnable);
            }
        }
        if (ad) {
            return;
        }
        StringBuilder sb = new StringBuilder("CameraPipeLifetime already shut down. This is unexpected. Executing ");
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "THREAD" : "SCOPE" : "CAMERA");
        sb.append(" shutdown action immediately...");
        Log.e("CXCP", sb.toString());
        runnable.run();
    }

    public final void purchase() {
        synchronized (this.purchase) {
            try {
                Log.d("CXCP", "Shutting down threads...");
                Iterator it = this.billing.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean vip(Runnable runnable) {
        boolean add;
        synchronized (this.license) {
            add = this.appmetrica.add(runnable);
        }
        return add;
    }
}
