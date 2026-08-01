package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leؑۙ۠;", "Leِٝؓ;", "Leؓٙۥ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eؑۙ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C0536e extends AbstractC11865e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f2694e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C7765e f2695e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final boolean f2696e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C7102e f2697e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final boolean f2698e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final InterfaceC3542e f2699e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final InterfaceC12006e f2700e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C15274e f2701e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C11388e f2702e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final InterfaceC13435e f2703e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C4988e f2704e;

    public C0536e(C11388e c11388e, C7102e c7102e, C7765e c7765e, InterfaceC12006e interfaceC12006e, boolean z, C4988e c4988e, InterfaceC13435e interfaceC13435e, boolean z2, C15274e c15274e, boolean z3, InterfaceC3542e interfaceC3542e) {
        this.f2702e = c11388e;
        this.f2697e = c7102e;
        this.f2695e = c7765e;
        this.f2700e = interfaceC12006e;
        this.f2694e = z;
        this.f2704e = c4988e;
        this.f2703e = interfaceC13435e;
        this.f2698e = z2;
        this.f2701e = c15274e;
        this.f2696e = z3;
        this.f2699e = interfaceC3542e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0536e)) {
            return false;
        }
        C0536e c0536e = (C0536e) obj;
        return AbstractC7890e.billing(this.f2702e, c0536e.f2702e) && AbstractC7890e.billing(this.f2697e, c0536e.f2697e) && AbstractC7890e.billing(this.f2695e, c0536e.f2695e) && AbstractC7890e.billing(this.f2700e, c0536e.f2700e) && this.f2694e == c0536e.f2694e && this.f2704e.equals(c0536e.f2704e) && AbstractC7890e.billing(this.f2703e, c0536e.f2703e) && this.f2698e == c0536e.f2698e && AbstractC7890e.billing(this.f2701e, c0536e.f2701e) && this.f2696e == c0536e.f2696e && AbstractC7890e.billing(this.f2699e, c0536e.f2699e);
    }

    public final int hashCode() {
        int hashCode = (this.f2695e.hashCode() + ((this.f2697e.hashCode() + (this.f2702e.hashCode() * 31)) * 31)) * 31;
        InterfaceC12006e interfaceC12006e = this.f2700e;
        int hashCode2 = (this.f2704e.hashCode() + ((((((hashCode + (interfaceC12006e == null ? 0 : interfaceC12006e.hashCode())) * 31) + (this.f2694e ? 1231 : 1237)) * 31) + 1237) * 31)) * 31;
        InterfaceC13435e interfaceC13435e = this.f2703e;
        int hashCode3 = (((this.f2701e.hashCode() + ((((hashCode2 + (interfaceC13435e == null ? 0 : interfaceC13435e.hashCode())) * 31) + (this.f2698e ? 1231 : 1237)) * 31)) * 31) + (this.f2696e ? 1231 : 1237)) * 31;
        InterfaceC3542e interfaceC3542e = this.f2699e;
        return hashCode3 + (interfaceC3542e != null ? interfaceC3542e.hashCode() : 0);
    }

    public final String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.f2702e + ", textLayoutState=" + this.f2697e + ", textFieldSelectionState=" + this.f2695e + ", filter=" + this.f2700e + ", enabled=" + this.f2694e + ", readOnly=false, keyboardOptions=" + this.f2704e + ", keyboardActionHandler=" + this.f2703e + ", singleLine=" + this.f2698e + ", interactionSource=" + this.f2701e + ", isPassword=" + this.f2696e + ", stylusHandwritingTrigger=" + this.f2699e + ')';
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C1902e(this.f2702e, this.f2697e, this.f2695e, this.f2700e, this.f2694e, this.f2704e, this.f2703e, this.f2698e, this.f2701e, this.f2696e, this.f2699e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C15108e c15108e;
        C8419e c8419e;
        C1902e c1902e = (C1902e) abstractC13616e;
        C3427e c3427e = c1902e.f5069e;
        C15108e c15108e2 = c1902e.f5076e;
        boolean z = c1902e.f5063e;
        C11388e c11388e = c1902e.f5067e;
        C4988e c4988e = c1902e.f5073e;
        C7765e c7765e = c1902e.f5077e;
        C15274e c15274e = c1902e.f5072e;
        boolean z2 = c1902e.f5070e;
        InterfaceC3542e interfaceC3542e = c1902e.f5071e;
        C11388e c11388e2 = this.f2702e;
        c1902e.f5067e = c11388e2;
        c1902e.f5064e = this.f2697e;
        C7765e c7765e2 = this.f2695e;
        c1902e.f5077e = c7765e2;
        c1902e.f5084e = this.f2700e;
        boolean z3 = this.f2694e;
        c1902e.f5063e = z3;
        C4988e c4988e2 = this.f2704e;
        c1902e.f5073e = c4988e2;
        c1902e.f5079e = this.f2703e;
        c1902e.f5080e = this.f2698e;
        C15274e c15274e2 = this.f2701e;
        c1902e.f5072e = c15274e2;
        boolean z4 = this.f2696e;
        c1902e.f5070e = z4;
        InterfaceC3542e interfaceC3542e2 = this.f2699e;
        c1902e.f5071e = interfaceC3542e2;
        if (z3 != z || !AbstractC7890e.billing(c11388e2, c11388e) || !c4988e2.equals(c4988e) || !AbstractC7890e.billing(interfaceC3542e2, interfaceC3542e)) {
            if (z3 && (c1902e.m717e() || c1902e.f5083e != null)) {
                c1902e.m715e(false);
            } else if (!z3) {
                c1902e.m710e();
            }
        }
        if (z3 != z || z3 != z || c4988e2.vip() != c4988e.vip() || z4 != z2) {
            AbstractC15118e.appmetrica(c1902e);
        }
        if (!AbstractC7890e.billing(c7765e2, c7765e)) {
            c3427e.m1363e();
            if (c1902e.f27016e) {
                c7765e2.amazon = c1902e.f5082e;
                if (c1902e.m717e() && (c8419e = c1902e.f5078e) != null) {
                    c8419e.Signature(null);
                    c1902e.f5078e = AbstractC5336e.purchase(c1902e.m3623e(), null, 0, new C10516e(c7765e2, null, 1), 3);
                }
            }
            c7765e2.smaato = new C10593e(c1902e, 2);
        }
        if (AbstractC7890e.billing(c15274e2, c15274e)) {
            c15108e = c15108e2;
        } else {
            c3427e.m1363e();
            c15108e = c15108e2;
            if (c15108e.f27016e) {
                c15108e.m3920e(c15274e2);
            }
        }
        if (z3 != z) {
            if (!z3) {
                c1902e.m2042e(c15108e);
            } else {
                c1902e.m2050e(c15108e);
                c15108e.m3920e(c15274e2);
            }
        }
    }
}
