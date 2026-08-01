package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leؓٙۨ;", "Leِٝؓ;", "Leؖٗ۟;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eؓٙۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C1904e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final float f5089e;

    public C1904e(float f) {
        this.f5089e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1904e) && Float.compare(this.f5089e, ((C1904e) obj).f5089e) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f5089e);
    }

    public final String toString() {
        return AbstractC17861e.remoteconfig(new StringBuilder("ZIndexElement(zIndex="), this.f5089e, ')');
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eْۤۡ, eؖٗ۟] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f9177e = this.f5089e;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        ((C4162e) abstractC13616e).f9177e = this.f5089e;
    }
}
