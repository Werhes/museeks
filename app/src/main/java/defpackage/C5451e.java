package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leؘؗۡ;", "Leِٝؓ;", "Leَٕۙ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eؘؗۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5451e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f11726e;

    public C5451e(int i) {
        this.f11726e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C5451e c5451e = obj instanceof C5451e ? (C5451e) obj : null;
        return c5451e != null && this.f11726e == c5451e.f11726e;
    }

    public final int hashCode() {
        return (AbstractC8703e.m2467class(this.f11726e) * 31) + 1231;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eَٕۙ, eٌٓۛ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13870e = new AbstractC13870e(0);
        abstractC13870e.f20715e = this.f11726e;
        abstractC13870e.f20714e = true;
        return abstractC13870e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C10496e c10496e = (C10496e) abstractC13616e;
        c10496e.f20715e = this.f11726e;
        c10496e.f20714e = true;
    }
}
