package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0512e {
    public final C13770e ad;

    public /* synthetic */ C0512e(C13770e c13770e) {
        this.ad = c13770e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0512e) {
            return AbstractC7890e.billing(this.ad, ((C0512e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.ad + ')';
    }
}
