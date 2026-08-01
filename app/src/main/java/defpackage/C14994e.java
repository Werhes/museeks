package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leّٔ۟;", "Leِٝؓ;", "Leًؚ٘;", "haze_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: eّٔ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C14994e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C4254e f29724e;

    public C14994e(C4254e c4254e) {
        this.f29724e = c4254e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14994e) && this.f29724e.equals(((C14994e) obj).f29724e) && Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        return AbstractC1414e.license(this.f29724e.hashCode() * 31, 0.0f, 31);
    }

    public final String toString() {
        return "HazeSourceElement(state=" + this.f29724e + ", zIndex=0.0, key=null)";
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C7016e(this.f29724e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C7016e c7016e = (C7016e) abstractC13616e;
        C12742e c12742e = c7016e.f14362e.ad;
        C16106e c16106e = c7016e.f14361e;
        boolean contains = c12742e.contains(c16106e);
        if (contains) {
            c7016e.f14362e.ad.remove(c16106e);
        }
        C4254e c4254e = this.f29724e;
        c7016e.f14362e = c4254e;
        if (contains) {
            c4254e.ad.add(c16106e);
        }
        c16106e.metrica.startapp(0.0f);
    }
}
