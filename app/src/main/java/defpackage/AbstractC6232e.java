package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؙۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6232e {
    public static C8496e ad;

    public static final void ad(InterfaceC12864e interfaceC12864e, long j, long j2, InterfaceC16154e interfaceC16154e, List list, C13770e c13770e, int i) {
        InterfaceC16154e interfaceC16154e2;
        List list2;
        InterfaceC16154e ad2;
        int i2;
        List list3;
        c13770e.m3671package(663218740);
        int i3 = i | (c13770e.purchase(interfaceC12864e) ? 4 : 2) | (c13770e.appmetrica(j) ? 32 : 16) | (c13770e.appmetrica(j2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | 9216;
        if (c13770e.m3673protected(i3 & 1, (i3 & 9363) != 9362)) {
            c13770e.m3655case();
            if ((i & 1) == 0 || c13770e.isPro()) {
                float f = AbstractC5924e.ad;
                float f2 = AbstractC0789e.ad;
                ad2 = AbstractC8949e.ad(c13770e, 7);
                i2 = i3 & (-64513);
                list3 = AbstractC5924e.metrica;
            } else {
                c13770e.m3659default();
                i2 = i3 & (-64513);
                ad2 = interfaceC16154e;
                list3 = list;
            }
            c13770e.admob();
            InterfaceC16154e interfaceC16154e3 = ad2;
            metrica(interfaceC12864e, j, j2, interfaceC16154e3, list3, c13770e, i2 & 65534);
            interfaceC16154e2 = interfaceC16154e3;
            list2 = list3;
        } else {
            c13770e.m3659default();
            interfaceC16154e2 = interfaceC16154e;
            list2 = list;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2132e(interfaceC12864e, j, j2, interfaceC16154e2, list2, i);
        }
    }

    public static boolean appmetrica(InterfaceC0390e interfaceC0390e) {
        if (!AbstractC3380e.license.contains(interfaceC0390e.getName())) {
            return false;
        }
        if (AbstractC13480e.ads(AbstractC3380e.metrica, AbstractC2876e.metrica(interfaceC0390e)) && interfaceC0390e.mo330e().isEmpty()) {
            return true;
        }
        if (!AbstractC13270e.applovin(interfaceC0390e)) {
            return false;
        }
        Collection mo337finally = interfaceC0390e.mo337finally();
        if (mo337finally.isEmpty()) {
            return false;
        }
        Iterator it = mo337finally.iterator();
        while (it.hasNext()) {
            if (appmetrica((InterfaceC0390e) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final InterfaceC10500e billing(InterfaceC16671e interfaceC16671e, InterfaceC18435e interfaceC18435e) {
        return AbstractC5336e.purchase(interfaceC18435e, null, 0, new C16600e(interfaceC16671e, null, 12), 3);
    }

    public static int[] license(int i, int i2) {
        int i3;
        int i4 = (i + 127) >> 7;
        if (i2 == 261888) {
            i3 = (((i4 * 1025) + 2097152) >> 22) & 15;
        } else {
            if (i2 != 95232) {
                throw new RuntimeException("Wrong Gamma2!");
            }
            int i5 = ((i4 * 11275) + 8388608) >> 24;
            i3 = i5 ^ (((43 - i5) >> 31) & i5);
        }
        int i6 = i - ((i3 * 2) * i2);
        return new int[]{i6 - (((4190208 - i6) >> 31) & 8380417), i3};
    }

    public static final void metrica(final InterfaceC12864e interfaceC12864e, final long j, final long j2, final InterfaceC16154e interfaceC16154e, final List list, C13770e c13770e, final int i) {
        int i2;
        float f;
        c13770e.m3671package(-1776169461);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.appmetrica(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.appmetrica(j2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.purchase(interfaceC16154e) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c13770e.yandex(list) ? 16384 : 8192;
        }
        if (!c13770e.m3673protected(i2 & 1, (i2 & 9363) != 9362)) {
            c13770e.m3659default();
        } else {
            if (list.size() <= 1) {
                throw new IllegalArgumentException("indicatorPolygons should have, at least, two RoundedPolygons");
            }
            boolean purchase = c13770e.purchase(list);
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            if (purchase || m3681throw == obj) {
                C1169e license = AbstractC6874e.license();
                int size = list.size();
                int i3 = 0;
                while (i3 < size) {
                    int i4 = i3 + 1;
                    if (i4 < list.size()) {
                        license.add(new C17994e(((C11913e) list.get(i3)).vip(), ((C11913e) list.get(i4)).vip()));
                    } else {
                        license.add(new C17994e(((C11913e) list.get(i3)).vip(), ((C11913e) list.get(0)).vip()));
                    }
                    i3 = i4;
                }
                m3681throw = AbstractC6874e.metrica(license);
                c13770e.m3682throws(m3681throw);
            }
            final List list2 = (List) m3681throw;
            boolean purchase2 = c13770e.purchase(list);
            Object m3681throw2 = c13770e.m3681throw();
            if (purchase2 || m3681throw2 == obj) {
                float[] fArr = new float[4];
                int size2 = list.size();
                float f2 = 1.0f;
                int i5 = 0;
                while (i5 < size2) {
                    C11913e c11913e = (C11913e) list.get(i5);
                    int i6 = size2;
                    C11913e.ad(c11913e, fArr, 2);
                    C1169e c1169e = c11913e.metrica;
                    float[] fArr2 = fArr;
                    long j3 = c11913e.vip;
                    int subs = c1169e.subs();
                    float f3 = 0.0f;
                    int i7 = 0;
                    while (i7 < subs) {
                        C1169e c1169e2 = c1169e;
                        C4211e c4211e = (C4211e) c1169e.get(i7);
                        int i8 = subs;
                        float Signature = c4211e.ad[0] - AbstractC11613e.Signature(j3);
                        float admob = c4211e.ad[1] - AbstractC11613e.admob(j3);
                        float f4 = AbstractC4424e.vip;
                        int i9 = i7;
                        long metrica = c4211e.metrica(0.5f);
                        float Signature2 = AbstractC11613e.Signature(metrica) - AbstractC11613e.Signature(j3);
                        float admob2 = AbstractC11613e.admob(metrica) - AbstractC11613e.admob(j3);
                        f3 = Math.max(f3, Math.max((admob * admob) + (Signature * Signature), (admob2 * admob2) + (Signature2 * Signature2)));
                        i7 = i9 + 1;
                        subs = i8;
                        c1169e = c1169e2;
                    }
                    float sqrt = (float) Math.sqrt(f3);
                    float[] fArr3 = {AbstractC11613e.Signature(j3) - sqrt, AbstractC11613e.admob(j3) - sqrt, AbstractC11613e.Signature(j3) + sqrt, AbstractC11613e.admob(j3) + sqrt};
                    f2 = Math.min(f2, Math.max((fArr2[2] - fArr2[0]) / (fArr3[2] - fArr3[0]), (fArr2[3] - fArr2[1]) / (fArr3[3] - fArr3[1])));
                    i5++;
                    size2 = i6;
                    fArr = fArr2;
                }
                f = 0.0f;
                m3681throw2 = Float.valueOf(f2 * AbstractC5924e.license);
                c13770e.m3682throws(m3681throw2);
            } else {
                f = 0.0f;
            }
            final float floatValue = ((Number) m3681throw2).floatValue();
            Object m3681throw3 = c13770e.m3681throw();
            if (m3681throw3 == obj) {
                m3681throw3 = AbstractC7111e.ad(f);
                c13770e.m3682throws(m3681throw3);
            }
            final C7558e c7558e = (C7558e) m3681throw3;
            Object m3681throw4 = c13770e.m3681throw();
            if (m3681throw4 == obj) {
                m3681throw4 = new C2616e(90.0f);
                c13770e.m3682throws(m3681throw4);
            }
            final C2616e c2616e = (C2616e) m3681throw4;
            Object m3681throw5 = c13770e.m3681throw();
            if (m3681throw5 == obj) {
                m3681throw5 = AbstractC7111e.ad(f);
                c13770e.m3682throws(m3681throw5);
            }
            final C7558e c7558e2 = (C7558e) m3681throw5;
            boolean purchase3 = c13770e.purchase(list);
            Object m3681throw6 = c13770e.m3681throw();
            if (purchase3 || m3681throw6 == obj) {
                m3681throw6 = new C16330e(0);
                c13770e.m3682throws(m3681throw6);
            }
            final C16330e c16330e = (C16330e) m3681throw6;
            boolean yandex = c13770e.yandex(c7558e) | c13770e.purchase(c16330e) | c13770e.yandex(list2) | c13770e.yandex(c7558e2);
            Object m3681throw7 = c13770e.m3681throw();
            if (yandex || m3681throw7 == obj) {
                m3681throw7 = new C7316e(c7558e, list2, c16330e, c2616e, c7558e2, (InterfaceC5083e) null);
                c13770e.m3682throws(m3681throw7);
            }
            AbstractC17680e.license(c13770e, list, (Function2) m3681throw7);
            Object m3681throw8 = c13770e.m3681throw();
            if (m3681throw8 == obj) {
                m3681throw8 = AbstractC11972e.ad();
                c13770e.m3682throws(m3681throw8);
            }
            final C17985e c17985e = (C17985e) m3681throw8;
            Object m3681throw9 = c13770e.m3681throw();
            if (m3681throw9 == obj) {
                Object c6739e = new C6739e(C6739e.ad());
                c13770e.m3682throws(c6739e);
                m3681throw9 = c6739e;
            }
            final float[] fArr4 = ((C6739e) m3681throw9).ad;
            InterfaceC12864e metrica2 = AbstractC16136e.metrica(AbstractC12447e.vip(AbstractC18007e.adcel(AbstractC2206e.appmetrica(interfaceC12864e), AbstractC5924e.ad, AbstractC5924e.vip).premium(AbstractC18007e.metrica), interfaceC16154e), j, AbstractC10432e.ad);
            InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11700e, false);
            long j4 = c13770e.f27286case;
            int i10 = (int) (j4 ^ (j4 >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e, metrica2);
            InterfaceC5685e.mopub.getClass();
            Function0 function0 = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(function0);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license2, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i10), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase4, C2721e.license);
            InterfaceC12864e metrica3 = AbstractC10075e.metrica(C0115e.f1276e, true);
            boolean yandex2 = c13770e.yandex(c7558e) | c13770e.yandex(c7558e2) | c13770e.yandex(list2) | c13770e.purchase(c16330e) | c13770e.yandex(c17985e) | c13770e.metrica(floatValue) | c13770e.yandex(fArr4) | ((i2 & 896) == 256);
            Object m3681throw10 = c13770e.m3681throw();
            if (yandex2 || m3681throw10 == obj) {
                Object obj2 = new Function1() { // from class: eٗؕۜ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        List list3 = list2;
                        C17985e c17985e2 = c17985e;
                        float f5 = floatValue;
                        float[] fArr5 = fArr4;
                        long j5 = j2;
                        C16330e c16330e2 = c16330e;
                        C4017e c4017e = (C4017e) obj3;
                        float floatValue2 = ((Number) C7558e.this.license()).floatValue();
                        float floatValue3 = ((Number) c7558e2.license()).floatValue() + c2616e.purchase() + (90 * floatValue2);
                        long mo779e = c4017e.f8940e.mo779e();
                        C18478e c18478e = c4017e.f8940e.f28537e;
                        long m4560try = c18478e.m4560try();
                        c18478e.m4557this().billing();
                        try {
                            ((C5389e) c18478e.f36228e).crashlytics(floatValue3, mo779e);
                            AbstractC5797e.license((C17994e) list3.get(c16330e2.purchase()), floatValue2, c17985e2);
                            long yandex3 = c4017e.yandex();
                            C6739e.license(fArr5);
                            C6739e.yandex(fArr5, Float.intBitsToFloat((int) (yandex3 >> 32)) * f5, Float.intBitsToFloat((int) (4294967295L & yandex3)) * f5, 4);
                            c17985e2.mopub(fArr5);
                            c17985e2.advert(C2152e.yandex(AbstractC5092e.license(yandex3), c17985e2.license().purchase()));
                            AbstractC4653e.Signature(c4017e, c17985e2, j5, 0.0f, C6590e.ad, 52);
                            AbstractC0054e.m224this(c18478e, m4560try);
                            return Unit.INSTANCE;
                        } catch (Throwable th) {
                            AbstractC0054e.m224this(c18478e, m4560try);
                            throw th;
                        }
                    }
                };
                c13770e.m3682throws(obj2);
                m3681throw10 = obj2;
            }
            AbstractC12534e.ad(c13770e, AbstractC5750e.appmetrica(metrica3, (Function1) m3681throw10));
            c13770e.Signature(true);
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eًؗٚ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    AbstractC6232e.metrica(InterfaceC12864e.this, j, j2, interfaceC16154e, list, (C13770e) obj3, AbstractC5190e.advert(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static byte[] purchase(long j) {
        long j2 = j;
        byte b = 1;
        while (true) {
            j2 >>= 8;
            if (j2 == 0) {
                break;
            }
            b = (byte) (b + 1);
        }
        byte[] bArr = new byte[b + 1];
        bArr[0] = b;
        for (int i = 1; i <= b; i++) {
            bArr[i] = (byte) (j >> ((b - i) * 8));
        }
        return bArr;
    }

    public static synchronized C3842e startapp(C4156e c4156e) {
        C3842e c3842e;
        synchronized (AbstractC6232e.class) {
            try {
                if (ad == null) {
                    ad = new C8496e(1);
                }
                c3842e = (C3842e) ad.m4615e(c4156e);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3842e;
    }

    public static final void vip(InterfaceC12864e interfaceC12864e, long j, List list, C13770e c13770e, int i, int i2) {
        int i3;
        InterfaceC12864e interfaceC12864e2;
        long j2;
        List list2;
        c13770e.m3671package(387862047);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && c13770e.appmetrica(j)) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= 128;
        }
        if (c13770e.m3673protected(i3 & 1, (i3 & 147) != 146)) {
            c13770e.m3655case();
            if ((i & 1) == 0 || c13770e.isPro()) {
                if (i4 != 0) {
                    interfaceC12864e = C0115e.f1276e;
                }
                if ((i2 & 2) != 0) {
                    float f = AbstractC5924e.ad;
                    float f2 = AbstractC0789e.ad;
                    j = AbstractC7893e.appmetrica(c13770e, 26);
                    i3 &= -113;
                }
                list = AbstractC5924e.metrica;
            } else {
                c13770e.m3659default();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            }
            int i5 = i3 & (-897);
            InterfaceC12864e interfaceC12864e3 = interfaceC12864e;
            long j3 = j;
            List list3 = list;
            c13770e.admob();
            long j4 = C3618e.adcel;
            float f3 = AbstractC5924e.ad;
            float f4 = AbstractC0789e.ad;
            metrica(interfaceC12864e3, j4, j3, AbstractC8949e.ad(c13770e, 7), list3, c13770e, (i5 & 14) | 48 | ((i5 << 3) & 896));
            interfaceC12864e2 = interfaceC12864e3;
            j2 = j3;
            list2 = list3;
        } else {
            c13770e.m3659default();
            interfaceC12864e2 = interfaceC12864e;
            j2 = j;
            list2 = list;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C14954e(interfaceC12864e2, j2, list2, i, i2);
        }
    }

    public static byte[] yandex(long j) {
        long j2 = j;
        byte b = 1;
        while (true) {
            j2 >>= 8;
            if (j2 == 0) {
                break;
            }
            b = (byte) (b + 1);
        }
        byte[] bArr = new byte[b + 1];
        bArr[b] = b;
        for (int i = 0; i < b; i++) {
            bArr[i] = (byte) (j >> (((b - i) - 1) * 8));
        }
        return bArr;
    }
}
