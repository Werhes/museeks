package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leًْٝ;", "Leِٝؓ;", "Leِۧؔ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eًْٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7913e extends AbstractC11865e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final float f16005e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f16006e;

    public C7913e(int i, float f) {
        this.f16006e = i;
        this.f16005e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7913e)) {
            return false;
        }
        C7913e c7913e = (C7913e) obj;
        return this.f16006e == c7913e.f16006e && this.f16005e == c7913e.f16005e;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f16005e) + (AbstractC8703e.m2467class(this.f16006e) * 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eْۤۡ, eِۧؔ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f24291e = this.f16006e;
        abstractC13616e.f24292e = this.f16005e;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C12127e c12127e = (C12127e) abstractC13616e;
        c12127e.f24291e = this.f16006e;
        c12127e.f24292e = this.f16005e;
    }
}
