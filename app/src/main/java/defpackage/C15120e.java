package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۧٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15120e extends C12478e {
    public final boolean Signature;
    public final boolean admob;
    public final C12478e loadAd;
    public final long pro;
    public Function1 remoteconfig;
    public Function1 subscription;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C15120e(defpackage.C12478e r8, kotlin.jvm.functions.Function1 r9, kotlin.jvm.functions.Function1 r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            eًٗۢ r0 = defpackage.AbstractC12909e.ad
            if (r8 == 0) goto La
            kotlin.jvm.functions.Function1 r0 = r8.appmetrica()
            if (r0 != 0) goto Le
        La:
            eّٜٗ r0 = defpackage.AbstractC12909e.adcel
            kotlin.jvm.functions.Function1 r0 = r0.appmetrica
        Le:
            kotlin.jvm.functions.Function1 r5 = defpackage.AbstractC12909e.mopub(r9, r0, r11)
            if (r8 == 0) goto L1a
            kotlin.jvm.functions.Function1 r9 = r8.startapp()
            if (r9 != 0) goto L1e
        L1a:
            eّٜٗ r9 = defpackage.AbstractC12909e.adcel
            kotlin.jvm.functions.Function1 r9 = r9.purchase
        L1e:
            kotlin.jvm.functions.Function1 r6 = defpackage.AbstractC12909e.advert(r10, r9)
            r2 = 0
            eُۢۡ r4 = defpackage.C11353e.f22848e
            r1 = r7
            r1.<init>(r2, r4, r5, r6)
            r1.loadAd = r8
            r1.Signature = r11
            r1.admob = r12
            kotlin.jvm.functions.Function1 r8 = r1.appmetrica
            r1.subscription = r8
            kotlin.jvm.functions.Function1 r8 = r1.purchase
            r1.remoteconfig = r8
            long r8 = defpackage.AbstractC15390e.appmetrica()
            r1.pro = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15120e.<init>(eّٔۚ, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, boolean):void");
    }

    @Override // defpackage.C12478e, defpackage.AbstractC13717e
    public final void advert() {
        AbstractC15849e.appmetrica();
        throw null;
    }

    @Override // defpackage.C12478e, defpackage.AbstractC13717e
    public final void amazon(InterfaceC17335e interfaceC17335e) {
        firebase().amazon(interfaceC17335e);
    }

    @Override // defpackage.C12478e, defpackage.AbstractC13717e
    public final Function1 appmetrica() {
        return this.subscription;
    }

    @Override // defpackage.AbstractC13717e
    public final long billing() {
        return firebase().billing();
    }

    @Override // defpackage.C12478e
    public final C12478e crashlytics(Function1 function1, Function1 function12) {
        Function1 mopub = AbstractC12909e.mopub(function1, this.subscription, true);
        Function1 advert = AbstractC12909e.advert(function12, this.remoteconfig);
        return !this.Signature ? new C15120e(firebase().crashlytics(null, advert), mopub, advert, false, true) : firebase().crashlytics(mopub, advert);
    }

    public final C12478e firebase() {
        C12478e c12478e = this.loadAd;
        return c12478e == null ? AbstractC12909e.adcel : c12478e;
    }

    @Override // defpackage.C12478e
    public final C12618e inmobi() {
        return firebase().inmobi();
    }

    @Override // defpackage.C12478e
    /* renamed from: isPro */
    public final Function1 appmetrica() {
        return this.subscription;
    }

    @Override // defpackage.C12478e
    public final AbstractC11912e isVip() {
        return firebase().isVip();
    }

    @Override // defpackage.AbstractC13717e
    public final C11353e license() {
        return firebase().license();
    }

    @Override // defpackage.C12478e, defpackage.AbstractC13717e
    public final void metrica() {
        C12478e c12478e;
        this.metrica = true;
        if (!this.admob || (c12478e = this.loadAd) == null) {
            return;
        }
        c12478e.metrica();
    }

    @Override // defpackage.C12478e, defpackage.AbstractC13717e
    public final void mopub() {
        AbstractC15849e.appmetrica();
        throw null;
    }

    @Override // defpackage.C12478e, defpackage.AbstractC13717e
    public final void pro(int i) {
        firebase().pro(i);
    }

    @Override // defpackage.C12478e, defpackage.AbstractC13717e
    public final boolean purchase() {
        return firebase().purchase();
    }

    @Override // defpackage.AbstractC13717e
    public final void remoteconfig(long j) {
        AbstractC15849e.appmetrica();
        throw null;
    }

    @Override // defpackage.C12478e, defpackage.AbstractC13717e
    public final AbstractC13717e signatures(Function1 function1) {
        Function1 mopub = AbstractC12909e.mopub(function1, this.subscription, true);
        return !this.Signature ? AbstractC12909e.billing(firebase().signatures(null), mopub, true) : firebase().signatures(mopub);
    }

    @Override // defpackage.C12478e, defpackage.AbstractC13717e
    public final void smaato() {
        firebase().smaato();
    }

    @Override // defpackage.C12478e, defpackage.AbstractC13717e
    public final Function1 startapp() {
        return this.remoteconfig;
    }

    @Override // defpackage.C12478e
    public final void subs(C12618e c12618e) {
        AbstractC15849e.appmetrica();
        throw null;
    }

    @Override // defpackage.AbstractC13717e
    public final void subscription(C11353e c11353e) {
        AbstractC15849e.appmetrica();
        throw null;
    }

    @Override // defpackage.C12478e, defpackage.AbstractC13717e
    public final int yandex() {
        return firebase().yandex();
    }
}
