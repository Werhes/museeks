package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۥٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11381e extends AbstractC12782e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C7249e f22907e = new C7249e(6);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f22908e;

    public C11381e(String str) {
        super(f22907e);
        this.f22908e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11381e) && AbstractC7890e.billing(this.f22908e, ((C11381e) obj).f22908e);
    }

    public final int hashCode() {
        return this.f22908e.hashCode();
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("PluginName("), this.f22908e, ')');
    }
}
