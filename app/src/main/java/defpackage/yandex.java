package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes.dex */
public final class yandex implements InterfaceC8026e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final yandex f36768e = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final double f36767e = ((Math.log(65504.0d) / AbstractC17457e.ad) + 9.72d) / 17.52d;

    @Override // defpackage.InterfaceC8026e
    public final float metrica(float f) {
        double d = f;
        return (float) (d <= -0.3013698630136986d ? (AbstractC0865e.billing(2.0d, (d * 17.52d) - 9.72d) - 1.52587890625E-5d) * 2.0d : d < f36767e ? Math.pow(2.0d, (d * 17.52d) - 9.72d) : 65504.0d);
    }

    @Override // defpackage.InterfaceC8026e
    public final float purchase(float f) {
        double log;
        double d = f;
        if (d < 3.0517578125E-5d) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            log = Math.log((f / 2.0d) + 1.52587890625E-5d) / AbstractC17457e.ad;
        } else {
            log = (float) (Math.log(d) / AbstractC17457e.ad);
        }
        return (float) ((log + 9.72d) / 17.52d);
    }
}
