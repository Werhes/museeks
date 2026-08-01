package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۜۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0578e {
    public static final C2892e ad = new C2892e(-685901422, false, new C2131e(11));
    public static final C2892e vip = new C2892e(1886749759, false, new C2131e(12));
    public static final C2892e metrica = new C2892e(-2124374540, false, new C11049e(29));

    public static C10133e ad(C12562e c12562e, boolean z) {
        List list = c12562e.f25157e;
        C10133e c10133e = new C10133e(c12562e, null, 1, z);
        C16169e mo1727e = c12562e.mo1727e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((InterfaceC16046e) obj).mo2738e() != 2) {
                break;
            }
            arrayList.add(obj);
        }
        C8950e m3580e = AbstractC13480e.m3580e(arrayList);
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(m3580e, 10));
        Iterator it = m3580e.iterator();
        while (true) {
            C2320e c2320e = (C2320e) it;
            if (!c2320e.f5836e.hasNext()) {
                AbstractC10226e mo1458e = ((InterfaceC16046e) AbstractC13480e.m3570break(list)).mo1458e();
                C8268e c8268e = AbstractC6050e.appmetrica;
                C13664e c13664e = C13664e.f27089e;
                c10133e.mo470e(null, mo1727e, c13664e, c13664e, arrayList2, mo1458e, 4, c8268e);
                C10133e c10133e2 = c10133e;
                c10133e2.f29675e = true;
                return c10133e2;
            }
            C9817e c9817e = (C9817e) c2320e.next();
            int i = c9817e.ad;
            InterfaceC16046e interfaceC16046e = (InterfaceC16046e) c9817e.vip;
            String vip2 = interfaceC16046e.getName().vip();
            C10133e c10133e3 = c10133e;
            arrayList2.add(new C13043e(c10133e3, null, i, C4590e.f9885e, C0520e.appmetrica(vip2.equals("T") ? "instance" : vip2.equals("E") ? "receiver" : vip2.toLowerCase(Locale.ROOT)), interfaceC16046e.mo1458e(), false, false, false, null, InterfaceC3054e.f7112e));
            c10133e = c10133e3;
        }
    }

    public static final C10994e license(String str) {
        int i;
        long j;
        int i2 = 10;
        AbstractC15211e.ad(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char charAt = str.charAt(0);
        int i3 = 1;
        if (AbstractC7890e.yandex(charAt, 48) >= 0) {
            i = 0;
        } else {
            if (length == 1 || charAt != '+') {
                return null;
            }
            i = 1;
        }
        long j2 = 10;
        long j3 = 0;
        long j4 = 512409557603043100L;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), i2);
            if (digit < 0) {
                return null;
            }
            int i4 = length;
            long j5 = j3 ^ Long.MIN_VALUE;
            int i5 = i;
            if (Long.compare(j5, j4 ^ Long.MIN_VALUE) <= 0) {
                j = j2;
            } else {
                if (j4 != 512409557603043100L) {
                    return null;
                }
                if (j2 >= 0) {
                    long j6 = (Long.MAX_VALUE / j2) << i3;
                    j = j2;
                    j4 = j6 + ((((-1) - (j6 * j2)) ^ Long.MIN_VALUE) >= (j2 ^ Long.MIN_VALUE) ? i3 : 0);
                } else if (Long.MAX_VALUE < (j2 ^ Long.MIN_VALUE)) {
                    j = j2;
                    j4 = 0;
                } else {
                    j4 = 1;
                    j = j2;
                }
                if (Long.compare(j5, j4 ^ Long.MIN_VALUE) > 0) {
                    return null;
                }
            }
            long j7 = j3 * j;
            long j8 = (digit & 4294967295L) + j7;
            if (Long.compare(j8 ^ Long.MIN_VALUE, j7 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i = i5 + 1;
            j3 = j8;
            length = i4;
            j2 = j;
            i2 = 10;
            i3 = 1;
        }
        return new C10994e(j3);
    }

    public static final C2875e metrica(String str) {
        int i;
        AbstractC15211e.ad(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        if (AbstractC7890e.yandex(charAt, 48) < 0) {
            i = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int i3 = 119304647;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            int i4 = i2 ^ RecyclerView.UNDEFINED_DURATION;
            if (Integer.compare(i4, i3 ^ RecyclerView.UNDEFINED_DURATION) > 0) {
                if (i3 != 119304647) {
                    return null;
                }
                i3 = (int) (((-1) & 4294967295L) / (4294967295L & 10));
                if (Integer.compare(i4, i3 ^ RecyclerView.UNDEFINED_DURATION) > 0) {
                    return null;
                }
            }
            int i5 = i2 * 10;
            int i6 = digit + i5;
            if (Integer.compare(i6 ^ RecyclerView.UNDEFINED_DURATION, i5 ^ RecyclerView.UNDEFINED_DURATION) < 0) {
                return null;
            }
            i++;
            i2 = i6;
        }
        return new C2875e(i2);
    }

    public static final C13308e vip(AbstractC2195e abstractC2195e, AbstractC2195e abstractC2195e2) {
        return new C13308e(AbstractC6874e.startapp(abstractC2195e, abstractC2195e2));
    }
}
