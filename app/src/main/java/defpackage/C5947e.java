package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؘ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5947e implements InterfaceC1848e {
    public static final C5947e ad = new Object();
    public static final C7369e vip = C7369e.metrica("packageName");
    public static final C7369e metrica = C7369e.metrica("versionName");
    public static final C7369e license = C7369e.metrica("appBuildVersion");
    public static final C7369e appmetrica = C7369e.metrica("deviceManufacturer");
    public static final C7369e purchase = C7369e.metrica("currentProcessDetails");
    public static final C7369e billing = C7369e.metrica("appProcessDetails");

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        C13666e c13666e = (C13666e) obj;
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        interfaceC14209e.ad(vip, c13666e.ad);
        interfaceC14209e.ad(metrica, c13666e.vip);
        interfaceC14209e.ad(license, c13666e.metrica);
        interfaceC14209e.ad(appmetrica, Build.MANUFACTURER);
        interfaceC14209e.ad(purchase, c13666e.license);
        interfaceC14209e.ad(billing, c13666e.appmetrica);
    }
}
