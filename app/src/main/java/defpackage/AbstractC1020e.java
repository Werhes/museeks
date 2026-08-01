package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؒۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1020e {
    public static final int ad = Float.floatToIntBits(0.5f);

    public static final float ad(short s) {
        int i = 0;
        boolean z = (32768 & s) != 0;
        int i2 = (s >> 10) & 31;
        int i3 = s & 1023;
        if (i2 != 0) {
            i = i2 != 31 ? i2 + 112 : 255;
        } else {
            if (i3 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(ad + i3) - 0.5f;
                return z ? -intBitsToFloat : intBitsToFloat;
            }
            i3 = 0;
        }
        float intBitsToFloat2 = Float.intBitsToFloat((i3 << 13) | (i << 23));
        return z ? -intBitsToFloat2 : intBitsToFloat2;
    }

    public static final String metrica(InterfaceC9998e interfaceC9998e, long j) {
        int purchase = interfaceC9998e.purchase();
        while (purchase > 0) {
            int i = purchase - 1;
            String billing = interfaceC9998e.billing(interfaceC9998e.purchase() - purchase);
            Long amazon = AbstractC12797e.amazon(interfaceC9998e, interfaceC9998e.license(billing));
            if (amazon != null && amazon.longValue() == j) {
                return billing;
            }
            purchase = i;
        }
        return null;
    }

    public static final int vip(InterfaceC9998e interfaceC9998e, String str) {
        int license = interfaceC9998e.license(str);
        if (license != -3) {
            return license;
        }
        throw new IllegalArgumentException(interfaceC9998e.ad() + " does not contain element with name '" + str + ". You can enable 'CborBuilder.ignoreUnknownKeys' property to ignore unknown keys");
    }
}
