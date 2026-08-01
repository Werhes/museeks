package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leَۙؖ;", "Leِٝؓ;", "Leِٖٜ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eَۙؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10491e extends AbstractC11865e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f20708e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C9137e f20709e;

    public C10491e(C9137e c9137e, boolean z) {
        this.f20709e = c9137e;
        this.f20708e = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10491e)) {
            return false;
        }
        C10491e c10491e = (C10491e) obj;
        return AbstractC7890e.billing(this.f20709e, c10491e.f20709e) && this.f20708e == c10491e.f20708e;
    }

    public final int hashCode() {
        return (((this.f20709e.hashCode() * 31) + 1237) * 31) + (this.f20708e ? 1231 : 1237);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eِٖٜ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f32117e = this.f20709e;
        abstractC13616e.f32118e = this.f20708e;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C16346e c16346e = (C16346e) abstractC13616e;
        c16346e.f32117e = this.f20709e;
        c16346e.f32118e = this.f20708e;
    }
}
