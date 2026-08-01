package defpackage;

import android.content.pm.PackageInfo;
import android.os.StrictMode;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؕۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1599e {
    public static final C13023e ad = new C13023e(6);

    public static final void ad(final boolean z, InterfaceC12864e interfaceC12864e, long j, int i, float f, float f2, float f3, float f4, C13770e c13770e, final int i2, final int i3) {
        final long j2;
        int i4;
        InterfaceC12864e interfaceC12864e2;
        final int i5;
        final float f5;
        final float f6;
        final float f7;
        final float f8;
        float f9;
        Object obj;
        float f10;
        float[] fArr;
        float f11;
        InterfaceC17838e[] interfaceC17838eArr;
        Object obj2;
        float f12;
        float[] fArr2;
        C2616e c2616e;
        int i6;
        InterfaceC3314e interfaceC3314e;
        final C2616e c2616e2;
        boolean z2;
        int i7;
        final float f13;
        final float f14;
        final float f15;
        c13770e.m3671package(-2007679889);
        int i8 = i2 | (c13770e.billing(z) ? 4 : 2);
        int i9 = i3 & 4;
        if (i9 != 0) {
            i4 = i8 | 384;
            j2 = j;
        } else {
            j2 = j;
            i4 = i8 | (c13770e.appmetrica(j2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        }
        int i10 = i4 | 14380032;
        if (c13770e.m3673protected(i10 & 1, (4793491 & i10) != 4793490)) {
            long j3 = i9 != 0 ? C3618e.appmetrica : j2;
            float f16 = 3;
            float f17 = 2;
            float f18 = 16;
            float f19 = 1;
            Object m3681throw = c13770e.m3681throw();
            Object obj3 = C2987e.ad;
            Object obj4 = m3681throw;
            if (m3681throw == obj3) {
                float[] fArr3 = new float[4];
                for (int i11 = 0; i11 < 4; i11++) {
                    fArr3[i11] = 0.0f;
                }
                c13770e.m3682throws(fArr3);
                obj4 = fArr3;
            }
            float[] fArr4 = (float[]) obj4;
            Object m3681throw2 = c13770e.m3681throw();
            Object obj5 = m3681throw2;
            if (m3681throw2 == obj3) {
                float[] fArr5 = new float[4];
                for (int i12 = 0; i12 < 4; i12++) {
                    fArr5[i12] = 0.0f;
                }
                c13770e.m3682throws(fArr5);
                obj5 = fArr5;
            }
            float[] fArr6 = (float[]) obj5;
            Object m3681throw3 = c13770e.m3681throw();
            Object obj6 = m3681throw3;
            if (m3681throw3 == obj3) {
                InterfaceC17838e[] interfaceC17838eArr2 = new InterfaceC17838e[4];
                for (int i13 = 0; i13 < 4; i13++) {
                    interfaceC17838eArr2[i13] = AbstractC3734e.vip;
                }
                c13770e.m3682throws(interfaceC17838eArr2);
                obj6 = interfaceC17838eArr2;
            }
            InterfaceC17838e[] interfaceC17838eArr3 = (InterfaceC17838e[]) obj6;
            Object m3681throw4 = c13770e.m3681throw();
            if (m3681throw4 == obj3) {
                f9 = f17;
                m3681throw4 = new C9260e(AbstractC12696e.yandex(150, 6, null), AbstractC9546e.ad, Float.valueOf(0.0f), Float.valueOf(1.0f), null);
                c13770e.m3682throws(m3681throw4);
            } else {
                f9 = f17;
            }
            Object obj7 = (C9260e) m3681throw4;
            Object m3681throw5 = c13770e.m3681throw();
            if (m3681throw5 == obj3) {
                obj = obj3;
                m3681throw5 = new C15867e(0L);
                c13770e.m3682throws(m3681throw5);
            } else {
                obj = obj3;
            }
            C15867e c15867e = (C15867e) m3681throw5;
            Object m3681throw6 = c13770e.m3681throw();
            Object obj8 = obj;
            if (m3681throw6 == obj8) {
                m3681throw6 = new C2616e(0.0f);
                c13770e.m3682throws(m3681throw6);
            }
            C2616e c2616e3 = (C2616e) m3681throw6;
            Object m3681throw7 = c13770e.m3681throw();
            if (m3681throw7 == obj8) {
                m3681throw7 = AbstractC14533e.startapp(Boolean.TRUE);
                c13770e.m3682throws(m3681throw7);
            }
            InterfaceC3314e interfaceC3314e2 = (InterfaceC3314e) m3681throw7;
            final long j4 = j3;
            Boolean valueOf = Boolean.valueOf(z);
            int i14 = i10 & 14;
            boolean yandex = (i14 == 4) | c13770e.yandex(fArr4) | c13770e.yandex(fArr6) | c13770e.yandex(interfaceC17838eArr3);
            Object m3681throw8 = c13770e.m3681throw();
            if (yandex || m3681throw8 == obj8) {
                f10 = f18;
                fArr = fArr6;
                f11 = f19;
                interfaceC17838eArr = interfaceC17838eArr3;
                obj2 = obj8;
                f12 = f16;
                fArr2 = fArr4;
                c2616e = c2616e3;
                i6 = 6;
                interfaceC3314e = interfaceC3314e2;
                m3681throw8 = new C16056e(z, fArr2, fArr, interfaceC17838eArr, interfaceC3314e, c15867e, null);
                c13770e.m3682throws(m3681throw8);
            } else {
                f10 = f18;
                fArr = fArr6;
                f12 = f16;
                f11 = f19;
                fArr2 = fArr4;
                interfaceC17838eArr = interfaceC17838eArr3;
                c2616e = c2616e3;
                i6 = 6;
                interfaceC3314e = interfaceC3314e2;
                obj2 = obj8;
            }
            AbstractC17680e.license(c13770e, valueOf, (Function2) m3681throw8);
            if (((Boolean) interfaceC3314e.getValue()).booleanValue()) {
                c13770e.m3676strictfp(924558011);
                boolean yandex2 = c13770e.yandex(obj7);
                Object m3681throw9 = c13770e.m3681throw();
                if (yandex2 || m3681throw9 == obj2) {
                    m3681throw9 = new C1247e(obj7, c15867e, c2616e, (InterfaceC5083e) null, 11);
                    c2616e2 = c2616e;
                    c13770e.m3682throws(m3681throw9);
                } else {
                    c2616e2 = c2616e;
                }
                AbstractC17680e.license(c13770e, fArr2, (Function2) m3681throw9);
                z2 = false;
            } else {
                c2616e2 = c2616e;
                z2 = false;
                c13770e.m3676strictfp(921212243);
            }
            c13770e.Signature(z2);
            boolean yandex3 = ((i10 & 896) == 256 ? true : z2) | c13770e.yandex(fArr2) | c13770e.yandex(fArr) | c13770e.yandex(interfaceC17838eArr) | (i14 == 4 ? true : z2);
            Object m3681throw10 = c13770e.m3681throw();
            if (yandex3 || m3681throw10 == obj2) {
                i7 = 4;
                final float[] fArr7 = fArr;
                final InterfaceC17838e[] interfaceC17838eArr4 = interfaceC17838eArr;
                final InterfaceC3314e interfaceC3314e3 = interfaceC3314e;
                f13 = f10;
                final float f20 = f9;
                f14 = f12;
                final float[] fArr8 = fArr2;
                f15 = f11;
                m3681throw10 = new Function1() { // from class: eؘؖۛ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj9) {
                        InterfaceC2235e interfaceC2235e;
                        float f21;
                        float f22;
                        Throwable th;
                        float[] fArr9 = fArr8;
                        float[] fArr10 = fArr7;
                        InterfaceC17838e[] interfaceC17838eArr5 = interfaceC17838eArr4;
                        long j5 = j4;
                        C2616e c2616e4 = c2616e2;
                        InterfaceC3314e interfaceC3314e4 = interfaceC3314e3;
                        InterfaceC2235e interfaceC2235e2 = (InterfaceC2235e) obj9;
                        float mo497instanceof = interfaceC2235e2.mo497instanceof(f14);
                        float mo497instanceof2 = interfaceC2235e2.mo497instanceof(f15);
                        float mo497instanceof3 = interfaceC2235e2.mo497instanceof(f13);
                        float mo497instanceof4 = interfaceC2235e2.mo497instanceof(f20);
                        float f23 = mo497instanceof + mo497instanceof2;
                        int i15 = 4;
                        float intBitsToFloat = (Float.intBitsToFloat((int) (interfaceC2235e2.yandex() >> 32)) - ((4 * f23) - mo497instanceof2)) / 2.0f;
                        float intBitsToFloat2 = (Float.intBitsToFloat((int) (interfaceC2235e2.yandex() & 4294967295L)) - mo497instanceof3) / 2.0f;
                        ((C5389e) interfaceC2235e2.mo782finally().f36228e).m1898this(intBitsToFloat, intBitsToFloat2);
                        int i16 = 0;
                        float f24 = 0.0f;
                        while (i16 < i15) {
                            try {
                                float[] fArr11 = fArr9;
                                float[] fArr12 = fArr10;
                                float startapp = AbstractC15842e.startapp(fArr9[i16], fArr10[i16], interfaceC17838eArr5[i16].ad(c2616e4.purchase()));
                                float max = mo497instanceof3 - Math.max(startapp * mo497instanceof3, mo497instanceof4);
                                float f25 = startapp + f24;
                                InterfaceC17838e[] interfaceC17838eArr6 = interfaceC17838eArr5;
                                long floatToRawIntBits = (Float.floatToRawIntBits(max) & 4294967295L) | (Float.floatToRawIntBits(i16 * f23) << 32);
                                long floatToRawIntBits2 = (Float.floatToRawIntBits(mo497instanceof3 - max) & 4294967295L) | (Float.floatToRawIntBits(mo497instanceof) << 32);
                                int i17 = i16;
                                C2616e c2616e5 = c2616e4;
                                interfaceC2235e = interfaceC2235e2;
                                f22 = intBitsToFloat2;
                                InterfaceC3314e interfaceC3314e5 = interfaceC3314e4;
                                f21 = intBitsToFloat;
                                float f26 = mo497instanceof4;
                                try {
                                    AbstractC4653e.subscription(interfaceC2235e, j5, floatToRawIntBits, floatToRawIntBits2, 0.0f, null, null, 0, 120);
                                    i16 = i17 + 1;
                                    f24 = f25;
                                    intBitsToFloat = f21;
                                    interfaceC3314e4 = interfaceC3314e5;
                                    interfaceC2235e2 = interfaceC2235e;
                                    fArr9 = fArr11;
                                    fArr10 = fArr12;
                                    interfaceC17838eArr5 = interfaceC17838eArr6;
                                    mo497instanceof4 = f26;
                                    i15 = 4;
                                    intBitsToFloat2 = f22;
                                    c2616e4 = c2616e5;
                                } catch (Throwable th2) {
                                    th = th2;
                                    ((C5389e) interfaceC2235e.mo782finally().f36228e).m1898this(-f21, -f22);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                interfaceC2235e = interfaceC2235e2;
                                f21 = intBitsToFloat;
                                f22 = intBitsToFloat2;
                                ((C5389e) interfaceC2235e.mo782finally().f36228e).m1898this(-f21, -f22);
                                throw th;
                            }
                        }
                        InterfaceC3314e interfaceC3314e6 = interfaceC3314e4;
                        interfaceC2235e = interfaceC2235e2;
                        f21 = intBitsToFloat;
                        f22 = intBitsToFloat2;
                        if (!z && f24 == 0.0f) {
                            interfaceC3314e6.setValue(Boolean.FALSE);
                        }
                        ((C5389e) interfaceC2235e.mo782finally().f36228e).m1898this(-f21, -f22);
                        return Unit.INSTANCE;
                    }
                };
                c13770e.m3682throws(m3681throw10);
            } else {
                i7 = 4;
                f13 = f10;
                f15 = f11;
                f14 = f12;
            }
            interfaceC12864e2 = interfaceC12864e;
            AbstractC18366e.ad(interfaceC12864e2, (Function1) m3681throw10, c13770e, i6);
            f5 = f14;
            f8 = f15;
            f7 = f13;
            i5 = i7;
            f6 = f9;
            j2 = j4;
        } else {
            interfaceC12864e2 = interfaceC12864e;
            c13770e.m3659default();
            i5 = i;
            f5 = f;
            f6 = f2;
            f7 = f3;
            f8 = f4;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            final InterfaceC12864e interfaceC12864e3 = interfaceC12864e2;
            subscription.license = new Function2(z, interfaceC12864e3, j2, i5, f5, f6, f7, f8, i2, i3) { // from class: eٜؑؒ

                /* renamed from: eّؑؑ, reason: contains not printable characters */
                public final /* synthetic */ float f1176e;

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ long f1177e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC12864e f1178e;

                /* renamed from: eٌٍٚ, reason: contains not printable characters */
                public final /* synthetic */ float f1179e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ int f1180e;

                /* renamed from: eّٕۜ, reason: contains not printable characters */
                public final /* synthetic */ int f1181e;

                /* renamed from: eّٖۦ, reason: contains not printable characters */
                public final /* synthetic */ boolean f1182e;

                /* renamed from: eؘَٗ, reason: contains not printable characters */
                public final /* synthetic */ float f1183e;

                /* renamed from: eٗۚۖ, reason: contains not printable characters */
                public final /* synthetic */ float f1184e;

                {
                    this.f1181e = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj9, Object obj10) {
                    ((Integer) obj10).getClass();
                    int advert = AbstractC5190e.advert(49);
                    AbstractC1599e.ad(this.f1182e, this.f1178e, this.f1177e, this.f1180e, this.f1176e, this.f1184e, this.f1183e, this.f1179e, (C13770e) obj9, advert, this.f1181e);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static void adcel(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[4];
        AbstractC15792e.license(2, jArr, jArr3);
        while (true) {
            startapp(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                AbstractC15792e.license(2, jArr2, jArr3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x012f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0317 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r3v2, types: [eؓۧ۠, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [eؓۧ۠] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void advert(android.content.Context r16, java.util.concurrent.Executor r17, defpackage.InterfaceC4732e r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1599e.advert(android.content.Context, java.util.concurrent.Executor, eًؗؖ, boolean):void");
    }

    public static final void appmetrica(InterfaceC17303e interfaceC17303e) {
        AbstractC5851e.yandex(interfaceC17303e, 2).m4404e();
    }

    public static void billing(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        metrica(jArr, jArr2, jArr4);
        startapp(jArr4, jArr3);
    }

    public static void license(long[] jArr, long j, long j2, long[] jArr2, int i) {
        jArr[1] = j2;
        long j3 = j2 << 1;
        jArr[2] = j3;
        long j4 = j3 ^ j2;
        jArr[3] = j4;
        long j5 = j2 << 2;
        jArr[4] = j5;
        jArr[5] = j5 ^ j2;
        long j6 = j4 << 1;
        jArr[6] = j6;
        jArr[7] = j6 ^ j2;
        long j7 = jArr[((int) j) & 7];
        long j8 = 0;
        int i2 = 48;
        do {
            int i3 = (int) (j >>> i2);
            long j9 = (jArr[i3 & 7] ^ (jArr[(i3 >>> 3) & 7] << 3)) ^ (jArr[(i3 >>> 6) & 7] << 6);
            j7 ^= j9 << i2;
            j8 ^= j9 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr2[i] = 144115188075855871L & j7;
        jArr2[i + 1] = (((((j & 72198606942111744L) & ((j2 << 7) >> 63)) >>> 8) ^ j8) << 7) ^ (j7 >>> 57);
    }

    public static void metrica(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = ((jArr[1] << 7) ^ (j >>> 57)) & 144115188075855871L;
        long j3 = j & 144115188075855871L;
        long j4 = jArr2[0];
        long j5 = ((j4 >>> 57) ^ (jArr2[1] << 7)) & 144115188075855871L;
        long j6 = j4 & 144115188075855871L;
        long[] jArr4 = new long[6];
        license(jArr3, j3, j6, jArr4, 0);
        license(jArr3, j2, j5, jArr4, 2);
        license(jArr3, j3 ^ j2, j6 ^ j5, jArr4, 4);
        long j7 = jArr4[1] ^ jArr4[2];
        long j8 = jArr4[0];
        long j9 = jArr4[3];
        long j10 = (jArr4[4] ^ j8) ^ j7;
        long j11 = j7 ^ (jArr4[5] ^ j9);
        jArr3[0] = j8 ^ (j10 << 57);
        jArr3[1] = (j10 >>> 7) ^ (j11 << 50);
        jArr3[2] = (j11 >>> 14) ^ (j9 << 43);
        jArr3[3] = j9 >>> 21;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void mopub(InterfaceC17303e interfaceC17303e, Function1 function1) {
        AbstractC17732e abstractC17732e;
        if (((AbstractC13616e) interfaceC17303e).f27022e.f27016e && (abstractC17732e = AbstractC5851e.yandex(interfaceC17303e, 2).f34777e) != null) {
            abstractC17732e.m4399e(function1, true);
        }
    }

    public static final void purchase(InterfaceC17303e interfaceC17303e) {
        AbstractC5851e.mopub(interfaceC17303e).m3710goto();
    }

    public static Object smaato(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void startapp(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = j3 ^ ((j4 >>> 40) ^ (j4 >>> 49));
        long j6 = j ^ ((j5 << 15) ^ (j5 << 24));
        long j7 = (j2 ^ ((j4 << 15) ^ (j4 << 24))) ^ ((j5 >>> 40) ^ (j5 >>> 49));
        long j8 = j7 >>> 49;
        jArr2[0] = (j6 ^ j8) ^ (j8 << 9);
        jArr2[1] = 562949953421311L & j7;
    }

    public static void vip(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void yandex(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }
}
