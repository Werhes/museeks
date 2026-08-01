package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leُؙْ;", "Leِٝؓ;", "Leؒٔۙ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eُؙْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C10969e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C6054e f21728e;

    public C10969e(C6054e c6054e) {
        this.f21728e = c6054e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10969e)) {
            return false;
        }
        C10969e c10969e = (C10969e) obj;
        C14298e c14298e = AbstractC2564e.vip;
        return c14298e.equals(c14298e) && AbstractC7890e.billing(this.f21728e, c10969e.f21728e);
    }

    public final int hashCode() {
        int i = ((1022 * 31) + 1237) * 31;
        C6054e c6054e = this.f21728e;
        return i + (c6054e == null ? 0 : c6054e.hashCode());
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + AbstractC2564e.vip + ", overrideDescendants=false, touchBoundsExpansion=" + this.f21728e + ')';
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new AbstractC12811e(AbstractC2564e.vip, this.f21728e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C1063e c1063e = (C1063e) abstractC13616e;
        C14298e c14298e = AbstractC2564e.vip;
        if (!AbstractC7890e.billing(c1063e.f25629e, c14298e)) {
            c1063e.f25629e = c14298e;
            if (c1063e.f25627e) {
                c1063e.m3404e();
            }
        }
        c1063e.f25628e = this.f21728e;
    }
}
