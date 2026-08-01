package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۛٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8217e {
    public static C17149e metrica;
    public static final C2871e ad = new Object();
    public static final C16372e vip = new C16372e("StdlibClassFinder", 2);

    public static final void ad(C6029e c6029e, Function0 function0, Function0 function02, C13770e c13770e, int i) {
        c13770e.m3671package(360045889);
        int i2 = (c13770e.yandex(c6029e) ? 4 : 2) | i | (c13770e.yandex(function0) ? 32 : 16) | (c13770e.yandex(function02) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            Unit unit = Unit.INSTANCE;
            boolean yandex = c13770e.yandex(c6029e);
            Object m3681throw = c13770e.m3681throw();
            InterfaceC5083e interfaceC5083e = null;
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C7236e(c6029e, interfaceC5083e, 19);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC17680e.license(c13770e, unit, (Function2) m3681throw);
            AbstractC6022e.vip(null, AbstractC16653e.license(216292813, new C12802e(function0, function02, c6029e), c13770e), c13770e, 48, 1);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C12802e(c6029e, function0, function02, i);
        }
    }

    public static final C17149e license() {
        C17149e c17149e = metrica;
        if (c17149e != null) {
            return c17149e;
        }
        C18373e c18373e = new C18373e("Rounded.Lock", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = AbstractC13069e.ad;
        C18466e c18466e = new C18466e(C3618e.vip);
        C13935e c13935e = new C13935e(20);
        ArrayList arrayList = (ArrayList) c13935e.f27641e;
        c13935e.m3733extends(18.0f, 8.0f);
        arrayList.add(new C5795e(-1.0f));
        c13935e.m3747this(17.0f, 6.0f);
        c13935e.premium(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        arrayList.add(new C8428e(7.0f, 3.24f, 7.0f, 6.0f));
        arrayList.add(new C14150e(2.0f));
        c13935e.m3747this(6.0f, 8.0f);
        c13935e.premium(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        arrayList.add(new C14150e(10.0f));
        c13935e.premium(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        arrayList.add(new C5795e(12.0f));
        c13935e.premium(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        c13935e.m3747this(20.0f, 10.0f);
        c13935e.premium(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        c13935e.ads();
        c13935e.m3733extends(12.0f, 17.0f);
        c13935e.premium(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        c13935e.m3735implements(0.9f, -2.0f, 2.0f, -2.0f);
        c13935e.m3735implements(2.0f, 0.9f, 2.0f, 2.0f);
        c13935e.m3735implements(-0.9f, 2.0f, -2.0f, 2.0f);
        c13935e.ads();
        c13935e.m3733extends(9.0f, 8.0f);
        c13935e.m3747this(9.0f, 6.0f);
        c13935e.premium(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        c13935e.m3735implements(3.0f, 1.34f, 3.0f, 3.0f);
        arrayList.add(new C14150e(2.0f));
        c13935e.m3747this(9.0f, 8.0f);
        c13935e.ads();
        C18373e.ad(c18373e, arrayList, c18466e);
        C17149e vip2 = c18373e.vip();
        metrica = vip2;
        return vip2;
    }

    public static final void metrica(C9820e c9820e, C13915e c13915e) {
        long mo211this = ((C14747e) c13915e.f27592e.license).mo211this(0L);
        int round = Math.round(Float.intBitsToFloat((int) (mo211this >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (mo211this & 4294967295L)));
        c9820e.layout(round, round2, c9820e.getMeasuredWidth() + round, c9820e.getMeasuredHeight() + round2);
    }

    public static final C4211e vip(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return new C4211e(new float[]{f, f2, f3, f4, f5, f6, f7, f8});
    }
}
