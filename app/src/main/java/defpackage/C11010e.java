package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11010e extends AbstractC11130e {

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final AbstractC15023e f21801e = new C16239e(new C6575e(7));

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Context f21802e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C3335e f21803e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Thread f21804e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public Boolean f21805e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object f21806e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public C1843e f21807e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C16672e f21808e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C14914e f21809e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11010e(Context context) {
        super(14, false);
        C14914e c14914e = new C14914e(22);
        C16672e c16672e = C16672e.f32696e;
        this.f21806e = new Object();
        this.f21802e = context != null ? context.getApplicationContext() : null;
        this.f21809e = c14914e;
        if (c16672e != null) {
            this.f21808e = c16672e;
        } else {
            c16672e.getClass();
            C8756e c8756e = new C8756e(c16672e);
            c8756e.license(c16672e);
            this.f21808e = new C16672e(c8756e);
        }
        this.f21803e = C3335e.startapp;
        if (this.f21808e.f32712e && context == null) {
            AbstractC2803e.smaato("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    /* renamed from: eؒٞ٘, reason: contains not printable characters */
    public static void m2967e(C7892e c7892e, C16672e c16672e, C8478e[] c8478eArr) {
        int i = c7892e.ad;
        C12931e[] c12931eArr = c7892e.metrica;
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            m2969e(c12931eArr[i2], c16672e, hashMap);
        }
        m2969e(c7892e.purchase, c16672e, hashMap);
        for (int i3 = 0; i3 < i; i3++) {
            C11680e c11680e = (C11680e) hashMap.get(Integer.valueOf(c7892e.vip[i3]));
            if (c11680e != null) {
                C16437e c16437e = c11680e.ad;
                AbstractC17475e abstractC17475e = c11680e.vip;
                c8478eArr[i3] = (abstractC17475e.isEmpty() || c12931eArr[i3].vip(c16437e) == -1) ? null : new C8478e(0, c16437e, AbstractC10509e.Signature(abstractC17475e));
            }
        }
    }

    /* renamed from: eؚٕؗ, reason: contains not printable characters */
    public static void m2968e(C7892e c7892e, C16672e c16672e, C8478e[] c8478eArr) {
        for (int i = 0; i < c7892e.ad; i++) {
            int i2 = c7892e.vip[i];
            if (c16672e.f32715e.get(i) || c16672e.f9753this.contains(Integer.valueOf(i2))) {
                c8478eArr[i] = null;
            }
        }
    }

    /* renamed from: eؘؗؕ, reason: contains not printable characters */
    public static void m2969e(C12931e c12931e, C4491e c4491e, HashMap hashMap) {
        for (int i = 0; i < c12931e.ad; i++) {
            C11680e c11680e = (C11680e) c4491e.f9751goto.get(c12931e.ad(i));
            if (c11680e != null) {
                C16437e c16437e = c11680e.ad;
                C11680e c11680e2 = (C11680e) hashMap.get(Integer.valueOf(c16437e.metrica));
                if (c11680e2 == null || (c11680e2.vip.isEmpty() && !c11680e.vip.isEmpty())) {
                    hashMap.put(Integer.valueOf(c16437e.metrica), c11680e);
                }
            }
        }
    }

    /* renamed from: eؘۗٚ, reason: contains not printable characters */
    public static C8478e m2970e(C12931e c12931e, int[][] iArr, C16672e c16672e) {
        if (c16672e.isVip.ad != 2) {
            int i = 0;
            C16437e c16437e = null;
            C4399e c4399e = null;
            for (int i2 = 0; i2 < c12931e.ad; i2++) {
                C16437e ad = c12931e.ad(i2);
                int[] iArr2 = iArr[i2];
                for (int i3 = 0; i3 < ad.ad; i3++) {
                    if (AbstractC0054e.inmobi(iArr2[i3], c16672e.f32713e)) {
                        C4399e c4399e2 = new C4399e(ad.license[i3], iArr2[i3]);
                        if (c4399e != null) {
                            if (AbstractC7118e.ad.metrica(c4399e2.f9579e, c4399e.f9579e).metrica(c4399e2.f9580e, c4399e.f9580e).appmetrica() <= 0) {
                            }
                        }
                        c16437e = ad;
                        i = i3;
                        c4399e = c4399e2;
                    }
                }
            }
            if (c16437e != null) {
                return new C8478e(0, c16437e, new int[]{i});
            }
        }
        return null;
    }

    /* renamed from: eؘِۢ, reason: contains not printable characters */
    public static void m2971e(C7892e c7892e, C16672e c16672e, C8478e[] c8478eArr) {
        int i = c7892e.ad;
        for (int i2 = 0; i2 < i; i2++) {
            C12931e c12931e = c7892e.metrica[i2];
            Map map = (Map) c16672e.f32710e.get(i2);
            if (map != null && map.containsKey(c12931e)) {
                Map map2 = (Map) c16672e.f32710e.get(i2);
                if (map2 != null && map2.get(c12931e) != null) {
                    throw new ClassCastException();
                }
                c8478eArr[i2] = null;
            }
        }
    }

    /* renamed from: eؘُٗ, reason: contains not printable characters */
    public static Pair m2972e(C8478e[] c8478eArr, int i) {
        for (int i2 = 0; i2 < c8478eArr.length; i2++) {
            C8478e c8478e = c8478eArr[i2];
            if (c8478e != null && c8478e.ad.metrica == i) {
                return Pair.create(c8478e, Integer.valueOf(i2));
            }
        }
        return null;
    }

    /* renamed from: eُِؕ, reason: contains not printable characters */
    public static String m2973e(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* renamed from: eٔٞۢ, reason: contains not printable characters */
    public static boolean m2974e(C16672e c16672e, int i, C16975e c16975e) {
        if ((i & 3584) == 0) {
            return false;
        }
        C0454e c0454e = c16672e.isVip;
        if (c0454e.metrica && (i & 2048) == 0) {
            return false;
        }
        if (c0454e.vip) {
            boolean z = (c16975e.f33283native == 0 && c16975e.f33280extends == 0) ? false : true;
            boolean z2 = (i & 1024) != 0;
            if (z && !z2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: eٔۥۥ, reason: contains not printable characters */
    public static int m2975e(C16975e c16975e, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(c16975e.license)) {
            return 4;
        }
        String m2973e = m2973e(str);
        String m2973e2 = m2973e(c16975e.license);
        if (m2973e2 == null || m2973e == null) {
            return (z && m2973e2 == null) ? 1 : 0;
        }
        if (m2973e2.startsWith(m2973e) || m2973e.startsWith(m2973e2)) {
            return 3;
        }
        String str2 = AbstractC9413e.ad;
        return m2973e2.split("-", 2)[0].equals(m2973e.split("-", 2)[0]) ? 2 : 0;
    }

    /* renamed from: eؘٖؕ, reason: contains not printable characters */
    public static Pair m2976e(int i, C7892e c7892e, int[][][] iArr, InterfaceC11929e interfaceC11929e, Comparator comparator) {
        int i2;
        Collection collection;
        C7892e c7892e2 = c7892e;
        ArrayList arrayList = new ArrayList();
        int i3 = c7892e2.ad;
        int i4 = 0;
        while (i4 < i3) {
            if (i == c7892e2.vip[i4]) {
                C12931e c12931e = c7892e2.metrica[i4];
                for (int i5 = 0; i5 < c12931e.ad; i5++) {
                    C16437e ad = c12931e.ad(i5);
                    C1410e vip = interfaceC11929e.vip(i4, ad, iArr[i4][i5]);
                    int i6 = ad.ad;
                    boolean[] zArr = new boolean[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        AbstractC7391e abstractC7391e = (AbstractC7391e) vip.get(i7);
                        int ad2 = abstractC7391e.ad();
                        if (zArr[i7] || ad2 == 0) {
                            i2 = i3;
                        } else {
                            if (ad2 == 1) {
                                collection = AbstractC17475e.ads(abstractC7391e);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(abstractC7391e);
                                int i8 = i7 + 1;
                                while (i8 < i6) {
                                    AbstractC7391e abstractC7391e2 = (AbstractC7391e) vip.get(i8);
                                    int i9 = i3;
                                    if (abstractC7391e2.ad() == 2 && abstractC7391e.vip(abstractC7391e2)) {
                                        arrayList2.add(abstractC7391e2);
                                        zArr[i8] = true;
                                    }
                                    i8++;
                                    i3 = i9;
                                }
                                collection = arrayList2;
                            }
                            i2 = i3;
                            arrayList.add(collection);
                        }
                        i7++;
                        i3 = i2;
                    }
                }
            }
            i4++;
            c7892e2 = c7892e;
            i3 = i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((AbstractC7391e) list.get(i10)).f15147e;
        }
        AbstractC7391e abstractC7391e3 = (AbstractC7391e) list.get(0);
        return Pair.create(new C8478e(0, abstractC7391e3.f15148e, iArr2), Integer.valueOf(abstractC7391e3.f15150e));
    }

    /* renamed from: eِٜ٘, reason: contains not printable characters */
    public static int m2977e(C16975e c16975e, AbstractC17475e abstractC17475e) {
        for (int i = 0; i < abstractC17475e.size(); i++) {
            for (int i2 = 0; i2 < c16975e.metrica.size(); i2++) {
                if (((C12016e) c16975e.metrica.get(i2)).vip.equals(abstractC17475e.get(i))) {
                    return i;
                }
            }
        }
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    /* renamed from: eؓٞؖ, reason: contains not printable characters */
    public final C16672e m2978e() {
        C16672e c16672e;
        synchronized (this.f21806e) {
            c16672e = this.f21808e;
        }
        return c16672e;
    }

    /* renamed from: eِؖؕ, reason: contains not printable characters */
    public final void m2979e() {
        synchronized (this.f21806e) {
            this.f21808e.getClass();
        }
    }

    /* renamed from: eِْ۠, reason: contains not printable characters */
    public final void m2980e(C16672e c16672e) {
        boolean equals;
        c16672e.getClass();
        synchronized (this.f21806e) {
            equals = this.f21808e.equals(c16672e);
            this.f21808e = c16672e;
        }
        if (equals) {
            return;
        }
        if (c16672e.f32712e && this.f21802e == null) {
            AbstractC2803e.smaato("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        C11246e c11246e = (C11246e) this.f22047e;
        if (c11246e != null) {
            c11246e.f22562e.billing(10);
        }
    }

    /* renamed from: eٍٕ, reason: contains not printable characters */
    public final void m2981e() {
        boolean z;
        C11246e c11246e;
        C1843e c1843e;
        synchronized (this.f21806e) {
            try {
                z = this.f21808e.f32712e && Build.VERSION.SDK_INT >= 32 && (c1843e = this.f21807e) != null && c1843e.vip;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (c11246e = (C11246e) this.f22047e) == null) {
            return;
        }
        c11246e.f22562e.billing(10);
    }

    @Override // defpackage.AbstractC11130e, defpackage.InterfaceC16843e
    public final void release() {
        C1843e c1843e;
        synchronized (this.f21806e) {
            try {
                Thread thread = this.f21804e;
                if (thread != null) {
                    AbstractC2301e.admob("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (c1843e = this.f21807e) != null) {
            c1843e.appmetrica();
            this.f21807e = null;
        }
        this.f22047e = null;
        this.f22046e = null;
    }
}
