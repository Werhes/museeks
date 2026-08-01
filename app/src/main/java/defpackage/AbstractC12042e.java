package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۡؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12042e {
    public static final C7936e ad;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        ad = new C7936e(2);
    }

    public static byte ad(AbstractC14583e abstractC14583e, byte b) {
        if (abstractC14583e == null) {
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            ad.getClass();
            int i = C1724e.ad;
            C12927e.license();
            if (b == 2) {
                return (byte) 1;
            }
            if (b == 3) {
                return (byte) 0;
            }
        } else {
            if (abstractC14583e instanceof C2992e) {
                C12927e.license();
                return b;
            }
            C12927e.license();
            if (b == 2) {
                return (byte) 1;
            }
            if (b == 3) {
                return (byte) 0;
            }
        }
        return b;
    }

    public static byte vip(AbstractC14583e abstractC14583e) {
        if (abstractC14583e != null) {
            if (abstractC14583e instanceof C2992e) {
                return C12927e.license().amazon;
            }
            return (byte) 1;
        }
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        ad.getClass();
        int i = C1724e.ad;
        return (byte) 1;
    }
}
