package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۧٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2247e implements InterfaceC14239e, InterfaceC5429e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final InterfaceC14469e f5702e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final boolean f5703e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C1400e f5704e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C5389e f5705e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final IdentityHashMap f5706e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public C2220e[] f5707e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final int f5708e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public int f5709e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C8938e f5710e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public InterfaceC1145e f5711e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final C5350e f5712e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final C9770e f5713e = new C9770e(11, this);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final Csuper f5714e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C2691e f5715e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public int f5716e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public C12931e f5717e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final InterfaceC4407e f5718e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public C14301e f5719e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final InterfaceC16970e f5720e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final long f5721e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final crashlytics f5722e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C5401e f5723e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C15683e f5724e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public C2220e[] f5725e;

    public C2247e(crashlytics crashlyticsVar, C8938e c8938e, C5389e c5389e, InterfaceC4407e interfaceC4407e, InterfaceC14469e interfaceC14469e, C15683e c15683e, C5401e c5401e, Csuper csuper, InterfaceC16970e interfaceC16970e, C1400e c1400e, boolean z, int i, C5350e c5350e) {
        this.f5722e = crashlyticsVar;
        this.f5710e = c8938e;
        this.f5705e = c5389e;
        this.f5718e = interfaceC4407e;
        this.f5702e = interfaceC14469e;
        this.f5724e = c15683e;
        this.f5723e = c5401e;
        this.f5714e = csuper;
        this.f5720e = interfaceC16970e;
        this.f5704e = c1400e;
        this.f5703e = z;
        this.f5708e = i;
        this.f5712e = c5350e;
        c1400e.getClass();
        C2171e c2171e = AbstractC17475e.f34223e;
        C1410e c1410e = C1410e.f4222e;
        this.f5719e = new C14301e(c1410e, c1410e);
        this.f5706e = new IdentityHashMap();
        this.f5715e = new C2691e(22);
        this.f5725e = new C2220e[0];
        this.f5707e = new C2220e[0];
        this.f5721e = Long.MIN_VALUE;
    }

    public static C16975e adcel(C16975e c16975e, C16975e c16975e2, boolean z) {
        C17750e c17750e;
        int i;
        String str;
        String str2;
        AbstractC17475e abstractC17475e;
        int i2;
        int i3;
        String str3;
        C2171e c2171e = AbstractC17475e.f34223e;
        C1410e c1410e = C1410e.f4222e;
        if (c16975e2 != null) {
            str2 = c16975e2.mopub;
            c17750e = c16975e2.advert;
            i2 = c16975e2.f33282interface;
            i = c16975e2.appmetrica;
            i3 = c16975e2.purchase;
            str = c16975e2.license;
            str3 = c16975e2.vip;
            abstractC17475e = c16975e2.metrica;
        } else {
            String inmobi = AbstractC9413e.inmobi(1, c16975e.mopub);
            c17750e = c16975e.advert;
            if (z) {
                i2 = c16975e.f33282interface;
                i = c16975e.appmetrica;
                i3 = c16975e.purchase;
                str = c16975e.license;
                str3 = c16975e.vip;
                str2 = inmobi;
                abstractC17475e = c16975e.metrica;
            } else {
                i = 0;
                str = null;
                str2 = inmobi;
                abstractC17475e = c1410e;
                i2 = -1;
                i3 = 0;
                str3 = null;
            }
        }
        String license = AbstractC8542e.license(str2);
        int i4 = z ? c16975e.yandex : -1;
        int i5 = z ? c16975e.startapp : -1;
        C11445e c11445e = new C11445e();
        c11445e.ad = c16975e.ad;
        c11445e.vip = str3;
        c11445e.metrica = AbstractC17475e.remoteconfig(abstractC17475e);
        c11445e.smaato = AbstractC8542e.amazon(c16975e.amazon);
        c11445e.amazon = AbstractC8542e.amazon(license);
        c11445e.adcel = str2;
        c11445e.mopub = c17750e;
        c11445e.yandex = i4;
        c11445e.startapp = i5;
        c11445e.f23018class = i2;
        c11445e.appmetrica = i;
        c11445e.purchase = i3;
        c11445e.license = str;
        return new C16975e(c11445e);
    }

    @Override // defpackage.InterfaceC5429e
    public final void ad() {
        for (C2220e c2220e : this.f5725e) {
            C18478e c18478e = c2220e.f5627e;
            C0851e c0851e = c2220e.f5655e;
            ArrayList arrayList = c2220e.f5629e;
            if (!arrayList.isEmpty()) {
                C8170e c8170e = (C8170e) AbstractC4306e.appmetrica(arrayList);
                int metrica = c0851e.metrica(c8170e);
                int i = c8170e.loadAd;
                if (metrica == 1) {
                    if (!c8170e.purchase()) {
                        AbstractC2301e.subscription(i != -1);
                        C9144e metrica2 = c0851e.billing.metrica(false, c8170e.smaato);
                        metrica2.getClass();
                        AbstractC17475e abstractC17475e = metrica2.subscription;
                        int i2 = (int) (c8170e.adcel - metrica2.mopub);
                        c8170e.f16636extends = i2 < 0 ? 0L : ((C12966e) (i2 < abstractC17475e.size() ? ((C2720e) abstractC17475e.get(i2)).f6606e : metrica2.remoteconfig).get(i)).f35428e;
                    }
                } else if (metrica == 0) {
                    c2220e.f5630e.post(new RunnableC2623e(c2220e, c8170e, 23));
                } else if (metrica == 2 && !c2220e.f5671e && c18478e.m4529case()) {
                    c18478e.tapsense();
                }
            }
        }
        this.f5711e.mopub(this);
    }

    @Override // defpackage.InterfaceC14585e
    public final long admob() {
        return this.f5719e.admob();
    }

    @Override // defpackage.InterfaceC14239e
    public final long advert() {
        return -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC14239e
    public final C12931e amazon() {
        C12931e c12931e = this.f5717e;
        c12931e.getClass();
        return c12931e;
    }

    @Override // defpackage.InterfaceC14239e
    public final long appmetrica(long j, C1198e c1198e) {
        C2220e[] c2220eArr = this.f5707e;
        int length = c2220eArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            C2220e c2220e = c2220eArr[i];
            if (c2220e.f5646e == 2) {
                C0851e c0851e = c2220e.f5655e;
                C8938e c8938e = c0851e.billing;
                int mopub = c0851e.subscription.mopub();
                C15214e[] c15214eArr = c0851e.appmetrica;
                C9144e metrica = (mopub >= c15214eArr.length || mopub == -1) ? null : c8938e.metrica(true, c15214eArr[c0851e.subscription.subscription()].metrica());
                if (metrica != null) {
                    AbstractC17475e abstractC17475e = metrica.subscription;
                    if (!abstractC17475e.isEmpty()) {
                        long j2 = metrica.yandex - c8938e.f17918e;
                        long j3 = j - j2;
                        int license = AbstractC9413e.license(abstractC17475e, Long.valueOf(j3), true);
                        long j4 = ((C2720e) abstractC17475e.get(license)).f35427e;
                        return c1198e.ad(j3, j4, (!metrica.metrica || license == abstractC17475e.size() - 1) ? j4 : ((C2720e) abstractC17475e.get(license + 1)).f35427e) + j2;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    @Override // defpackage.InterfaceC14239e
    public final void billing() {
        for (C2220e c2220e : this.f5725e) {
            c2220e.m770interface();
            if (c2220e.f5671e && !c2220e.f5634e) {
                throw C15125e.ad(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // defpackage.InterfaceC14585e
    public final long license() {
        return this.f5719e.license();
    }

    @Override // defpackage.InterfaceC14585e
    public final boolean loadAd(C6576e c6576e) {
        if (this.f5717e != null) {
            return this.f5719e.loadAd(c6576e);
        }
        for (C2220e c2220e : this.f5725e) {
            if (!c2220e.f5634e) {
                C4042e c4042e = new C4042e();
                c4042e.ad = c2220e.f5636e;
                c2220e.loadAd(new C6576e(c4042e));
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x0120, code lost:
    
        if (r44 != r3.f5636e) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0334 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // defpackage.InterfaceC14239e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long metrica(defpackage.InterfaceC17119e[] r40, boolean[] r41, defpackage.InterfaceC4543e[] r42, boolean[] r43, long r44) {
        /*
            Method dump skipped, instructions count: 891
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2247e.metrica(eُٗٛ[], boolean[], eؖۨۚ[], boolean[], long):long");
    }

    public final C2220e purchase(String str, int i, C15214e[] c15214eArr, C16975e[] c16975eArr, C16975e c16975e, List list, Map map, long j) {
        C2220e c2220e = new C2220e(str, i, this.f5713e, new C0851e(this.f5722e, this.f5710e, c15214eArr, c16975eArr, this.f5705e, this.f5718e, this.f5715e, list, this.f5712e), map, this.f5720e, j, c16975e, this.f5702e, this.f5724e, this.f5723e, this.f5714e, this.f5708e, null);
        long j2 = this.f5721e;
        c2220e.f5656e = j2;
        if (c2220e.f5643e) {
            for (C6939e c6939e : c2220e.f5649e) {
                c6939e.m4176class(j2);
            }
        }
        return c2220e;
    }

    @Override // defpackage.InterfaceC14239e
    public final void smaato(InterfaceC1145e interfaceC1145e, long j) {
        String str;
        crashlytics crashlyticsVar;
        boolean z;
        Map map;
        AbstractC17475e abstractC17475e;
        int i;
        HashSet hashSet;
        int i2;
        HashSet hashSet2;
        AbstractC17475e abstractC17475e2;
        Map map2;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z2;
        boolean z3;
        int i3;
        boolean z4;
        List list;
        this.f5711e = interfaceC1145e;
        C8938e c8938e = this.f5710e;
        c8938e.getClass();
        c8938e.f17905e.add(this);
        C5833e c5833e = c8938e.f17909e;
        c5833e.getClass();
        Map map3 = Collections.EMPTY_MAP;
        AbstractC17475e license = c8938e.license(0);
        license.getClass();
        AbstractC17475e license2 = c8938e.license(2);
        license2.getClass();
        AbstractC17475e license3 = c8938e.license(3);
        license3.getClass();
        boolean isEmpty = license.isEmpty();
        this.f5709e = 0;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        crashlytics crashlyticsVar2 = this.f5722e;
        boolean z5 = this.f5703e;
        if (isEmpty) {
            str = "ID3";
            crashlyticsVar = crashlyticsVar2;
            z = z5;
            map = map3;
            abstractC17475e = license3;
        } else {
            C16975e c16975e = c5833e.yandex;
            List list2 = c5833e.startapp;
            int size = license.size();
            int[] iArr = new int[size];
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < license.size(); i6++) {
                C16975e c16975e2 = ((C15214e) license.get(i6)).ad.ad;
                int i7 = c16975e2.isVip;
                String str2 = c16975e2.mopub;
                if (i7 > 0 || AbstractC9413e.inmobi(2, str2) != null) {
                    int i8 = i5;
                    iArr[i6] = 2;
                    i4++;
                    i5 = i8;
                } else if (AbstractC9413e.inmobi(1, str2) != null) {
                    iArr[i6] = 1;
                    i5++;
                } else {
                    iArr[i6] = -1;
                }
            }
            int i9 = i5;
            if (i4 > 0) {
                z3 = false;
                i3 = i4;
                z2 = true;
            } else if (i9 < size) {
                int i10 = size - i9;
                z2 = false;
                i3 = i10;
                z3 = true;
            } else {
                z2 = false;
                z3 = false;
                i3 = size;
            }
            C15214e[] c15214eArr = new C15214e[i3];
            C16975e[] c16975eArr = new C16975e[i3];
            int[] iArr2 = new int[i3];
            int i11 = 0;
            boolean z6 = z2;
            int i12 = 0;
            while (i12 < license.size()) {
                if (z6) {
                    list = list2;
                    if (iArr[i12] != 2) {
                        i12++;
                        list2 = list;
                    }
                } else {
                    list = list2;
                }
                if (!z3 || iArr[i12] != 1) {
                    C15214e c15214e = (C15214e) license.get(i12);
                    c15214eArr[i11] = c15214e;
                    c16975eArr[i11] = c15214e.ad.ad;
                    iArr2[i11] = i12;
                    i11++;
                }
                i12++;
                list2 = list;
            }
            List list3 = list2;
            String str3 = c16975eArr[0].mopub;
            int isVip = AbstractC9413e.isVip(2, str3);
            int i13 = 1;
            int isVip2 = AbstractC9413e.isVip(1, str3);
            boolean z7 = (isVip2 == 1 || (isVip2 == 0 && license2.isEmpty())) && isVip <= 1 && isVip2 + isVip > 0;
            if (z6 || isVip2 <= 0) {
                z4 = true;
                i13 = 0;
            } else {
                z4 = true;
            }
            z = z5;
            abstractC17475e = license3;
            C2220e purchase = purchase("main", i13, c15214eArr, c16975eArr, c16975e, list3, map3, j);
            arrayList3.add(purchase);
            arrayList4.add(iArr2);
            if (z && z7) {
                ArrayList arrayList5 = new ArrayList();
                if (isVip > 0) {
                    C16975e[] c16975eArr2 = new C16975e[i3];
                    int i14 = 0;
                    while (i14 < i3) {
                        C16975e c16975e3 = c16975eArr[i14];
                        String inmobi = AbstractC9413e.inmobi(2, c16975e3.mopub);
                        String license4 = AbstractC8542e.license(inmobi);
                        C16975e[] c16975eArr3 = c16975eArr;
                        C11445e c11445e = new C11445e();
                        c11445e.ad = c16975e3.ad;
                        c11445e.vip = c16975e3.vip;
                        c11445e.metrica = AbstractC17475e.remoteconfig(c16975e3.metrica);
                        c11445e.smaato = AbstractC8542e.amazon(c16975e3.amazon);
                        c11445e.amazon = AbstractC8542e.amazon(license4);
                        c11445e.adcel = inmobi;
                        c11445e.mopub = c16975e3.advert;
                        c11445e.yandex = c16975e3.yandex;
                        c11445e.startapp = c16975e3.startapp;
                        c11445e.signatures = c16975e3.tapsense;
                        c11445e.tapsense = c16975e3.isVip;
                        c11445e.isPro = c16975e3.applovin;
                        c11445e.appmetrica = c16975e3.appmetrica;
                        c11445e.purchase = c16975e3.purchase;
                        c11445e.crashlytics = c16975e3.firebase;
                        c16975eArr2[i14] = new C16975e(c11445e);
                        i14++;
                        c16975eArr = c16975eArr3;
                        map3 = map3;
                    }
                    C16975e[] c16975eArr4 = c16975eArr;
                    map = map3;
                    arrayList5.add(new C16437e("main", c16975eArr2));
                    if (isVip2 > 0 && (c16975e != null || license2.isEmpty())) {
                        C11445e ad = adcel(c16975eArr4[0], c16975e, false).ad();
                        ad.advert = "main";
                        arrayList5.add(new C16437e("main:audio", new C16975e(ad)));
                    }
                    if (list3 != null) {
                        for (int i15 = 0; i15 < list3.size(); i15++) {
                            String admob = AbstractC1786e.admob(i15, "main:cc:");
                            C11445e ad2 = crashlyticsVar2.advert((C16975e) list3.get(i15)).ad();
                            ad2.advert = "main";
                            arrayList5.add(new C16437e(admob, new C16975e(ad2)));
                        }
                    }
                    crashlyticsVar = crashlyticsVar2;
                } else {
                    map = map3;
                    crashlyticsVar = crashlyticsVar2;
                    C16975e[] c16975eArr5 = new C16975e[i3];
                    for (int i16 = 0; i16 < i3; i16++) {
                        c16975eArr5[i16] = adcel(c16975eArr[i16], c16975e, true);
                    }
                    arrayList5.add(new C16437e("main", c16975eArr5));
                }
                C11445e c11445e2 = new C11445e();
                str = "ID3";
                c11445e2.ad = str;
                c11445e2.amazon = AbstractC8542e.amazon("application/id3");
                c11445e2.advert = "main";
                C16437e c16437e = new C16437e("main:id3", new C16975e(c11445e2));
                arrayList5.add(c16437e);
                purchase.m769goto((C16437e[]) arrayList5.toArray(new C16437e[0]), arrayList5.indexOf(c16437e));
            } else {
                map = map3;
                str = "ID3";
                crashlyticsVar = crashlyticsVar2;
            }
        }
        ArrayList arrayList6 = new ArrayList(license2.size());
        ArrayList arrayList7 = new ArrayList(license2.size());
        ArrayList arrayList8 = new ArrayList(license2.size());
        HashSet hashSet3 = new HashSet();
        int i17 = 0;
        while (i17 < license2.size()) {
            String str4 = ((C15214e) license2.get(i17)).ad.metrica;
            str4.getClass();
            if (hashSet3.add(str4)) {
                arrayList6.clear();
                arrayList7.clear();
                arrayList8.clear();
                boolean z8 = true;
                for (int i18 = 0; i18 < license2.size(); i18++) {
                    if (str4.equals(((C15214e) license2.get(i18)).ad.metrica)) {
                        C15214e c15214e2 = (C15214e) license2.get(i18);
                        C16975e c16975e4 = c15214e2.ad.ad;
                        arrayList8.add(Integer.valueOf(i18));
                        arrayList6.add(c15214e2);
                        arrayList7.add(c16975e4);
                        z8 &= AbstractC9413e.isVip(1, c16975e4.mopub) == 1;
                    }
                }
                String concat = "audio:".concat(str4);
                String str5 = AbstractC9413e.ad;
                i2 = i17;
                hashSet2 = hashSet3;
                abstractC17475e2 = license2;
                map2 = map;
                arrayList = arrayList7;
                arrayList2 = arrayList8;
                C2220e purchase2 = purchase(concat, 1, (C15214e[]) arrayList6.toArray(new C15214e[0]), (C16975e[]) arrayList7.toArray(new C16975e[0]), null, Collections.EMPTY_LIST, map2, j);
                arrayList4.add(AbstractC10509e.Signature(arrayList2));
                arrayList3.add(purchase2);
                if (z && z8) {
                    String adcel = AbstractC10257e.adcel(concat, ":id3");
                    C11445e c11445e3 = new C11445e();
                    c11445e3.ad = str;
                    c11445e3.amazon = AbstractC8542e.amazon("application/id3");
                    c11445e3.advert = concat;
                    purchase2.m769goto(new C16437e[]{new C16437e(concat, (C16975e[]) arrayList.toArray(new C16975e[0])), new C16437e(adcel, new C16975e(c11445e3))}, 1);
                }
            } else {
                hashSet2 = hashSet3;
                i2 = i17;
                abstractC17475e2 = license2;
                map2 = map;
                arrayList = arrayList7;
                arrayList2 = arrayList8;
            }
            i17 = i2 + 1;
            arrayList7 = arrayList;
            license2 = abstractC17475e2;
            arrayList8 = arrayList2;
            hashSet3 = hashSet2;
            map = map2;
        }
        Map map4 = map;
        this.f5716e = arrayList3.size();
        ArrayList arrayList9 = new ArrayList(abstractC17475e.size());
        ArrayList arrayList10 = new ArrayList(abstractC17475e.size());
        ArrayList arrayList11 = new ArrayList(abstractC17475e.size());
        HashSet hashSet4 = new HashSet();
        int i19 = 0;
        while (i19 < abstractC17475e.size()) {
            AbstractC17475e abstractC17475e3 = abstractC17475e;
            String str6 = ((C15214e) abstractC17475e3.get(i19)).ad.metrica;
            str6.getClass();
            if (hashSet4.add(str6)) {
                arrayList9.clear();
                arrayList10.clear();
                arrayList11.clear();
                for (int i20 = 0; i20 < abstractC17475e3.size(); i20++) {
                    if (str6.equals(((C15214e) abstractC17475e3.get(i20)).ad.metrica)) {
                        C15214e c15214e3 = (C15214e) abstractC17475e3.get(i20);
                        arrayList11.add(Integer.valueOf(i20));
                        arrayList9.add(c15214e3);
                        arrayList10.add(c15214e3.ad.ad);
                    }
                }
                String concat2 = "subtitle:".concat(str6);
                C16975e[] c16975eArr6 = (C16975e[]) arrayList10.toArray(new C16975e[0]);
                String str7 = AbstractC9413e.ad;
                C15214e[] c15214eArr2 = (C15214e[]) arrayList9.toArray(new C15214e[0]);
                C2171e c2171e = AbstractC17475e.f34223e;
                abstractC17475e = abstractC17475e3;
                i = i19;
                hashSet = hashSet4;
                C2220e purchase3 = purchase(concat2, 3, c15214eArr2, c16975eArr6, null, C1410e.f4222e, map4, j);
                arrayList4.add(AbstractC10509e.Signature(arrayList11));
                arrayList3.add(purchase3);
                int length = c16975eArr6.length;
                C16975e[] c16975eArr7 = new C16975e[length];
                for (int i21 = 0; i21 < length; i21++) {
                    c16975eArr7[i21] = crashlyticsVar.advert(c16975eArr6[i21]);
                }
                purchase3.m769goto(new C16437e[]{new C16437e(concat2, c16975eArr7)}, new int[0]);
            } else {
                hashSet = hashSet4;
                i = i19;
                abstractC17475e = abstractC17475e3;
            }
            i19 = i + 1;
            hashSet4 = hashSet;
        }
        this.f5725e = (C2220e[]) arrayList3.toArray(new C2220e[0]);
        this.f5709e = this.f5725e.length;
        for (int i22 = 0; i22 < this.f5716e; i22++) {
            this.f5725e[i22].f5655e.advert = true;
        }
        for (C2220e c2220e : this.f5725e) {
            if (!c2220e.f5634e) {
                C4042e c4042e = new C4042e();
                c4042e.ad = c2220e.f5636e;
                c2220e.loadAd(new C6576e(c4042e));
            }
        }
        this.f5707e = this.f5725e;
    }

    @Override // defpackage.InterfaceC14239e
    public final void startapp(long j) {
        for (C2220e c2220e : this.f5707e) {
            if (c2220e.f5643e && !c2220e.firebase()) {
                int length = c2220e.f5649e.length;
                for (int i = 0; i < length; i++) {
                    c2220e.f5649e[i].adcel(j, c2220e.f5631e[i]);
                }
            }
        }
    }

    @Override // defpackage.InterfaceC14585e
    public final boolean subscription() {
        return this.f5719e.subscription();
    }

    @Override // defpackage.InterfaceC14585e
    public final void tapsense(long j) {
        this.f5719e.tapsense(j);
    }

    @Override // defpackage.InterfaceC5429e
    public final boolean vip(Uri uri, C13572e c13572e, boolean z) {
        int i;
        boolean z2;
        int applovin;
        C2220e[] c2220eArr = this.f5725e;
        int length = c2220eArr.length;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < length) {
            C2220e c2220e = c2220eArr[i2];
            C0851e c0851e = c2220e.f5655e;
            C15214e[] c15214eArr = c0851e.appmetrica;
            C8938e c8938e = c0851e.billing;
            int length2 = c15214eArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    break;
                }
                C15214e c15214e = c15214eArr[i3];
                C4232e c4232e = (C4232e) c8938e.f17919e.get(uri);
                if (c15214e.equals(c4232e != null ? c4232e.ad : null)) {
                    C9436e remoteconfig = !z ? c2220e.f5659e.remoteconfig(c0851e.ad(uri), c13572e) : null;
                    c0851e.loadAd = uri;
                    if (remoteconfig != null) {
                        int i4 = remoteconfig.f18776e;
                        i = i2;
                        long j = remoteconfig.f18775e;
                        if (i4 == 1) {
                            C4232e c4232e2 = (C4232e) c8938e.f17919e.get(uri);
                            if (c4232e2 != null) {
                                z2 = C4232e.metrica(c4232e2, uri, j);
                            }
                        } else {
                            if (i4 != 2) {
                                throw new IllegalStateException(AbstractC1786e.admob(i4, "Invalid fallback selection type: "));
                            }
                            int i5 = 0;
                            while (true) {
                                if (i5 >= c15214eArr.length) {
                                    i5 = -1;
                                    break;
                                }
                                C15214e c15214e2 = c15214eArr[i5];
                                C4232e c4232e3 = (C4232e) c8938e.f17919e.get(uri);
                                if (c15214e2.equals(c4232e3 != null ? c4232e3.ad : null)) {
                                    break;
                                }
                                i5++;
                            }
                            if (i5 != -1 && (applovin = c0851e.subscription.applovin(i5)) != -1 && c0851e.subscription.signatures(applovin, j)) {
                                C4232e c4232e4 = (C4232e) c8938e.f17919e.get(uri);
                                if (c4232e4 != null ? C4232e.metrica(c4232e4, uri, j) : false) {
                                    z2 = true;
                                }
                            }
                        }
                    }
                } else {
                    i3++;
                }
            }
            i = i2;
            z2 = false;
            z3 |= z2;
            i2 = i + 1;
        }
        this.f5711e.mopub(this);
        return z3;
    }

    @Override // defpackage.InterfaceC14239e
    public final long yandex(long j) {
        C2220e[] c2220eArr = this.f5707e;
        if (c2220eArr.length > 0) {
            boolean m771native = c2220eArr[0].m771native(j, false);
            int i = 1;
            while (true) {
                C2220e[] c2220eArr2 = this.f5707e;
                if (i >= c2220eArr2.length) {
                    break;
                }
                c2220eArr2[i].m771native(j, m771native);
                i++;
            }
            if (m771native) {
                ((SparseArray) this.f5715e.f6570e).clear();
            }
        }
        return j;
    }
}
