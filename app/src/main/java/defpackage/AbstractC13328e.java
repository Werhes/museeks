package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَْٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13328e {
    public static final C2892e ad = new C2892e(-2076581929, false, new C10417e(3));
    public static final C2892e vip = new C2892e(-1470807147, false, new C10417e(4));
    public static final C2892e metrica = new C2892e(-466088303, false, new C7156e(17));
    public static final C2892e license = new C2892e(-163200912, false, new C7156e(18));
    public static final C2892e appmetrica = new C2892e(139686479, false, new C7156e(19));
    public static final C2892e purchase = new C2892e(-2117491689, false, new C7156e(20));
    public static final C2892e billing = new C2892e(613853047, false, new C7156e(9));
    public static final C2892e yandex = new C2892e(2127212656, false, new C7156e(10));
    public static final C2892e startapp = new C2892e(-842956057, false, new C7156e(11));
    public static final C2892e adcel = new C2892e(-2058819388, false, new C7156e(12));
    public static final C2892e mopub = new C2892e(1100974736, false, new C7156e(13));
    public static final C2892e advert = new C2892e(887418157, false, new C7156e(14));
    public static final C2892e smaato = new C2892e(-225674807, false, new C7156e(15));
    public static final C2892e amazon = new C2892e(353091338, false, new C7156e(16));

    public static final void ad(int i, C2892e c2892e, C13770e c13770e, InterfaceC12864e interfaceC12864e) {
        int i2;
        c13770e.m3671package(2064964257);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(c2892e) ? 32 : 16;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            vip(((i2 << 3) & 896) | (i2 & 14) | 48, c2892e, c13770e, interfaceC12864e);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4430e(interfaceC12864e, c2892e, i, 0);
        }
    }

    public static final C11078e appmetrica() {
        Float valueOf = Float.valueOf(0.0f);
        long j = C3618e.startapp;
        C6571e c6571e = new C6571e(valueOf, new C3618e(j));
        Float valueOf2 = Float.valueOf(0.1f);
        long j2 = C3618e.vip;
        return C11047e.loadAd(new C6571e[]{c6571e, new C6571e(valueOf2, new C3618e(j2)), new C6571e(Float.valueOf(0.9f), new C3618e(j2)), new C6571e(Float.valueOf(1.0f), new C3618e(j))});
    }

    public static final C11078e billing() {
        return C11047e.loadAd(new C6571e[]{new C6571e(Float.valueOf(0.92f), new C3618e(C3618e.vip)), new C6571e(Float.valueOf(1.0f), new C3618e(C3618e.startapp))});
    }

    public static final InterfaceC12864e license(InterfaceC12864e interfaceC12864e, C11078e c11078e) {
        return AbstractC5750e.appmetrica(AbstractC12546e.startapp(interfaceC12864e, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 458751), new C3921e(c11078e, 0));
    }

    public static boolean metrica(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final C0438e purchase(Function0 function0, C13770e c13770e, int i) {
        View view = (View) c13770e.adcel(AbstractC2676e.purchase);
        boolean purchase2 = c13770e.purchase(view);
        Object m3681throw = c13770e.m3681throw();
        Object obj = C2987e.ad;
        if (purchase2 || m3681throw == obj) {
            m3681throw = new C0438e(view, null, function0);
            c13770e.m3682throws(m3681throw);
        }
        C0438e c0438e = (C0438e) m3681throw;
        boolean yandex2 = c13770e.yandex(c0438e);
        Object m3681throw2 = c13770e.m3681throw();
        if (yandex2 || m3681throw2 == obj) {
            m3681throw2 = new C17161e(c0438e, 3);
            c13770e.m3682throws(m3681throw2);
        }
        AbstractC17680e.vip(c0438e, (Function1) m3681throw2, c13770e);
        return c0438e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object startapp(defpackage.C11180e r4, defpackage.C2122e r5, defpackage.AbstractC10731e r6) {
        /*
            boolean r0 = r6 instanceof defpackage.C3986e
            if (r0 == 0) goto L13
            r0 = r6
            eٌؖؖ r0 = (defpackage.C3986e) r0
            int r1 = r0.f8888e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8888e = r1
            goto L18
        L13:
            eٌؖؖ r0 = new eٌؖؖ
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f8886e
            int r1 = r0.f8888e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2a
            eؓ۟ؗ r5 = r0.f8887e
            defpackage.AbstractC2003e.purchase(r6)     // Catch: defpackage.C8716e -> L28
            return r6
        L28:
            r4 = move-exception
            goto L49
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            defpackage.AbstractC2003e.purchase(r6)
            r0.f8887e = r5     // Catch: defpackage.C8716e -> L28
            r0.f8888e = r3     // Catch: defpackage.C8716e -> L28
            eٖٝٔ r6 = new eٖٝٔ     // Catch: defpackage.C8716e -> L28
            r1 = 0
            r6.<init>(r5, r4, r2, r1)     // Catch: defpackage.C8716e -> L28
            java.lang.Object r4 = defpackage.AbstractC9743e.appmetrica(r6, r0)     // Catch: defpackage.C8716e -> L28
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r4 != r5) goto L48
            return r5
        L48:
            return r4
        L49:
            int r6 = r4.f17581e
            int r5 = r5.hashCode()
            if (r6 != r5) goto L52
            return r2
        L52:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC13328e.startapp(eُۖؒ, eؓ۟ؗ, eُؑ۠):java.lang.Object");
    }

    public static final void vip(int i, C2892e c2892e, C13770e c13770e, InterfaceC12864e interfaceC12864e) {
        int i2;
        c13770e.m3671package(771959668);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.yandex(c2892e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                C0576e c0576e = new C0576e(null, C10990e.f21771e);
                c13770e.m3682throws(c0576e);
                m3681throw = c0576e;
            }
            InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw;
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == c5170e) {
                m3681throw2 = new C1672e(interfaceC3314e, 0);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC1101e.ad(AbstractC2844e.vip.ad(purchase((Function0) m3681throw2, c13770e, 0)), AbstractC16653e.license(-291176396, new C4197e(0, interfaceC12864e, interfaceC3314e, c2892e), c13770e), c13770e, 56);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4430e(interfaceC12864e, c2892e, i, 1);
        }
    }

    public static final C11078e yandex() {
        Float valueOf = Float.valueOf(0.0f);
        long j = C3618e.startapp;
        C6571e c6571e = new C6571e(valueOf, new C3618e(j));
        Float valueOf2 = Float.valueOf(0.06f);
        long j2 = C3618e.vip;
        return C11047e.pro(new C6571e[]{c6571e, new C6571e(valueOf2, new C3618e(j2)), new C6571e(Float.valueOf(0.9f), new C3618e(j2)), new C6571e(Float.valueOf(1.0f), new C3618e(j))});
    }
}
