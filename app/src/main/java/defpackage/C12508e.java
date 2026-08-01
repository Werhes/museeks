package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚّٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12508e extends AbstractC2052e {
    public final int appmetrica;

    public C12508e(int i) {
        super(AbstractC1975e.metrica, i == 2 ? 2 : 1, i == 3 ? 2 : null);
        this.appmetrica = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12508e) {
            return this.appmetrica == ((C12508e) obj).appmetrica;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC8703e.m2467class(this.appmetrica);
    }
}
