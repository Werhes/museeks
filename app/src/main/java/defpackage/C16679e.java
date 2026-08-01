package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۨٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16679e extends AbstractC6126e implements InterfaceC1683e, InterfaceC1403e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public C8419e f32722e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public AbstractC7185e f32723e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public C5780e f32724e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public Function1 f32726e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public Function1 f32728e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C6656e f32725e = AbstractC14533e.purchase(new C5671e(16, this));

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public C0763e f32727e = C0763e.appmetrica;

    /* JADX WARN: Multi-variable type inference failed */
    public C16679e(C5780e c5780e, Function1 function1, Function1 function12, Function1 function13) {
        this.f32724e = c5780e;
        this.f32723e = (AbstractC7185e) function1;
        this.f32726e = function12;
        this.f32728e = function13;
    }

    @Override // defpackage.InterfaceC1403e
    public final long advert(InterfaceC0043e interfaceC0043e) {
        return loadAd(interfaceC0043e).yandex();
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eّْٝ */
    public final void mo228e() {
        C5780e c5780e = this.f32724e;
        c5780e.vip = 2;
        c5780e.ad = null;
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: e٘ٔ٘ */
    public final void mo229e() {
        C5780e c5780e = this.f32724e;
        c5780e.vip = 3;
        c5780e.ad = this;
    }

    @Override // defpackage.InterfaceC1403e
    public final C0763e loadAd(InterfaceC0043e interfaceC0043e) {
        C0763e c0763e;
        if (this.f27016e && (c0763e = (C0763e) this.f32728e.invoke(interfaceC0043e)) != null) {
            this.f32727e = c0763e;
            return c0763e;
        }
        return this.f32727e;
    }

    @Override // defpackage.InterfaceC1403e
    /* renamed from: super */
    public final C17828e mo601super() {
        return (C17828e) this.f32725e.getValue();
    }
}
