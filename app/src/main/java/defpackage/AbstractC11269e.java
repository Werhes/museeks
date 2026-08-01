package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۛٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11269e {
    public static final float ad = AbstractC3836e.metrica;
    public static final int vip = 1;
    public static final int metrica = 1;
    public static final float license = AbstractC17599e.appmetrica;
    public static final float appmetrica = AbstractC17599e.purchase;
    public static final float purchase = AbstractC3836e.vip;

    public static final void ad(InterfaceC2235e interfaceC2235e, int i, long j, float f, float f2) {
        if (i == 1) {
            float f3 = f / 2.0f;
            float intBitsToFloat = (Float.intBitsToFloat((int) (interfaceC2235e.yandex() >> 32)) - f3) - f2;
            float intBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC2235e.yandex() & 4294967295L)) / 2.0f;
            AbstractC4653e.mopub(interfaceC2235e, j, f3, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2)), null, 120);
            return;
        }
        float intBitsToFloat3 = (Float.intBitsToFloat((int) (interfaceC2235e.yandex() >> 32)) - f) - f2;
        float intBitsToFloat4 = (Float.intBitsToFloat((int) (interfaceC2235e.yandex() & 4294967295L)) - f) / 2.0f;
        AbstractC4653e.subscription(interfaceC2235e, j, (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L), (Float.floatToRawIntBits(f) << 32) | (4294967295L & Float.floatToRawIntBits(f)), 0.0f, null, null, 0, 120);
    }
}
