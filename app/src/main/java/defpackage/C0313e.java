package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٔۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0313e {
    public long Signature;
    public final Object ad;
    public final AbstractC0241e[] adcel;
    public final C7982e advert;
    public C12931e amazon;
    public boolean appmetrica;
    public C15701e billing;
    public boolean license;
    public C10379e loadAd;
    public final InterfaceC4543e[] metrica;
    public final AbstractC11130e mopub;
    public boolean purchase;
    public C0313e smaato;
    public final boolean[] startapp;
    public final Object vip;
    public boolean yandex;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eُۣؗ] */
    public C0313e(AbstractC0241e[] abstractC0241eArr, long j, AbstractC11130e abstractC11130e, C0909e c0909e, C7982e c7982e, C15701e c15701e, C10379e c10379e) {
        this.adcel = abstractC0241eArr;
        this.Signature = j;
        this.mopub = abstractC11130e;
        this.advert = c7982e;
        C18208e c18208e = c15701e.ad;
        this.vip = c18208e.ad;
        this.billing = c15701e;
        this.amazon = C12931e.license;
        this.loadAd = c10379e;
        this.metrica = new InterfaceC4543e[abstractC0241eArr.length];
        this.startapp = new boolean[abstractC0241eArr.length];
        long j2 = c15701e.vip;
        long j3 = c15701e.appmetrica;
        boolean z = c15701e.billing;
        c7982e.getClass();
        Object obj = c18208e.ad;
        int i = C9189e.amazon;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        C18208e ad = c18208e.ad(pair.second);
        C8846e c8846e = (C8846e) ((HashMap) c7982e.appmetrica).get(obj2);
        c8846e.getClass();
        ((HashSet) c7982e.yandex).add(c8846e);
        C14018e c14018e = (C14018e) ((HashMap) c7982e.purchase).get(c8846e);
        if (c14018e != null) {
            c14018e.ad.appmetrica(c14018e.vip);
        }
        c8846e.metrica.add(ad);
        C9500e vip = c8846e.ad.vip(ad, c0909e, j2);
        ((IdentityHashMap) c7982e.license).put(vip, c8846e);
        c7982e.license();
        if (j3 != -9223372036854775807L) {
            vip = new C5231e(vip, !z, 0L, j3, 0);
        }
        this.ad = vip;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [eٓۛٛ, java.lang.Object] */
    public final long ad(C10379e c10379e, long j, boolean z, boolean[] zArr) {
        AbstractC0241e[] abstractC0241eArr;
        InterfaceC4543e[] interfaceC4543eArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= c10379e.f20509e) {
                break;
            }
            if (z || !c10379e.subs(this.loadAd, i)) {
                z2 = false;
            }
            this.startapp[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            abstractC0241eArr = this.adcel;
            int length = abstractC0241eArr.length;
            interfaceC4543eArr = this.metrica;
            if (i2 >= length) {
                break;
            }
            if (abstractC0241eArr[i2].f1496e == -2) {
                interfaceC4543eArr[i2] = null;
            }
            i2++;
        }
        vip();
        this.loadAd = c10379e;
        metrica();
        long metrica = this.ad.metrica((InterfaceC17119e[]) c10379e.f20510e, this.startapp, this.metrica, zArr, j);
        for (int i3 = 0; i3 < abstractC0241eArr.length; i3++) {
            if (abstractC0241eArr[i3].f1496e == -2 && this.loadAd.m2803interface(i3)) {
                interfaceC4543eArr[i3] = new C4524e(29);
            }
        }
        this.purchase = false;
        for (int i4 = 0; i4 < interfaceC4543eArr.length; i4++) {
            if (interfaceC4543eArr[i4] != null) {
                AbstractC2301e.subscription(c10379e.m2803interface(i4));
                if (abstractC0241eArr[i4].f1496e != -2) {
                    this.purchase = true;
                }
            } else {
                AbstractC2301e.subscription(((InterfaceC17119e[]) c10379e.f20510e)[i4] == null);
            }
        }
        return metrica;
    }

    /* JADX WARN: Type inference failed for: r15v7, types: [eؚۘٔ, eَٕٞ, java.lang.Object, eٕؓۥ] */
    /* JADX WARN: Type inference failed for: r2v11, types: [eّۗؐ, eْٗۤ] */
    /* JADX WARN: Type inference failed for: r5v7, types: [eّۗؐ, eؒۛٞ] */
    public final C10379e adcel(float f, AbstractC6690e abstractC6690e, boolean z) {
        C16672e c16672e;
        String str;
        int[] iArr;
        C12931e[] c12931eArr;
        int[][][] iArr2;
        int[] iArr3;
        C12931e[] c12931eArr2;
        long j;
        boolean z2;
        C1410e c1410e;
        AbstractC2207e c11809e;
        int i;
        int[] iArr4;
        String str2;
        Pair m2976e;
        CaptioningManager captioningManager;
        Locale locale;
        boolean z3;
        Context context;
        int[] iArr5;
        AbstractC11130e abstractC11130e = this.mopub;
        AbstractC0241e[] abstractC0241eArr = this.adcel;
        C12931e c12931e = this.amazon;
        abstractC11130e.getClass();
        int i2 = 1;
        int[] iArr6 = new int[abstractC0241eArr.length + 1];
        int length = abstractC0241eArr.length + 1;
        C16437e[][] c16437eArr = new C16437e[length];
        int[][][] iArr7 = new int[abstractC0241eArr.length + 1][];
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = c12931e.ad;
            c16437eArr[i3] = new C16437e[i4];
            iArr7[i3] = new int[i4];
        }
        int length2 = abstractC0241eArr.length;
        int[] iArr8 = new int[length2];
        for (int i5 = 0; i5 < length2; i5++) {
            iArr8[i5] = abstractC0241eArr[i5].subs();
        }
        int i6 = 0;
        while (i6 < c12931e.ad) {
            C16437e ad = c12931e.ad(i6);
            int i7 = ad.metrica == 5 ? i2 : 0;
            int length3 = abstractC0241eArr.length;
            int i8 = i2;
            int i9 = 0;
            int i10 = 0;
            while (i9 < abstractC0241eArr.length) {
                AbstractC0241e abstractC0241e = abstractC0241eArr[i9];
                AbstractC11130e abstractC11130e2 = abstractC11130e;
                C12931e c12931e2 = c12931e;
                int i11 = i2;
                int i12 = 0;
                for (int i13 = 0; i13 < ad.ad; i13++) {
                    i12 = Math.max(i12, abstractC0241e.premium(ad.license[i13]) & 7);
                }
                int i14 = iArr6[i9] == 0 ? i11 : 0;
                if (i12 > i10 || (i12 == i10 && i7 != 0 && i8 == 0 && i14 != 0)) {
                    i10 = i12;
                    i8 = i14;
                    length3 = i9;
                }
                i9++;
                i2 = i11;
                abstractC11130e = abstractC11130e2;
                c12931e = c12931e2;
            }
            AbstractC11130e abstractC11130e3 = abstractC11130e;
            C12931e c12931e3 = c12931e;
            int i15 = i2;
            if (length3 == abstractC0241eArr.length) {
                iArr5 = new int[ad.ad];
            } else {
                AbstractC0241e abstractC0241e2 = abstractC0241eArr[length3];
                int[] iArr9 = new int[ad.ad];
                for (int i16 = 0; i16 < ad.ad; i16++) {
                    iArr9[i16] = abstractC0241e2.premium(ad.license[i16]);
                }
                iArr5 = iArr9;
            }
            int i17 = iArr6[length3];
            c16437eArr[length3][i17] = ad;
            iArr7[length3][i17] = iArr5;
            iArr6[length3] = i17 + 1;
            i6++;
            i2 = i15;
            abstractC11130e = abstractC11130e3;
            c12931e = c12931e3;
        }
        AbstractC11130e abstractC11130e4 = abstractC11130e;
        int i18 = i2;
        C12931e[] c12931eArr3 = new C12931e[abstractC0241eArr.length];
        String[] strArr = new String[abstractC0241eArr.length];
        int[] iArr10 = new int[abstractC0241eArr.length];
        for (int i19 = 0; i19 < abstractC0241eArr.length; i19++) {
            int i20 = iArr6[i19];
            c12931eArr3[i19] = new C12931e((C16437e[]) AbstractC9413e.m2552final(i20, c16437eArr[i19]));
            iArr7[i19] = (int[][]) AbstractC9413e.m2552final(i20, iArr7[i19]);
            strArr[i19] = abstractC0241eArr[i19].purchase();
            iArr10[i19] = abstractC0241eArr[i19].f1496e;
        }
        C7892e c7892e = new C7892e(iArr10, c12931eArr3, iArr8, iArr7, new C12931e((C16437e[]) AbstractC9413e.m2552final(iArr6[abstractC0241eArr.length], c16437eArr[abstractC0241eArr.length])));
        C11010e c11010e = (C11010e) abstractC11130e4;
        synchronized (c11010e.f21806e) {
            c11010e.f21804e = Thread.currentThread();
            c16672e = c11010e.f21808e;
        }
        if (c11010e.f21805e == null && (context = c11010e.f21802e) != null) {
            c11010e.f21805e = Boolean.valueOf(AbstractC9413e.m2544abstract(context));
        }
        if (c16672e.f32712e && Build.VERSION.SDK_INT >= 32 && c11010e.f21807e == null) {
            c11010e.f21807e = new C1843e(c11010e.f21802e, new RunnableC17584e(29, c11010e), c11010e.f21805e);
        }
        int i21 = c7892e.ad;
        C8478e[] c8478eArr = new C8478e[i21];
        C11010e.m2967e(c7892e, c16672e, c8478eArr);
        C11010e.m2971e(c7892e, c16672e, c8478eArr);
        C11010e.m2968e(c7892e, c16672e, c8478eArr);
        Context context2 = c11010e.f21802e;
        int i22 = c7892e.ad;
        Pair m2972e = C11010e.m2972e(c8478eArr, i18);
        if (m2972e == null) {
            int i23 = 0;
            while (true) {
                if (i23 >= i22) {
                    z3 = false;
                    break;
                }
                if (2 == iArr10[i23] && c12931eArr3[i23].ad > 0) {
                    z3 = true;
                    break;
                }
                i23++;
            }
            m2972e = C11010e.m2976e(1, c7892e, iArr7, new C15446e(z3, c11010e, c16672e, iArr8), new C6575e(10));
            if (m2972e != null) {
                c8478eArr[((Integer) m2972e.second).intValue()] = (C8478e) m2972e.first;
            }
        }
        if (m2972e == null) {
            str = null;
        } else {
            C8478e c8478e = (C8478e) m2972e.first;
            str = c8478e.ad.license[c8478e.vip[0]].license;
        }
        Pair m2972e2 = C11010e.m2972e(c8478eArr, 2);
        Pair m2972e3 = C11010e.m2972e(c8478eArr, 4);
        if (m2972e2 == null && m2972e3 == null) {
            Pair m2976e2 = c16672e.isVip.ad == 2 ? null : C11010e.m2976e(2, c7892e, iArr7, new C12879e(c16672e, str, iArr8, (!c16672e.mopub || context2 == null) ? null : AbstractC9413e.isPro(context2)), new C6575e(9));
            Pair m2976e3 = ((c16672e.firebase || m2976e2 == null) && c16672e.isVip.ad != 2) ? C11010e.m2976e(4, c7892e, iArr7, new C0211e(24, c16672e), new C6575e(8)) : null;
            if (m2976e3 != null) {
                c8478eArr[((Integer) m2976e3.second).intValue()] = (C8478e) m2976e3.first;
            } else if (m2976e2 != null) {
                c8478eArr[((Integer) m2976e2.second).intValue()] = (C8478e) m2976e2.first;
            }
        }
        int i24 = 3;
        if (C11010e.m2972e(c8478eArr, 3) == null) {
            if (c16672e.isVip.ad == 2) {
                m2976e = null;
            } else {
                if (!c16672e.premium || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                    str2 = null;
                } else {
                    String str3 = AbstractC9413e.ad;
                    str2 = locale.toLanguageTag();
                }
                m2976e = C11010e.m2976e(3, c7892e, iArr7, new C9509e(i24, c16672e, str, str2), new C6575e(11));
            }
            if (m2976e != null) {
                c8478eArr[((Integer) m2976e.second).intValue()] = (C8478e) m2976e.first;
            }
        }
        int tapsense = AbstractC0054e.tapsense(0, 0, 0, 0);
        if (c16672e.isVip.ad == 2) {
            iArr = iArr10;
            c12931eArr = c12931eArr3;
            iArr2 = iArr7;
        } else {
            ?? abstractC12670e = new AbstractC12670e(4);
            int i25 = 0;
            while (i25 < i21) {
                C8478e c8478e2 = c8478eArr[i25];
                if (c8478e2 != null) {
                    C16437e c16437e = c8478e2.ad;
                    if (!c16672e.f32715e.get(i25)) {
                        iArr3 = iArr10;
                        if (!c16672e.f9753this.contains(Integer.valueOf(c16437e.metrica))) {
                            abstractC12670e.ad(c16437e.vip);
                            int i26 = 0;
                            while (true) {
                                int[] iArr11 = c8478e2.vip;
                                c12931eArr2 = c12931eArr3;
                                if (i26 < iArr11.length) {
                                    String str4 = c16437e.license[iArr11[i26]].smaato;
                                    if (str4 != null) {
                                        abstractC12670e.metrica(str4);
                                    }
                                    i26++;
                                    c12931eArr3 = c12931eArr2;
                                }
                            }
                            i25++;
                            iArr10 = iArr3;
                            c12931eArr3 = c12931eArr2;
                        }
                        c12931eArr2 = c12931eArr3;
                        i25++;
                        iArr10 = iArr3;
                        c12931eArr3 = c12931eArr2;
                    }
                }
                iArr3 = iArr10;
                c12931eArr2 = c12931eArr3;
                i25++;
                iArr10 = iArr3;
                c12931eArr3 = c12931eArr2;
            }
            iArr = iArr10;
            c12931eArr = c12931eArr3;
            AbstractC12614e billing = abstractC12670e.billing();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i27 = 0;
            while (i27 < i22) {
                if (iArr[i27] == 5) {
                    C12931e c12931e4 = c12931eArr[i27];
                    int i28 = 0;
                    while (i28 < c12931e4.ad) {
                        C16437e ad2 = c12931e4.ad(i28);
                        arrayList.add(ad2);
                        int i29 = i27;
                        int[] iArr12 = (int[]) iArr7[i27][i28].clone();
                        C12931e c12931e5 = c12931e4;
                        int[][][] iArr13 = iArr7;
                        for (int i30 = 0; i30 < iArr12.length; i30++) {
                            String str5 = ad2.license[i30].smaato;
                            if (str5 != null && !billing.contains(str5)) {
                                iArr12[i30] = tapsense;
                            }
                        }
                        arrayList2.add(iArr12);
                        i28++;
                        c12931e4 = c12931e5;
                        i27 = i29;
                        iArr7 = iArr13;
                    }
                }
                i27++;
                iArr7 = iArr7;
            }
            iArr2 = iArr7;
            int size = arrayList.size();
            C16437e[] c16437eArr2 = new C16437e[size];
            AbstractC2301e.subscription(arrayList.size() == size);
            arrayList.toArray(c16437eArr2);
            C12931e c12931e6 = new C12931e(c16437eArr2);
            int size2 = arrayList2.size();
            int[][] iArr14 = new int[size2];
            AbstractC2301e.subscription(arrayList2.size() == size2);
            arrayList2.toArray(iArr14);
            for (int i31 = 0; i31 < i22; i31++) {
                if (iArr[i31] == 5) {
                    C8478e m2970e = C11010e.m2970e(c12931e6, iArr14, c16672e);
                    c8478eArr[i31] = m2970e;
                    if (m2970e == null) {
                        break;
                    }
                    Arrays.fill(iArr14[c12931e6.vip(m2970e.ad)], tapsense);
                }
            }
        }
        for (int i32 = 0; i32 < i22; i32++) {
            int i33 = iArr[i32];
            if (i33 != 2 && i33 != 1) {
                if (i33 != 3 && i33 != 4) {
                    if (i33 != 5 && c8478eArr[i32] == null) {
                        c8478eArr[i32] = C11010e.m2970e(c12931eArr[i32], iArr2[i32], c16672e);
                    }
                }
            }
        }
        C11010e.m2967e(c7892e, c16672e, c8478eArr);
        C11010e.m2971e(c7892e, c16672e, c8478eArr);
        C11010e.m2968e(c7892e, c16672e, c8478eArr);
        C14914e c14914e = c11010e.f21809e;
        InterfaceC16610e interfaceC16610e = (InterfaceC16610e) c11010e.f22046e;
        interfaceC16610e.getClass();
        c14914e.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (C8478e c8478e3 : c8478eArr) {
            if (c8478e3 == null || c8478e3.vip.length <= 1) {
                arrayList3.add(null);
            } else {
                C13304e Signature = AbstractC17475e.Signature();
                Signature.metrica(new C4258e(0L, 0L));
                arrayList3.add(Signature);
            }
        }
        int length4 = c8478eArr.length;
        long[][] jArr = new long[length4];
        int i34 = 0;
        while (true) {
            j = -1;
            if (i34 >= c8478eArr.length) {
                break;
            }
            C8478e c8478e4 = c8478eArr[i34];
            if (c8478e4 == null) {
                jArr[i34] = new long[0];
            } else {
                int[] iArr15 = c8478e4.vip;
                jArr[i34] = new long[iArr15.length];
                for (int i35 = 0; i35 < iArr15.length; i35++) {
                    long j2 = c8478e4.ad.license[iArr15[i35]].adcel;
                    long[] jArr2 = jArr[i34];
                    if (j2 == -1) {
                        j2 = 0;
                    }
                    jArr2[i35] = j2;
                }
                Arrays.sort(jArr[i34]);
            }
            i34++;
        }
        int[] iArr16 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i36 = 0; i36 < length4; i36++) {
            long[] jArr4 = jArr[i36];
            jArr3[i36] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        C11809e.ad(arrayList3, jArr3);
        AbstractC17595e.metrica(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(C5949e.f12529e);
        C2856e c2856e = new C2856e();
        ?? abstractC1837e = new AbstractC1837e(treeMap);
        abstractC1837e.f15163e = c2856e;
        int i37 = 0;
        while (i37 < length4) {
            long[] jArr5 = jArr[i37];
            long j3 = j;
            if (jArr5.length <= 1) {
                i = length4;
                iArr4 = iArr16;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                int i38 = 0;
                while (true) {
                    long[] jArr6 = jArr[i37];
                    i = length4;
                    double d = 0.0d;
                    if (i38 >= jArr6.length) {
                        break;
                    }
                    int[] iArr17 = iArr16;
                    long j4 = jArr6[i38];
                    if (j4 != j3) {
                        d = Math.log(j4);
                    }
                    dArr[i38] = d;
                    i38++;
                    length4 = i;
                    iArr16 = iArr17;
                }
                iArr4 = iArr16;
                int i39 = length5 - 1;
                double d2 = dArr[i39] - dArr[0];
                int i40 = 0;
                while (i40 < i39) {
                    double d3 = dArr[i40];
                    i40++;
                    abstractC1837e.yandex(Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i40]) * 0.5d) - dArr[0]) / d2), Integer.valueOf(i37));
                    d2 = d2;
                }
            }
            i37++;
            length4 = i;
            j = j3;
            iArr16 = iArr4;
        }
        int[] iArr18 = iArr16;
        Collection collection = abstractC1837e.f20586e;
        if (collection == null) {
            collection = new C17403e(1, (Object) abstractC1837e);
            abstractC1837e.f20586e = collection;
        }
        AbstractC17475e remoteconfig = AbstractC17475e.remoteconfig(collection);
        for (int i41 = 0; i41 < remoteconfig.size(); i41++) {
            int intValue = ((Integer) remoteconfig.get(i41)).intValue();
            int i42 = iArr18[intValue] + 1;
            iArr18[intValue] = i42;
            jArr3[intValue] = jArr[intValue][i42];
            C11809e.ad(arrayList3, jArr3);
        }
        for (int i43 = 0; i43 < c8478eArr.length; i43++) {
            if (arrayList3.get(i43) != null) {
                jArr3[i43] = jArr3[i43] * 2;
            }
        }
        C11809e.ad(arrayList3, jArr3);
        C13304e Signature2 = AbstractC17475e.Signature();
        for (int i44 = 0; i44 < arrayList3.size(); i44++) {
            C13304e c13304e = (C13304e) arrayList3.get(i44);
            Signature2.metrica(c13304e == null ? C1410e.f4222e : c13304e.billing());
        }
        C1410e billing2 = Signature2.billing();
        InterfaceC17119e[] interfaceC17119eArr = new InterfaceC17119e[c8478eArr.length];
        for (int i45 = 0; i45 < c8478eArr.length; i45++) {
            C8478e c8478e5 = c8478eArr[i45];
            if (c8478e5 != null) {
                int[] iArr19 = c8478e5.vip;
                if (iArr19.length != 0) {
                    if (iArr19.length == 1) {
                        c11809e = new AbstractC2207e(c8478e5.ad, new int[]{iArr19[0]});
                    } else {
                        long j5 = 25000;
                        c11809e = new C11809e(c8478e5.ad, iArr19, interfaceC16610e, ModuleDescriptor.MODULE_VERSION, j5, j5, (AbstractC17475e) billing2.get(i45));
                    }
                    interfaceC17119eArr[i45] = c11809e;
                }
            }
        }
        C11443e[] c11443eArr = new C11443e[i21];
        for (int i46 = 0; i46 < i21; i46++) {
            c11443eArr[i46] = (c16672e.f32715e.get(i46) || c16672e.f9753this.contains(Integer.valueOf(c7892e.vip[i46])) || (c7892e.vip[i46] != -2 && interfaceC17119eArr[i46] == null)) ? null : C11443e.metrica;
        }
        if (c16672e.isVip.ad != 0) {
            int i47 = 0;
            int i48 = 0;
            int i49 = -1;
            while (true) {
                if (i47 < c7892e.ad) {
                    int i50 = c7892e.vip[i47];
                    InterfaceC17119e interfaceC17119e = interfaceC17119eArr[i47];
                    if (i50 != 1 && interfaceC17119e != null) {
                        break;
                    }
                    if (i50 == 1 && interfaceC17119e != null && interfaceC17119e.length() == 1) {
                        if (C11010e.m2974e(c16672e, iArr2[i47][c7892e.metrica[i47].vip(interfaceC17119e.adcel())][interfaceC17119e.Signature(0)], interfaceC17119e.remoteconfig())) {
                            i48++;
                            i49 = i47;
                        }
                    }
                    i47++;
                } else if (i48 == 1) {
                    int i51 = c16672e.isVip.vip ? 1 : 2;
                    C11443e c11443e = c11443eArr[i49];
                    c11443eArr[i49] = new C11443e(i51, c11443e != null && c11443e.vip);
                }
            }
        }
        Pair create = Pair.create(c11443eArr, interfaceC17119eArr);
        InterfaceC17119e[] interfaceC17119eArr2 = (InterfaceC17119e[]) create.second;
        int length6 = interfaceC17119eArr2.length;
        List[] listArr = new List[length6];
        for (int i52 = 0; i52 < interfaceC17119eArr2.length; i52++) {
            InterfaceC17119e interfaceC17119e2 = interfaceC17119eArr2[i52];
            if (interfaceC17119e2 != null) {
                c1410e = AbstractC17475e.ads(interfaceC17119e2);
            } else {
                C2171e c2171e = AbstractC17475e.f34223e;
                c1410e = C1410e.f4222e;
            }
            listArr[i52] = c1410e;
        }
        ?? abstractC12670e2 = new AbstractC12670e(4);
        int i53 = 0;
        while (true) {
            int i54 = c7892e.ad;
            C12931e[] c12931eArr4 = c7892e.metrica;
            if (i53 >= i54) {
                break;
            }
            C12931e c12931e7 = c12931eArr4[i53];
            int i55 = 0;
            while (i55 < c12931e7.ad) {
                C16437e ad3 = c12931e7.ad(i55);
                int i56 = c12931eArr4[i53].ad(i55).ad;
                int[] iArr20 = new int[i56];
                int i57 = 0;
                int i58 = 0;
                while (i58 < i56) {
                    List[] listArr2 = listArr;
                    if ((c7892e.appmetrica[i53][i55][i58] & 7) == 4) {
                        iArr20[i57] = i58;
                        i57++;
                    }
                    i58++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] copyOf = Arrays.copyOf(iArr20, i57);
                int i59 = 16;
                int i60 = i53;
                String str6 = null;
                int i61 = 0;
                boolean z4 = false;
                int i62 = 0;
                while (i61 < copyOf.length) {
                    int[] iArr21 = copyOf;
                    String str7 = c12931eArr4[i60].ad(i55).license[copyOf[i61]].loadAd;
                    int i63 = i62 + 1;
                    if (i62 == 0) {
                        str6 = str7;
                    } else {
                        z4 = (!Objects.equals(str6, str7)) | z4;
                    }
                    i59 = Math.min(i59, c7892e.appmetrica[i60][i55][i61] & 24);
                    i61++;
                    i62 = i63;
                    copyOf = iArr21;
                }
                if (z4) {
                    i59 = Math.min(i59, c7892e.license[i60]);
                }
                boolean z5 = i59 != 0;
                int i64 = ad3.ad;
                int[] iArr22 = new int[i64];
                boolean[] zArr = new boolean[i64];
                int i65 = 0;
                while (i65 < ad3.ad) {
                    iArr22[i65] = c7892e.appmetrica[i60][i55][i65] & 7;
                    int i66 = 0;
                    boolean z6 = false;
                    while (i66 < length6) {
                        List list = listArr3[i66];
                        int i67 = length6;
                        C12931e c12931e8 = c12931e7;
                        int i68 = 0;
                        while (true) {
                            if (i68 < list.size()) {
                                InterfaceC17119e interfaceC17119e3 = (InterfaceC17119e) list.get(i68);
                                int i69 = i68;
                                if (interfaceC17119e3.adcel().equals(ad3) && interfaceC17119e3.applovin(i65) != -1) {
                                    z6 = true;
                                    break;
                                }
                                i68 = i69 + 1;
                            }
                        }
                        i66++;
                        length6 = i67;
                        c12931e7 = c12931e8;
                    }
                    zArr[i65] = z6;
                    i65++;
                    c12931e7 = c12931e7;
                }
                abstractC12670e2.metrica(new C6653e(ad3, z5, iArr22, zArr));
                i55++;
                listArr = listArr3;
                i53 = i60;
                length6 = length6;
                c12931e7 = c12931e7;
            }
            i53++;
        }
        C12931e c12931e9 = c7892e.purchase;
        for (int i70 = 0; i70 < c12931e9.ad; i70++) {
            C16437e ad4 = c12931e9.ad(i70);
            int[] iArr23 = new int[ad4.ad];
            Arrays.fill(iArr23, 0);
            abstractC12670e2.metrica(new C6653e(ad4, false, iArr23, new boolean[ad4.ad]));
        }
        C10379e c10379e = new C10379e((C11443e[]) create.first, (InterfaceC17119e[]) create.second, new C18255e(abstractC12670e2.billing()), c7892e);
        for (int i71 = 0; i71 < c10379e.f20509e; i71++) {
            if (c10379e.m2803interface(i71)) {
                if (((InterfaceC17119e[]) c10379e.f20510e)[i71] == null && this.adcel[i71].f1496e != -2) {
                    z2 = false;
                    AbstractC2301e.subscription(z2);
                }
                z2 = true;
                AbstractC2301e.subscription(z2);
            } else {
                AbstractC2301e.subscription(((InterfaceC17119e[]) c10379e.f20510e)[i71] == null);
            }
        }
        for (InterfaceC17119e interfaceC17119e4 : (InterfaceC17119e[]) c10379e.f20510e) {
            if (interfaceC17119e4 != null) {
                interfaceC17119e4.tapsense(f);
                interfaceC17119e4.smaato(z);
            }
        }
        return c10379e;
    }

    public final long appmetrica() {
        return this.billing.vip + this.Signature;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, eًٔ] */
    public final boolean billing() {
        if (this.appmetrica) {
            return !this.purchase || this.ad.admob() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, eًٔ] */
    public final long license() {
        if (!this.appmetrica) {
            return this.billing.vip;
        }
        long admob = this.purchase ? this.ad.admob() : Long.MIN_VALUE;
        return admob == Long.MIN_VALUE ? this.billing.purchase : admob;
    }

    public final void metrica() {
        if (this.smaato != null) {
            return;
        }
        int i = 0;
        while (true) {
            C10379e c10379e = this.loadAd;
            if (i >= c10379e.f20509e) {
                return;
            }
            boolean m2803interface = c10379e.m2803interface(i);
            InterfaceC17119e interfaceC17119e = ((InterfaceC17119e[]) this.loadAd.f20510e)[i];
            if (m2803interface && interfaceC17119e != null) {
                interfaceC17119e.loadAd();
            }
            i++;
        }
    }

    public final void mopub() {
        Object obj = this.ad;
        if (obj instanceof C5231e) {
            long j = this.billing.appmetrica;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            C5231e c5231e = (C5231e) obj;
            c5231e.f11138e = 0L;
            c5231e.f11137e = j;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eٓۛٛ, java.lang.Object] */
    public final void purchase(float f, AbstractC6690e abstractC6690e, boolean z) {
        this.appmetrica = true;
        this.amazon = this.ad.amazon();
        C10379e adcel = adcel(f, abstractC6690e, z);
        C15701e c15701e = this.billing;
        long j = c15701e.vip;
        long j2 = c15701e.purchase;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long ad = ad(adcel, j, false, new boolean[this.adcel.length]);
        long j3 = this.Signature;
        C15701e c15701e2 = this.billing;
        this.Signature = (c15701e2.vip - ad) + j3;
        this.billing = c15701e2.vip(ad, c15701e2.metrica);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eٓۛٛ, java.lang.Object] */
    public final void startapp() {
        vip();
        ?? r0 = this.ad;
        try {
            boolean z = r0 instanceof C5231e;
            C7982e c7982e = this.advert;
            if (z) {
                c7982e.yandex(((C5231e) r0).f11136e);
            } else {
                c7982e.yandex(r0);
            }
        } catch (RuntimeException e) {
            AbstractC2803e.billing("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void vip() {
        if (this.smaato != null) {
            return;
        }
        int i = 0;
        while (true) {
            C10379e c10379e = this.loadAd;
            if (i >= c10379e.f20509e) {
                return;
            }
            boolean m2803interface = c10379e.m2803interface(i);
            InterfaceC17119e interfaceC17119e = ((InterfaceC17119e[]) this.loadAd.f20510e)[i];
            if (m2803interface && interfaceC17119e != null) {
                interfaceC17119e.billing();
            }
            i++;
        }
    }

    public final boolean yandex() {
        if (this.appmetrica) {
            return billing() || license() - this.billing.vip >= -9223372036854775807L;
        }
        return false;
    }
}
