package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِِٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16948e extends AbstractC13616e implements InterfaceC9629e, InterfaceC8501e, InterfaceC17453e, InterfaceC0479e {

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public C12729e f33189e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public Function1 f33191e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public Function1 f33192e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public InterfaceC9178e f33194e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public InterfaceC14388e f33196e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public C14137e f33198e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public C6656e f33199e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public InterfaceC15277e f33201e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public View f33202e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public float f33190e = Float.NaN;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public boolean f33188e = true;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public long f33200e = 9205357640488583168L;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public float f33203e = Float.NaN;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public float f33187e = Float.NaN;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public boolean f33197e = true;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public final C0576e f33195e = new C0576e(null, C10990e.f21771e);

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public long f33193e = 9205357640488583168L;

    public C16948e(Function1 function1, Function1 function12, InterfaceC15277e interfaceC15277e) {
        this.f33191e = function1;
        this.f33192e = function12;
        this.f33201e = interfaceC15277e;
    }

    @Override // defpackage.InterfaceC17453e
    public final void adcel(InterfaceC15671e interfaceC15671e) {
        interfaceC15671e.appmetrica(AbstractC4046e.ad, new C7974e(this, 1));
    }

    @Override // defpackage.InterfaceC17453e
    /* renamed from: break */
    public final /* synthetic */ boolean mo358break() {
        return false;
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: case */
    public final /* synthetic */ void mo292case() {
    }

    /* renamed from: eؒٚۨ, reason: contains not printable characters */
    public final void m4231e() {
        InterfaceC9178e interfaceC9178e = this.f33194e;
        if (interfaceC9178e != null) {
            ((C17760e) interfaceC9178e).vip();
        }
        View view = this.f33202e;
        if (view == null) {
            view = AbstractC13482e.crashlytics(this);
        }
        View view2 = view;
        this.f33202e = view2;
        InterfaceC14388e interfaceC14388e = this.f33196e;
        if (interfaceC14388e == null) {
            interfaceC14388e = AbstractC5851e.mopub(this).f27604e;
        }
        InterfaceC14388e interfaceC14388e2 = interfaceC14388e;
        this.f33196e = interfaceC14388e2;
        this.f33194e = this.f33201e.vip(view2, this.f33188e, this.f33200e, this.f33203e, this.f33187e, this.f33197e, interfaceC14388e2, this.f33190e);
        m4234e();
    }

    @Override // defpackage.InterfaceC17453e
    /* renamed from: eؒۖۗ */
    public final /* synthetic */ boolean mo359e() {
        return false;
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: eُؚٕ */
    public final void mo294e(C4017e c4017e) {
        c4017e.ad();
        C14137e c14137e = this.f33198e;
        if (c14137e != null) {
            c14137e.amazon(Unit.INSTANCE);
        }
    }

    /* renamed from: eّّۚ, reason: contains not printable characters */
    public final void m4232e() {
        InterfaceC14388e interfaceC14388e = this.f33196e;
        if (interfaceC14388e == null) {
            interfaceC14388e = AbstractC5851e.mopub(this).f27604e;
            this.f33196e = interfaceC14388e;
        }
        long j = ((C2152e) this.f33191e.invoke(interfaceC14388e)).ad;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & m4233e()) == 9205357640488583168L) {
            this.f33193e = 9205357640488583168L;
            InterfaceC9178e interfaceC9178e = this.f33194e;
            if (interfaceC9178e != null) {
                ((C17760e) interfaceC9178e).vip();
                return;
            }
            return;
        }
        this.f33193e = C2152e.startapp(m4233e(), j);
        if (this.f33194e == null) {
            m4231e();
        }
        InterfaceC9178e interfaceC9178e2 = this.f33194e;
        if (interfaceC9178e2 != null) {
            interfaceC9178e2.ad(this.f33193e, 9205357640488583168L, this.f33190e);
        }
        m4234e();
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eّْٝ */
    public final void mo228e() {
        InterfaceC9178e interfaceC9178e = this.f33194e;
        if (interfaceC9178e != null) {
            ((C17760e) interfaceC9178e).vip();
        }
        this.f33194e = null;
    }

    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public final long m4233e() {
        if (this.f33199e == null) {
            this.f33199e = AbstractC14533e.purchase(new C7974e(this, 2));
        }
        C6656e c6656e = this.f33199e;
        if (c6656e != null) {
            return ((C2152e) c6656e.getValue()).ad;
        }
        return 9205357640488583168L;
    }

    /* renamed from: eٖٔۧ, reason: contains not printable characters */
    public final void m4234e() {
        InterfaceC14388e interfaceC14388e;
        InterfaceC9178e interfaceC9178e = this.f33194e;
        if (interfaceC9178e == null || (interfaceC14388e = this.f33196e) == null) {
            return;
        }
        C17760e c17760e = (C17760e) interfaceC9178e;
        if (C12729e.ad(c17760e.metrica(), this.f33189e)) {
            return;
        }
        Function1 function1 = this.f33192e;
        if (function1 != null) {
            function1.invoke(new C16109e(interfaceC14388e.tapsense(AbstractC8116e.startapp(c17760e.metrica()))));
        }
        this.f33189e = new C12729e(c17760e.metrica());
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: e٘ٔ٘ */
    public final void mo229e() {
        mo343for();
        this.f33198e = AbstractC12501e.ad(0, 0, null, 7);
        AbstractC5336e.purchase(m3623e(), null, 4, new C16600e(this, null, 19), 1);
    }

    @Override // defpackage.InterfaceC0479e
    /* renamed from: for */
    public final void mo343for() {
        AbstractC16425e.purchase(this, new C7974e(this, 0));
    }

    @Override // defpackage.InterfaceC17453e
    public final /* synthetic */ boolean smaato() {
        return true;
    }

    @Override // defpackage.InterfaceC9629e
    /* renamed from: try */
    public final void mo721try(InterfaceC0043e interfaceC0043e) {
        this.f33195e.setValue(interfaceC0043e);
    }
}
