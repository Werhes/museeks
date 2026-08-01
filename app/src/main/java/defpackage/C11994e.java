package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۛۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11994e extends AbstractC13294e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C11994e f23973e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final transient C0917e f23974e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public transient C4947e f23975e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final transient int f23976e;

    /* JADX WARN: Type inference failed for: r1v0, types: [eؚؒۚ, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.license(3);
        f23973e = new C11994e(obj);
    }

    public C11994e(C0917e c0917e) {
        this.f23974e = c0917e;
        long j = 0;
        int i = 0;
        while (true) {
            int i2 = c0917e.metrica;
            if (i >= i2) {
                this.f23976e = AbstractC10509e.loadAd(j);
                return;
            } else {
                AbstractC2301e.mopub(i, i2);
                j += c0917e.vip[i];
                i++;
            }
        }
    }

    @Override // defpackage.AbstractC0281e
    public final boolean advert() {
        throw null;
    }

    @Override // defpackage.AbstractC13294e
    public final AbstractC12614e loadAd() {
        C4947e c4947e = this.f23975e;
        if (c4947e != null) {
            return c4947e;
        }
        C4947e c4947e2 = new C4947e(this, 1);
        this.f23975e = c4947e2;
        return c4947e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f23976e;
    }
}
