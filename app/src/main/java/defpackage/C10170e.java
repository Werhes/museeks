package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10170e extends AbstractC6073e {
    public C9500e Signature;
    public boolean admob;
    public final boolean advert;
    public final C6158e amazon;
    public C3096e loadAd;
    public boolean remoteconfig;
    public final C11501e smaato;
    public boolean subscription;

    public C10170e(AbstractC3317e abstractC3317e, boolean z) {
        super(abstractC3317e);
        this.advert = z && abstractC3317e.startapp();
        this.smaato = new C11501e();
        this.amazon = new C6158e();
        AbstractC6690e billing = abstractC3317e.billing();
        if (billing == null) {
            this.loadAd = new C3096e(new C4826e(abstractC3317e.yandex()), C11501e.admob, C3096e.yandex);
        } else {
            this.loadAd = new C3096e(billing, null, null);
            this.remoteconfig = true;
        }
    }

    @Override // defpackage.AbstractC1029e, defpackage.AbstractC3317e
    public final void Signature() {
        this.subscription = false;
        this.admob = false;
        super.Signature();
    }

    @Override // defpackage.AbstractC3317e
    public final boolean ad(C1962e c1962e) {
        return this.mopub.ad(c1962e);
    }

    @Override // defpackage.AbstractC3317e
    public final void amazon(InterfaceC14239e interfaceC14239e) {
        C9500e c9500e = (C9500e) interfaceC14239e;
        if (c9500e.f18844e != null) {
            AbstractC3317e abstractC3317e = c9500e.f18848e;
            abstractC3317e.getClass();
            abstractC3317e.amazon(c9500e.f18844e);
        }
        if (interfaceC14239e == this.Signature) {
            this.Signature = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00cc  */
    @Override // defpackage.AbstractC6073e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void applovin(defpackage.AbstractC6690e r12) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10170e.applovin(eؙ۠ؐ):void");
    }

    public final boolean crashlytics(long j) {
        C9500e c9500e = this.Signature;
        int vip = this.loadAd.vip(c9500e.f18849e.ad);
        if (vip == -1) {
            return false;
        }
        C3096e c3096e = this.loadAd;
        C6158e c6158e = this.amazon;
        c3096e.purchase(vip, c6158e, false);
        long j2 = c6158e.license;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        c9500e.f18847e = j;
        return true;
    }

    @Override // defpackage.AbstractC6073e
    public final C18208e isPro(C18208e c18208e) {
        Object obj = c18208e.ad;
        Object obj2 = this.loadAd.billing;
        if (obj2 != null && obj2.equals(obj)) {
            obj = C3096e.yandex;
        }
        return c18208e.ad(obj);
    }

    @Override // defpackage.AbstractC6073e
    public final void premium() {
        if (this.advert) {
            return;
        }
        this.admob = true;
        ads();
    }

    @Override // defpackage.AbstractC6073e, defpackage.AbstractC3317e
    public final void remoteconfig(C1962e c1962e) {
        if (this.remoteconfig) {
            C3096e c3096e = this.loadAd;
            AbstractC6690e abstractC6690e = c3096e.appmetrica;
            this.loadAd = new C3096e(abstractC6690e instanceof C9389e ? new C9389e(((C9389e) abstractC6690e).appmetrica, c1962e) : new C9389e(abstractC6690e, c1962e), c3096e.purchase, c3096e.billing);
        } else {
            this.loadAd = new C3096e(new C4826e(c1962e), C11501e.admob, C3096e.yandex);
        }
        this.mopub.remoteconfig(c1962e);
    }

    @Override // defpackage.AbstractC3317e
    /* renamed from: subs, reason: merged with bridge method [inline-methods] */
    public final C9500e vip(C18208e c18208e, InterfaceC16970e interfaceC16970e, long j) {
        C9500e c9500e = new C9500e(c18208e, interfaceC16970e, j);
        AbstractC2301e.subscription(c9500e.f18848e == null);
        c9500e.f18848e = this.mopub;
        if (!this.subscription) {
            this.Signature = c9500e;
            if (!this.admob) {
                this.admob = true;
                ads();
            }
            return c9500e;
        }
        Object obj = c18208e.ad;
        if (this.loadAd.billing != null && obj.equals(C3096e.yandex)) {
            obj = this.loadAd.billing;
        }
        c9500e.vip(c18208e.ad(obj));
        return c9500e;
    }
}
