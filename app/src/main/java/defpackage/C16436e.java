package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leٖۗ٘;", "Leِٝؓ;", "Leؑٞؔ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eٖۗ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C16436e extends AbstractC11865e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC16154e f32269e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C18466e f32270e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final float f32271e;

    public C16436e(float f, C18466e c18466e, InterfaceC16154e interfaceC16154e) {
        this.f32271e = f;
        this.f32270e = c18466e;
        this.f32269e = interfaceC16154e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16436e)) {
            return false;
        }
        C16436e c16436e = (C16436e) obj;
        return C15765e.vip(this.f32271e, c16436e.f32271e) && this.f32270e.equals(c16436e.f32270e) && AbstractC7890e.billing(this.f32269e, c16436e.f32269e);
    }

    public final int hashCode() {
        return this.f32269e.hashCode() + ((this.f32270e.hashCode() + (Float.floatToIntBits(this.f32271e) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BorderModifierNodeElement(width=");
        AbstractC10257e.admob(this.f32271e, sb, ", brush=");
        sb.append(this.f32270e);
        sb.append(", shape=");
        sb.append(this.f32269e);
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C0447e(this.f32271e, this.f32270e, this.f32269e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C0447e c0447e = (C0447e) abstractC13616e;
        float f = c0447e.f2494e;
        C17166e c17166e = c0447e.f2493e;
        float f2 = this.f32271e;
        if (!C15765e.vip(f, f2)) {
            c0447e.f2494e = f2;
            c17166e.m4273e();
        }
        C18466e c18466e = c0447e.f2496e;
        C18466e c18466e2 = this.f32270e;
        if (!AbstractC7890e.billing(c18466e, c18466e2)) {
            c0447e.f2496e = c18466e2;
            c17166e.m4273e();
        }
        InterfaceC16154e interfaceC16154e = c0447e.f2497e;
        InterfaceC16154e interfaceC16154e2 = this.f32269e;
        if (AbstractC7890e.billing(interfaceC16154e, interfaceC16154e2)) {
            return;
        }
        c0447e.f2497e = interfaceC16154e2;
        c17166e.m4273e();
        AbstractC15118e.appmetrica(c0447e);
    }
}
