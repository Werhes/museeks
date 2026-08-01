package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٓٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14341e implements InterfaceC8064e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f28366e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f28367e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f28368e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f28369e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f28370e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f28371e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f28372e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f28373e;

    @Override // defpackage.InterfaceC3811e
    public Object ad() {
        return new C4541e((ArrayList) this.f28366e, (ArrayList) this.f28373e, (ArrayList) this.f28372e, (List) this.f28367e, (C1828e) this.f28370e);
    }

    public int appmetrica(C17688e c17688e, int i) {
        ArrayList arrayList;
        int i2;
        long max;
        float f;
        C17688e c17688e2 = c17688e;
        ArrayList arrayList2 = (ArrayList) this.f28369e;
        int size = arrayList2.size();
        long j = 0;
        int i3 = 0;
        long j2 = 0;
        while (i3 < size) {
            AbstractC17471e abstractC17471e = ((C18113e) arrayList2.get(i3)).ad;
            if (!(abstractC17471e instanceof C10396e) ? !(i != 0 ? (abstractC17471e instanceof C4954e) : (abstractC17471e instanceof C9586e)) : ((C10396e) abstractC17471e).purchase != i) {
                C17455e c17455e = (i == 0 ? c17688e2.license : c17688e2.appmetrica).yandex;
                C17455e c17455e2 = (i == 0 ? c17688e2.license : c17688e2.appmetrica).startapp;
                C17455e c17455e3 = abstractC17471e.yandex;
                C17455e c17455e4 = abstractC17471e.startapp;
                boolean contains = c17455e3.advert.contains(c17455e);
                boolean contains2 = c17455e4.advert.contains(c17455e2);
                long adcel = abstractC17471e.adcel();
                if (contains && contains2) {
                    long vip = C18113e.vip(c17455e3, j);
                    long ad = C18113e.ad(c17455e4, j);
                    long j3 = vip - adcel;
                    int i4 = c17455e4.purchase;
                    arrayList = arrayList2;
                    i2 = size;
                    if (j3 >= (-i4)) {
                        j3 += i4;
                    }
                    long j4 = c17455e3.purchase;
                    long j5 = ((-ad) - adcel) - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    C11325e c11325e = abstractC17471e.vip;
                    if (i == 0) {
                        f = c11325e.f22744instanceof;
                    } else if (i == 1) {
                        f = c11325e.f22753static;
                    } else {
                        c11325e.getClass();
                        f = -1.0f;
                    }
                    float f2 = (float) (f > 0.0f ? (((float) j3) / (1.0f - f)) + (((float) j5) / f) : 0L);
                    max = (c17455e3.purchase + ((((f2 * f) + 0.5f) + adcel) + AbstractC1634e.billing(1.0f, f, f2, 0.5f))) - c17455e4.purchase;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    max = contains ? Math.max(C18113e.vip(c17455e3, c17455e3.purchase), c17455e3.purchase + adcel) : contains2 ? Math.max(-C18113e.ad(c17455e4, c17455e4.purchase), (-c17455e4.purchase) + adcel) : (abstractC17471e.adcel() + c17455e3.purchase) - c17455e4.purchase;
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                max = j;
            }
            j2 = Math.max(j2, max);
            i3++;
            c17688e2 = c17688e;
            arrayList2 = arrayList;
            size = i2;
            j = 0;
        }
        return (int) j2;
    }

    public void billing(int i, int i2, int i3, int i4, C11325e c11325e) {
        C10039e c10039e = (C10039e) this.f28372e;
        c10039e.ad = i;
        c10039e.vip = i3;
        c10039e.metrica = i2;
        c10039e.license = i4;
        ((C0724e) this.f28373e).vip(c11325e, c10039e);
        c11325e.m3195protected(c10039e.appmetrica);
        c11325e.m3197throw(c10039e.purchase);
        c11325e.firebase = c10039e.yandex;
        c11325e.m3196this(c10039e.billing);
    }

    public void license() {
        C17688e c17688e = (C17688e) this.f28367e;
        ArrayList arrayList = (ArrayList) this.f28369e;
        ArrayList arrayList2 = (ArrayList) this.f28366e;
        arrayList2.clear();
        C17688e c17688e2 = (C17688e) this.f28370e;
        c17688e2.license.purchase();
        c17688e2.appmetrica.purchase();
        arrayList2.add(c17688e2.license);
        arrayList2.add(c17688e2.appmetrica);
        Iterator it = c17688e2.f34670e.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C11325e c11325e = (C11325e) it.next();
            if (c11325e instanceof C0913e) {
                AbstractC17471e abstractC17471e = new AbstractC17471e(c11325e);
                c11325e.license.purchase();
                c11325e.appmetrica.purchase();
                abstractC17471e.purchase = ((C0913e) c11325e).f3335e;
                arrayList2.add(abstractC17471e);
            } else {
                if (c11325e.inmobi()) {
                    if (c11325e.vip == null) {
                        c11325e.vip = new C10396e(c11325e, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c11325e.vip);
                } else {
                    arrayList2.add(c11325e.license);
                }
                if (c11325e.isPro()) {
                    if (c11325e.metrica == null) {
                        c11325e.metrica = new C10396e(c11325e, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c11325e.metrica);
                } else {
                    arrayList2.add(c11325e.appmetrica);
                }
                if (c11325e instanceof AbstractC14215e) {
                    arrayList2.add(new AbstractC17471e(c11325e));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((AbstractC17471e) it2.next()).purchase();
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            AbstractC17471e abstractC17471e2 = (AbstractC17471e) it3.next();
            if (abstractC17471e2.vip != c17688e2) {
                abstractC17471e2.license();
            }
        }
        arrayList.clear();
        purchase(c17688e.license, 0, arrayList);
        purchase(c17688e.appmetrica, 1, arrayList);
        this.f28371e = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x028c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x019d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x000a A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void metrica(defpackage.C17688e r25) {
        /*
            Method dump skipped, instructions count: 845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14341e.metrica(eُ٘ۙ):void");
    }

    public void purchase(AbstractC17471e abstractC17471e, int i, ArrayList arrayList) {
        C17455e c17455e = abstractC17471e.yandex;
        C17455e c17455e2 = abstractC17471e.startapp;
        Iterator it = c17455e.mopub.iterator();
        while (it.hasNext()) {
            InterfaceC12462e interfaceC12462e = (InterfaceC12462e) it.next();
            if (interfaceC12462e instanceof C17455e) {
                vip((C17455e) interfaceC12462e, i, arrayList, null);
            } else if (interfaceC12462e instanceof AbstractC17471e) {
                vip(((AbstractC17471e) interfaceC12462e).yandex, i, arrayList, null);
            }
        }
        Iterator it2 = c17455e2.mopub.iterator();
        while (it2.hasNext()) {
            InterfaceC12462e interfaceC12462e2 = (InterfaceC12462e) it2.next();
            if (interfaceC12462e2 instanceof C17455e) {
                vip((C17455e) interfaceC12462e2, i, arrayList, null);
            } else if (interfaceC12462e2 instanceof AbstractC17471e) {
                vip(((AbstractC17471e) interfaceC12462e2).startapp, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((C4954e) abstractC17471e).mopub.mopub.iterator();
            while (it3.hasNext()) {
                InterfaceC12462e interfaceC12462e3 = (InterfaceC12462e) it3.next();
                if (interfaceC12462e3 instanceof C17455e) {
                    vip((C17455e) interfaceC12462e3, i, arrayList, null);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, e٘ۤۚ] */
    public void vip(C17455e c17455e, int i, ArrayList arrayList, C18113e c18113e) {
        AbstractC17471e abstractC17471e = c17455e.license;
        C18113e c18113e2 = abstractC17471e.metrica;
        C17455e c17455e2 = abstractC17471e.startapp;
        C17455e c17455e3 = abstractC17471e.yandex;
        if (c18113e2 == null) {
            C17688e c17688e = (C17688e) this.f28367e;
            if (abstractC17471e != c17688e.license) {
                C18113e c18113e3 = c18113e;
                if (abstractC17471e == c17688e.appmetrica) {
                    return;
                }
                if (c18113e == null) {
                    ?? obj = new Object();
                    obj.ad = null;
                    obj.vip = new ArrayList();
                    obj.ad = abstractC17471e;
                    arrayList.add(obj);
                    c18113e3 = obj;
                }
                abstractC17471e.metrica = c18113e3;
                c18113e3.vip.add(abstractC17471e);
                Iterator it = c17455e3.mopub.iterator();
                while (it.hasNext()) {
                    InterfaceC12462e interfaceC12462e = (InterfaceC12462e) it.next();
                    if (interfaceC12462e instanceof C17455e) {
                        vip((C17455e) interfaceC12462e, i, arrayList, c18113e3);
                    }
                }
                Iterator it2 = c17455e2.mopub.iterator();
                while (it2.hasNext()) {
                    InterfaceC12462e interfaceC12462e2 = (InterfaceC12462e) it2.next();
                    if (interfaceC12462e2 instanceof C17455e) {
                        vip((C17455e) interfaceC12462e2, i, arrayList, c18113e3);
                    }
                }
                if (i == 1 && (abstractC17471e instanceof C4954e)) {
                    Iterator it3 = ((C4954e) abstractC17471e).mopub.mopub.iterator();
                    while (it3.hasNext()) {
                        InterfaceC12462e interfaceC12462e3 = (InterfaceC12462e) it3.next();
                        if (interfaceC12462e3 instanceof C17455e) {
                            vip((C17455e) interfaceC12462e3, i, arrayList, c18113e3);
                        }
                    }
                }
                Iterator it4 = c17455e3.advert.iterator();
                while (it4.hasNext()) {
                    vip((C17455e) it4.next(), i, arrayList, c18113e3);
                }
                Iterator it5 = c17455e2.advert.iterator();
                while (it5.hasNext()) {
                    vip((C17455e) it5.next(), i, arrayList, c18113e3);
                }
                if (i == 1 && (abstractC17471e instanceof C4954e)) {
                    Iterator it6 = ((C4954e) abstractC17471e).mopub.advert.iterator();
                    while (it6.hasNext()) {
                        vip((C17455e) it6.next(), i, arrayList, c18113e3);
                    }
                }
            }
        }
    }

    public void yandex() {
        C4515e c4515e;
        Iterator it = ((C17688e) this.f28367e).f34670e.iterator();
        while (it.hasNext()) {
            C11325e c11325e = (C11325e) it.next();
            if (!c11325e.ad) {
                int[] iArr = c11325e.f22751public;
                boolean z = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = c11325e.subscription;
                int i4 = c11325e.remoteconfig;
                boolean z2 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z = true;
                }
                C1542e c1542e = c11325e.license.appmetrica;
                boolean z3 = c1542e.adcel;
                C1542e c1542e2 = c11325e.appmetrica.appmetrica;
                boolean z4 = c1542e2.adcel;
                boolean z5 = z2;
                if (z3 && z4) {
                    billing(1, c1542e.billing, 1, c1542e2.billing, c11325e);
                    c11325e.ad = true;
                } else if (z3 && z) {
                    billing(1, c1542e.billing, 2, c1542e2.billing, c11325e);
                    if (i2 == 3) {
                        c11325e.appmetrica.appmetrica.smaato = c11325e.mopub();
                    } else {
                        c11325e.appmetrica.appmetrica.license(c11325e.mopub());
                        c11325e.ad = true;
                    }
                } else if (z4 && z5) {
                    billing(2, c1542e.billing, 1, c1542e2.billing, c11325e);
                    if (i == 3) {
                        c11325e.license.appmetrica.smaato = c11325e.admob();
                    } else {
                        c11325e.license.appmetrica.license(c11325e.admob());
                        c11325e.ad = true;
                    }
                }
                if (c11325e.ad && (c4515e = c11325e.appmetrica.advert) != null) {
                    c4515e.license(c11325e.f22748package);
                }
            }
        }
    }
}
