package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leٌؚؐ;", "Leِٝؓ;", "Leؒۤ۠;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eٌؚؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8388e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C14544e f17161e;

    public C8388e(C14544e c14544e) {
        this.f17161e = c14544e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C8388e c8388e = obj instanceof C8388e ? (C8388e) obj : null;
        if (c8388e == null) {
            return false;
        }
        return this.f17161e.equals(c8388e.f17161e);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f17161e.ad);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eْۤۡ, eؒۤ۠] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f4273e = this.f17161e;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        ((C1443e) abstractC13616e).f4273e = this.f17161e;
    }
}
