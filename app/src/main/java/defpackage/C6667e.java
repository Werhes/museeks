package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leٍؙۜ;", "Leِٝؓ;", "Leٌٕٓ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eٍؙۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6667e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C16330e f13765e;

    public C6667e(C16330e c16330e) {
        this.f13765e = c16330e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6667e) && AbstractC7890e.billing(this.f13765e, ((C6667e) obj).f13765e);
    }

    public final int hashCode() {
        C16330e c16330e = this.f13765e;
        return Float.floatToIntBits(1.0f) + ((c16330e != null ? c16330e.hashCode() : 0) * 961);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٕٓ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f27722e = 1.0f;
        abstractC13616e.f27723e = this.f13765e;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C13996e c13996e = (C13996e) abstractC13616e;
        c13996e.f27722e = 1.0f;
        c13996e.f27723e = this.f13765e;
    }
}
