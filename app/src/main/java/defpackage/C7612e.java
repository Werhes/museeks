package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؚۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7612e implements InterfaceC1848e {
    public static final C7612e ad = new Object();
    public static final C7369e vip = C7369e.metrica("appId");
    public static final C7369e metrica = C7369e.metrica("deviceModel");
    public static final C7369e license = C7369e.metrica("sessionSdkVersion");
    public static final C7369e appmetrica = C7369e.metrica("osVersion");
    public static final C7369e purchase = C7369e.metrica("logEnvironment");
    public static final C7369e billing = C7369e.metrica("androidAppInfo");

    @Override // defpackage.InterfaceC5898e
    public final void ad(Object obj, Object obj2) {
        C10426e c10426e = (C10426e) obj;
        InterfaceC14209e interfaceC14209e = (InterfaceC14209e) obj2;
        interfaceC14209e.ad(vip, c10426e.ad);
        interfaceC14209e.ad(metrica, Build.MODEL);
        interfaceC14209e.ad(license, "3.0.4");
        interfaceC14209e.ad(appmetrica, Build.VERSION.RELEASE);
        interfaceC14209e.ad(purchase, EnumC1949e.LOG_ENVIRONMENT_PROD);
        interfaceC14209e.ad(billing, c10426e.vip);
    }
}
