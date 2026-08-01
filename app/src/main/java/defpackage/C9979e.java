package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leًَؑ;", "Leِٝؓ;", "Leّۛۘ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eًَؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C9979e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C14298e f19708e;

    public C9979e(C14298e c14298e) {
        this.f19708e = c14298e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9979e) && this.f19708e.equals(((C9979e) obj).f19708e);
    }

    public final int hashCode() {
        return (this.f19708e.vip * 31) + 1237;
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.f19708e + ", overrideDescendants=false)";
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new AbstractC12811e(this.f19708e, null);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C12748e c12748e = (C12748e) abstractC13616e;
        C14298e c14298e = c12748e.f25629e;
        C14298e c14298e2 = this.f19708e;
        if (AbstractC7890e.billing(c14298e, c14298e2)) {
            return;
        }
        c12748e.f25629e = c14298e2;
        if (c12748e.f25627e) {
            c12748e.m3404e();
        }
    }
}
