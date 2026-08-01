package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leَۤٔ;", "Leِٝؓ;", "Leؚٙٛ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eَۤٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10635e extends AbstractC11865e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final float f20956e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final float f20957e;

    public C10635e(float f, float f2, C4526e c4526e) {
        this.f20957e = f;
        this.f20956e = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C10635e c10635e = obj instanceof C10635e ? (C10635e) obj : null;
        return c10635e != null && C15765e.vip(this.f20957e, c10635e.f20957e) && C15765e.vip(this.f20956e, c10635e.f20956e);
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f20956e) + (Float.floatToIntBits(this.f20957e) * 31)) * 31) + 1231;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffsetModifierElement(x=");
        AbstractC10257e.admob(this.f20957e, sb, ", y=");
        sb.append((Object) C15765e.metrica(this.f20956e));
        sb.append(", rtlAware=true)");
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؚٙٛ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f14804e = this.f20957e;
        abstractC13616e.f14805e = this.f20956e;
        abstractC13616e.f14803e = true;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C7246e c7246e = (C7246e) abstractC13616e;
        float f = c7246e.f14804e;
        float f2 = this.f20957e;
        boolean vip = C15765e.vip(f, f2);
        float f3 = this.f20956e;
        if (!vip || !C15765e.vip(c7246e.f14805e, f3) || !c7246e.f14803e) {
            AbstractC5851e.mopub(c7246e).m3716new(false);
        }
        c7246e.f14804e = f2;
        c7246e.f14805e = f3;
        c7246e.f14803e = true;
    }
}
