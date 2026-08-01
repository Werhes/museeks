package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC4511e;
import defpackage.C14679e;
import defpackage.C16786e;
import defpackage.C1779e;
import defpackage.C6869e;
import defpackage.C7259e;
import defpackage.C8625e;
import defpackage.C9237e;
import defpackage.InterfaceC11846e;
import defpackage.InterfaceC13242e;
import defpackage.InterfaceC13586e;
import defpackage.InterfaceC16107e;
import defpackage.InterfaceC2560e;
import defpackage.InterfaceC4648e;
import defpackage.InterfaceC7030e;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Keep
/* loaded from: classes3.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(C16786e c16786e, InterfaceC2560e interfaceC2560e) {
        C14679e c14679e = (C14679e) interfaceC2560e.ad(C14679e.class);
        if (interfaceC2560e.ad(InterfaceC16107e.class) == null) {
            return new FirebaseMessaging(c14679e, interfaceC2560e.appmetrica(C1779e.class), interfaceC2560e.appmetrica(InterfaceC13586e.class), (InterfaceC4648e) interfaceC2560e.ad(InterfaceC4648e.class), interfaceC2560e.advert(c16786e), (InterfaceC13242e) interfaceC2560e.ad(InterfaceC13242e.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C7259e> getComponents() {
        C16786e c16786e = new C16786e(InterfaceC7030e.class, InterfaceC11846e.class);
        C9237e vip = C7259e.vip(FirebaseMessaging.class);
        vip.ad = LIBRARY_NAME;
        vip.ad(C8625e.vip(C14679e.class));
        vip.ad(new C8625e(0, 0, InterfaceC16107e.class));
        vip.ad(new C8625e(0, 1, C1779e.class));
        vip.ad(new C8625e(0, 1, InterfaceC13586e.class));
        vip.ad(C8625e.vip(InterfaceC4648e.class));
        vip.ad(new C8625e(c16786e, 0, 1));
        vip.ad(C8625e.vip(InterfaceC13242e.class));
        vip.billing = new C6869e(c16786e, 1);
        vip.metrica(1);
        return Arrays.asList(vip.vip(), AbstractC4511e.vip(LIBRARY_NAME, "25.0.1"));
    }
}
