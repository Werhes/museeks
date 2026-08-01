package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16398e {
    public static final C10068e ad = new C10068e(8);

    public static C9689e ad(C8823e c8823e) {
        return AbstractC5750e.purchase(new C11565e(c8823e, "Deferred.asListenableFuture", 6));
    }

    public static void appmetrica(InterfaceC4766e interfaceC4766e) {
        AbstractC2228e abstractC2228e;
        if (billing(interfaceC4766e) || (abstractC2228e = ((AbstractC2228e) interfaceC4766e).f5683e) == null) {
            Trace.beginSection(((AbstractC2228e) interfaceC4766e).f5680e);
            yandex(interfaceC4766e);
        } else {
            appmetrica(abstractC2228e);
            yandex(interfaceC4766e);
        }
    }

    public static boolean billing(InterfaceC4766e interfaceC4766e) {
        return ((AbstractC2228e) interfaceC4766e).f5679e != Thread.currentThread();
    }

    public static InterfaceC12864e license(InterfaceC12864e interfaceC12864e, float f, InterfaceC16154e interfaceC16154e, boolean z, int i) {
        if ((i & 2) != 0) {
            interfaceC16154e = AbstractC10432e.ad;
        }
        InterfaceC16154e interfaceC16154e2 = interfaceC16154e;
        if ((i & 4) != 0) {
            z = C15765e.ad(f, (float) 0) > 0;
        }
        boolean z2 = z;
        long j = AbstractC9944e.ad;
        return (C15765e.ad(f, (float) 0) > 0 || z2) ? interfaceC12864e.premium(new C7151e(f, interfaceC16154e2, z2, j, j)) : interfaceC12864e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void metrica(InterfaceC1908e interfaceC1908e, InterfaceC6334e interfaceC6334e) {
        ((C6467e) interfaceC1908e).mo692else(new C9041e(interfaceC1908e, interfaceC6334e, 5));
    }

    public static void purchase(InterfaceC4766e interfaceC4766e) {
        if (!billing(interfaceC4766e)) {
            AbstractC2228e abstractC2228e = (AbstractC2228e) interfaceC4766e;
            if (abstractC2228e.f5683e != null) {
                Trace.endSection();
                purchase(abstractC2228e.f5683e);
                return;
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public static final void vip(C1059e c1059e, Function1 function1) {
        int billing = AbstractC6874e.billing(c1059e.getFragmentStack()) - 2;
        if (billing < 0) {
            billing = 0;
        }
        int billing2 = AbstractC6874e.billing(c1059e.getFragmentStack());
        if (billing > billing2) {
            return;
        }
        while (true) {
            function1.invoke(c1059e.getFragmentStack().get(billing));
            if (billing == billing2) {
                return;
            } else {
                billing++;
            }
        }
    }

    public static void yandex(InterfaceC4766e interfaceC4766e) {
        String str = ((AbstractC2228e) interfaceC4766e).f5682e;
        AtomicReference atomicReference = AbstractC5076e.ad;
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }
}
