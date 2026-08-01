package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۧٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14395e extends C8870e {
    public final Throwable ad;

    public C14395e(Throwable th) {
        this.ad = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14395e) {
            return AbstractC7890e.billing(this.ad, ((C14395e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.ad;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.C8870e
    public final String toString() {
        return "Closed(" + this.ad + ')';
    }
}
