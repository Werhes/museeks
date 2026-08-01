package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٗٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17166e extends AbstractC13616e implements InterfaceC0479e, InterfaceC2961e, InterfaceC8501e {

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public Function1 f33657e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final C8953e f33658e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public boolean f33659e;

    public C17166e(C8953e c8953e, Function1 function1) {
        this.f33658e = c8953e;
        this.f33657e = function1;
        c8953e.f17969e = this;
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: case */
    public final void mo292case() {
        m4273e();
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eَؑۨ */
    public final void mo338e() {
        m4273e();
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: eُؚٕ */
    public final void mo294e(C4017e c4017e) {
        boolean z = this.f33659e;
        C8953e c8953e = this.f33658e;
        if (!z) {
            c8953e.f17968e = null;
            AbstractC16425e.purchase(this, new C14194e(this, c8953e, 3));
            if (c8953e.f17968e == null) {
                throw AbstractC8703e.Signature("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f33659e = true;
        }
        ((Function1) c8953e.f17968e.f19315e).invoke(c4017e);
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eُۘٙ */
    public final void mo713e() {
        m4273e();
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eّْٝ */
    public final void mo228e() {
    }

    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public final void m4273e() {
        this.f33659e = false;
        this.f33658e.f17968e = null;
        AbstractC12640e.advert(this);
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eؘٖؗ */
    public final void mo1339e() {
        m4273e();
    }

    @Override // defpackage.InterfaceC0479e
    /* renamed from: for */
    public final void mo343for() {
        m4273e();
    }

    @Override // defpackage.InterfaceC2961e
    public final EnumC7792e getLayoutDirection() {
        return AbstractC5851e.mopub(this).f27610e;
    }

    @Override // defpackage.InterfaceC2961e
    public final InterfaceC14388e vip() {
        return AbstractC5851e.mopub(this).f27604e;
    }

    @Override // defpackage.InterfaceC2961e
    public final long yandex() {
        return AbstractC8116e.startapp(AbstractC5851e.yandex(this, 4).f6803e);
    }
}
