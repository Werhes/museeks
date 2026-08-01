package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8749e {
    public static C17149e admob;
    public static final C2892e ad = new C2892e(1337264171, false, new C16627e(27));
    public static final C2892e vip = new C2892e(-67927507, false, new C11049e(2));
    public static final C2892e metrica = new C2892e(-801005646, false, new C10494e(13));
    public static final C2892e license = new C2892e(-1503601485, false, new C10494e(14));
    public static final C2892e appmetrica = new C2892e(1495480407, false, new C10494e(5));
    public static final C2892e purchase = new C2892e(-273991207, false, new C10494e(6));
    public static final C2892e billing = new C2892e(-2043462821, false, new C10494e(7));
    public static final C2892e yandex = new C2892e(-1466756561, false, new C10494e(8));
    public static final C2892e startapp = new C2892e(599837166, false, new C10494e(9));
    public static final C2892e adcel = new C2892e(-144357626, false, new C16627e(28));
    public static final C2892e mopub = new C2892e(-672946105, false, new C16627e(29));
    public static final C2892e advert = new C2892e(377329820, false, new C10494e(10));
    public static final C2892e smaato = new C2892e(1429479807, false, new C11049e(0));
    public static final C2892e amazon = new C2892e(729986334, false, new C10494e(11));
    public static final C2892e loadAd = new C2892e(1782136321, false, new C11049e(1));
    public static final C2892e Signature = new C2892e(1082642848, false, new C10494e(12));

    public static final void ad(C4837e c4837e, Function1 function1, Function1 function12, Function1 function13, C13770e c13770e, int i) {
        c13770e.m3671package(411348303);
        int i2 = i | (c13770e.purchase(c4837e) ? 4 : 2) | (c13770e.yandex(function1) ? 32 : 16) | (c13770e.yandex(function12) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.yandex(function13) ? 2048 : 1024);
        if (c13770e.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
            InterfaceC3314e vip2 = AbstractC3265e.vip(c4837e.yandex, c13770e, 0);
            AbstractC13348e.ad(null, AbstractC16653e.license(-1442000621, new C18227e(c4837e, 0), c13770e), null, null, null, 0, 0L, 0L, AbstractC3338e.ad, AbstractC16653e.license(-1874838242, new C14885e(AbstractC3265e.vip(c4837e.adcel, c13770e, 0), function1, function12, function13, AbstractC3265e.vip(c4837e.startapp, c13770e, 0), c4837e, vip2), c13770e), c13770e, 905969712, 253);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C6409e(c4837e, function1, function12, function13, i, 15);
        }
    }

    public static final Object license(Set set, Enum r2, Enum r3, Enum r4, boolean z) {
        if (!z) {
            if (r4 != null) {
                set = AbstractC13480e.m3582e(AbstractC4511e.Signature(set, r4));
            }
            return AbstractC13480e.m3599static(set);
        }
        Enum r1 = set.contains(r2) ? r2 : set.contains(r3) ? r3 : null;
        if (AbstractC7890e.billing(r1, r2) && AbstractC7890e.billing(r4, r3)) {
            return null;
        }
        return r4 == null ? r1 : r4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0074, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean metrica(defpackage.InterfaceC5487e r9) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8749e.metrica(eؘؙۚ):boolean");
    }

    public static final C17149e vip() {
        C17149e c17149e = admob;
        if (c17149e != null) {
            return c17149e;
        }
        C18373e c18373e = new C18373e("Rounded.ArrowForward", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = AbstractC13069e.ad;
        C18466e c18466e = new C18466e(C3618e.vip);
        C13935e c13935e = new C13935e(20);
        ArrayList arrayList = (ArrayList) c13935e.f27641e;
        c13935e.m3733extends(5.0f, 13.0f);
        arrayList.add(new C5795e(11.17f));
        c13935e.m3738native(-4.88f, 4.88f);
        c13935e.premium(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.42f);
        c13935e.premium(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        c13935e.m3738native(6.59f, -6.59f);
        c13935e.premium(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        c13935e.m3738native(-6.58f, -6.6f);
        c13935e.premium(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        c13935e.premium(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        c13935e.m3747this(16.17f, 11.0f);
        c13935e.firebase(5.0f);
        c13935e.premium(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        c13935e.m3735implements(0.45f, 1.0f, 1.0f, 1.0f);
        c13935e.ads();
        C18373e.ad(c18373e, arrayList, c18466e);
        C17149e vip2 = c18373e.vip();
        admob = vip2;
        return vip2;
    }
}
