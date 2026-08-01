package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes.dex */
public final class startapp implements InterfaceC8026e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final startapp f36460e = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final double f36459e = ((Math.log(65504.0d) / AbstractC17457e.ad) + 9.72d) / 17.52d;

    @Override // defpackage.InterfaceC8026e
    public final float metrica(float f) {
        double d = f;
        return (float) (d <= 0.155251141552511d ? (d - 0.0729055341958355d) / 10.5402377416545d : d < f36459e ? Math.pow(2.0d, (d * 17.52d) - 9.72d) : 65504.0d);
    }

    @Override // defpackage.InterfaceC8026e
    public final float purchase(float f) {
        double d = f;
        return (float) (d < 0.0078125d ? (d * 10.5402377416545d) + 0.0729055341958355d : (((float) (Math.log(d) / AbstractC17457e.ad)) + 9.72d) / 17.52d);
    }
}
