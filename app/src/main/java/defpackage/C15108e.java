package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۦۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15108e extends AbstractC6126e implements InterfaceC17453e, InterfaceC9629e, InterfaceC1683e, InterfaceC0479e, InterfaceC6459e {

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public static final C7936e f29885e = new C7936e(0);

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public InterfaceC0043e f29886e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final Function1 f29887e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public C15274e f29888e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C11795e f29889e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public C16906e f29890e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public C8258e f29891e;

    public C15108e(C15274e c15274e, int i, Function1 function1) {
        this.f29888e = c15274e;
        this.f29887e = function1;
        C11795e c11795e = new C11795e(i, 10, new C14874e(2, this, C15108e.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0, 4));
        m2050e(c11795e);
        this.f29889e = c11795e;
    }

    public /* synthetic */ C15108e(C15274e c15274e, C13031e c13031e, int i) {
        this(c15274e, 1, (i & 4) != 0 ? null : c13031e);
    }

    @Override // defpackage.InterfaceC17453e
    public final void adcel(InterfaceC15671e interfaceC15671e) {
        boolean vip = this.f29889e.m3239e().vip();
        InterfaceC8614e[] interfaceC8614eArr = AbstractC14594e.ad;
        C16591e c16591e = AbstractC9058e.advert;
        InterfaceC8614e interfaceC8614e = AbstractC14594e.ad[4];
        interfaceC15671e.appmetrica(c16591e, Boolean.valueOf(vip));
        interfaceC15671e.appmetrica(AbstractC10789e.isVip, new C10591e(null, new C15101e(0, this, C15108e.class, "requestFocus", "requestFocus()Z", 0, 0, 7)));
    }

    @Override // defpackage.InterfaceC6459e
    public final Object admob() {
        return f29885e;
    }

    @Override // defpackage.InterfaceC17453e
    /* renamed from: break */
    public final /* synthetic */ boolean mo358break() {
        return false;
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eَؑۨ */
    public final void mo338e() {
        C8258e c8258e = this.f29891e;
        if (c8258e != null) {
            c8258e.vip();
        }
        this.f29891e = null;
    }

    @Override // defpackage.InterfaceC17453e
    /* renamed from: eؒۖۗ */
    public final /* synthetic */ boolean mo359e() {
        return false;
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eؚؚؓ */
    public final boolean mo293e() {
        return false;
    }

    /* renamed from: eؚٜ۠, reason: contains not printable characters */
    public final void m3920e(C15274e c15274e) {
        C16906e c16906e;
        if (AbstractC7890e.billing(this.f29888e, c15274e)) {
            return;
        }
        C15274e c15274e2 = this.f29888e;
        if (c15274e2 != null && (c16906e = this.f29890e) != null) {
            c15274e2.vip(new C2574e(c16906e));
        }
        this.f29890e = null;
        this.f29888e = c15274e;
    }

    /* renamed from: eٖٔۧ, reason: contains not printable characters */
    public final void m3921e(C15274e c15274e, InterfaceC13352e interfaceC13352e) {
        if (!this.f27016e) {
            c15274e.vip(interfaceC13352e);
            return;
        }
        InterfaceC10500e interfaceC10500e = (InterfaceC10500e) ((C14826e) m3623e()).f29359e.mo397public(C4524e.f9798e);
        AbstractC5336e.purchase(m3623e(), null, 0, new C8857e(c15274e, interfaceC13352e, interfaceC10500e != null ? interfaceC10500e.mo692else(new C9041e(c15274e, interfaceC13352e, 15)) : null, (InterfaceC5083e) null, 15), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eّؖٝ, java.lang.Object] */
    @Override // defpackage.InterfaceC0479e
    /* renamed from: for */
    public final void mo343for() {
        ?? obj = new Object();
        AbstractC16425e.purchase(this, new C5625e((Object) obj, this, 15));
        C8258e c8258e = (C8258e) obj.f9318e;
        if (this.f29889e.m3239e().vip()) {
            C8258e c8258e2 = this.f29891e;
            if (c8258e2 != null) {
                c8258e2.vip();
            }
            if (c8258e != null) {
                c8258e.ad();
            } else {
                c8258e = null;
            }
            this.f29891e = c8258e;
        }
    }

    @Override // defpackage.InterfaceC17453e
    public final /* synthetic */ boolean smaato() {
        return true;
    }

    @Override // defpackage.InterfaceC9629e
    /* renamed from: try */
    public final void mo721try(InterfaceC0043e interfaceC0043e) {
        this.f29886e = interfaceC0043e;
        if (this.f29889e.m3239e().vip()) {
            boolean billing = interfaceC0043e.billing();
            C0136e c0136e = AbstractC4778e.f10207e;
            if (!billing) {
                if (this.f27016e) {
                    AbstractC14114e.license(this, c0136e);
                }
            } else {
                InterfaceC0043e interfaceC0043e2 = this.f29886e;
                if (interfaceC0043e2 != null && interfaceC0043e2.billing() && this.f27016e) {
                    AbstractC14114e.license(this, c0136e);
                }
            }
        }
    }
}
