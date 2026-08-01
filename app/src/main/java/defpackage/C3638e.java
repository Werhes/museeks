package defpackage;

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۜؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3638e extends AbstractMap implements Serializable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public transient Object[] f8189e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public transient int[] f8190e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public transient AbstractCollection f8191e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient Object f8192e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public transient AbstractSet f8193e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public transient Object[] f8194e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public transient AbstractSet f8195e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8196e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public transient int f8197e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public transient int f8198e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final Object f8188e = new Object();

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final Object f8187e = new Object();

    public C3638e(int i) {
        this.f8196e = i;
        switch (i) {
            case 1:
                this.f8198e = Math.min(Math.max(12, 1), 1073741823);
                return;
            default:
                return;
        }
    }

    public static C3638e ad() {
        C3638e c3638e = new C3638e(0);
        c3638e.f8198e = AbstractC10509e.yandex(3, 1);
        return c3638e;
    }

    public static C3638e vip(int i) {
        C3638e c3638e = new C3638e(0);
        AbstractC2301e.yandex(i >= 0, "Expected size must be >= 0");
        c3638e.f8198e = AbstractC10509e.yandex(i, 1);
        return c3638e;
    }

    public Map Signature() {
        Object obj = this.f8192e;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public Object[] adcel() {
        Object[] objArr = this.f8194e;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public void admob(int i, int i2) {
        Object obj = this.f8192e;
        Objects.requireNonNull(obj);
        int[] smaato = smaato();
        Object[] amazon = amazon();
        Object[] loadAd = loadAd();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            amazon[i] = null;
            loadAd[i] = null;
            smaato[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj2 = amazon[i3];
        amazon[i] = obj2;
        loadAd[i] = loadAd[i3];
        amazon[i3] = null;
        loadAd[i3] = null;
        smaato[i] = smaato[i3];
        smaato[i3] = 0;
        int billing = AbstractC0890e.billing(obj2) & i2;
        int adcel = AbstractC14161e.adcel(billing, obj);
        if (adcel == size) {
            AbstractC14161e.advert(billing, i4, obj);
            return;
        }
        while (true) {
            int i5 = adcel - 1;
            int i6 = smaato[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                smaato[i5] = (i6 & (~i2)) | (i2 & i4);
                return;
            }
            adcel = i7;
        }
    }

    public int advert(int i, int i2, int i3, int i4) {
        Object metrica = AbstractC4520e.metrica(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            AbstractC4520e.smaato(i3 & i5, i4 + 1, metrica);
        }
        Object obj = this.f8192e;
        Objects.requireNonNull(obj);
        int[] startapp = startapp();
        for (int i6 = 0; i6 <= i; i6++) {
            int advert = AbstractC4520e.advert(i6, obj);
            while (advert != 0) {
                int i7 = advert - 1;
                int i8 = startapp[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int advert2 = AbstractC4520e.advert(i10, metrica);
                AbstractC4520e.smaato(i10, advert, metrica);
                startapp[i7] = AbstractC4520e.billing(i9, advert2, i5);
                advert = i8 & i;
            }
        }
        this.f8192e = metrica;
        this.f8198e = AbstractC4520e.billing(this.f8198e, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    public Object[] amazon() {
        Object[] objArr = this.f8194e;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public int appmetrica(Object obj) {
        if (billing()) {
            return -1;
        }
        int appmetrica = AbstractC3192e.appmetrica(obj);
        int license = license();
        Object obj2 = this.f8192e;
        Objects.requireNonNull(obj2);
        int advert = AbstractC4520e.advert(appmetrica & license, obj2);
        if (advert == 0) {
            return -1;
        }
        int i = ~license;
        int i2 = appmetrica & i;
        do {
            int i3 = advert - 1;
            int i4 = startapp()[i3];
            if ((i4 & i) == i2 && AbstractC13328e.metrica(obj, adcel()[i3])) {
                return i3;
            }
            advert = i4 & license;
        } while (advert != 0);
        return -1;
    }

    public boolean billing() {
        return this.f8192e == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        switch (this.f8196e) {
            case 0:
                if (billing()) {
                    return;
                }
                this.f8198e += 32;
                Map metrica = metrica();
                if (metrica != null) {
                    this.f8198e = AbstractC10509e.yandex(size(), 3);
                    metrica.clear();
                    this.f8192e = null;
                    this.f8197e = 0;
                    return;
                }
                Arrays.fill(adcel(), 0, this.f8197e, (Object) null);
                Arrays.fill(mopub(), 0, this.f8197e, (Object) null);
                Object obj = this.f8192e;
                Objects.requireNonNull(obj);
                if (obj instanceof byte[]) {
                    Arrays.fill((byte[]) obj, (byte) 0);
                } else if (obj instanceof short[]) {
                    Arrays.fill((short[]) obj, (short) 0);
                } else {
                    Arrays.fill((int[]) obj, 0);
                }
                Arrays.fill(startapp(), 0, this.f8197e, 0);
                this.f8197e = 0;
                return;
            default:
                if (subscription()) {
                    return;
                }
                this.f8198e += 32;
                Map Signature = Signature();
                if (Signature != null) {
                    this.f8198e = Math.min(Math.max(size(), 3), 1073741823);
                    Signature.clear();
                    this.f8192e = null;
                    this.f8197e = 0;
                    return;
                }
                Arrays.fill(amazon(), 0, this.f8197e, (Object) null);
                Arrays.fill(loadAd(), 0, this.f8197e, (Object) null);
                Object obj2 = this.f8192e;
                Objects.requireNonNull(obj2);
                if (obj2 instanceof byte[]) {
                    Arrays.fill((byte[]) obj2, (byte) 0);
                } else if (obj2 instanceof short[]) {
                    Arrays.fill((short[]) obj2, (short) 0);
                } else {
                    Arrays.fill((int[]) obj2, 0);
                }
                Arrays.fill(smaato(), 0, this.f8197e, 0);
                this.f8197e = 0;
                return;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.f8196e) {
            case 0:
                Map metrica = metrica();
                return metrica != null ? metrica.containsKey(obj) : appmetrica(obj) != -1;
            default:
                Map Signature = Signature();
                return Signature != null ? Signature.containsKey(obj) : pro(obj) != -1;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.f8196e) {
            case 0:
                Map metrica = metrica();
                if (metrica != null) {
                    return metrica.containsValue(obj);
                }
                for (int i = 0; i < this.f8197e; i++) {
                    if (AbstractC13328e.metrica(obj, mopub()[i])) {
                        return true;
                    }
                }
                return false;
            default:
                Map Signature = Signature();
                if (Signature != null) {
                    return Signature.containsValue(obj);
                }
                for (int i2 = 0; i2 < this.f8197e; i2++) {
                    if (AbstractC6437e.license(obj, loadAd()[i2])) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.f8196e) {
            case 0:
                C9618e c9618e = (C9618e) this.f8195e;
                if (c9618e != null) {
                    return c9618e;
                }
                C9618e c9618e2 = new C9618e(this, 0);
                this.f8195e = c9618e2;
                return c9618e2;
            default:
                C0276e c0276e = (C0276e) this.f8195e;
                if (c0276e != null) {
                    return c0276e;
                }
                C0276e c0276e2 = new C0276e(this, 0);
                this.f8195e = c0276e2;
                return c0276e2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        switch (this.f8196e) {
            case 0:
                Map metrica = metrica();
                if (metrica != null) {
                    return metrica.get(obj);
                }
                int appmetrica = appmetrica(obj);
                if (appmetrica == -1) {
                    return null;
                }
                return mopub()[appmetrica];
            default:
                Map Signature = Signature();
                if (Signature != null) {
                    return Signature.get(obj);
                }
                int pro = pro(obj);
                if (pro == -1) {
                    return null;
                }
                return loadAd()[pro];
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        switch (this.f8196e) {
            case 0:
                return size() == 0;
            default:
                return size() == 0;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        switch (this.f8196e) {
            case 0:
                C9618e c9618e = (C9618e) this.f8193e;
                if (c9618e != null) {
                    return c9618e;
                }
                C9618e c9618e2 = new C9618e(this, 1);
                this.f8193e = c9618e2;
                return c9618e2;
            default:
                C0276e c0276e = (C0276e) this.f8193e;
                if (c0276e != null) {
                    return c0276e;
                }
                C0276e c0276e2 = new C0276e(this, 1);
                this.f8193e = c0276e2;
                return c0276e2;
        }
    }

    public int license() {
        return (1 << (this.f8198e & 31)) - 1;
    }

    public Object[] loadAd() {
        Object[] objArr = this.f8189e;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public Map metrica() {
        Object obj = this.f8192e;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public Object[] mopub() {
        Object[] objArr = this.f8189e;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public int pro(Object obj) {
        if (subscription()) {
            return -1;
        }
        int billing = AbstractC0890e.billing(obj);
        int remoteconfig = remoteconfig();
        Object obj2 = this.f8192e;
        Objects.requireNonNull(obj2);
        int adcel = AbstractC14161e.adcel(billing & remoteconfig, obj2);
        if (adcel != 0) {
            int i = ~remoteconfig;
            int i2 = billing & i;
            do {
                int i3 = adcel - 1;
                int i4 = smaato()[i3];
                if ((i4 & i) == i2 && AbstractC6437e.license(obj, amazon()[i3])) {
                    return i3;
                }
                adcel = i4 & remoteconfig;
            } while (adcel != 0);
        }
        return -1;
    }

    public void purchase(int i, int i2) {
        Object obj = this.f8192e;
        Objects.requireNonNull(obj);
        int[] startapp = startapp();
        Object[] adcel = adcel();
        Object[] mopub = mopub();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            adcel[i] = null;
            mopub[i] = null;
            startapp[i] = 0;
            return;
        }
        Object obj2 = adcel[i3];
        adcel[i] = obj2;
        mopub[i] = mopub[i3];
        adcel[i3] = null;
        mopub[i3] = null;
        startapp[i] = startapp[i3];
        startapp[i3] = 0;
        int appmetrica = AbstractC3192e.appmetrica(obj2) & i2;
        int advert = AbstractC4520e.advert(appmetrica, obj);
        if (advert == size) {
            AbstractC4520e.smaato(appmetrica, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = advert - 1;
            int i5 = startapp[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                startapp[i4] = AbstractC4520e.billing(i5, i + 1, i2);
                return;
            }
            advert = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0274  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x0287 -> B:98:0x026f). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object put(java.lang.Object r24, java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3638e.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public int remoteconfig() {
        return (1 << (this.f8198e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        switch (this.f8196e) {
            case 0:
                Map metrica = metrica();
                if (metrica != null) {
                    return metrica.remove(obj);
                }
                Object yandex = yandex(obj);
                if (yandex == f8188e) {
                    return null;
                }
                return yandex;
            default:
                Map Signature = Signature();
                if (Signature != null) {
                    return Signature.remove(obj);
                }
                Object tapsense = tapsense(obj);
                if (tapsense == f8187e) {
                    return null;
                }
                return tapsense;
        }
    }

    public int signatures(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object mopub = AbstractC14161e.mopub(i2);
        if (i4 != 0) {
            AbstractC14161e.advert(i3 & i5, i4 + 1, mopub);
        }
        Object obj = this.f8192e;
        Objects.requireNonNull(obj);
        int[] smaato = smaato();
        for (int i6 = 0; i6 <= i; i6++) {
            int adcel = AbstractC14161e.adcel(i6, obj);
            while (adcel != 0) {
                int i7 = adcel - 1;
                int i8 = smaato[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int adcel2 = AbstractC14161e.adcel(i10, mopub);
                AbstractC14161e.advert(i10, adcel, mopub);
                smaato[i7] = ((~i5) & i9) | (adcel2 & i5);
                adcel = i8 & i;
            }
        }
        this.f8192e = mopub;
        this.f8198e = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.f8198e & (-32));
        return i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.f8196e) {
            case 0:
                Map metrica = metrica();
                return metrica != null ? metrica.size() : this.f8197e;
            default:
                Map Signature = Signature();
                return Signature != null ? Signature.size() : this.f8197e;
        }
    }

    public int[] smaato() {
        int[] iArr = this.f8190e;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public int[] startapp() {
        int[] iArr = this.f8190e;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public boolean subscription() {
        return this.f8192e == null;
    }

    public Object tapsense(Object obj) {
        if (!subscription()) {
            int remoteconfig = remoteconfig();
            Object obj2 = this.f8192e;
            Objects.requireNonNull(obj2);
            int startapp = AbstractC14161e.startapp(obj, null, remoteconfig, obj2, smaato(), amazon(), null);
            if (startapp != -1) {
                Object obj3 = loadAd()[startapp];
                admob(startapp, remoteconfig);
                this.f8197e--;
                this.f8198e += 32;
                return obj3;
            }
        }
        return f8187e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        switch (this.f8196e) {
            case 0:
                C17403e c17403e = (C17403e) this.f8191e;
                if (c17403e != null) {
                    return c17403e;
                }
                C17403e c17403e2 = new C17403e(2, this);
                this.f8191e = c17403e2;
                return c17403e2;
            default:
                C17403e c17403e3 = (C17403e) this.f8191e;
                if (c17403e3 != null) {
                    return c17403e3;
                }
                C17403e c17403e4 = new C17403e(4, this);
                this.f8191e = c17403e4;
                return c17403e4;
        }
    }

    public Object yandex(Object obj) {
        if (!billing()) {
            int license = license();
            Object obj2 = this.f8192e;
            Objects.requireNonNull(obj2);
            int startapp = AbstractC4520e.startapp(obj, null, license, obj2, startapp(), adcel(), null);
            if (startapp != -1) {
                Object obj3 = mopub()[startapp];
                purchase(startapp, license);
                this.f8197e--;
                this.f8198e += 32;
                return obj3;
            }
        }
        return f8188e;
    }
}
