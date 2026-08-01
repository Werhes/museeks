package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۖۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15656e extends AbstractC2052e {
    public final int appmetrica;

    public C15656e(int i) {
        super(AbstractC1975e.vip, i == 2 ? 2 : 1, i == 3 ? 2 : null);
        this.appmetrica = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C15656e) {
            return this.appmetrica == ((C15656e) obj).appmetrica;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC8703e.m2467class(this.appmetrica);
    }
}
