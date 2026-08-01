package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10102e {
    public static final C16005e license;
    public static final C10102e ad = new Object();
    public static final float vip = AbstractC8904e.vip;
    public static final float metrica = AbstractC8904e.metrica;

    /* JADX WARN: Type inference failed for: r0v0, types: [eَؙؐ, java.lang.Object] */
    static {
        float f = 12;
        C16005e c16005e = AbstractC10244e.ad;
        license = new C16005e(f, c16005e.vip, f, c16005e.license);
    }

    public static InterfaceC16154e metrica(int i, int i2, C13770e c13770e) {
        float f = AbstractC8904e.ad;
        C3924e c3924e = (C3924e) AbstractC8949e.ad(c13770e, 7);
        if (i2 == 1) {
            return c3924e;
        }
        if (i == 0) {
            C1536e c1536e = AbstractC16871e.startapp;
            return C3924e.metrica(c3924e, null, c1536e, c1536e, null, 9);
        }
        if (i != i2 - 1) {
            return AbstractC10432e.ad;
        }
        C1536e c1536e2 = AbstractC16871e.startapp;
        return C3924e.metrica(c3924e, c1536e2, null, null, c1536e2, 6);
    }

    public final void ad(C13770e c13770e, int i) {
        C13770e c13770e2;
        c13770e.m3671package(-1273041460);
        if (c13770e.m3673protected(i & 1, (i & 3) != 2)) {
            C17149e c17149e = AbstractC7640e.vip;
            if (c17149e == null) {
                C18373e c18373e = new C18373e("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                int i2 = AbstractC13069e.ad;
                C18466e c18466e = new C18466e(C3618e.vip);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new C8664e(9.0f, 16.17f));
                arrayList.add(new C5161e(4.83f, 12.0f));
                arrayList.add(new C11098e(-1.42f, 1.41f));
                arrayList.add(new C5161e(9.0f, 19.0f));
                arrayList.add(new C5161e(21.0f, 7.0f));
                arrayList.add(new C11098e(-1.41f, -1.41f));
                arrayList.add(C11621e.metrica);
                C18373e.ad(c18373e, arrayList, c18466e);
                c17149e = c18373e.vip();
                AbstractC7640e.vip = c17149e;
            }
            c13770e2 = c13770e;
            AbstractC5647e.ad(c17149e, null, AbstractC18007e.startapp(C0115e.f1276e, metrica), 0L, c13770e2, 48, 8);
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C17689e(this, i, 28);
        }
    }

    public final void vip(boolean z, Function2 function2, C13770e c13770e, int i) {
        Function2 function22;
        c13770e.m3671package(-657462570);
        int i2 = i | (c13770e.billing(z) ? 4 : 2) | 432;
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            c13770e.m3676strictfp(-1416240287);
            AbstractC12640e.license(z, null, AbstractC15869e.license(AbstractC11008e.metrica(c13770e, 4), 2).ad(new C18351e(new C5761e((C15421e) null, (C1223e) null, (C4980e) null, new C12395e(0.0f, AbstractC9931e.ad(0.0f, 1.0f), AbstractC11008e.metrica(c13770e, 2)), (LinkedHashMap) null, 119))), C2128e.vip, null, AbstractC16653e.license(2059591811, new C8580e(24), c13770e), c13770e, (i2 & 14) | 196608, 18);
            c13770e.Signature(false);
            function22 = AbstractC14430e.ad;
        } else {
            c13770e.m3659default();
            function22 = function2;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C15545e(this, z, function22, i, 4);
        }
    }
}
