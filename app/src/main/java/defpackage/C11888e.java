package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leِٞۚ;", "Leِٝؓ;", "Leُِٛ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eِٞۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11888e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC12123e f23818e;

    public C11888e(InterfaceC12123e interfaceC12123e, C4526e c4526e) {
        this.f23818e = interfaceC12123e;
    }

    public final boolean equals(Object obj) {
        C11888e c11888e = obj instanceof C11888e ? (C11888e) obj : null;
        if (c11888e == null) {
            return false;
        }
        return AbstractC7890e.billing(this.f23818e, c11888e.f23818e);
    }

    public final int hashCode() {
        return this.f23818e.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eُِٛ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f23753e = this.f23818e;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        ((C11843e) abstractC13616e).f23753e = this.f23818e;
    }
}
