package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1460e {
    public final AbstractC5881e ad;
    public final C13572e adcel;
    public long advert;
    public C9218e appmetrica;
    public C0731e billing;
    public C15309e license;
    public C1578e metrica;
    public final C13572e mopub;
    public AbstractC17680e purchase;
    public C3318e startapp;
    public C14236e vip;
    public long yandex = 9205357640488583168L;

    public C1460e(AbstractC5881e abstractC5881e) {
        this.ad = abstractC5881e;
        boolean z = false;
        C13572e c13572e = new C13572e(7, z);
        c13572e.f26878e = new C12328e();
        this.adcel = c13572e;
        C13572e c13572e2 = new C13572e(15, z);
        c13572e2.f26878e = new C2805e();
        this.mopub = c13572e2;
        this.advert = 0L;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eُؚٕ, java.lang.Object] */
    public static void metrica(C1460e c1460e, C3189e c3189e, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        AbstractC5881e abstractC5881e = c1460e.ad;
        C15309e c15309e = c1460e.license;
        C15309e c15309e2 = c15309e;
        if (c15309e == null) {
            ?? obj = new Object();
            obj.vip = null;
            obj.metrica = Long.MAX_VALUE;
            obj.license = false;
            c1460e.license = obj;
            c15309e2 = obj;
        }
        c15309e2.vip = c3189e;
        c15309e2.metrica = j;
        C3318e c3318e = c1460e.startapp;
        if (c3318e == null) {
            c1460e.startapp = new C3318e(abstractC5881e.f12415e, 2);
        } else {
            c3318e.f7485e = abstractC5881e.f12415e;
            c3318e.f7486e = j2;
        }
        c15309e2.license = false;
        c1460e.purchase = c15309e2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, eٖٓۛ] */
    public final void ad() {
        C14236e c14236e = this.vip;
        C14236e c14236e2 = c14236e;
        if (c14236e == null) {
            ?? obj = new Object();
            obj.vip = 3;
            obj.metrica = false;
            this.vip = obj;
            c14236e2 = obj;
        }
        c14236e2.vip = 3;
        c14236e2.metrica = false;
        this.purchase = c14236e2;
    }

    public final void appmetrica(C3189e c3189e, C7180e c7180e, long j) {
        AbstractC5881e abstractC5881e = this.ad;
        long Signature = AbstractC5851e.adcel(abstractC5881e).Signature(0L);
        if (!C2152e.vip(this.yandex, 9205357640488583168L) && !C2152e.vip(Signature, this.yandex)) {
            this.advert = C2152e.startapp(this.advert, C2152e.yandex(Signature, this.yandex));
        }
        this.yandex = Signature;
        EnumC17426e enumC17426e = abstractC5881e.f12415e;
        C15256e c15256e = AbstractC6367e.ad;
        if (Math.abs(Float.intBitsToFloat((int) (enumC17426e == EnumC17426e.f34146e ? j & 4294967295L : j >> 32))) > 2.0f) {
            AbstractC7291e.ad(license(), c3189e, abstractC5881e.f12415e, c7180e, this.adcel, this.advert);
            C13572e c13572e = this.mopub;
            C2805e c2805e = (C2805e) c13572e.f26878e;
            int i = c2805e.vip;
            if (i == 3) {
                int i2 = c13572e.f26879e;
                c13572e.f26879e = i2 + 1;
                if (i2 < 0 || i2 >= i) {
                    AbstractC14783e.yandex("Index must be between 0 and size");
                    throw null;
                }
                long[] jArr = c2805e.ad;
                long j2 = jArr[i2];
                jArr[i2] = j;
            } else {
                c2805e.ad(j);
            }
            if (c13572e.f26879e == 3) {
                c13572e.f26879e = 0;
            }
            long[] jArr2 = c2805e.ad;
            int i3 = c2805e.vip;
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i4 = 0; i4 < i3; i4++) {
                f2 += Float.intBitsToFloat((int) (jArr2[i4] >> 32));
            }
            int i5 = c2805e.vip;
            float f3 = f2 / i5;
            long[] jArr3 = c2805e.ad;
            for (int i6 = 0; i6 < i5; i6++) {
                f += Float.intBitsToFloat((int) (jArr3[i6] & 4294967295L));
            }
            abstractC5881e.m1980e(new C0119e((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f / c2805e.vip) & 4294967295L), true));
        }
    }

    public final C0731e license() {
        C0731e c0731e = this.billing;
        if (c0731e != null) {
            return c0731e;
        }
        throw new IllegalArgumentException("Velocity Tracker not initialized.");
    }

    public final void purchase(C3189e c3189e, C3189e c3189e2, C7180e c7180e, long j) {
        if (this.billing == null) {
            this.billing = new C0731e(1);
        }
        this.advert = 0L;
        C0731e license = license();
        AbstractC5881e abstractC5881e = this.ad;
        AbstractC7291e.ad(license, c3189e, abstractC5881e.f12415e, c7180e, this.adcel, this.advert);
        long yandex = C2152e.yandex(AbstractC7291e.billing(c3189e2, abstractC5881e.f12415e, c7180e), j);
        if (((Boolean) abstractC5881e.f12412e.invoke(new C15991e(1))).booleanValue()) {
            this.yandex = AbstractC5851e.adcel(abstractC5881e).Signature(0L);
            abstractC5881e.m1980e(new C7325e(yandex));
        }
        C13572e c13572e = this.mopub;
        c13572e.f26879e = 0;
        ((C2805e) c13572e.f26878e).vip = 0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, eٍؔؔ] */
    public final void vip(C3189e c3189e, long j, C3318e c3318e) {
        C9218e c9218e = this.appmetrica;
        C9218e c9218e2 = c9218e;
        if (c9218e == null) {
            ?? obj = new Object();
            obj.vip = null;
            obj.metrica = Long.MAX_VALUE;
            this.appmetrica = obj;
            c9218e2 = obj;
        }
        c9218e2.vip = c3189e;
        c9218e2.metrica = j;
        c3318e.f7486e = 0L;
        this.purchase = c9218e2;
    }
}
