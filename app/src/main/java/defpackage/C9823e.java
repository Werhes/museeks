package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۡۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9823e {
    public final C13783e ad;
    public final C1615e license;
    public final List metrica;
    public final C10860e vip;

    public C9823e(C17280e c17280e, C13783e c13783e, C9485e c9485e, C16354e c16354e, List list, C5122e c5122e) {
        this.ad = c13783e;
        this.metrica = c9485e.advert;
        C1239e c1239e = c9485e.adcel;
        Map map = c9485e.smaato;
        C0738e c0738e = AbstractC12227e.metrica;
        Object obj = c1239e.get(c0738e);
        Boolean bool = Boolean.TRUE;
        if (AbstractC7890e.billing(obj, bool) || AbstractC7890e.billing(map.get(c0738e), bool)) {
            Log.i("CXCP", c0738e + " is set to true, ignoring GraphState3A parameters.");
        }
        C14955e c14955e = c9485e.loadAd;
        c5122e.vip.getClass();
        C5401e c5401e = c14955e.vip;
        Set set = (Set) C5122e.metrica.get(Build.MANUFACTURER);
        int max = (set == null || !set.contains(Build.DEVICE) || Build.VERSION.SDK_INT >= 34) ? 0 : Math.max(0, 10);
        c5401e.getClass();
        int max2 = Math.max(max, c5401e.f11581e);
        C12445e c12445e = max2 != 0 ? new C12445e(max2) : null;
        C10860e c10860e = new C10860e(c13783e, c1239e, map, AbstractC13480e.m3584final(list, AbstractC6874e.adcel(c12445e)), AbstractC1660e.isPro(new Object[]{c16354e, c12445e}), c17280e.ad, c17280e.purchase);
        this.vip = c10860e;
        if (c12445e != null) {
            if (c12445e.f24908e != null) {
                throw new IllegalStateException("GraphLoop has already been set!");
            }
            c12445e.f24908e = c10860e;
            c10860e.f21515e.ad = 0;
            Log.w("CXCP", "Capture processing has been disabled for " + c10860e + " until " + c12445e.f24910e + " frames have been completed.");
        }
        this.license = AbstractC9180e.metrica(C10534e.vip);
    }

    public final void ad(C16815e c16815e) {
        C1615e c1615e;
        Object value;
        AbstractC17233e abstractC17233e;
        Log.d("CXCP", this + " onGraphError(" + c16815e + ')');
        do {
            c1615e = this.license;
            value = c1615e.getValue();
            abstractC17233e = (AbstractC17233e) value;
        } while (!c1615e.mopub(value, ((abstractC17233e instanceof C8072e) || (abstractC17233e instanceof C10534e)) ? C10534e.vip : c16815e));
        for (C5373e c5373e : this.metrica) {
            C5241e c5241e = c5373e.ad;
            C12701e c12701e = c5373e.vip;
            if (c12701e == null) {
                c12701e = null;
            }
            c5241e.vip(c12701e, c16815e);
        }
    }

    public final boolean appmetrica(Map map) {
        C10860e c10860e = this.vip;
        if (c10860e.purchase() != null) {
            return c10860e.f21517e.m4495e(new C12877e(map));
        }
        throw new IllegalStateException("Cannot submit parameters without an active repeating request!");
    }

    public final void license(C9021e c9021e) {
        C10860e c10860e = this.vip;
        synchronized (c10860e.f21521e) {
            try {
                C9021e c9021e2 = c10860e.f21507e;
                c10860e.f21507e = c9021e;
                if (c9021e2 != null || c9021e != null) {
                    if (c9021e != null) {
                        c10860e.f21517e.m4495e(new C14765e(c9021e));
                    } else {
                        c10860e.f21517e.m4495e(C18369e.license);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c9021e == null) {
            int size = c10860e.f21505e.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC3351e) c10860e.f21505e.get(i)).metrica();
            }
        }
    }

    public final void metrica() {
        Log.d("CXCP", this + " onGraphStopped");
        C1615e c1615e = this.license;
        c1615e.getClass();
        C10534e c10534e = C10534e.vip;
        c1615e.smaato(null, c10534e);
        this.vip.subs(null);
        for (C5373e c5373e : this.metrica) {
            C5241e c5241e = c5373e.ad;
            C12701e c12701e = c5373e.vip;
            if (c12701e == null) {
                c12701e = null;
            }
            c5241e.vip(c12701e, c10534e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    public final void purchase(LinkedHashMap linkedHashMap) {
        C10860e c10860e = this.vip;
        synchronized (c10860e.f21521e) {
            c10860e.f21511e = linkedHashMap;
            c10860e.f21517e.m4495e(new C3880e(c10860e.f21506e, linkedHashMap));
            Unit unit = Unit.INSTANCE;
        }
    }

    public final String toString() {
        return "GraphProcessor(cameraGraph: " + this.ad + ')';
    }

    public final void vip(C10379e c10379e) {
        Log.d("CXCP", this + " onGraphStarted");
        C4186e c4186e = C4186e.vip;
        C1615e c1615e = this.license;
        c1615e.getClass();
        c1615e.smaato(null, c4186e);
        this.vip.subs(c10379e);
        for (C5373e c5373e : this.metrica) {
            C5241e c5241e = c5373e.ad;
            C12701e c12701e = c5373e.vip;
            if (c12701e == null) {
                c12701e = null;
            }
            c5241e.vip(c12701e, c4186e);
        }
    }
}
