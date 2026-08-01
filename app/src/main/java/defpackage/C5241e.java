package defpackage;

import android.os.Looper;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؗۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5241e {
    public EnumC13278e appmetrica;
    public boolean billing;
    public C12701e license;
    public C12040e purchase;
    public final LinkedHashMap yandex;
    public final Object ad = new Object();
    public final C18478e vip = new C18478e(22);
    public final C1326e metrica = new AbstractC9790e();

    /* JADX WARN: Type inference failed for: r0v2, types: [eٍ۟ۤ, eؒۛ٘] */
    public C5241e() {
        EnumC13278e enumC13278e = EnumC13278e.f26334e;
        this.appmetrica = enumC13278e;
        this.yandex = new LinkedHashMap();
        metrica(enumC13278e, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ad(defpackage.C12701e r12, defpackage.AbstractC17233e r13) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5241e.ad(eّۘۗ, eٗۙٔ):void");
    }

    public final void metrica(EnumC13278e enumC13278e, C12040e c12040e) {
        List<Map.Entry> m3575continue;
        ((C1326e) this.vip.f36228e).adcel(new C0214e(enumC13278e));
        int ordinal = enumC13278e.ordinal();
        int i = 5;
        if (ordinal != 2) {
            if (ordinal == 3) {
                i = 1;
            } else if (ordinal == 4) {
                i = 4;
            } else if (ordinal == 5) {
                i = 2;
            } else {
                if (ordinal != 6) {
                    throw new IllegalArgumentException("Unexpected CameraInternal state: " + enumC13278e);
                }
                i = 3;
            }
        }
        C0088e c0088e = new C0088e(i, c12040e);
        C1326e c1326e = this.metrica;
        if (AbstractC7890e.billing(Looper.myLooper(), Looper.getMainLooper())) {
            c1326e.startapp(c0088e);
        } else {
            c1326e.adcel(c0088e);
        }
        synchronized (this.ad) {
            m3575continue = AbstractC13480e.m3575continue(this.yandex.entrySet());
        }
        for (Map.Entry entry : m3575continue) {
            ((Executor) entry.getValue()).execute(new RunnableC16019e((InterfaceC0867e) entry.getKey(), c0088e, 18));
        }
    }

    public final void vip(C12701e c12701e, AbstractC17233e abstractC17233e) {
        synchronized (this.ad) {
            if (this.billing) {
                if (AbstractC9464e.admob()) {
                    Log.w("CXCP", "Ignoring graph state update " + abstractC17233e + " on removed camera.");
                }
                return;
            }
            if (AbstractC9464e.smaato("CXCP")) {
                Log.d("CXCP", c12701e + " state updated to " + abstractC17233e);
            }
            ad(c12701e, abstractC17233e);
            Unit unit = Unit.INSTANCE;
        }
    }
}
