package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؓۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15955e implements InterfaceC1719e {
    public final /* synthetic */ C18237e ad;

    public C15955e(C18237e c18237e) {
        this.ad = c18237e;
    }

    @Override // defpackage.InterfaceC1719e
    public final float ad(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        C18237e c18237e = this.ad;
        float floatValue = ((Number) c18237e.ad.invoke(Float.valueOf(f))).floatValue();
        c18237e.appmetrica.setValue(Boolean.valueOf(floatValue > 0.0f));
        c18237e.purchase.setValue(Boolean.valueOf(floatValue < 0.0f));
        return floatValue;
    }
}
