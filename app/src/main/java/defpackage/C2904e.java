package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔ۠ؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2904e extends AbstractC14073e {
    public final C2330e appmetrica;
    public final C17985e purchase;

    public C2904e(C2330e c2330e) {
        C17985e c17985e;
        this.appmetrica = c2330e;
        if (AbstractC13336e.yandex(c2330e)) {
            c17985e = null;
        } else {
            c17985e = AbstractC11972e.ad();
            AbstractC1634e.license(c17985e, c2330e);
        }
        this.purchase = c17985e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2904e) {
            return AbstractC7890e.billing(this.appmetrica, ((C2904e) obj).appmetrica);
        }
        return false;
    }

    public final int hashCode() {
        return this.appmetrica.hashCode();
    }

    @Override // defpackage.AbstractC14073e
    public final C0763e mopub() {
        C2330e c2330e = this.appmetrica;
        return new C0763e(c2330e.ad, c2330e.vip, c2330e.metrica, c2330e.license);
    }
}
