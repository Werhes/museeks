package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C2140e.class)
/* renamed from: eٛۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18213e extends AbstractC4879e {
    public static final C16302e Companion = new Object();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f35654e;

    public C18213e(String str) {
        this.f35654e = str;
    }

    @Override // defpackage.AbstractC4879e
    public final int appmetrica() {
        return 14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C12232e c12232e = AbstractC3820e.ad;
        return AbstractC7890e.billing(c12232e.vip(C18213e.class), c12232e.vip(obj.getClass())) && AbstractC7890e.billing(this.f35654e, ((C18213e) obj).f35654e);
    }

    public final int hashCode() {
        return this.f35654e.hashCode();
    }

    public final String toString() {
        return AbstractC1786e.signatures(new StringBuilder("BsonJavaScript(code='"), this.f35654e, "')");
    }
}
