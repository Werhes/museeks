package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙِۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6350e extends AbstractC7391e implements Comparable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f13193e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final int f13194e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final int f13195e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final int f13196e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final boolean f13197e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final boolean f13198e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final int f13199e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final int f13200e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f13201e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f13202e;

    public C6350e(int i, C16437e c16437e, int i2, C16672e c16672e, int i3, String str, String str2) {
        super(i, c16437e, i2);
        int i4;
        int i5 = 0;
        this.f13202e = AbstractC0054e.inmobi(i3, false);
        int i6 = this.f15149e.appmetrica;
        int i7 = c16672e.subs;
        AbstractC17475e abstractC17475e = c16672e.isPro;
        int i8 = i6 & (~i7);
        this.f13201e = (i8 & 1) != 0;
        this.f13198e = (i8 & 2) != 0;
        AbstractC17475e ads = str2 != null ? AbstractC17475e.ads(str2) : abstractC17475e.isEmpty() ? AbstractC17475e.ads(BuildConfig.FLAVOR) : abstractC17475e;
        int i9 = 0;
        while (true) {
            if (i9 >= ads.size()) {
                i4 = 0;
                i9 = Integer.MAX_VALUE;
                break;
            } else {
                i4 = C11010e.m2975e(this.f15149e, (String) ads.get(i9), c16672e.crashlytics);
                if (i4 > 0) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        this.f13200e = i9;
        this.f13196e = i4;
        int i10 = str2 != null ? 1088 : c16672e.ads;
        int i11 = this.f15149e.purchase;
        AbstractC15023e abstractC15023e = C11010e.f21801e;
        int bitCount = (i11 == 0 || i11 != i10) ? Integer.bitCount(i10 & i11) : Integer.MAX_VALUE;
        this.f13199e = bitCount;
        C16975e c16975e = this.f15149e;
        this.f13197e = (1088 & c16975e.purchase) != 0;
        int m2977e = C11010e.m2977e(c16975e, c16672e.applovin);
        this.f13195e = m2977e;
        int m2975e = C11010e.m2975e(this.f15149e, str, C11010e.m2973e(str) == null);
        this.f13194e = m2975e;
        boolean z = i4 > 0 || (abstractC17475e.isEmpty() && bitCount > 0) || ((abstractC17475e.isEmpty() && m2977e != Integer.MAX_VALUE) || this.f13201e || ((this.f13198e && m2975e > 0) || c16672e.inmobi));
        if (AbstractC0054e.inmobi(i3, c16672e.f32713e) && z) {
            i5 = 1;
        }
        this.f13193e = i5;
    }

    @Override // defpackage.AbstractC7391e
    public final int ad() {
        return this.f13193e;
    }

    @Override // java.lang.Comparable
    /* renamed from: metrica, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C6350e c6350e) {
        AbstractC7118e metrica = AbstractC7118e.ad.metrica(this.f13202e, c6350e.f13202e);
        Integer valueOf = Integer.valueOf(this.f13200e);
        Integer valueOf2 = Integer.valueOf(c6350e.f13200e);
        C5949e c5949e = C5949e.f12529e;
        C5949e c5949e2 = C5949e.f12528e;
        AbstractC7118e vip = metrica.vip(valueOf, valueOf2, c5949e2);
        int i = c6350e.f13196e;
        int i2 = this.f13196e;
        AbstractC7118e ad = vip.ad(i2, i);
        int i3 = c6350e.f13199e;
        int i4 = this.f13199e;
        AbstractC7118e metrica2 = ad.ad(i4, i3).vip(Integer.valueOf(this.f13195e), Integer.valueOf(c6350e.f13195e), c5949e2).metrica(this.f13201e, c6350e.f13201e);
        Boolean valueOf3 = Boolean.valueOf(this.f13198e);
        Boolean valueOf4 = Boolean.valueOf(c6350e.f13198e);
        if (i2 != 0) {
            c5949e = c5949e2;
        }
        AbstractC7118e ad2 = metrica2.vip(valueOf3, valueOf4, c5949e).ad(this.f13194e, c6350e.f13194e);
        if (i4 == 0) {
            ad2 = ad2.license(this.f13197e, c6350e.f13197e);
        }
        return ad2.appmetrica();
    }

    @Override // defpackage.AbstractC7391e
    public final /* bridge */ /* synthetic */ boolean vip(AbstractC7391e abstractC7391e) {
        return false;
    }
}
