package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۡۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18434e implements InterfaceC8026e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C18434e f36137e = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final double f36136e = (AbstractC0865e.billing(0.018d, 0.45d) * 1.099d) - 0.099d;

    @Override // defpackage.InterfaceC8026e
    public final float metrica(float f) {
        double d = f;
        return (d < f36136e ? Float.valueOf(f / 4.5f) : Double.valueOf(AbstractC0865e.billing((d + 0.099d) / 1.099d, 2.2222222222222223d))).floatValue();
    }

    @Override // defpackage.InterfaceC8026e
    public final float purchase(float f) {
        double d = f;
        return (float) (d < 0.018d ? d * 4.5d : (AbstractC0865e.billing(d, 0.45d) * 1.099d) - 0.099d);
    }
}
