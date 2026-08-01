package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8738e {
    public static final C2892e vip = new C2892e(-644856200, false, new C11832e(18));
    public final /* synthetic */ int ad;

    public static final void ad(final boolean z, final long j, final InterfaceC12864e interfaceC12864e, C13770e c13770e, final int i) {
        int i2;
        C13770e c13770e2;
        c13770e.m3671package(-98306080);
        if ((i & 6) == 0) {
            i2 = (c13770e.billing(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (c13770e.appmetrica(j) ? 32 : 16);
        if ((i & 384) == 0) {
            i3 |= c13770e.purchase(interfaceC12864e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c13770e.m3673protected(i3 & 1, (i3 & 147) != 146)) {
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            if (m3681throw == obj) {
                m3681throw = new C4051e(z);
                c13770e.m3682throws(m3681throw);
            }
            C4051e c4051e = (C4051e) m3681throw;
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == obj) {
                m3681throw2 = new C2562e();
                c13770e.m3682throws(m3681throw2);
            }
            C2562e c2562e = (C2562e) m3681throw2;
            float f = !z ? 1.0f : 0.0f;
            boolean yandex = c13770e.yandex(c4051e);
            Object m3681throw3 = c13770e.m3681throw();
            if (yandex || m3681throw3 == obj) {
                m3681throw3 = new C6846e(21, c4051e);
                c13770e.m3682throws(m3681throw3);
            }
            InterfaceC16132e vip2 = AbstractC16102e.vip(f, null, null, (Function1) m3681throw3, c13770e, 0, 14);
            c13770e2 = c13770e;
            boolean purchase = c13770e2.purchase(vip2) | c13770e2.yandex(c4051e) | ((i3 & 112) == 32);
            Object m3681throw4 = c13770e2.m3681throw();
            if (purchase || m3681throw4 == obj) {
                Object c8830e = new C8830e(vip2, c2562e, c4051e, j);
                c13770e2.m3682throws(c8830e);
                m3681throw4 = c8830e;
            }
            AbstractC18366e.ad(interfaceC12864e, (Function1) m3681throw4, c13770e2, (i3 >> 6) & 14);
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eُؗۢ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    C8738e.ad(z, j, interfaceC12864e, (C13770e) obj2, AbstractC5190e.advert(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final float appmetrica(float f, float f2, float f3) {
        return (f3 * f2) + ((1 - f3) * f);
    }

    public static String billing(int i) {
        return i == 0 ? "Clear" : i == 1 ? "Src" : i == 2 ? "Dst" : i == 3 ? "SrcOver" : i == 4 ? "DstOver" : i == 5 ? "SrcIn" : i == 6 ? "DstIn" : i == 7 ? "SrcOut" : i == 8 ? "DstOut" : i == 9 ? "SrcAtop" : i == 10 ? "DstAtop" : i == 11 ? "Xor" : i == 12 ? "Plus" : i == 13 ? "Modulate" : i == 14 ? "Screen" : i == 15 ? "Overlay" : i == 16 ? "Darken" : i == 17 ? "Lighten" : i == 18 ? "ColorDodge" : i == 19 ? "ColorBurn" : i == 20 ? "HardLight" : i == 21 ? "Softlight" : i == 22 ? "Difference" : i == 23 ? "Exclusion" : i == 24 ? "Multiply" : i == 25 ? "Hue" : i == 26 ? "Saturation" : i == 27 ? "Color" : i == 28 ? "Luminosity" : "Unknown";
    }

    public static C11078e vip(C7127e c7127e) {
        if (!(c7127e instanceof C7127e)) {
            throw new C14803e(10);
        }
        ArrayList arrayList = new ArrayList(20);
        for (int i = 0; i < 20; i++) {
            arrayList.add(new C3618e(C3618e.vip(AbstractC17419e.metrica(1.0f, 0.0f, c7127e.ad.ad((i * 1.0f) / 19)), C3618e.yandex)));
        }
        return new C11078e(arrayList, null, c7127e.vip, c7127e.metrica, 0);
    }

    public static int yandex(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            C8738e c8738e = AbstractC15375e.ad;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return AbstractC15375e.metrica(i, AbstractC14352e.billing(j, bArr));
        }
        if (i2 == 2) {
            return AbstractC15375e.license(i, AbstractC14352e.billing(j, bArr), AbstractC14352e.billing(j + 1, bArr));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return r27 + r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int license(java.lang.String r25, byte[] r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8738e.license(java.lang.String, byte[], int, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String metrica(int r11, int r12, byte[] r13) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8738e.metrica(int, int, byte[]):java.lang.String");
    }

    public final int purchase(int i, int i2, byte[] bArr) {
        byte b;
        long j;
        int i3 = i;
        byte b2 = -96;
        byte b3 = -62;
        switch (this.ad) {
            case 0:
                while (i3 < i2 && bArr[i3] >= 0) {
                    i3++;
                }
                if (i3 < i2) {
                    while (i3 < i2) {
                        int i4 = i3 + 1;
                        byte b4 = bArr[i3];
                        if (b4 < 0) {
                            if (b4 < -32) {
                                if (i4 >= i2) {
                                    return b4;
                                }
                                if (b4 >= -62) {
                                    i3 += 2;
                                    if (bArr[i4] > -65) {
                                    }
                                }
                                return -1;
                            }
                            if (b4 >= -16) {
                                if (i4 >= i2 - 2) {
                                    return AbstractC15375e.ad(i4, i2, bArr);
                                }
                                int i5 = i3 + 2;
                                byte b5 = bArr[i4];
                                if (b5 <= -65 && (((b5 + 112) + (b4 << 28)) >> 30) == 0) {
                                    int i6 = i3 + 3;
                                    if (bArr[i5] <= -65) {
                                        i3 += 4;
                                        if (bArr[i6] > -65) {
                                        }
                                    }
                                }
                                return -1;
                            }
                            if (i4 >= i2 - 1) {
                                return AbstractC15375e.ad(i4, i2, bArr);
                            }
                            int i7 = i3 + 2;
                            byte b6 = bArr[i4];
                            if (b6 <= -65 && ((b4 != -32 || b6 >= -96) && (b4 != -19 || b6 < -96))) {
                                i3 += 3;
                                if (bArr[i7] > -65) {
                                }
                            }
                            return -1;
                        }
                        i3 = i4;
                    }
                }
                return 0;
            default:
                if ((i3 | i2 | (bArr.length - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i3), Integer.valueOf(i2)));
                }
                int i8 = 0;
                long j2 = i3;
                int i9 = (int) (i2 - j2);
                if (i9 < 16) {
                    b = 0;
                    j = j2;
                } else {
                    int i10 = 8 - (((int) j2) & 7);
                    b = 0;
                    j = j2;
                    long j3 = j;
                    while (true) {
                        if (i8 < i10) {
                            long j4 = j3 + 1;
                            if (AbstractC14352e.billing(j3, bArr) >= 0) {
                                i8++;
                                j3 = j4;
                            }
                        } else {
                            while (true) {
                                int i11 = i8 + 8;
                                if (i11 <= i9 && (AbstractC14352e.metrica.yandex(AbstractC14352e.purchase + j3, bArr) & (-9187201950435737472L)) == 0) {
                                    j3 += 8;
                                    i8 = i11;
                                }
                            }
                            while (true) {
                                if (i8 < i9) {
                                    long j5 = j3 + 1;
                                    if (AbstractC14352e.billing(j3, bArr) >= 0) {
                                        i8++;
                                        j3 = j5;
                                    }
                                } else {
                                    i8 = i9;
                                }
                            }
                        }
                    }
                }
                int i12 = i9 - i8;
                long j6 = j + i8;
                while (true) {
                    byte b7 = b;
                    while (true) {
                        if (i12 > 0) {
                            long j7 = j6 + 1;
                            b7 = AbstractC14352e.billing(j6, bArr);
                            if (b7 >= 0) {
                                i12--;
                                j6 = j7;
                            } else {
                                j6 = j7;
                            }
                        }
                    }
                    if (i12 == 0) {
                        return b;
                    }
                    int i13 = i12 - 1;
                    if (b7 < -32) {
                        if (i13 == 0) {
                            return b7;
                        }
                        i12 -= 2;
                        if (b7 >= b3) {
                            long j8 = j6 + 1;
                            if (AbstractC14352e.billing(j6, bArr) <= -65) {
                                j6 = j8;
                                b2 = -96;
                                b3 = -62;
                            }
                        }
                    } else if (b7 < -16) {
                        if (i13 < 2) {
                            return yandex(j6, bArr, b7, i13);
                        }
                        i12 -= 3;
                        long j9 = j6 + 1;
                        byte billing = AbstractC14352e.billing(j6, bArr);
                        if (billing <= -65 && ((b7 != -32 || billing >= b2) && (b7 != -19 || billing < b2))) {
                            j6 += 2;
                            if (AbstractC14352e.billing(j9, bArr) <= -65) {
                                b2 = -96;
                                b3 = -62;
                            }
                        }
                    } else {
                        if (i13 < 3) {
                            return yandex(j6, bArr, b7, i13);
                        }
                        i12 -= 4;
                        long j10 = j6 + 1;
                        byte billing2 = AbstractC14352e.billing(j6, bArr);
                        if (billing2 <= -65 && (((billing2 + 112) + (b7 << 28)) >> 30) == 0) {
                            long j11 = j6 + 2;
                            if (AbstractC14352e.billing(j10, bArr) <= -65) {
                                j6 += 3;
                                if (AbstractC14352e.billing(j11, bArr) <= -65) {
                                    b2 = -96;
                                    b3 = -62;
                                }
                            }
                        }
                    }
                }
                return -1;
        }
    }
}
