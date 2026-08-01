package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Path;
import android.net.Uri;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۙٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17976e {
    public static final C2892e ad = new C2892e(-1938796054, false, new C2131e(22));
    public static final C2892e vip = new C2892e(-117572982, false, new C2131e(23));
    public static final C2892e metrica = new C2892e(173893428, false, new C13428e(3));

    public static final void ad(C17985e c17985e, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180) * 3.141592653589793d;
        double cos = Math.cos(d11);
        double sin = Math.sin(d11);
        double d12 = ((d2 * sin) + (d * cos)) / d10;
        double d13 = ((d2 * cos) + ((-d) * sin)) / d6;
        double d14 = ((d4 * sin) + (d3 * cos)) / d10;
        double d15 = ((d4 * cos) + ((-d3) * sin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = 2;
        double d19 = (d12 + d14) / d18;
        double d20 = (d13 + d15) / d18;
        double d21 = (d17 * d17) + (d16 * d16);
        if (d21 == 0.0d) {
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d21) / 1.99999d);
            ad(c17985e, d, d2, d3, d4, d10 * sqrt, d6 * sqrt, d7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d22);
        double d23 = d16 * sqrt2;
        double d24 = sqrt2 * d17;
        if (z == z2) {
            d8 = d19 - d24;
            d9 = d20 + d23;
        } else {
            d8 = d19 + d24;
            d9 = d20 - d23;
        }
        double atan2 = Math.atan2(d13 - d9, d12 - d8);
        double atan22 = Math.atan2(d15 - d9, d14 - d8) - atan2;
        if (z2 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d25 = d8 * d10;
        double d26 = d9 * d6;
        double d27 = (d25 * cos) - (d26 * sin);
        double d28 = (d26 * cos) + (d25 * sin);
        double d29 = 4;
        int ceil = (int) Math.ceil(Math.abs((atan22 * d29) / 3.141592653589793d));
        double cos2 = Math.cos(d11);
        double sin2 = Math.sin(d11);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d30 = atan22;
        double d31 = -d10;
        double d32 = d31 * cos2;
        double d33 = d6 * sin2;
        double d34 = (d32 * sin3) - (d33 * cos3);
        double d35 = d31 * sin2;
        double d36 = d6 * cos2;
        double d37 = (cos3 * d36) + (sin3 * d35);
        double d38 = d30 / ceil;
        double d39 = atan2;
        double d40 = d34;
        int i = 0;
        double d41 = d;
        double d42 = d37;
        double d43 = d2;
        while (i < ceil) {
            double d44 = d39 + d38;
            double sin4 = Math.sin(d44);
            double cos4 = Math.cos(d44);
            int i2 = i;
            double d45 = (((d10 * cos2) * cos4) + d27) - (d33 * sin4);
            int i3 = ceil;
            double d46 = (d36 * sin4) + (d10 * sin2 * cos4) + d28;
            double d47 = (d32 * sin4) - (d33 * cos4);
            double d48 = (cos4 * d36) + (sin4 * d35);
            double d49 = d44 - d39;
            double tan = Math.tan(d49 / d18);
            double sqrt3 = ((Math.sqrt(((3.0d * tan) * tan) + d29) - 1) * Math.sin(d49)) / 3;
            c17985e.metrica((float) ((d40 * sqrt3) + d41), (float) ((d42 * sqrt3) + d43), (float) (d45 - (sqrt3 * d47)), (float) (d46 - (sqrt3 * d48)), (float) d45, (float) d46);
            d41 = d45;
            i = i2 + 1;
            d27 = d27;
            sin2 = sin2;
            d29 = d29;
            d39 = d44;
            d42 = d48;
            d40 = d47;
            d43 = d46;
            d10 = d5;
            ceil = i3;
        }
    }

    public static final List appmetrica(C2691e c2691e, C18478e c18478e) {
        AbstractC7919e abstractC7919e = (AbstractC7919e) c18478e.f36228e;
        if (AbstractC7890e.billing(Looper.myLooper(), Looper.getMainLooper())) {
            AbstractC14966e.ad(AbstractC11575e.vip(c2691e), 5, "[MediaStoreController] Running MediaStore queries on main thread is not recommended!", null);
        }
        AbstractC3219e[] abstractC3219eArr = (AbstractC3219e[]) c18478e.f36229e;
        ArrayList arrayList = new ArrayList();
        for (AbstractC3219e abstractC3219e : abstractC3219eArr) {
            if (!(abstractC3219e instanceof C7223e)) {
                arrayList.add(abstractC3219e);
            }
        }
        String m3608try = AbstractC13480e.m3608try(arrayList, " AND ", null, null, new C4526e(17), 30);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC3219e) it.next()).getClass();
        }
        ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((AbstractC3219e) it2.next()).getClass();
            arrayList3.add(null);
        }
        Cursor query = ((ContentResolver) c2691e.f6570e).query((Uri) abstractC7919e.f16035e, (String[]) abstractC7919e.f16034e, m3608try, (String[]) arrayList3.toArray(new String[0]), ((AbstractC8918e) c18478e.f36227e).ad);
        if (query == null) {
            return C13664e.f27089e;
        }
        try {
            ArrayList arrayList4 = new ArrayList();
            while (query.moveToNext()) {
                arrayList4.add(((Function1) abstractC7919e.f16036e).invoke(query));
            }
            query.close();
            return arrayList4;
        } finally {
        }
    }

    public static void billing(byte[] bArr, int i, byte[] bArr2) {
        int i2 = 0;
        do {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + i2]);
            int i3 = i2 + 1;
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i + i3]);
            int i4 = i2 + 2;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i + i4]);
            int i5 = i2 + 3;
            bArr[i5] = (byte) (bArr[i5] ^ bArr2[i + i5]);
            i2 += 4;
        } while (i2 < 16);
    }

    public static void license(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr2[0];
        long j4 = jArr2[1];
        long reverse = Long.reverse(j);
        long reverse2 = Long.reverse(j2);
        long reverse3 = Long.reverse(j3);
        long reverse4 = Long.reverse(j4);
        long reverse5 = Long.reverse(metrica(reverse, reverse3));
        long metrica2 = metrica(j, j3) << 1;
        long reverse6 = Long.reverse(metrica(reverse2, reverse4));
        long metrica3 = metrica(j2, j4);
        long j5 = metrica3 << 1;
        long reverse7 = Long.reverse(metrica(reverse ^ reverse2, reverse4 ^ reverse3));
        long metrica4 = ((metrica(j ^ j2, j3 ^ j4) << 1) ^ ((reverse6 ^ metrica2) ^ j5)) ^ ((metrica3 << 63) ^ (metrica3 << 58));
        jArr[0] = reverse5 ^ ((metrica4 >>> 7) ^ (((metrica4 >>> 1) ^ metrica4) ^ (metrica4 >>> 2)));
        jArr[1] = ((metrica4 << 57) ^ ((metrica4 << 63) ^ (metrica4 << 62))) ^ ((reverse7 ^ ((metrica2 ^ reverse5) ^ reverse6)) ^ (((j5 ^ (j5 >>> 1)) ^ (j5 >>> 2)) ^ (j5 >>> 7)));
    }

    public static long metrica(long j, long j2) {
        long j3 = j & 1229782938247303441L;
        long j4 = j & 2459565876494606882L;
        long j5 = j & 4919131752989213764L;
        long j6 = j & (-8608480567731124088L);
        long j7 = j2 & 1229782938247303441L;
        long j8 = j2 & 2459565876494606882L;
        long j9 = j2 & 4919131752989213764L;
        long j10 = j2 & (-8608480567731124088L);
        long j11 = (((j3 * j7) ^ (j4 * j10)) ^ (j5 * j9)) ^ (j6 * j8);
        long j12 = (((j3 * j8) ^ (j4 * j7)) ^ (j5 * j10)) ^ (j6 * j9);
        long j13 = (((j3 * j9) ^ (j4 * j8)) ^ (j5 * j7)) ^ (j6 * j10);
        return (j11 & 1229782938247303441L) | (j12 & 2459565876494606882L) | (j13 & 4919131752989213764L) | (((((j3 * j10) ^ (j4 * j9)) ^ (j5 * j8)) ^ (j6 * j7)) & (-8608480567731124088L));
    }

    public static final void purchase(List list, C17985e c17985e) {
        Path path;
        int i;
        float f;
        int i2;
        AbstractC13722e abstractC13722e;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        List list2 = list;
        C17985e c17985e2 = c17985e;
        Path path2 = c17985e2.ad;
        Path path3 = c17985e2.ad;
        int i3 = path2.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
        c17985e2.startapp();
        c17985e2.adcel(i3);
        AbstractC13722e abstractC13722e2 = list2.isEmpty() ? C11621e.metrica : (AbstractC13722e) list2.get(0);
        int size = list2.size();
        float f11 = 0.0f;
        int i4 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (i4 < size) {
            AbstractC13722e abstractC13722e3 = (AbstractC13722e) list2.get(i4);
            if (abstractC13722e3 instanceof C11621e) {
                c17985e2.vip();
                path = path3;
                i = size;
                f = f11;
                i2 = i4;
                abstractC13722e = abstractC13722e3;
                f12 = f16;
                f14 = f12;
                f13 = f17;
                f15 = f13;
            } else {
                if (abstractC13722e3 instanceof C11688e) {
                    C11688e c11688e = (C11688e) abstractC13722e3;
                    float f18 = c11688e.metrica;
                    f14 += f18;
                    float f19 = c11688e.license;
                    f15 += f19;
                    path3.rMoveTo(f18, f19);
                    path = path3;
                    i = size;
                    f = f11;
                    i2 = i4;
                    f16 = f14;
                    f17 = f15;
                } else {
                    if (abstractC13722e3 instanceof C8664e) {
                        C8664e c8664e = (C8664e) abstractC13722e3;
                        float f20 = c8664e.metrica;
                        float f21 = c8664e.license;
                        c17985e2.purchase(f20, f21);
                        f15 = f21;
                        f17 = f15;
                        path = path3;
                        f14 = f20;
                        f16 = f14;
                    } else {
                        if (abstractC13722e3 instanceof C11098e) {
                            C11098e c11098e = (C11098e) abstractC13722e3;
                            float f22 = c11098e.license;
                            float f23 = c11098e.metrica;
                            path3.rLineTo(f23, f22);
                            f14 += f23;
                            f15 += f22;
                        } else if (abstractC13722e3 instanceof C5161e) {
                            C5161e c5161e = (C5161e) abstractC13722e3;
                            float f24 = c5161e.license;
                            float f25 = c5161e.metrica;
                            c17985e2.appmetrica(f25, f24);
                            f14 = f25;
                            path = path3;
                            f15 = f24;
                        } else if (abstractC13722e3 instanceof C5795e) {
                            float f26 = ((C5795e) abstractC13722e3).metrica;
                            path3.rLineTo(f26, f11);
                            f14 += f26;
                        } else if (abstractC13722e3 instanceof C14810e) {
                            float f27 = ((C14810e) abstractC13722e3).metrica;
                            c17985e2.appmetrica(f27, f15);
                            f14 = f27;
                        } else if (abstractC13722e3 instanceof C14150e) {
                            float f28 = ((C14150e) abstractC13722e3).metrica;
                            path3.rLineTo(f11, f28);
                            f15 += f28;
                        } else if (abstractC13722e3 instanceof C8600e) {
                            float f29 = ((C8600e) abstractC13722e3).metrica;
                            c17985e2.appmetrica(f14, f29);
                            f15 = f29;
                        } else if (abstractC13722e3 instanceof C15014e) {
                            C15014e c15014e = (C15014e) abstractC13722e3;
                            path3.rCubicTo(c15014e.metrica, c15014e.license, c15014e.appmetrica, c15014e.purchase, c15014e.billing, c15014e.yandex);
                            Path path4 = path3;
                            float f30 = c15014e.appmetrica + f14;
                            float f31 = c15014e.purchase + f15;
                            f14 += c15014e.billing;
                            f15 += c15014e.yandex;
                            f13 = f31;
                            path = path4;
                            i = size;
                            f = f11;
                            i2 = i4;
                            abstractC13722e = abstractC13722e3;
                            f12 = f30;
                        } else {
                            Path path5 = path3;
                            if (abstractC13722e3 instanceof C2543e) {
                                C2543e c2543e = (C2543e) abstractC13722e3;
                                c17985e2.metrica(c2543e.metrica, c2543e.license, c2543e.appmetrica, c2543e.purchase, c2543e.billing, c2543e.yandex);
                                f5 = c2543e.appmetrica;
                                f6 = c2543e.purchase;
                                f7 = c2543e.billing;
                                f8 = c2543e.yandex;
                            } else {
                                if (abstractC13722e3 instanceof C9777e) {
                                    if (abstractC13722e2.ad) {
                                        f9 = f14 - f12;
                                        f10 = f15 - f13;
                                    } else {
                                        f9 = f11;
                                        f10 = f9;
                                    }
                                    C9777e c9777e = (C9777e) abstractC13722e3;
                                    path5.rCubicTo(f9, f10, c9777e.metrica, c9777e.license, c9777e.appmetrica, c9777e.purchase);
                                    path5 = path5;
                                    float f32 = c9777e.metrica + f14;
                                    float f33 = c9777e.license + f15;
                                    f14 += c9777e.appmetrica;
                                    f15 += c9777e.purchase;
                                    f12 = f32;
                                    f13 = f33;
                                } else if (abstractC13722e3 instanceof C8428e) {
                                    if (abstractC13722e2.ad) {
                                        float f34 = 2;
                                        f14 = (f14 * f34) - f12;
                                        f15 = (f34 * f15) - f13;
                                    }
                                    C8428e c8428e = (C8428e) abstractC13722e3;
                                    c17985e.metrica(f14, f15, c8428e.metrica, c8428e.license, c8428e.appmetrica, c8428e.purchase);
                                    f5 = c8428e.metrica;
                                    f6 = c8428e.license;
                                    f7 = c8428e.appmetrica;
                                    f8 = c8428e.purchase;
                                } else {
                                    if (abstractC13722e3 instanceof C7910e) {
                                        C7910e c7910e = (C7910e) abstractC13722e3;
                                        float f35 = c7910e.purchase;
                                        float f36 = c7910e.appmetrica;
                                        float f37 = c7910e.license;
                                        float f38 = c7910e.metrica;
                                        path5.rQuadTo(f38, f37, f36, f35);
                                        f5 = f38 + f14;
                                        f4 = f37 + f15;
                                        f14 += f36;
                                        f15 += f35;
                                    } else if (abstractC13722e3 instanceof C7162e) {
                                        C7162e c7162e = (C7162e) abstractC13722e3;
                                        float f39 = c7162e.purchase;
                                        float f40 = c7162e.appmetrica;
                                        f4 = c7162e.license;
                                        f5 = c7162e.metrica;
                                        path5.quadTo(f5, f4, f40, f39);
                                        f15 = f39;
                                        f14 = f40;
                                    } else if (abstractC13722e3 instanceof C14890e) {
                                        if (abstractC13722e2.vip) {
                                            f2 = f14 - f12;
                                            f3 = f15 - f13;
                                        } else {
                                            f2 = f11;
                                            f3 = f2;
                                        }
                                        C14890e c14890e = (C14890e) abstractC13722e3;
                                        float f41 = c14890e.license;
                                        float f42 = c14890e.metrica;
                                        path5.rQuadTo(f2, f3, f42, f41);
                                        float f43 = f2 + f14;
                                        float f44 = f3 + f15;
                                        f14 += f42;
                                        f15 += f41;
                                        f12 = f43;
                                        f13 = f44;
                                    } else if (abstractC13722e3 instanceof C11945e) {
                                        if (abstractC13722e2.vip) {
                                            float f45 = 2;
                                            f14 = (f14 * f45) - f12;
                                            f15 = (f45 * f15) - f13;
                                        }
                                        C11945e c11945e = (C11945e) abstractC13722e3;
                                        float f46 = c11945e.license;
                                        float f47 = c11945e.metrica;
                                        path5.quadTo(f14, f15, f47, f46);
                                        path = path5;
                                        i = size;
                                        f = f11;
                                        i2 = i4;
                                        f12 = f14;
                                        f13 = f15;
                                        abstractC13722e = abstractC13722e3;
                                        f14 = f47;
                                        f15 = f46;
                                    } else if (abstractC13722e3 instanceof C13716e) {
                                        C13716e c13716e = (C13716e) abstractC13722e3;
                                        float f48 = c13716e.yandex + f14;
                                        float f49 = c13716e.startapp + f15;
                                        i = size;
                                        i2 = i4;
                                        path = path5;
                                        f = 0.0f;
                                        ad(c17985e, f14, f15, f48, f49, c13716e.metrica, c13716e.license, c13716e.appmetrica, c13716e.purchase, c13716e.billing);
                                        f12 = f48;
                                        f14 = f12;
                                        f13 = f49;
                                        f15 = f13;
                                        abstractC13722e = abstractC13722e3;
                                    } else {
                                        path = path5;
                                        i = size;
                                        f = f11;
                                        i2 = i4;
                                        if (!(abstractC13722e3 instanceof C4783e)) {
                                            throw new C14803e(10);
                                        }
                                        C4783e c4783e = (C4783e) abstractC13722e3;
                                        float f50 = c4783e.startapp;
                                        float f51 = c4783e.yandex;
                                        abstractC13722e = abstractC13722e3;
                                        ad(c17985e, f14, f15, f51, f50, c4783e.metrica, c4783e.license, c4783e.appmetrica, c4783e.purchase, c4783e.billing);
                                        f13 = f50;
                                        f15 = f13;
                                        f12 = f51;
                                        f14 = f12;
                                    }
                                    f13 = f4;
                                    path = path5;
                                    i = size;
                                    f = f11;
                                    i2 = i4;
                                    abstractC13722e = abstractC13722e3;
                                    f12 = f5;
                                }
                                path = path5;
                            }
                            f13 = f6;
                            f14 = f7;
                            f15 = f8;
                            path = path5;
                            i = size;
                            f = f11;
                            i2 = i4;
                            abstractC13722e = abstractC13722e3;
                            f12 = f5;
                        }
                        path = path3;
                    }
                    i = size;
                    f = f11;
                    i2 = i4;
                }
                abstractC13722e = abstractC13722e3;
            }
            i4 = i2 + 1;
            list2 = list;
            c17985e2 = c17985e;
            path3 = path;
            size = i;
            abstractC13722e2 = abstractC13722e;
            f11 = f;
        }
    }

    public static Object vip(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static void yandex(byte[] bArr, byte[] bArr2) {
        int i = 0;
        do {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            int i2 = i + 1;
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
            int i3 = i + 2;
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
            int i4 = i + 3;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i4]);
            i += 4;
        } while (i < 16);
    }
}
