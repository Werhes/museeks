package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC4511e;
import defpackage.C11180e;
import defpackage.C12664e;
import defpackage.C16786e;
import defpackage.C6553e;
import defpackage.C7259e;
import defpackage.C8625e;
import defpackage.C9237e;
import defpackage.InterfaceC11846e;
import defpackage.InterfaceC1294e;
import defpackage.InterfaceC2560e;
import defpackage.InterfaceC7030e;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Keep
/* loaded from: classes3.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ InterfaceC11846e lambda$getComponents$0(InterfaceC2560e interfaceC2560e) {
        C6553e.vip((Context) interfaceC2560e.ad(Context.class));
        return C6553e.ad().metrica(C12664e.purchase);
    }

    public static /* synthetic */ InterfaceC11846e lambda$getComponents$1(InterfaceC2560e interfaceC2560e) {
        C6553e.vip((Context) interfaceC2560e.ad(Context.class));
        return C6553e.ad().metrica(C12664e.purchase);
    }

    public static /* synthetic */ InterfaceC11846e lambda$getComponents$2(InterfaceC2560e interfaceC2560e) {
        C6553e.vip((Context) interfaceC2560e.ad(Context.class));
        return C6553e.ad().metrica(C12664e.appmetrica);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C7259e> getComponents() {
        C9237e vip = C7259e.vip(InterfaceC11846e.class);
        vip.ad = LIBRARY_NAME;
        vip.ad(C8625e.vip(Context.class));
        vip.billing = new C11180e(25);
        C7259e vip2 = vip.vip();
        C9237e ad = C7259e.ad(new C16786e(InterfaceC1294e.class, InterfaceC11846e.class));
        ad.ad(C8625e.vip(Context.class));
        ad.billing = new C11180e(26);
        C7259e vip3 = ad.vip();
        C9237e ad2 = C7259e.ad(new C16786e(InterfaceC7030e.class, InterfaceC11846e.class));
        ad2.ad(C8625e.vip(Context.class));
        ad2.billing = new C11180e(27);
        return Arrays.asList(vip2, vip3, ad2.vip(), AbstractC4511e.vip(LIBRARY_NAME, "19.0.0"));
    }
}
