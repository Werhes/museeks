package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۥٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7595e {
    public static final C2892e ad = new C2892e(1510565771, false, new C15480e(23));

    public static C14911e ad(String str, AbstractC3903e abstractC3903e) {
        AbstractC0259e.ad(abstractC3903e.f8719e.f32975e);
        return new C14911e(str, abstractC3903e);
    }

    public static final C4254e appmetrica(C13770e c13770e) {
        float f = AbstractC15863e.ad;
        boolean z = Build.VERSION.SDK_INT >= 31;
        Object m3681throw = c13770e.m3681throw();
        if (m3681throw == C2987e.ad) {
            m3681throw = new C4254e(z);
            c13770e.m3682throws(m3681throw);
        }
        C4254e c4254e = (C4254e) m3681throw;
        c4254e.vip.setValue(Boolean.valueOf(z));
        return c4254e;
    }

    public static final AbstractC9876e billing(AbstractC4457e abstractC4457e) {
        if (abstractC4457e instanceof AbstractC9876e) {
            return (AbstractC9876e) abstractC4457e;
        }
        if (!(abstractC4457e instanceof C18466e)) {
            throw new C14803e(10);
        }
        long j = ((C18466e) abstractC4457e).ad;
        return C11047e.subscription(0.0f, 14, AbstractC6874e.startapp(new C3618e(j), new C3618e(j)));
    }

    public static final long license(long j, long j2, float f) {
        return (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 && (((9187343241974906880L ^ (j2 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) ? AbstractC12246e.yandex(j, j2, f) : f < 0.5f ? j : j2;
    }

    public static final ArrayList metrica(List list, List list2, float f) {
        if (list2 == null || list == null) {
            return null;
        }
        int max = Math.max(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(max);
        for (int i = 0; i < max; i++) {
            arrayList.add(Float.valueOf(AbstractC15842e.startapp(((Number) list.get(Math.min(i, list.size() - 1))).floatValue(), ((Number) list2.get(Math.min(i, list2.size() - 1))).floatValue(), f)));
        }
        return arrayList;
    }

    public static final void purchase(C2561e c2561e, long j, Function1 function1, boolean z) {
        MotionEvent ad2 = c2561e.ad();
        if (ad2 == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = ad2.getAction();
        if (z) {
            ad2.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        ad2.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        function1.invoke(ad2);
        ad2.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        ad2.setAction(action);
    }

    public static final ArrayList vip(List list, List list2, float f) {
        int max = Math.max(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(max);
        for (int i = 0; i < max; i++) {
            arrayList.add(new C3618e(AbstractC6532e.isVip(((C3618e) list.get(Math.min(i, list.size() - 1))).ad, ((C3618e) list2.get(Math.min(i, list2.size() - 1))).ad, f)));
        }
        return arrayList;
    }
}
