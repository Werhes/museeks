package defpackage;

import android.os.Build;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8306e {
    public static final C2892e ad = new C2892e(-704347243, false, new C7156e(6));
    public static final C2892e vip = new C2892e(1536844436, false, new C10417e(2));
    public static final C2892e metrica = new C2892e(-1613008353, false, new C7156e(7));
    public static final C2892e license = new C2892e(-334138213, false, new C7156e(8));

    public static void ad(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(AbstractC1786e.admob(i2, "at index "));
            }
        }
    }

    public static final Object adcel(long j, Function2 function2, InterfaceC5083e interfaceC5083e) {
        return startapp(AbstractC16481e.yandex(j), function2, interfaceC5083e);
    }

    public static final int[] appmetrica(int i, List list) {
        int i2;
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i3 < size) {
                iArr[i3] = AbstractC6532e.m2193extends(((C3618e) list.get(i3)).ad);
                i3++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i];
        int billing = AbstractC6874e.billing(list);
        int size2 = list.size();
        int i4 = 0;
        while (i3 < size2) {
            long j = ((C3618e) list.get(i3)).ad;
            if (C3618e.license(j) == 0.0f) {
                if (i3 == 0) {
                    i2 = i4 + 1;
                    iArr2[i4] = AbstractC6532e.m2193extends(C3618e.vip(0.0f, ((C3618e) list.get(1)).ad));
                } else if (i3 == billing) {
                    i2 = i4 + 1;
                    iArr2[i4] = AbstractC6532e.m2193extends(C3618e.vip(0.0f, ((C3618e) list.get(i3 - 1)).ad));
                } else {
                    int i5 = i4 + 1;
                    iArr2[i4] = AbstractC6532e.m2193extends(C3618e.vip(0.0f, ((C3618e) list.get(i3 - 1)).ad));
                    i4 += 2;
                    iArr2[i5] = AbstractC6532e.m2193extends(C3618e.vip(0.0f, ((C3618e) list.get(i3 + 1)).ad));
                }
                i4 = i2;
            } else {
                iArr2[i4] = AbstractC6532e.m2193extends(j);
                i4++;
            }
            i3++;
        }
        return iArr2;
    }

    public static final Object billing(RunnableC1690e runnableC1690e, Function2 function2) {
        AbstractC6629e.smaato(runnableC1690e, true, new C9098e(0, AbstractC16481e.license(runnableC1690e.f4530e.admob()).ad(runnableC1690e.f4620e, runnableC1690e, runnableC1690e.f35291e)));
        return AbstractC18491e.amazon(runnableC1690e, false, runnableC1690e, function2);
    }

    public static final Object license(C6302e c6302e, C12916e c12916e) {
        Object obj = c6302e.adcel.ad.get(c12916e);
        return obj == null ? c12916e.f25784e : obj;
    }

    public static final Object metrica(C14542e c14542e, C12916e c12916e) {
        Object obj = c14542e.signatures.ad.get(c12916e);
        if (obj != null) {
            return obj;
        }
        Object obj2 = c14542e.isVip.amazon.ad.get(c12916e);
        return obj2 == null ? c12916e.f25784e : obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r8v3, types: [eّؖٝ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object mopub(long r5, kotlin.jvm.functions.Function2 r7, defpackage.AbstractC10731e r8) {
        /*
            boolean r0 = r8 instanceof defpackage.C2236e
            if (r0 == 0) goto L13
            r0 = r8
            eؓۦۜ r0 = (defpackage.C2236e) r0
            int r1 = r0.f5694e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5694e = r1
            goto L18
        L13:
            eؓۦۜ r0 = new eؓۦۜ
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f5692e
            int r1 = r0.f5694e
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            eّؖٝ r5 = r0.f5693e
            defpackage.AbstractC2003e.purchase(r8)     // Catch: defpackage.C3063e -> L27
            return r8
        L27:
            r6 = move-exception
            goto L57
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.AbstractC2003e.purchase(r8)
            r3 = 0
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 > 0) goto L3b
            goto L5d
        L3b:
            eّؖٝ r8 = new eّؖٝ
            r8.<init>()
            r0.f5693e = r8     // Catch: defpackage.C3063e -> L55
            r0.f5694e = r2     // Catch: defpackage.C3063e -> L55
            eٌُؓ r1 = new eٌُؓ     // Catch: defpackage.C3063e -> L55
            r1.<init>(r5, r0)     // Catch: defpackage.C3063e -> L55
            r8.f9318e = r1     // Catch: defpackage.C3063e -> L55
            java.lang.Object r5 = billing(r1, r7)     // Catch: defpackage.C3063e -> L55
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r5 != r6) goto L54
            return r6
        L54:
            return r5
        L55:
            r6 = move-exception
            r5 = r8
        L57:
            eَٟۙ r7 = r6.f7127e
            java.lang.Object r5 = r5.f9318e
            if (r7 != r5) goto L5f
        L5d:
            r5 = 0
            return r5
        L5f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8306e.mopub(long, kotlin.jvm.functions.Function2, eُؑ۠):java.lang.Object");
    }

    public static final float[] purchase(int i, List list, List list2) {
        if (i == 0) {
            if (list != null) {
                return AbstractC13480e.m3609volatile(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i];
        fArr[0] = list != null ? ((Number) list.get(0)).floatValue() : 0.0f;
        int billing = AbstractC6874e.billing(list2);
        int i2 = 1;
        for (int i3 = 1; i3 < billing; i3++) {
            long j = ((C3618e) list2.get(i3)).ad;
            float floatValue = list != null ? ((Number) list.get(i3)).floatValue() : i3 / AbstractC6874e.billing(list2);
            int i4 = i2 + 1;
            fArr[i2] = floatValue;
            if (C3618e.license(j) == 0.0f) {
                i2 += 2;
                fArr[i4] = floatValue;
            } else {
                i2 = i4;
            }
        }
        fArr[i2] = list != null ? ((Number) list.get(AbstractC6874e.billing(list2))).floatValue() : 1.0f;
        return fArr;
    }

    public static final Object startapp(long j, Function2 function2, InterfaceC5083e interfaceC5083e) {
        if (j > 0) {
            return billing(new RunnableC1690e(j, interfaceC5083e), function2);
        }
        throw new C3063e("Timed out immediately", null);
    }

    public static final int vip(List list) {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int billing = AbstractC6874e.billing(list);
        for (int i2 = 1; i2 < billing; i2++) {
            if (C3618e.license(((C3618e) list.get(i2)).ad) == 0.0f) {
                i++;
            }
        }
        return i;
    }

    public static final void yandex(List list, List list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
