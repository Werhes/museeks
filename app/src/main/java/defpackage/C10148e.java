package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leًَۘ;", "Leِٝؓ;", "Leٍٜ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eًَۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10148e extends AbstractC11865e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f20088e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C10156e f20089e;

    public C10148e(C10156e c10156e, boolean z) {
        this.f20089e = c10156e;
        this.f20088e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C10148e c10148e = obj instanceof C10148e ? (C10148e) obj : null;
        return c10148e != null && this.f20089e.equals(c10148e.f20089e) && this.f20088e == c10148e.f20088e;
    }

    public final int hashCode() {
        return (this.f20089e.hashCode() * 31) + (this.f20088e ? 1231 : 1237);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍٜ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f19021e = this.f20089e;
        abstractC13616e.f19022e = this.f20088e;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C9588e c9588e = (C9588e) abstractC13616e;
        c9588e.f19021e = this.f20089e;
        c9588e.f19022e = this.f20088e;
    }
}
