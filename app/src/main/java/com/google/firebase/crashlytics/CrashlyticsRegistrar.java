package com.google.firebase.crashlytics;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC4511e;
import defpackage.C0211e;
import defpackage.C11440e;
import defpackage.C12787e;
import defpackage.C1426e;
import defpackage.C14679e;
import defpackage.C16786e;
import defpackage.C17651e;
import defpackage.C2289e;
import defpackage.C7259e;
import defpackage.C8625e;
import defpackage.C9237e;
import defpackage.EnumC17850e;
import defpackage.InterfaceC10123e;
import defpackage.InterfaceC10774e;
import defpackage.InterfaceC4086e;
import defpackage.InterfaceC4648e;
import defpackage.InterfaceC5632e;
import defpackage.InterfaceC7549e;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int license = 0;
    public final C16786e ad = new C16786e(InterfaceC7549e.class, ExecutorService.class);
    public final C16786e vip = new C16786e(InterfaceC10123e.class, ExecutorService.class);
    public final C16786e metrica = new C16786e(InterfaceC4086e.class, ExecutorService.class);

    static {
        Map map = C11440e.vip;
        EnumC17850e enumC17850e = EnumC17850e.f35036e;
        if (map.containsKey(enumC17850e)) {
            Log.d("FirebaseSessions", "Dependency " + enumC17850e + " already added.");
            return;
        }
        map.put(enumC17850e, new C1426e(new C17651e(true)));
        Log.d("FirebaseSessions", "Dependency to " + enumC17850e + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C9237e vip = C7259e.vip(C2289e.class);
        vip.ad = "fire-cls";
        vip.ad(C8625e.vip(C14679e.class));
        vip.ad(C8625e.vip(InterfaceC4648e.class));
        vip.ad(new C8625e(this.ad, 1, 0));
        vip.ad(new C8625e(this.vip, 1, 0));
        vip.ad(new C8625e(this.metrica, 1, 0));
        vip.ad(new C8625e(0, 2, C12787e.class));
        vip.ad(new C8625e(0, 2, InterfaceC5632e.class));
        vip.ad(new C8625e(0, 2, InterfaceC10774e.class));
        vip.billing = new C0211e(20, this);
        vip.metrica(2);
        return Arrays.asList(vip.vip(), AbstractC4511e.vip("fire-cls", "20.0.4"));
    }
}
