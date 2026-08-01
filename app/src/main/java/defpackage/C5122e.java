package defpackage;

import android.os.Build;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۙٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5122e {
    public final InterfaceC12541e ad;
    public final C12204e vip;
    public static final Map metrica = Collections.singletonMap("Google", AbstractC1660e.m664case(new String[]{"oriole", "raven", "bluejay", "panther", "cheetah", "lynx"}));
    public static final Object license = AbstractC10064e.purchase(new C6571e("google", AbstractC1660e.m664case(new String[]{"pixel 4", "pixel 4 xl"})), new C6571e("samsung", Collections.singleton("sm-g770f")));

    public C5122e(InterfaceC12541e interfaceC12541e, C12204e c12204e) {
        this.ad = interfaceC12541e;
        this.vip = c12204e;
    }

    public final boolean ad(String str) {
        boolean z;
        this.vip.getClass();
        if (Build.VERSION.SDK_INT <= 32) {
            C6434e c6434e = InterfaceC2531e.yandex;
            InterfaceC2531e appmetrica = ((C7520e) this.ad).appmetrica(str);
            c6434e.getClass();
            if (C6434e.vip(appmetrica)) {
                z = true;
                return !z || (!"motorola".equalsIgnoreCase(Build.BRAND) && "moto e20".equalsIgnoreCase(Build.MODEL) && str.equals("1"));
            }
        }
        z = false;
        if (z) {
        }
    }
}
