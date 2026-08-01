package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٓٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14156e extends AbstractC10727e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public float f27985e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C11105e f27986e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public C2815e f27987e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C0576e f27988e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C0576e f27990e = AbstractC14533e.startapp(new C2108e(0));

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C0576e f27989e = AbstractC14533e.startapp(Boolean.FALSE);

    public C14156e(C10319e c10319e) {
        C11105e c11105e = new C11105e(c10319e);
        c11105e.purchase = new C17073e(19, this);
        this.f27986e = c11105e;
        this.f27988e = new C0576e(Unit.INSTANCE, C10990e.f21771e);
        this.f27985e = 1.0f;
    }

    @Override // defpackage.AbstractC10727e
    public final void adcel(InterfaceC2235e interfaceC2235e) {
        C2815e c2815e = this.f27987e;
        C11105e c11105e = this.f27986e;
        if (c2815e == null) {
            c2815e = (C2815e) c11105e.billing.getValue();
        }
        if (((Boolean) this.f27989e.getValue()).booleanValue() && interfaceC2235e.getLayoutDirection() == EnumC7792e.f15793e) {
            long mo779e = interfaceC2235e.mo779e();
            C18478e mo782finally = interfaceC2235e.mo782finally();
            long m4560try = mo782finally.m4560try();
            mo782finally.m4557this().billing();
            try {
                ((C5389e) mo782finally.f36228e).firebase(-1.0f, 1.0f, mo779e);
                c11105e.appmetrica(interfaceC2235e, this.f27985e, c2815e);
            } finally {
                AbstractC0054e.m224this(mo782finally, m4560try);
            }
        } else {
            c11105e.appmetrica(interfaceC2235e, this.f27985e, c2815e);
        }
        this.f27988e.getValue();
        Unit unit = Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC10727e
    public final boolean appmetrica(C2815e c2815e) {
        this.f27987e = c2815e;
        return true;
    }

    @Override // defpackage.AbstractC10727e
    public final boolean license(float f) {
        this.f27985e = f;
        return true;
    }

    @Override // defpackage.AbstractC10727e
    public final long startapp() {
        return ((C2108e) this.f27990e.getValue()).ad;
    }
}
