package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٔؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7150e {
    public static final void ad(InterfaceC12864e interfaceC12864e, C15036e c15036e, Function2 function2, C13770e c13770e, int i) {
        InterfaceC12864e premium;
        float f = c15036e.ad;
        c13770e.m3671package(-710607452);
        if (((i | (c13770e.purchase(interfaceC12864e) ? 4 : 2) | (c13770e.purchase(c15036e) ? 32 : 16) | (c13770e.purchase(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128)) & 731) == 146 && c13770e.ads()) {
            c13770e.m3659default();
        } else {
            c13770e.m3672private(-492369756);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = C11047e.subscription(0.0f, 14, AbstractC6874e.startapp(new C3618e(AbstractC6532e.license(4294967295L)), new C3618e(AbstractC6532e.license(4278190080L))));
                c13770e.m3682throws(m3681throw);
            }
            c13770e.Signature(false);
            AbstractC4457e abstractC4457e = (AbstractC4457e) m3681throw;
            Float valueOf = Float.valueOf(f);
            c13770e.m3672private(1157296644);
            boolean purchase = c13770e.purchase(valueOf);
            Object m3681throw2 = c13770e.m3681throw();
            if (purchase || m3681throw2 == c5170e) {
                C9604e vip = new C11236e(f, 1.0f, 1.0f, 1.0f).vip();
                C3618e c3618e = new C3618e(AbstractC6532e.license(4294967295L));
                float f2 = 255;
                int appmetrica = AbstractC1561e.appmetrica(vip.ad * f2);
                int appmetrica2 = AbstractC1561e.appmetrica(vip.vip * f2);
                int appmetrica3 = AbstractC1561e.appmetrica(vip.metrica * f2);
                float f3 = vip.license;
                m3681throw2 = C11047e.amazon(AbstractC6874e.startapp(c3618e, new C3618e(AbstractC6532e.metrica(appmetrica, appmetrica2, appmetrica3, AbstractC1561e.appmetrica((Float.isNaN(f3) ? 1.0f : f3) * f2)))));
                c13770e.m3682throws(m3681throw2);
            }
            c13770e.Signature(false);
            AbstractC4457e abstractC4457e2 = (AbstractC4457e) m3681throw2;
            InterfaceC12864e premium2 = interfaceC12864e.premium(AbstractC18007e.metrica);
            Unit unit = Unit.INSTANCE;
            c13770e.m3672private(1157296644);
            boolean purchase2 = c13770e.purchase(function2);
            Object m3681throw3 = c13770e.m3681throw();
            if (purchase2 || m3681throw3 == c5170e) {
                m3681throw3 = new C13768e(function2, null, 3);
                c13770e.m3682throws(m3681throw3);
            }
            c13770e.Signature(false);
            premium = premium2.premium(new C8128e(unit, null, null, new C9614e((Function2) m3681throw3), 6));
            c13770e.m3672private(1618982084);
            boolean purchase3 = c13770e.purchase(abstractC4457e) | c13770e.purchase(abstractC4457e2) | c13770e.purchase(c15036e);
            Object m3681throw4 = c13770e.m3681throw();
            if (purchase3 || m3681throw4 == c5170e) {
                m3681throw4 = new C7314e(10, abstractC4457e, abstractC4457e2, c15036e);
                c13770e.m3682throws(m3681throw4);
            }
            c13770e.Signature(false);
            AbstractC18366e.ad(premium, (Function1) m3681throw4, c13770e, 0);
        }
        C2846e subscription = c13770e.subscription();
        if (subscription == null) {
            return;
        }
        subscription.license = new C6477e(interfaceC12864e, c15036e, function2, i, 3);
    }

    public static C11123e billing(C4860e c4860e) {
        int i;
        C11123e c11123e = null;
        if (c4860e == null) {
            return null;
        }
        List m3729catch = C13935e.m3729catch(C11123e.purchase, c4860e, 0, 0, new C8436e((byte) 0, 3), 6);
        if (m3729catch.size() == 1) {
            return (C11123e) ((C6571e) m3729catch.get(0)).f13543e;
        }
        int length = c4860e.length();
        ArrayList arrayList = null;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            while (true) {
                char charAt = c4860e.charAt(i2);
                if (charAt != ' ' && charAt != ',') {
                    i3 = i2;
                    i = i3;
                    break;
                }
                i2++;
                if (i2 >= length) {
                    i = i2;
                    break;
                }
            }
            while (i < length) {
                char charAt2 = c4860e.charAt(i);
                if (charAt2 == ' ' || charAt2 == ',') {
                    break;
                }
                i++;
            }
            C6571e c6571e = (C6571e) AbstractC13480e.m3603synchronized(C11123e.purchase.m3730case(c4860e, i3, i, true, new C8436e((byte) 0, 3)));
            if (c6571e == null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c4860e.subSequence(i3, i).toString());
            } else {
                Object obj = c6571e.f13543e;
                if (c11123e == null) {
                    c11123e = (C11123e) obj;
                } else {
                    i2 = i;
                    c11123e = new C11123e(c11123e.ad || ((C11123e) obj).ad, c11123e.vip || ((C11123e) obj).vip, c11123e.metrica || ((C11123e) obj).metrica, C13664e.f27089e);
                }
            }
            i2 = i;
        }
        if (c11123e == null) {
            c11123e = C11123e.appmetrica;
        }
        return arrayList == null ? c11123e : new C11123e(c11123e.ad, c11123e.vip, c11123e.metrica, arrayList);
    }

    public static final C13918e purchase(C12476e c12476e, int i, int i2, int i3, long j, boolean z, boolean z2) {
        C9106e c9106e;
        if (z) {
            c9106e = null;
        } else {
            int i4 = C12347e.metrica;
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            c9106e = new C9106e(new C14980e(AbstractC8677e.license(c12476e, i5), 1L, i5), new C14980e(AbstractC8677e.license(c12476e, i6), 1L, i6), C12347e.yandex(j));
        }
        return new C13918e(z2, 1, 1, c9106e, new C4395e(1L, 1, i, i2, i3, c12476e));
    }

    public static boolean startapp(byte b) {
        return b > -65;
    }

    public static final C6571e vip(long j, long j2) {
        long startapp = AbstractC8116e.startapp(j2);
        float purchase = C2108e.purchase(startapp);
        float metrica = C2108e.metrica(startapp);
        float vip = AbstractC3062e.vip(C2152e.appmetrica(j), 0.0f, purchase);
        float vip2 = AbstractC3062e.vip(C2152e.purchase(j), 0.0f, C2108e.metrica(startapp));
        return new C6571e(Float.valueOf(AbstractC3062e.vip((1.0f / purchase) * vip, 0.0f, 1.0f)), Float.valueOf(AbstractC3062e.vip(1.0f - ((1.0f / metrica) * vip2), 0.0f, 1.0f)));
    }

    public static final int yandex(int i, int i2) {
        int m2467class = AbstractC8703e.m2467class(i2);
        if (m2467class != 0) {
            if (m2467class != 1) {
                if (m2467class == 2) {
                    return 3;
                }
                throw new C14803e(10);
            }
            int m2467class2 = AbstractC8703e.m2467class(i);
            if (m2467class2 != 0) {
                if (m2467class2 == 1) {
                    return 2;
                }
                if (m2467class2 == 2) {
                    return 3;
                }
                throw new C14803e(10);
            }
        }
        return 1;
    }

    public Object appmetrica(int i) {
        Object invoke;
        C4763e tapsense = license().tapsense(i);
        int i2 = i - tapsense.ad;
        Function1 key = tapsense.metrica.getKey();
        return (key == null || (invoke = key.invoke(Integer.valueOf(i2))) == null) ? new C10251e(i) : invoke;
    }

    public abstract Csuper license();

    public Object metrica(int i) {
        C4763e tapsense = license().tapsense(i);
        return tapsense.metrica.ad().invoke(Integer.valueOf(i - tapsense.ad));
    }
}
