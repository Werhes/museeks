package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۣۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7560e extends AbstractC11750e {
    public final C14544e smaato;

    public C7560e(C14544e c14544e) {
        this.smaato = c14544e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7560e) && AbstractC7890e.billing(this.smaato, ((C7560e) obj).smaato);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.smaato.ad);
    }

    @Override // defpackage.AbstractC11750e
    public final int license(int i, int i2, EnumC7792e enumC7792e) {
        return this.smaato.ad(i2, i);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.smaato + ')';
    }
}
