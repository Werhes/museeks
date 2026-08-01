package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C3094e.class)
/* renamed from: eًٓٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14076e extends AbstractC10710e {
    public static final C3378e Companion = new Object();
    public final int metrica;

    public C14076e(int i) {
        this.metrica = i;
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("Unit duration must be positive, but was ", i, " days.").toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14076e) {
            return this.metrica == ((C14076e) obj).metrica;
        }
        return false;
    }

    public final int hashCode() {
        return this.metrica ^ 65536;
    }

    public final String toString() {
        int i = this.metrica;
        return i % 7 == 0 ? AbstractC0894e.ad(i / 7, "WEEK") : AbstractC0894e.ad(i, "DAY");
    }
}
