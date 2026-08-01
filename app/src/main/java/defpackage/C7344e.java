package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚّٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7344e extends AbstractC13616e implements InterfaceC17453e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public C8091e f15063e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public boolean f15064e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public EnumC17426e f15065e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public Function0 f15066e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public InterfaceC5495e f15067e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public C9585e f15068e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C8091e f15069e = new C8091e(this, 0);

    public C7344e(Function0 function0, InterfaceC5495e interfaceC5495e, EnumC17426e enumC17426e, boolean z) {
        this.f15066e = function0;
        this.f15067e = interfaceC5495e;
        this.f15065e = enumC17426e;
        this.f15064e = z;
        m2290e();
    }

    @Override // defpackage.InterfaceC17453e
    public final void adcel(InterfaceC15671e interfaceC15671e) {
        AbstractC14594e.Signature(interfaceC15671e);
        interfaceC15671e.appmetrica(AbstractC9058e.f18133break, this.f15069e);
        if (this.f15065e == EnumC17426e.f34146e) {
            C9585e c9585e = this.f15068e;
            if (c9585e == null) {
                c9585e = null;
            }
            C16591e c16591e = AbstractC9058e.isVip;
            InterfaceC8614e interfaceC8614e = AbstractC14594e.ad[13];
            interfaceC15671e.appmetrica(c16591e, c9585e);
        } else {
            C9585e c9585e2 = this.f15068e;
            if (c9585e2 == null) {
                c9585e2 = null;
            }
            C16591e c16591e2 = AbstractC9058e.tapsense;
            InterfaceC8614e interfaceC8614e2 = AbstractC14594e.ad[12];
            interfaceC15671e.appmetrica(c16591e2, c9585e2);
        }
        C8091e c8091e = this.f15063e;
        if (c8091e != null) {
            interfaceC15671e.appmetrica(AbstractC10789e.purchase, new C10591e(null, c8091e));
        }
        interfaceC15671e.appmetrica(AbstractC10789e.subs, new C10591e(null, new C10570e(1, new C13607e(this, 2))));
        C6517e purchase = this.f15067e.purchase();
        C16591e c16591e3 = AbstractC9058e.purchase;
        InterfaceC8614e interfaceC8614e3 = AbstractC14594e.ad[24];
        interfaceC15671e.appmetrica(c16591e3, purchase);
    }

    @Override // defpackage.InterfaceC17453e
    /* renamed from: break */
    public final /* synthetic */ boolean mo358break() {
        return false;
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

    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public final void m2290e() {
        this.f15068e = new C9585e(new C13607e(this, 0), new C13607e(this, 1));
        this.f15063e = this.f15064e ? new C8091e(this, 1) : null;
    }

    @Override // defpackage.InterfaceC17453e
    public final /* synthetic */ boolean smaato() {
        return true;
    }
}
