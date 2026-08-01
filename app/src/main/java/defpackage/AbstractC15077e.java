package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.recyclerview.widget.RecyclerView;
import java.math.BigInteger;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۤۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15077e {
    public static final C2892e ad = new C2892e(-692649309, false, new C8898e(21));
    public static final C2892e vip = new C2892e(-812464729, false, new C8898e(22));
    public static final C2892e metrica = new C2892e(-2001663974, false, new C8898e(23));
    public static final C2892e license = new C2892e(-1180165602, false, new C8898e(24));

    public static boolean Signature(int[] iArr, int[] iArr2) {
        for (int i = 4; i >= 0; i--) {
            int i2 = iArr[i] ^ RecyclerView.UNDEFINED_DURATION;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static final void ad(int i, C13770e c13770e, final boolean z) {
        boolean z2;
        Object obj;
        float f;
        Object obj2;
        c13770e.m3671package(-1560355159);
        if (c13770e.m3673protected(i & 1, (i & 3) != 2)) {
            Object m3681throw = c13770e.m3681throw();
            Object obj3 = C2987e.ad;
            Object obj4 = m3681throw;
            if (m3681throw == obj3) {
                float[] fArr = {0.5f, 0.2f, 0.3f, 0.2f, 0.5f};
                c13770e.m3682throws(fArr);
                obj4 = fArr;
            }
            final float[] fArr2 = (float[]) obj4;
            Object m3681throw2 = c13770e.m3681throw();
            Object obj5 = m3681throw2;
            if (m3681throw2 == obj3) {
                Object obj6 = z ? new float[]{0.75f, 0.4f, 0.4f, 0.4f, 0.75f} : new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
                c13770e.m3682throws(obj6);
                obj5 = obj6;
            }
            final float[] fArr3 = (float[]) obj5;
            AbstractC4455e abstractC4455e = AbstractC11785e.ad;
            final long j = ((C7019e) c13770e.adcel(abstractC4455e)).ad.Signature;
            final long j2 = ((C7019e) c13770e.adcel(abstractC4455e)).ad.admob;
            final long j3 = ((C7019e) c13770e.adcel(abstractC4455e)).ad.ad;
            float f2 = 8;
            C8587e ad2 = AbstractC6451e.ad(AbstractC16497e.billing(f2), C5438e.f11685e, c13770e, 6);
            long j4 = c13770e.f27286case;
            int i2 = (int) (j4 ^ (j4 >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, c0115e);
            InterfaceC5685e.mopub.getClass();
            Function0 function0 = C2721e.vip;
            c13770e.m3666import();
            Object obj7 = obj3;
            if (c13770e.f27292implements) {
                c13770e.mopub(function0);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad2, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i2), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            c13770e.m3676strictfp(625378035);
            final int i3 = 0;
            for (int length = fArr2.length; i3 < length; length = length) {
                InterfaceC12864e vip2 = AbstractC12447e.vip(AbstractC18007e.smaato(AbstractC18007e.license(c0115e, 108), f2), AbstractC6549e.ad);
                boolean appmetrica = c13770e.appmetrica(j) | c13770e.appmetrica(j3) | c13770e.yandex(fArr3) | c13770e.license(i3) | c13770e.appmetrica(j2) | c13770e.yandex(fArr2);
                Object m3681throw3 = c13770e.m3681throw();
                if (appmetrica) {
                    obj = obj7;
                } else {
                    obj = obj7;
                    if (m3681throw3 != obj) {
                        f = f2;
                        obj2 = m3681throw3;
                        obj7 = obj;
                        AbstractC18366e.ad(vip2, (Function1) obj2, c13770e, 0);
                        i3++;
                        f2 = f;
                    }
                }
                f = f2;
                obj7 = obj;
                obj2 = new Function1() { // from class: eؗٙٝ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj8) {
                        InterfaceC2235e interfaceC2235e = (InterfaceC2235e) obj8;
                        AbstractC4653e.subscription(interfaceC2235e, j, 0L, 0L, 0.0f, null, null, 0, 126);
                        float intBitsToFloat = Float.intBitsToFloat((int) (interfaceC2235e.yandex() & 4294967295L));
                        float[] fArr4 = fArr3;
                        int i4 = i3;
                        float f3 = (1.0f - fArr4[i4]) * intBitsToFloat;
                        float f4 = 28;
                        long floatToRawIntBits = Float.floatToRawIntBits(r3) & 4294967295L;
                        AbstractC4653e.pro(interfaceC2235e, j3, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L), 0L, floatToRawIntBits | (Float.floatToRawIntBits(interfaceC2235e.mo497instanceof(f4)) << 32), null, 244);
                        boolean z3 = z;
                        long j5 = j2;
                        float[] fArr5 = fArr2;
                        if (z3) {
                            float intBitsToFloat2 = (1.0f - fArr5[i4]) * Float.intBitsToFloat((int) (interfaceC2235e.yandex() & 4294967295L));
                            AbstractC4653e.subscription(interfaceC2235e, j5, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), 0L, 0.0f, null, null, 0, 124);
                        } else {
                            float intBitsToFloat3 = (1.0f - fArr5[i4]) * Float.intBitsToFloat((int) (interfaceC2235e.yandex() & 4294967295L));
                            float mo497instanceof = interfaceC2235e.mo497instanceof(f4);
                            AbstractC4653e.pro(interfaceC2235e, j5, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L), 0L, (Float.floatToRawIntBits(mo497instanceof) << 32) | (Float.floatToRawIntBits(mo497instanceof) & 4294967295L), null, 244);
                        }
                        return Unit.INSTANCE;
                    }
                };
                c13770e.m3682throws(obj2);
                AbstractC18366e.ad(vip2, (Function1) obj2, c13770e, 0);
                i3++;
                f2 = f;
            }
            z2 = z;
            c13770e.Signature(false);
            c13770e.Signature(true);
        } else {
            z2 = z;
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C16027e(i, 3, z2);
        }
    }

    public static int adcel(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        return (int) (j5 >>> 32);
    }

    public static boolean admob(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 5; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void advert(int i, int[] iArr, int[] iArr2) {
        iArr2[i] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
        iArr2[i + 4] = iArr[4];
    }

    public static int[] amazon(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 160) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[5];
        for (int i = 0; i < 5; i++) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArr;
    }

    public static final long appmetrica(C17985e c17985e, long j, float f, float f2, float f3) {
        float license2 = license(f3) * f2;
        int i = (int) (j >> 32);
        float intBitsToFloat = (f / 2.0f) + Float.intBitsToFloat(i);
        c17985e.metrica(intBitsToFloat, Float.intBitsToFloat((int) (j & 4294967295L)), intBitsToFloat, license2, Float.intBitsToFloat(i) + f, license2);
        return (Float.floatToRawIntBits(Float.intBitsToFloat(i) + f) << 32) | (Float.floatToRawIntBits(license2) & 4294967295L);
    }

    public static final void billing(C2892e c2892e, Function2 function2, boolean z, Function1 function1, C13770e c13770e, int i) {
        c13770e.m3671package(150349467);
        int i2 = i | (c13770e.billing(z) ? 256 : 128) | (c13770e.yandex(function1) ? 2048 : 1024);
        if (c13770e.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
            InterfaceC12864e metrica2 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            boolean z2 = ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object m3681throw = c13770e.m3681throw();
            if (z2 || m3681throw == C2987e.ad) {
                m3681throw = new C2221e(1, function1, z);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC16429e.ad(c2892e, AbstractC9546e.license(metrica2, false, null, (Function0) m3681throw, 15), null, function2, null, AbstractC16653e.license(-564375362, new C16618e(0, function1, z), c13770e), null, 0.0f, 0.0f, c13770e, 199686, 468);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C6242e(c2892e, function2, z, function1, i);
        }
    }

    public static BigInteger inmobi(int[] iArr) {
        byte[] bArr = new byte[20];
        for (int i = 0; i < 5; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                AbstractC3628e.billing(i2, (4 - i) << 2, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void isVip(int[] iArr, int[] iArr2) {
        long j = (iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L)) + (j >> 32);
        iArr2[1] = (int) j2;
        long j3 = ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L)) + (j2 >> 32);
        iArr2[2] = (int) j3;
        long j4 = ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L)) + (j3 >> 32);
        iArr2[3] = (int) j4;
        iArr2[4] = (int) (((iArr2[4] & 4294967295L) - (4294967295L & iArr[4])) + (j4 >> 32));
    }

    public static final float license(float f) {
        return 1.0f - ((Number) AbstractC3062e.purchase(Float.valueOf(((((Number) AbstractC3062e.purchase(Float.valueOf(f), new C3721e(-12.0f, 12.0f))).floatValue() / 12.0f) + 1.0f) / 2.0f), new C3721e(0.0f, 1.0f))).floatValue();
    }

    public static int loadAd(int[] iArr) {
        return iArr[0] & 1;
    }

    public static final void metrica(final List list, final long j, final long j2, final InterfaceC12864e interfaceC12864e, C13770e c13770e, final int i) {
        c13770e.m3671package(747321670);
        int i2 = i | (c13770e.yandex(list) ? 4 : 2) | (c13770e.appmetrica(j) ? 32 : 16) | (c13770e.appmetrica(j2) ? 256 : 128) | (c13770e.purchase(interfaceC12864e) ? 2048 : 1024);
        if (c13770e.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
            final long j3 = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.f18935goto;
            boolean appmetrica = ((i2 & 112) == 32) | c13770e.appmetrica(j3) | c13770e.yandex(list) | ((i2 & 896) == 256);
            Object m3681throw = c13770e.m3681throw();
            if (appmetrica || m3681throw == C2987e.ad) {
                Function1 function1 = new Function1() { // from class: eؚؗۧ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        C17985e c17985e;
                        C8953e c8953e = (C8953e) obj;
                        final float vip2 = c8953e.vip() * ((float) 1.5d);
                        final long j4 = j;
                        final C11078e subscription = C11047e.subscription(0.0f, 14, AbstractC6874e.startapp(new C3618e(C3618e.vip(0.5f, j4)), new C3618e(j3)));
                        final C17985e ad2 = AbstractC11972e.ad();
                        C17985e ad3 = AbstractC11972e.ad();
                        float intBitsToFloat = Float.intBitsToFloat((int) (c8953e.f17969e.yandex() >> 32));
                        List list2 = list;
                        float size = intBitsToFloat / (list2.size() - 1);
                        long floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(AbstractC15077e.license(((Number) list2.get(0)).floatValue()) * Float.intBitsToFloat((int) (c8953e.f17969e.yandex() & 4294967295L))) & 4294967295L);
                        int i3 = (int) (floatToRawIntBits >> 32);
                        ad2.purchase(Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (c8953e.f17969e.yandex() & 4294967295L)));
                        float intBitsToFloat2 = Float.intBitsToFloat(i3);
                        int i4 = (int) (floatToRawIntBits & 4294967295L);
                        ad2.appmetrica(intBitsToFloat2, Float.intBitsToFloat(i4));
                        ad3.purchase(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4));
                        int billing = AbstractC6874e.billing(list2);
                        int i5 = 1;
                        if (1 <= billing) {
                            while (true) {
                                long j5 = floatToRawIntBits;
                                AbstractC15077e.appmetrica(ad2, j5, size, Float.intBitsToFloat((int) (c8953e.f17969e.yandex() & 4294967295L)), ((Number) list2.get(i5)).floatValue());
                                float f = size;
                                c17985e = ad3;
                                floatToRawIntBits = AbstractC15077e.appmetrica(c17985e, j5, f, Float.intBitsToFloat((int) (c8953e.f17969e.yandex() & 4294967295L)), ((Number) list2.get(i5)).floatValue());
                                size = f;
                                if (i5 == billing) {
                                    break;
                                }
                                i5++;
                                ad3 = c17985e;
                            }
                        } else {
                            c17985e = ad3;
                        }
                        ad2.appmetrica(Float.intBitsToFloat((int) (c8953e.f17969e.yandex() >> 32)), Float.intBitsToFloat((int) (c8953e.f17969e.yandex() & 4294967295L)));
                        final long j6 = j2;
                        final C17985e c17985e2 = c17985e;
                        return c8953e.ad(new C16860e(0, new Function1() { // from class: eٜٗٛ
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                InterfaceC2235e interfaceC2235e = (InterfaceC2235e) obj2;
                                float intBitsToFloat3 = Float.intBitsToFloat((int) (interfaceC2235e.yandex() & 4294967295L)) / 2.0f;
                                long floatToRawIntBits2 = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
                                float intBitsToFloat4 = Float.intBitsToFloat((int) (interfaceC2235e.yandex() >> 32));
                                float intBitsToFloat5 = Float.intBitsToFloat((int) (interfaceC2235e.yandex() & 4294967295L)) / 2.0f;
                                long floatToRawIntBits3 = (Float.floatToRawIntBits(intBitsToFloat4) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat5));
                                long j7 = j6;
                                float f2 = vip2;
                                interfaceC2235e.mo776extends(j7, floatToRawIntBits2, floatToRawIntBits3, f2, (r19 & 16) != 0 ? 0 : 0);
                                AbstractC4653e.Signature(interfaceC2235e, c17985e2, j4, 0.0f, new C13121e(f2, 0.0f, 0, 0, null, 30), 52);
                                AbstractC4653e.loadAd(interfaceC2235e, ad2, subscription, 0.0f, null, null, 0, 60);
                                return Unit.INSTANCE;
                            }
                        }));
                    }
                };
                c13770e.m3682throws(function1);
                m3681throw = function1;
            }
            AbstractC12534e.ad(c13770e, AbstractC5750e.license(interfaceC12864e, (Function1) m3681throw));
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2(list, j, j2, interfaceC12864e, i) { // from class: eؒؓۚ

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ long f3187e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ long f3188e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC12864e f3189e;

                /* renamed from: eّٖۦ, reason: contains not printable characters */
                public final /* synthetic */ List f3190e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert = AbstractC5190e.advert(1);
                    AbstractC15077e.metrica(this.f3190e, this.f3188e, this.f3187e, this.f3189e, (C13770e) obj, advert);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final InterfaceC7189e mopub(InterfaceC7189e interfaceC7189e, InterfaceC10161e interfaceC10161e) {
        return interfaceC7189e.purchase(new C4289e(interfaceC10161e));
    }

    public static int pro(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = 4294967295L;
        long j2 = iArr2[0] & 4294967295L;
        long j3 = iArr2[1] & 4294967295L;
        long j4 = iArr2[2] & 4294967295L;
        long j5 = iArr2[3] & 4294967295L;
        long j6 = iArr2[4] & 4294967295L;
        long j7 = 0;
        while (i < 5) {
            long j8 = j;
            long j9 = iArr[i] & j8;
            int i2 = i;
            long j10 = (j9 * j2) + (iArr3[i] & j8);
            iArr3[i2] = (int) j10;
            int i3 = i2 + 1;
            long j11 = (j9 * j3) + (iArr3[i3] & j8) + (j10 >>> 32);
            iArr3[i3] = (int) j11;
            long j12 = (j9 * j4) + (iArr3[r15] & j8) + (j11 >>> 32);
            iArr3[i2 + 2] = (int) j12;
            long j13 = (j9 * j5) + (iArr3[r2] & j8) + (j12 >>> 32);
            iArr3[i2 + 3] = (int) j13;
            long j14 = (j9 * j6) + (iArr3[r2] & j8) + (j13 >>> 32);
            iArr3[i2 + 4] = (int) j14;
            long j15 = (j14 >>> 32) + (iArr3[r2] & j8) + j7;
            iArr3[i2 + 5] = (int) j15;
            j7 = j15 >>> 32;
            j = j8;
            j2 = j2;
            i = i3;
        }
        return (int) j7;
    }

    public static final void purchase(String str, String str2, float f, Function1 function1, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        String str3;
        String str4;
        InterfaceC12864e interfaceC12864e2;
        InterfaceC3314e interfaceC3314e;
        boolean z;
        C5170e c5170e;
        int i2;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(1284117108);
        int i3 = i | (c13770e2.purchase(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= c13770e2.purchase(str2) ? 32 : 16;
        }
        int i4 = i3 | (c13770e2.metrica(f) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e2.yandex(function1) ? 2048 : 1024) | 24576;
        if (c13770e2.m3673protected(i4 & 1, (i4 & 9363) != 9362)) {
            Object m3681throw = c13770e2.m3681throw();
            C5170e c5170e2 = C2987e.ad;
            if (m3681throw == c5170e2) {
                m3681throw = AbstractC14533e.startapp(new C0398e(0L, 6, String.valueOf(f)));
                c13770e2.m3682throws(m3681throw);
            }
            InterfaceC3314e interfaceC3314e2 = (InterfaceC3314e) m3681throw;
            Object m3681throw2 = c13770e2.m3681throw();
            if (m3681throw2 == c5170e2) {
                m3681throw2 = AbstractC14533e.startapp(Boolean.FALSE);
                c13770e2.m3682throws(m3681throw2);
            }
            InterfaceC3314e interfaceC3314e3 = (InterfaceC3314e) m3681throw2;
            if (((Boolean) interfaceC3314e3.getValue()).booleanValue()) {
                c13770e2.m3676strictfp(-140576172);
                Object m3681throw3 = c13770e2.m3681throw();
                int i5 = 8;
                if (m3681throw3 == c5170e2) {
                    m3681throw3 = new C1672e(interfaceC3314e3, i5);
                    c13770e2.m3682throws(m3681throw3);
                }
                c5170e = c5170e2;
                z = false;
                interfaceC3314e = interfaceC3314e3;
                AbstractC9262e.ad((Function0) m3681throw3, AbstractC16653e.license(-838083641, new C4197e(i5, function1, interfaceC3314e3, interfaceC3314e2), c13770e2), null, AbstractC16653e.license(2088423045, new C5776e(interfaceC3314e3, 3), c13770e2), null, AbstractC16653e.license(719962435, new C11449e(str, 5), c13770e2), AbstractC16653e.license(35732130, new C6409e((Object) function1, interfaceC3314e2, (Object) interfaceC3314e3, (Object) str2, 6), c13770e2), null, 0L, 0L, 0L, 0L, 0.0f, null, c13770e, 1772598, 0, 16276);
                c13770e2 = c13770e;
            } else {
                interfaceC3314e = interfaceC3314e3;
                z = false;
                c5170e = c5170e2;
                c13770e2.m3676strictfp(-143594642);
            }
            c13770e2.Signature(z);
            float f2 = AbstractC11992e.ad;
            C8872e ad2 = AbstractC11992e.ad(C3618e.startapp, 0L, 0L, 0L, c13770e2, 510);
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e metrica2 = AbstractC18007e.metrica(c0115e, 1.0f);
            Object m3681throw4 = c13770e2.m3681throw();
            if (m3681throw4 == c5170e) {
                i2 = 6;
                m3681throw4 = new C1672e(interfaceC3314e, i2);
                c13770e2.m3682throws(m3681throw4);
            } else {
                i2 = 6;
            }
            InterfaceC12864e license2 = AbstractC9546e.license(metrica2, z, null, (Function0) m3681throw4, 15);
            str3 = str;
            str4 = str2;
            AbstractC16429e.ad(AbstractC16653e.license(-272641326, new C11449e(str3, i2), c13770e2), license2, null, AbstractC16653e.license(-1419052139, new C17111e(str4, f), c13770e2), null, null, ad2, 0.0f, 0.0f, c13770e, 3078, 436);
            interfaceC12864e2 = c0115e;
        } else {
            str3 = str;
            str4 = str2;
            c13770e.m3659default();
            interfaceC12864e2 = interfaceC12864e;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4305e(str3, str4, f, function1, interfaceC12864e2, i);
        }
    }

    public static void remoteconfig(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr[0] & 4294967295L;
        long j7 = j6 * j;
        iArr3[0] = (int) j7;
        char c = ' ';
        long j8 = (j7 >>> 32) + (j6 * j2);
        iArr3[1] = (int) j8;
        long j9 = (j8 >>> 32) + (j6 * j3);
        iArr3[2] = (int) j9;
        long j10 = (j9 >>> 32) + (j6 * j4);
        iArr3[3] = (int) j10;
        long j11 = (j6 * j5) + (j10 >>> 32);
        iArr3[4] = (int) j11;
        iArr3[5] = (int) (j11 >>> 32);
        int i = 1;
        for (int i2 = 5; i < i2; i2 = 5) {
            long j12 = iArr[i] & 4294967295L;
            int i3 = i;
            long j13 = (j12 * j) + (iArr3[i] & 4294967295L);
            iArr3[i3] = (int) j13;
            long j14 = j13 >>> c;
            long j15 = j12 * j2;
            int i4 = i3 + 1;
            char c2 = c;
            long j16 = j15 + (iArr3[i4] & 4294967295L) + j14;
            iArr3[i4] = (int) j16;
            long j17 = (j12 * j3) + (iArr3[r11] & 4294967295L) + (j16 >>> c2);
            iArr3[i3 + 2] = (int) j17;
            long j18 = (j12 * j4) + (iArr3[r11] & 4294967295L) + (j17 >>> c2);
            iArr3[i3 + 3] = (int) j18;
            long j19 = j18 >>> c2;
            long j20 = (j12 * j5) + (iArr3[r7] & 4294967295L) + j19;
            iArr3[i3 + 4] = (int) j20;
            iArr3[i3 + 5] = (int) (j20 >>> c2);
            i = i4;
            c = c2;
        }
    }

    public static void signatures(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i = 10;
        int i2 = 0;
        int i3 = 4;
        while (true) {
            int i4 = i3 - 1;
            long j2 = iArr[i3] & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i - 1] = (i2 << 31) | ((int) (j3 >>> 33));
            i -= 2;
            iArr2[i] = (int) (j3 >>> 1);
            i2 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | ((i2 << 31) & 4294967295L);
                iArr2[0] = (int) j4;
                int i5 = ((int) (j4 >>> 32)) & 1;
                long j6 = iArr[1] & 4294967295L;
                long j7 = (j6 * j) + j5;
                int i6 = (int) j7;
                iArr2[1] = i5 | (i6 << 1);
                long j8 = iArr[2] & 4294967295L;
                long j9 = (j8 * j) + (iArr2[2] & 4294967295L) + (j7 >>> 32);
                int i7 = (int) j9;
                iArr2[2] = (i7 << 1) | (i6 >>> 31);
                long amazon = AbstractC1786e.amazon(j8, j6, j9 >>> 32, iArr2[3] & 4294967295L);
                long j10 = (iArr2[4] & 4294967295L) + (amazon >>> 32);
                long j11 = iArr[3] & 4294967295L;
                long j12 = (iArr2[5] & 4294967295L) + (j10 >>> 32);
                long j13 = j10 & 4294967295L;
                long j14 = (iArr2[6] & 4294967295L) + (j12 >>> 32);
                long j15 = j12 & 4294967295L;
                long j16 = (j11 * j) + (amazon & 4294967295L);
                int i8 = (int) j16;
                iArr2[3] = (i7 >>> 31) | (i8 << 1);
                int i9 = i8 >>> 31;
                long amazon2 = AbstractC1786e.amazon(j11, j6, j16 >>> 32, j13);
                long amazon3 = AbstractC1786e.amazon(j11, j8, amazon2 >>> 32, j15);
                long j17 = j14 + (amazon3 >>> 32);
                long j18 = iArr[4] & 4294967295L;
                long j19 = (iArr2[7] & 4294967295L) + (j17 >>> 32);
                long j20 = j17 & 4294967295L;
                long j21 = (iArr2[8] & 4294967295L) + (j19 >>> 32);
                long j22 = (j18 * j) + (amazon2 & 4294967295L);
                int i10 = (int) j22;
                iArr2[4] = i9 | (i10 << 1);
                int i11 = i10 >>> 31;
                long amazon4 = AbstractC1786e.amazon(j18, j6, j22 >>> 32, amazon3 & 4294967295L);
                long amazon5 = AbstractC1786e.amazon(j18, j8, amazon4 >>> 32, j20);
                long amazon6 = AbstractC1786e.amazon(j18, j11, amazon5 >>> 32, j19 & 4294967295L);
                long j23 = j21 + (amazon6 >>> 32);
                int i12 = (int) amazon4;
                iArr2[5] = (i12 << 1) | i11;
                int i13 = (int) amazon5;
                iArr2[6] = (i12 >>> 31) | (i13 << 1);
                int i14 = i13 >>> 31;
                int i15 = (int) amazon6;
                iArr2[7] = i14 | (i15 << 1);
                int i16 = i15 >>> 31;
                int i17 = (int) j23;
                iArr2[8] = i16 | (i17 << 1);
                iArr2[9] = ((iArr2[9] + ((int) (j23 >>> 32))) << 1) | (i17 >>> 31);
                return;
            }
            i3 = i4;
        }
    }

    public static boolean smaato(int[] iArr, int[] iArr2) {
        for (int i = 4; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int startapp(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        return (int) (j5 >>> 32);
    }

    public static boolean subscription(int[] iArr) {
        for (int i = 0; i < 5; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int tapsense(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        return (int) (j5 >> 32);
    }

    public static final void vip(C2892e c2892e, C2892e c2892e2, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        int i2;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-1136490665);
        if ((i & 6) == 0) {
            i2 = (c13770e2.yandex(c2892e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e2.yandex(c2892e2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e2.purchase(interfaceC12864e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i3 = i2;
        if (c13770e2.m3673protected(i3 & 1, (i3 & 147) != 146)) {
            C15492e c15492e = AbstractC11785e.ad;
            C1839e c1839e = new C1839e(((C7019e) c13770e2.adcel(c15492e)).ad.remoteconfig, AbstractC13362e.startapp(14), null, null, 0L, 0L, 0, 0, 0L, 16777212);
            C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.billing(16), C5438e.f11672e, c13770e2, 6);
            long j = c13770e2.f27286case;
            int i4 = (int) ((j >>> 32) ^ j);
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, interfaceC12864e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, ad2, C2721e.billing);
            AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i4), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
            AbstractC0865e.ad(AbstractC18007e.metrica(AbstractC18007e.license(C0115e.f1276e, 200), 1.0f), ((C7019e) c13770e2.adcel(c15492e)).metrica.appmetrica, AbstractC12322e.vip(((C7019e) c13770e2.adcel(c15492e)).ad.subscription, 0L, 0L, 0L, c13770e2, 0, 14), null, null, c2892e, c13770e, ((i3 << 15) & 458752) | 6, 24);
            c13770e2 = c13770e;
            AbstractC14489e.ad(c1839e, c2892e2, c13770e2, i3 & 112);
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C9381e(c2892e, c2892e2, interfaceC12864e, i, 12);
        }
    }

    public static final void yandex(final boolean z, final int i, final C15860e c15860e, C13770e c13770e, final int i2) {
        int i3;
        C0866e license2;
        c13770e.m3671package(-1344558920);
        if ((i2 & 6) == 0) {
            i3 = (c13770e.billing(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c13770e.license(AbstractC8703e.m2467class(i)) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c13770e.yandex(c15860e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c13770e.m3673protected(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 14;
            boolean purchase = (i4 == 4) | c13770e.purchase(c15860e);
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            if (purchase || m3681throw == obj) {
                m3681throw = new C17588e(c15860e, z);
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC11944e interfaceC11944e = (InterfaceC11944e) m3681throw;
            boolean yandex = c13770e.yandex(c15860e) | (i4 == 4);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex || m3681throw2 == obj) {
                m3681throw2 = new C2619e(c15860e, z);
                c13770e.m3682throws(m3681throw2);
            }
            InterfaceC6790e interfaceC6790e = (InterfaceC6790e) m3681throw2;
            boolean yandex2 = C12347e.yandex(c15860e.amazon().vip);
            int i5 = (int) (z ? c15860e.amazon().vip >> 32 : c15860e.amazon().vip & 4294967295L);
            C7911e c7911e = c15860e.license;
            float license3 = (c7911e == null || (license2 = c7911e.license()) == null) ? 0.0f : AbstractC7255e.license(license2.ad, i5);
            boolean yandex3 = c13770e.yandex(interfaceC11944e);
            Object m3681throw3 = c13770e.m3681throw();
            if (yandex3 || m3681throw3 == obj) {
                m3681throw3 = new C0543e(interfaceC11944e, 1);
                c13770e.m3682throws(m3681throw3);
            }
            AbstractC9357e.vip(interfaceC6790e, z, i, yandex2, 0L, license3, new C8128e(interfaceC11944e, null, null, (PointerInputEventHandler) m3681throw3, 6), c13770e, (i3 << 3) & 1008, 16);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eًٟؒ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int advert = AbstractC5190e.advert(i2 | 1);
                    AbstractC15077e.yandex(z, i, c15860e, (C13770e) obj2, advert);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
