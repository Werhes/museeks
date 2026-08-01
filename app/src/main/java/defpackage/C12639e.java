package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C11400e.class)
/* renamed from: eّٟؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12639e extends AbstractC4879e {
    public static final C9549e Companion = new Object();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f25358e;

    public C12639e(String str) {
        this.f25358e = str;
    }

    @Override // defpackage.AbstractC4879e
    public final int appmetrica() {
        return 15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C12232e c12232e = AbstractC3820e.ad;
        return AbstractC7890e.billing(c12232e.vip(C12639e.class), c12232e.vip(obj.getClass())) && AbstractC7890e.billing(this.f25358e, ((C12639e) obj).f25358e);
    }

    public final int hashCode() {
        return this.f25358e.hashCode();
    }

    public final String toString() {
        return AbstractC1786e.signatures(new StringBuilder("BsonSymbol(value='"), this.f25358e, "')");
    }
}
