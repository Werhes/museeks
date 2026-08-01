package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leٗۨۘ;", "Leِٝؓ;", "Leؘِٞ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eٗۨۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17446e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f34168e;

    public C17446e(boolean z) {
        this.f34168e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C17446e ? (C17446e) obj : null) == null) {
            return false;
        }
        return this.f34168e == ((C17446e) obj).f34168e;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(1.0f) * 31) + (this.f34168e ? 1231 : 1237);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؘِٞ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f12233e = 1.0f;
        abstractC13616e.f12234e = this.f34168e;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C5784e c5784e = (C5784e) abstractC13616e;
        c5784e.f12233e = 1.0f;
        c5784e.f12234e = this.f34168e;
    }
}
