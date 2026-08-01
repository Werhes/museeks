package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٜؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10381e extends AbstractC11130e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Function2 f20513e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public boolean f20514e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final InterfaceC18435e f20515e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C8419e f20516e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C14137e f20517e;

    public C10381e(InterfaceC18435e interfaceC18435e, C17130e c17130e) {
        super(c17130e);
        this.f20515e = interfaceC18435e;
        this.f20513e = new C14641e(2, 3, null);
    }

    @Override // defpackage.AbstractC11130e
    /* renamed from: eۣؑۡ, reason: contains not printable characters */
    public final void mo2808e() {
        C14137e c14137e = this.f20517e;
        if (c14137e != null) {
            c14137e.smaato(new CancellationException("onBack cancelled"), true);
        }
        C8419e c8419e = this.f20516e;
        if (c8419e != null) {
            c8419e.Signature(null);
        }
        this.f20517e = null;
        this.f20516e = null;
        this.f20514e = false;
    }

    @Override // defpackage.AbstractC11130e
    /* renamed from: eٌۡٔ */
    public final void mo2004e() {
        if (this.f20517e != null && !this.f20514e) {
            mo2808e();
        }
        InterfaceC5083e interfaceC5083e = null;
        if (this.f20517e == null) {
            this.f20514e = false;
            this.f20517e = AbstractC12501e.ad(-2, 1, null, 4);
            this.f20516e = AbstractC5336e.purchase(this.f20515e, null, 0, new C1695e(this, interfaceC5083e, 29), 3);
        }
        C14137e c14137e = this.f20517e;
        if (c14137e != null) {
            c14137e.startapp(null);
        }
        this.f20514e = false;
    }

    @Override // defpackage.AbstractC11130e
    /* renamed from: eّ۟ٝ, reason: contains not printable characters */
    public final void mo2809e(C0419e c0419e) {
        C14137e c14137e = this.f20517e;
        if (c14137e != null) {
            c14137e.amazon(c0419e);
        }
    }

    @Override // defpackage.AbstractC11130e
    /* renamed from: eْٗۚ, reason: contains not printable characters */
    public final void mo2810e() {
        mo2808e();
        if (super.m3037e()) {
            this.f20514e = true;
            this.f20517e = AbstractC12501e.ad(-2, 1, null, 4);
            this.f20516e = AbstractC5336e.purchase(this.f20515e, null, 0, new C1695e(this, null, 29), 3);
        }
    }

    /* renamed from: eِٜ٘, reason: contains not printable characters */
    public final void m2811e(boolean z) {
        C8419e c8419e;
        if (!z && super.m3037e() && (c8419e = this.f20516e) != null && !c8419e.purchase()) {
            mo2808e();
        }
        ((C11109e) this.f22047e).appmetrica(z);
        ((C5601e) this.f22046e).purchase(z);
    }
}
