package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC4511e;
import defpackage.C0211e;
import defpackage.C12582e;
import defpackage.C14679e;
import defpackage.C14935e;
import defpackage.C16786e;
import defpackage.C17647e;
import defpackage.C7259e;
import defpackage.C8625e;
import defpackage.C9237e;
import defpackage.ExecutorC12660e;
import defpackage.InterfaceC10123e;
import defpackage.InterfaceC15973e;
import defpackage.InterfaceC2560e;
import defpackage.InterfaceC4648e;
import defpackage.InterfaceC7549e;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Keep
/* loaded from: classes3.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static InterfaceC4648e lambda$getComponents$0(InterfaceC2560e interfaceC2560e) {
        return new C14935e((C14679e) interfaceC2560e.ad(C14679e.class), interfaceC2560e.appmetrica(InterfaceC15973e.class), (ExecutorService) interfaceC2560e.inmobi(new C16786e(InterfaceC7549e.class, ExecutorService.class)), new ExecutorC12660e((Executor) interfaceC2560e.inmobi(new C16786e(InterfaceC10123e.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C7259e> getComponents() {
        C9237e vip = C7259e.vip(InterfaceC4648e.class);
        vip.ad = LIBRARY_NAME;
        vip.ad(C8625e.vip(C14679e.class));
        vip.ad(new C8625e(0, 1, InterfaceC15973e.class));
        vip.ad(new C8625e(new C16786e(InterfaceC7549e.class, ExecutorService.class), 1, 0));
        vip.ad(new C8625e(new C16786e(InterfaceC10123e.class, Executor.class), 1, 0));
        vip.billing = new C12582e(17);
        C7259e vip2 = vip.vip();
        C17647e c17647e = new C17647e(0);
        C9237e vip3 = C7259e.vip(C17647e.class);
        vip3.metrica = 1;
        vip3.billing = new C0211e(16, c17647e);
        return Arrays.asList(vip2, vip3.vip(), AbstractC4511e.vip(LIBRARY_NAME, "19.1.0"));
    }
}
