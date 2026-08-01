package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘْۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5621e extends AbstractC12782e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C14914e f11979e = new C14914e(26);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f11980e;

    public C5621e(String str) {
        super(f11979e);
        this.f11980e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5621e) && AbstractC7890e.billing(this.f11980e, ((C5621e) obj).f11980e);
    }

    public final int hashCode() {
        return this.f11980e.hashCode();
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("CoroutineName("), this.f11980e, ')');
    }
}
