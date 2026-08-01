package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C4800e.class)
/* renamed from: eؓٓۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1809e extends AbstractC4879e {
    public static final C0005e Companion = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C4767e f4884e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f4885e;

    public C1809e(String str, C4767e c4767e) {
        this.f4885e = str;
        this.f4884e = c4767e;
    }

    @Override // defpackage.AbstractC4879e
    public final int appmetrica() {
        return 16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C12232e c12232e = AbstractC3820e.ad;
        if (!AbstractC7890e.billing(c12232e.vip(C1809e.class), c12232e.vip(obj.getClass()))) {
            return false;
        }
        C1809e c1809e = (C1809e) obj;
        return AbstractC7890e.billing(this.f4885e, c1809e.f4885e) && AbstractC7890e.billing(this.f4884e, c1809e.f4884e);
    }

    public final int hashCode() {
        return this.f4884e.f10200e.hashCode() + (this.f4885e.hashCode() * 31);
    }

    public final String toString() {
        return "BsonJavaScriptWithScope(code='" + this.f4885e + "', scope=" + this.f4884e + ')';
    }
}
