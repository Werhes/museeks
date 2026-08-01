package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚِٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7086e {
    public static final C0136e purchase = new C0136e(10);
    public final C11388e ad;
    public final boolean appmetrica;
    public final boolean license;
    public final boolean metrica;
    public final C1839e vip;

    public C7086e(C11388e c11388e, C1839e c1839e, boolean z, boolean z2, boolean z3) {
        this.ad = c11388e;
        this.vip = c1839e;
        this.metrica = z;
        this.license = z2;
        this.appmetrica = z3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NonMeasureInputs(textFieldState=");
        sb.append(this.ad);
        sb.append(", textStyle=");
        sb.append(this.vip);
        sb.append(", singleLine=");
        sb.append(this.metrica);
        sb.append(", softWrap=");
        sb.append(this.license);
        sb.append(", isKeyboardTypePhone=");
        return AbstractC1786e.isVip(sb, this.appmetrica, ')');
    }
}
