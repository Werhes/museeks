package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۜٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0575e extends AbstractC0421e {
    @Override // defpackage.AbstractC0421e
    public final void purchase(C16022e c16022e, float f, float f2) {
        c16022e.license(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        C0249e c0249e = new C0249e(0.0f, 0.0f, f3, f3);
        c0249e.purchase = 180.0f;
        c0249e.billing = 90.0f;
        c16022e.purchase.add(c0249e);
        C13508e c13508e = new C13508e(c0249e);
        c16022e.ad(180.0f);
        c16022e.billing.add(c13508e);
        c16022e.license = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        double d = 270.0f;
        c16022e.vip = (((float) Math.cos(Math.toRadians(d))) * f5) + f4;
        c16022e.metrica = (f5 * ((float) Math.sin(Math.toRadians(d)))) + f4;
    }
}
