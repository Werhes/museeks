package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِّؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4062e extends AbstractC12699e {
    public final C17424e ad;

    public C4062e(C17424e c17424e) {
        this.ad = c17424e;
    }

    @Override // defpackage.AbstractC12699e
    public final boolean ad() {
        return ((C7818e) this.ad.f34141e).crashlytics() != EnumC3021e.RAW;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4062e)) {
            return false;
        }
        C17424e c17424e = ((C4062e) obj).ad;
        C17424e c17424e2 = this.ad;
        EnumC3021e crashlytics = ((C7818e) c17424e2.f34141e).crashlytics();
        C7818e c7818e = (C7818e) c17424e.f34141e;
        C7818e c7818e2 = (C7818e) c17424e.f34141e;
        return crashlytics.equals(c7818e.crashlytics()) && ((C7818e) c17424e2.f34141e).firebase().equals(c7818e2.firebase()) && ((C7818e) c17424e2.f34141e).m2325class().equals(c7818e2.m2325class());
    }

    public final int hashCode() {
        C17424e c17424e = this.ad;
        return Objects.hash((C7818e) c17424e.f34141e, (C15768e) c17424e.f34142e);
    }

    public final String toString() {
        C17424e c17424e = this.ad;
        String firebase = ((C7818e) c17424e.f34141e).firebase();
        int ordinal = ((C7818e) c17424e.f34141e).crashlytics().ordinal();
        return AbstractC17861e.subscription("(typeUrl=", firebase, ", outputPrefixType=", ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }
}
