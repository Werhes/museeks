package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۦؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4498e extends AbstractC5881e {

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public Function3 f9757e;

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public Function3 f9758e;

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public boolean f9759e;

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public InterfaceC3239e f9760e;

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public boolean f9761e;

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public EnumC17426e f9762e;

    @Override // defpackage.AbstractC5881e
    /* renamed from: eّؔٞ, reason: contains not printable characters */
    public final void mo1629e(C15208e c15208e) {
        if (!this.f27016e || AbstractC7890e.billing(this.f9758e, AbstractC6367e.vip)) {
            return;
        }
        AbstractC5336e.purchase(m3623e(), null, 4, new C8857e(this, c15208e, (InterfaceC5083e) null, 5), 1);
    }

    @Override // defpackage.AbstractC5881e
    /* renamed from: eؙؙٝ, reason: contains not printable characters */
    public final boolean mo1630e() {
        return this.f9761e;
    }

    @Override // defpackage.AbstractC5881e
    /* renamed from: eٍؙّ, reason: contains not printable characters */
    public final void mo1631e(long j) {
        if (!this.f27016e || AbstractC7890e.billing(this.f9757e, AbstractC6367e.ad)) {
            return;
        }
        AbstractC5336e.purchase(m3623e(), null, 4, new C2454e(this, j, (InterfaceC5083e) null), 1);
    }

    @Override // defpackage.AbstractC5881e
    /* renamed from: eٌۘۤ, reason: contains not printable characters */
    public final Object mo1632e(C13750e c13750e, C13750e c13750e2) {
        Object ad = this.f9760e.ad(EnumC6955e.f14254e, new C8857e(c13750e, this, (InterfaceC5083e) null, 4), c13750e2);
        return ad == EnumC2821e.f6782e ? ad : Unit.INSTANCE;
    }
}
