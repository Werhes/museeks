package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۦٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14382e extends AbstractC11750e {
    public final InterfaceC3886e smaato;

    public C14382e(C9577e c9577e) {
        this.smaato = c9577e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14382e) && AbstractC7890e.billing(this.smaato, ((C14382e) obj).smaato);
    }

    public final int hashCode() {
        return this.smaato.hashCode();
    }

    @Override // defpackage.AbstractC11750e
    public final int license(int i, int i2, EnumC7792e enumC7792e) {
        return this.smaato.ad(i2, i, enumC7792e);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.smaato + ')';
    }
}
