package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C10150e.class)
/* renamed from: eؕؒ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3081e extends AbstractC10710e {
    public static final C1668e Companion = new Object();
    public final int metrica;

    public C3081e(int i) {
        this.metrica = i;
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("Unit duration must be positive, but was ", i, " months.").toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3081e) {
            return this.metrica == ((C3081e) obj).metrica;
        }
        return false;
    }

    public final int hashCode() {
        return this.metrica ^ 131072;
    }

    public final String toString() {
        int i = this.metrica;
        return i % 1200 == 0 ? AbstractC0894e.ad(i / 1200, "CENTURY") : i % 12 == 0 ? AbstractC0894e.ad(i / 12, "YEAR") : i % 3 == 0 ? AbstractC0894e.ad(i / 3, "QUARTER") : AbstractC0894e.ad(i, "MONTH");
    }
}
