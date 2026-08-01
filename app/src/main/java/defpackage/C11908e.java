package defpackage;

import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11908e implements InterfaceC3974e {
    public static final C11908e ad = new Object();
    public static boolean appmetrica;
    public static int license;
    public static boolean metrica;
    public static C2007e purchase;
    public static int vip;

    @Override // defpackage.InterfaceC3974e
    public final void ad(AbstractC16049e abstractC16049e, AbstractC16049e abstractC16049e2) {
        if (metrica) {
            metrica = false;
            C7838e c7838e = VKXApplication.f36530e;
            if (c7838e == null) {
                c7838e = null;
            }
            c7838e.subscription();
        }
    }

    @Override // defpackage.InterfaceC3974e
    public final void metrica(long j) {
        if (!appmetrica || metrica) {
            return;
        }
        int i = license - 1;
        license = i;
        C2007e c2007e = purchase;
        if (c2007e != null) {
            ((C14564e) c2007e.f5254e).m3830synchronized(i);
        }
        if (license <= 0) {
            appmetrica = false;
            C7838e c7838e = VKXApplication.f36530e;
            if (c7838e == null) {
                c7838e = null;
            }
            c7838e.subscription();
        }
    }

    @Override // defpackage.InterfaceC3974e
    public final void vip(EnumC11342e enumC11342e) {
    }
}
