package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؗ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5076e {
    public static final AtomicReference ad;
    public static final C6121e license;
    public static final WeakHashMap metrica;
    public static final C10068e vip;

    static {
        AbstractC12614e.Signature(5, "androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        ad = new AtomicReference(C4477e.f9679e);
        vip = new C10068e(23);
        metrica = new WeakHashMap();
        license = new C6121e(14);
        new ArrayDeque();
        new ArrayDeque();
    }

    public static InterfaceC4766e ad(C17823e c17823e, InterfaceC4766e interfaceC4766e) {
        boolean equals;
        c17823e.getClass();
        InterfaceC4766e interfaceC4766e2 = c17823e.vip;
        if (interfaceC4766e2 != interfaceC4766e) {
            if (interfaceC4766e2 == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    equals = Trace.isEnabled();
                } else {
                    AbstractC11492e.ad.getClass();
                    vip.getClass();
                    String str = "false";
                    try {
                        str = (String) AbstractC12093e.ad.invoke(null, "tiktok_systrace", "false");
                    } catch (Exception e) {
                        Log.e("SystemProperties", "get error", e);
                    }
                    equals = str.equals("true");
                }
                c17823e.ad = equals;
            }
            if (c17823e.ad) {
                if (interfaceC4766e2 != null) {
                    if (interfaceC4766e != null) {
                        if (((AbstractC2228e) interfaceC4766e2).f5683e == interfaceC4766e && !AbstractC16398e.billing(interfaceC4766e2)) {
                            Trace.endSection();
                        } else if (interfaceC4766e2 == ((AbstractC2228e) interfaceC4766e).f5683e && !AbstractC16398e.billing(interfaceC4766e)) {
                            AbstractC16398e.yandex(interfaceC4766e);
                        }
                    }
                    AbstractC16398e.purchase(interfaceC4766e2);
                }
                if (interfaceC4766e != null) {
                    AbstractC16398e.appmetrica(interfaceC4766e);
                }
            }
            if (interfaceC4766e2 != interfaceC4766e) {
                c17823e.vip = interfaceC4766e;
                return interfaceC4766e2;
            }
        }
        return interfaceC4766e;
    }

    public static C17823e vip() {
        return (C17823e) license.get();
    }
}
