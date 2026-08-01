package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٖۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10302e implements InterfaceC1489e {

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final InterfaceC3232e f20331e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC4311e f20332e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final C5891e f20334e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C13391e f20336e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C9205e f20337e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public C14402e f20338e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public AbstractC16510e f20340e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C3936e f20341e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C13391e f20343e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C14131e f20344e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C9205e f20346e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C9576e f20347e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final ArrayList f20329e = new ArrayList();

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final ArrayList f20348e = new ArrayList();

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public List f20345e = Collections.EMPTY_LIST;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f20333e = 0;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public Range f20342e = C6884e.yandex;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final Object f20330e = new Object();

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public boolean f20335e = true;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public InterfaceC12330e f20339e = null;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C3168e f20349e = new C3168e(16);

    public C10302e(InterfaceC2881e interfaceC2881e, InterfaceC2881e interfaceC2881e2, C16575e c16575e, C16575e c16575e2, C13391e c13391e, C13391e c13391e2, C9576e c9576e, C5891e c5891e, InterfaceC4311e interfaceC4311e) {
        InterfaceC3232e interfaceC3232e = c16575e.f32519e;
        this.f20331e = interfaceC3232e;
        this.f20346e = new C9205e(interfaceC2881e, c16575e);
        if (interfaceC2881e2 == null || c16575e2 == null) {
            this.f20337e = null;
        } else {
            this.f20337e = new C9205e(interfaceC2881e2, c16575e2);
        }
        this.f20336e = c13391e;
        this.f20343e = c13391e2;
        this.f20347e = c9576e;
        this.f20332e = interfaceC4311e;
        this.f20344e = AbstractC11906e.yandex(c16575e.f34060e.billing(), c16575e2 != null ? c16575e2.f34060e.billing() : null, (C15681e) ((C6594e) interfaceC3232e).f13613e);
        this.f20334e = c5891e;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [eؒٝۥ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [eٍؚؐ, eٖۜؓ] */
    public static HashMap applovin(ArrayList arrayList, InterfaceC4311e interfaceC4311e, InterfaceC4311e interfaceC4311e2, int i, Range range) {
        InterfaceC12438e billing;
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC16510e abstractC16510e = (AbstractC16510e) it.next();
            if (abstractC16510e instanceof C14402e) {
                C14402e c14402e = (C14402e) abstractC16510e;
                C5450e c5450e = new C5450e(C17015e.vip(new C3186e(2).f7297e));
                AbstractC14100e.purchase(c5450e);
                ?? abstractC16510e2 = new AbstractC16510e(c5450e);
                abstractC16510e2.pro = C9301e.ads;
                InterfaceC12438e billing2 = abstractC16510e2.billing(false, interfaceC4311e);
                if (billing2 == null) {
                    billing = null;
                } else {
                    C4069e purchase = C4069e.purchase(billing2);
                    purchase.adcel(InterfaceC7775e.f15760e);
                    billing = ((C2362e) c14402e.advert(purchase)).mo819interface();
                }
            } else {
                billing = abstractC16510e.billing(false, interfaceC4311e);
            }
            InterfaceC12438e billing3 = abstractC16510e.billing(true, interfaceC4311e2);
            C4069e purchase2 = billing3 != null ? C4069e.purchase(billing3) : C4069e.license();
            purchase2.yandex(InterfaceC12438e.f24892e, Integer.valueOf(i));
            if (!C6884e.yandex.equals(range)) {
                purchase2.billing(InterfaceC12438e.f24889e, EnumC13734e.f27214e, range);
                purchase2.yandex(InterfaceC12438e.f24885e, Boolean.TRUE);
            }
            InterfaceC12438e mo819interface = abstractC16510e.advert(purchase2).mo819interface();
            ?? obj = new Object();
            obj.ad = billing;
            obj.vip = mo819interface;
            hashMap.put(abstractC16510e, obj);
        }
        return hashMap;
    }

    /* renamed from: class, reason: not valid java name */
    public static void m2787class(HashMap hashMap) {
        HashSet hashSet;
        for (Map.Entry entry : hashMap.entrySet()) {
            AbstractC16510e abstractC16510e = (AbstractC16510e) entry.getKey();
            Set set = (Set) entry.getValue();
            if (set != null) {
                abstractC16510e.getClass();
                hashSet = new HashSet(set);
            } else {
                hashSet = null;
            }
            abstractC16510e.billing = hashSet;
        }
    }

    public static HashMap purchase(LinkedHashSet linkedHashSet, C2362e c2362e) {
        HashMap hashMap = new HashMap();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            AbstractC16510e abstractC16510e = (AbstractC16510e) it.next();
            hashMap.put(abstractC16510e, abstractC16510e.billing);
            HashSet hashSet = null;
            LinkedHashSet linkedHashSet2 = c2362e != null ? (LinkedHashSet) c2362e.f5914e : null;
            if (linkedHashSet2 != null) {
                hashSet = new HashSet(linkedHashSet2);
            }
            abstractC16510e.billing = hashSet;
        }
        return hashMap;
    }

    public static Matrix tapsense(Rect rect, Size size) {
        AbstractC4265e.license(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    /* renamed from: this, reason: not valid java name */
    public static ArrayList m2788this(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC16510e) it.next()).getClass();
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                throw AbstractC5087e.m1747goto(it2);
            }
        }
        return arrayList2;
    }

    public final void Signature() {
        synchronized (this.f20330e) {
            try {
                if (!this.f20335e) {
                    if (!this.f20348e.isEmpty()) {
                        this.f20346e.startapp(this.f20331e);
                        C9205e c9205e = this.f20337e;
                        if (c9205e != null) {
                            c9205e.startapp(this.f20331e);
                        }
                    }
                    this.f20346e.advert(this.f20348e);
                    C9205e c9205e2 = this.f20337e;
                    if (c9205e2 != null) {
                        c9205e2.advert(this.f20348e);
                    }
                    m2791interface();
                    Iterator it = this.f20348e.iterator();
                    while (it.hasNext()) {
                        ((AbstractC16510e) it.next()).subscription();
                    }
                    this.f20335e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet ads(LinkedHashSet linkedHashSet, boolean z) {
        int i;
        HashSet hashSet = new HashSet();
        synchronized (this.f20330e) {
            Iterator it = this.f20345e.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
            i = z ? 3 : 0;
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            AbstractC16510e abstractC16510e = (AbstractC16510e) it2.next();
            AbstractC4265e.license(!(abstractC16510e instanceof C14402e), "Only support one level of sharing for now.");
            Iterator it3 = abstractC16510e.mopub().iterator();
            while (true) {
                if (it3.hasNext()) {
                    int intValue = ((Integer) it3.next()).intValue();
                    if ((i & intValue) == intValue) {
                        hashSet.add(abstractC16510e);
                        break;
                    }
                }
            }
        }
        return hashSet;
    }

    public final void appmetrica(C6201e c6201e) {
        Map map = c6201e.startapp.ad;
        ArrayList arrayList = c6201e.vip;
        synchronized (this.f20330e) {
            try {
                if (this.f20341e != null && !arrayList.isEmpty()) {
                    boolean z = this.f20346e.f18386e.f34060e.admob() == 0;
                    Rect mopub = this.f20346e.f18386e.f34060e.mopub();
                    C3936e c3936e = this.f20341e;
                    Rational rational = c3936e.vip;
                    int signatures = this.f20346e.f18386e.f34060e.signatures(c3936e.metrica);
                    C3936e c3936e2 = this.f20341e;
                    HashMap metrica = AbstractC16268e.metrica(mopub, z, rational, signatures, c3936e2.ad, c3936e2.license, map);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        AbstractC16510e abstractC16510e = (AbstractC16510e) it.next();
                        Rect rect = (Rect) metrica.get(abstractC16510e);
                        rect.getClass();
                        abstractC16510e.crashlytics(rect);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    AbstractC16510e abstractC16510e2 = (AbstractC16510e) it2.next();
                    Rect mopub2 = this.f20346e.f18386e.f34060e.mopub();
                    C6884e c6884e = (C6884e) map.get(abstractC16510e2);
                    c6884e.getClass();
                    abstractC16510e2.premium(tapsense(mopub2, c6884e.ad));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        List list = this.f20345e;
        ArrayList arrayList2 = c6201e.vip;
        LinkedHashSet linkedHashSet = c6201e.ad;
        ArrayList m2788this = m2788this(arrayList2, list);
        ArrayList arrayList3 = new ArrayList(linkedHashSet);
        arrayList3.removeAll(arrayList2);
        ArrayList m2788this2 = m2788this(arrayList3, m2788this);
        if (!m2788this2.isEmpty()) {
            AbstractC9464e.remoteconfig("CameraUseCaseAdapter", "Unused effects: " + m2788this2);
        }
        Iterator it3 = c6201e.appmetrica.iterator();
        while (it3.hasNext()) {
            ((AbstractC16510e) it3.next()).firebase(this.f20346e);
        }
        this.f20346e.smaato(c6201e.appmetrica);
        if (this.f20337e != null) {
            Iterator it4 = c6201e.appmetrica.iterator();
            while (it4.hasNext()) {
                AbstractC16510e abstractC16510e3 = (AbstractC16510e) it4.next();
                C9205e c9205e = this.f20337e;
                Objects.requireNonNull(c9205e);
                abstractC16510e3.firebase(c9205e);
            }
            C9205e c9205e2 = this.f20337e;
            Objects.requireNonNull(c9205e2);
            c9205e2.smaato(c6201e.appmetrica);
        }
        if (c6201e.appmetrica.isEmpty()) {
            Iterator it5 = c6201e.license.iterator();
            while (it5.hasNext()) {
                AbstractC16510e abstractC16510e4 = (AbstractC16510e) it5.next();
                Map map2 = c6201e.startapp.ad;
                if (map2.containsKey(abstractC16510e4)) {
                    C6884e c6884e2 = (C6884e) map2.get(abstractC16510e4);
                    Objects.requireNonNull(c6884e2);
                    InterfaceC12330e interfaceC12330e = c6884e2.purchase;
                    if (interfaceC12330e != null) {
                        C11469e c11469e = abstractC16510e4.admob;
                        C17015e c17015e = c11469e.billing.vip;
                        Objects.requireNonNull(interfaceC12330e);
                        if (interfaceC12330e.admob().size() == c11469e.billing.vip.admob().size()) {
                            for (C14326e c14326e : interfaceC12330e.admob()) {
                                if (c17015e.f33330e.containsKey(c14326e) && Objects.equals(c17015e.subscription(c14326e), interfaceC12330e.subscription(c14326e))) {
                                }
                            }
                        }
                        abstractC16510e4.startapp = abstractC16510e4.isPro(interfaceC12330e);
                        if (this.f20335e) {
                            this.f20346e.purchase(abstractC16510e4);
                            C9205e c9205e3 = this.f20337e;
                            if (c9205e3 != null) {
                                c9205e3.purchase(abstractC16510e4);
                            }
                        }
                    }
                }
            }
        }
        Iterator it6 = c6201e.metrica.iterator();
        while (it6.hasNext()) {
            AbstractC16510e abstractC16510e5 = (AbstractC16510e) it6.next();
            C1211e c1211e = (C1211e) c6201e.yandex.get(abstractC16510e5);
            Objects.requireNonNull(c1211e);
            C9205e c9205e4 = this.f20337e;
            if (c9205e4 != null) {
                abstractC16510e5.vip(this.f20346e, c9205e4, c1211e.ad, c1211e.vip);
                C6884e c6884e3 = (C6884e) c6201e.startapp.ad.get(abstractC16510e5);
                c6884e3.getClass();
                C11376e c11376e = c6201e.adcel;
                c11376e.getClass();
                abstractC16510e5.m4159interface(c6884e3, (C6884e) c11376e.ad.get(abstractC16510e5));
            } else {
                abstractC16510e5.vip(this.f20346e, null, c1211e.ad, c1211e.vip);
                C6884e c6884e4 = (C6884e) c6201e.startapp.ad.get(abstractC16510e5);
                c6884e4.getClass();
                abstractC16510e5.m4159interface(c6884e4, null);
            }
        }
        if (this.f20335e) {
            this.f20346e.advert(c6201e.metrica);
            C9205e c9205e5 = this.f20337e;
            if (c9205e5 != null) {
                c9205e5.advert(c6201e.metrica);
            }
        }
        Iterator it7 = c6201e.metrica.iterator();
        while (it7.hasNext()) {
            ((AbstractC16510e) it7.next()).subscription();
        }
        this.f20329e.clear();
        this.f20329e.addAll(c6201e.ad);
        this.f20348e.clear();
        this.f20348e.addAll(c6201e.vip);
        this.f20340e = c6201e.billing;
        this.f20338e = c6201e.purchase;
    }

    public final boolean crashlytics() {
        boolean z;
        synchronized (this.f20330e) {
            C6594e c6594e = (C6594e) this.f20331e;
            c6594e.getClass();
            int i = AbstractC3521e.ad;
            z = ((Integer) AbstractC0054e.Signature(c6594e, InterfaceC3232e.license, 0)).intValue() == 1;
        }
        return z;
    }

    /* renamed from: extends, reason: not valid java name */
    public final void m2789extends(int i) {
        synchronized (this.f20330e) {
            this.f20333e = i;
        }
    }

    public final void firebase(ArrayList arrayList) {
        synchronized (this.f20330e) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC16510e) it.next()).billing = null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f20329e);
            linkedHashSet.removeAll(arrayList);
            appmetrica(pro(linkedHashSet, this.f20337e != null));
        }
    }

    /* renamed from: goto, reason: not valid java name */
    public final void m2790goto(List list) {
        synchronized (this.f20330e) {
            this.f20345e = list;
        }
    }

    public final void inmobi() {
        synchronized (this.f20330e) {
            try {
                if (this.f20335e) {
                    this.f20346e.smaato(new ArrayList(this.f20348e));
                    C9205e c9205e = this.f20337e;
                    if (c9205e != null) {
                        c9205e.smaato(new ArrayList(this.f20348e));
                    }
                    remoteconfig();
                    this.f20335e = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: interface, reason: not valid java name */
    public final void m2791interface() {
        synchronized (this.f20330e) {
            try {
                InterfaceC12330e interfaceC12330e = this.f20339e;
                if (interfaceC12330e != null) {
                    this.f20346e.f18385e.appmetrica(interfaceC12330e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int isPro() {
        synchronized (this.f20330e) {
            try {
                return this.f20347e.vip() == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C14402e isVip(LinkedHashSet linkedHashSet, boolean z) {
        boolean z2;
        synchronized (this.f20330e) {
            try {
                HashSet ads = ads(linkedHashSet, z);
                if (ads.size() < 2) {
                    subs();
                    return null;
                }
                C14402e c14402e = this.f20338e;
                if (c14402e != null && c14402e.pro.f16692e.equals(ads)) {
                    C14402e c14402e2 = this.f20338e;
                    c14402e2.getClass();
                    HashSet hashSet = ((AbstractC16510e) ads.iterator().next()).billing;
                    c14402e2.billing = hashSet != null ? new HashSet(hashSet) : null;
                    C14402e c14402e3 = this.f20338e;
                    Objects.requireNonNull(c14402e3);
                    return c14402e3;
                }
                int[] iArr = {1, 2, 4};
                HashSet hashSet2 = new HashSet();
                Iterator it = ads.iterator();
                while (it.hasNext()) {
                    AbstractC16510e abstractC16510e = (AbstractC16510e) it.next();
                    for (int i = 0; i < 3; i++) {
                        int i2 = iArr[i];
                        Iterator it2 = abstractC16510e.mopub().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            }
                            int intValue = ((Integer) it2.next()).intValue();
                            if ((i2 & intValue) == intValue) {
                                z2 = true;
                                break;
                            }
                        }
                        if (z2) {
                            if (hashSet2.contains(Integer.valueOf(i2))) {
                                return null;
                            }
                            hashSet2.add(Integer.valueOf(i2));
                        }
                    }
                }
                return new C14402e(this.f20346e, this.f20337e, this.f20336e, this.f20343e, ads, this.f20332e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void metrica(Collection collection, C2362e c2362e) {
        AbstractC9464e.yandex("CameraUseCaseAdapter", "addUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + c2362e);
        synchronized (this.f20330e) {
            try {
                C9205e c9205e = this.f20346e;
                InterfaceC3232e interfaceC3232e = this.f20331e;
                c9205e.startapp(interfaceC3232e);
                C9205e c9205e2 = this.f20337e;
                if (c9205e2 != null) {
                    c9205e2.startapp(interfaceC3232e);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f20329e);
                linkedHashSet.addAll(collection);
                HashMap purchase = purchase(linkedHashSet, c2362e);
                try {
                    appmetrica(pro(linkedHashSet, this.f20337e != null));
                } catch (IllegalArgumentException e) {
                    m2787class(purchase);
                    throw new Exception(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: native, reason: not valid java name */
    public final void m2792native(Range range) {
        synchronized (this.f20330e) {
            this.f20342e = range;
        }
    }

    public final List premium() {
        ArrayList arrayList;
        synchronized (this.f20330e) {
            arrayList = new ArrayList(this.f20329e);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        throw new java.lang.IllegalArgumentException("Ultra HDR image and Raw capture does not support for use with CameraEffect.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0165, code lost:
    
        return pro(r20, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x015f, code lost:
    
        if (r2 != false) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C6201e pro(java.util.LinkedHashSet r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10302e.pro(java.util.LinkedHashSet, boolean):eؙؖۜ");
    }

    public final void remoteconfig() {
        synchronized (this.f20330e) {
            C0200e c0200e = this.f20346e.f18385e;
            this.f20339e = c0200e.vip.mopub();
            c0200e.advert();
        }
    }

    /* JADX WARN: Type inference failed for: r8v14, types: [eٍؚؐ, eٖۜؓ] */
    public final AbstractC16510e signatures(LinkedHashSet linkedHashSet, C14402e c14402e) {
        AbstractC16510e abstractC16510e;
        synchronized (this.f20330e) {
            try {
                ArrayList arrayList = new ArrayList(linkedHashSet);
                if (c14402e != null) {
                    arrayList.add(c14402e);
                    arrayList.removeAll(c14402e.pro.f16692e);
                }
                if (crashlytics()) {
                    Iterator it = arrayList.iterator();
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    while (it.hasNext()) {
                        AbstractC16510e abstractC16510e2 = (AbstractC16510e) it.next();
                        if (!(abstractC16510e2 instanceof C9301e) && !(abstractC16510e2 instanceof C14402e)) {
                            if (abstractC16510e2 instanceof C3373e) {
                                z2 = true;
                            }
                        }
                        z3 = true;
                    }
                    if (!z2 || z3) {
                        Iterator it2 = arrayList.iterator();
                        boolean z4 = false;
                        while (it2.hasNext()) {
                            AbstractC16510e abstractC16510e3 = (AbstractC16510e) it2.next();
                            if (!(abstractC16510e3 instanceof C9301e) && !(abstractC16510e3 instanceof C14402e)) {
                                if (abstractC16510e3 instanceof C3373e) {
                                    z4 = true;
                                }
                            }
                            z = true;
                        }
                        if (z && !z4) {
                            AbstractC16510e abstractC16510e4 = this.f20340e;
                            if (abstractC16510e4 instanceof C3373e) {
                                abstractC16510e = abstractC16510e4;
                            } else {
                                C3186e c3186e = new C3186e(1);
                                c3186e.f7297e.yandex(InterfaceC7775e.f15761e, "ImageCapture-Extra");
                                abstractC16510e = c3186e.ad();
                            }
                        }
                    } else {
                        AbstractC16510e abstractC16510e5 = this.f20340e;
                        if (!(abstractC16510e5 instanceof C9301e)) {
                            C3186e c3186e2 = new C3186e(2);
                            c3186e2.f7297e.yandex(InterfaceC7775e.f15761e, "Preview-Extra");
                            C5450e c5450e = new C5450e(C17015e.vip(c3186e2.f7297e));
                            AbstractC14100e.purchase(c5450e);
                            ?? abstractC16510e6 = new AbstractC16510e(c5450e);
                            ScheduledExecutorServiceC5380e scheduledExecutorServiceC5380e = C9301e.ads;
                            abstractC16510e6.pro = scheduledExecutorServiceC5380e;
                            C8391e c8391e = new C8391e(1);
                            AbstractC13062e.metrica();
                            abstractC16510e6.remoteconfig = c8391e;
                            abstractC16510e6.pro = scheduledExecutorServiceC5380e;
                            if (abstractC16510e6.metrica() != null) {
                                abstractC16510e6.m2542this((C5450e) abstractC16510e6.yandex, abstractC16510e6.startapp);
                                abstractC16510e6.admob();
                            }
                            abstractC16510e6.Signature();
                            abstractC16510e = abstractC16510e6;
                        }
                    }
                }
                abstractC16510e = null;
            } finally {
            }
        }
        return abstractC16510e;
    }

    public final void subs() {
        synchronized (this.f20330e) {
            ((C6594e) this.f20331e).m2230transient();
        }
    }

    /* renamed from: throw, reason: not valid java name */
    public final void m2793throw(C3936e c3936e) {
        synchronized (this.f20330e) {
            this.f20341e = c3936e;
        }
    }

    @Override // defpackage.InterfaceC1489e
    public final InterfaceC12424e vip() {
        return this.f20346e.f18386e;
    }
}
