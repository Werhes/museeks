package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leؙؓۙ;", "Leِٝؓ;", "Leؕ٘ؑ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eؙؓۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6149e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C15274e f12920e;

    public C6149e(C15274e c15274e) {
        this.f12920e = c15274e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6149e) && AbstractC7890e.billing(((C6149e) obj).f12920e, this.f12920e);
    }

    public final int hashCode() {
        return this.f12920e.hashCode() * 31;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eْۤۡ, eؕ٘ؑ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f7657e = this.f12920e;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C3423e c3423e = (C3423e) abstractC13616e;
        C15274e c15274e = c3423e.f7657e;
        C15274e c15274e2 = this.f12920e;
        if (AbstractC7890e.billing(c15274e, c15274e2)) {
            return;
        }
        c3423e.m1361e();
        c3423e.f7657e = c15274e2;
    }
}
