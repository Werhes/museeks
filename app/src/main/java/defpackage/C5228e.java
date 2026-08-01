package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leۣؗؒ;", "Leِٝؓ;", "Leًۦٜ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eۣؗؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5228e extends AbstractC11865e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f11122e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final float f11123e;

    public C5228e(float f, boolean z) {
        this.f11123e = f;
        this.f11122e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C5228e c5228e = obj instanceof C5228e ? (C5228e) obj : null;
        return c5228e != null && this.f11123e == c5228e.f11123e && this.f11122e == c5228e.f11122e;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f11123e) * 31) + (this.f11122e ? 1231 : 1237);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eًۦٜ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f17086e = this.f11123e;
        abstractC13616e.f17087e = this.f11122e;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C8354e c8354e = (C8354e) abstractC13616e;
        c8354e.f17086e = this.f11123e;
        c8354e.f17087e = this.f11122e;
    }
}
