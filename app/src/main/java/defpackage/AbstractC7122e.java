package defpackage;

import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚْؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7122e {
    public static final C16330e ad;
    public static final C0576e vip;

    static {
        VKXApplication.Companion companion = VKXApplication.f36531e;
        ad = new C16330e(VKXApplication.Companion.ad(72.0f));
        vip = AbstractC14533e.startapp(EnumC2631e.f6496e);
    }

    public static void ad(EnumC2631e enumC2631e) {
        int ad2;
        vip.setValue(enumC2631e);
        int ordinal = enumC2631e.ordinal();
        if (ordinal == 0) {
            VKXApplication.Companion companion = VKXApplication.f36531e;
            ad2 = VKXApplication.Companion.ad(133.0f);
        } else {
            if (ordinal != 1) {
                throw new C14803e(10);
            }
            VKXApplication.Companion companion2 = VKXApplication.f36531e;
            ad2 = VKXApplication.Companion.ad(72.0f);
        }
        ad.startapp(ad2);
    }
}
