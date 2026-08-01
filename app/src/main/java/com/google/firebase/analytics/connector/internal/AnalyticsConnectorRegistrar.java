package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC4511e;
import defpackage.AbstractC9528e;
import defpackage.C14679e;
import defpackage.C17768e;
import defpackage.C18395e;
import defpackage.C6173e;
import defpackage.C7259e;
import defpackage.C8625e;
import defpackage.C8638e;
import defpackage.C9237e;
import defpackage.C9821e;
import defpackage.ExecutorC0082e;
import defpackage.InterfaceC13242e;
import defpackage.InterfaceC2560e;
import defpackage.InterfaceC5632e;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Keep
/* loaded from: classes3.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static InterfaceC5632e lambda$getComponents$0(InterfaceC2560e interfaceC2560e) {
        C14679e c14679e = (C14679e) interfaceC2560e.ad(C14679e.class);
        Context context = (Context) interfaceC2560e.ad(Context.class);
        InterfaceC13242e interfaceC13242e = (InterfaceC13242e) interfaceC2560e.ad(InterfaceC13242e.class);
        AbstractC9528e.startapp(c14679e);
        AbstractC9528e.startapp(context);
        AbstractC9528e.startapp(interfaceC13242e);
        AbstractC9528e.startapp(context.getApplicationContext());
        if (C8638e.metrica == null) {
            synchronized (C8638e.class) {
                try {
                    if (C8638e.metrica == null) {
                        Bundle bundle = new Bundle(1);
                        c14679e.ad();
                        if ("[DEFAULT]".equals(c14679e.vip)) {
                            ((C18395e) interfaceC13242e).ad(ExecutorC0082e.f1247e, C6173e.f12940e);
                            bundle.putBoolean("dataCollectionDefaultEnabled", c14679e.yandex());
                        }
                        C8638e.metrica = new C8638e(C17768e.metrica(context, bundle).vip);
                    }
                } finally {
                }
            }
        }
        return C8638e.metrica;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C7259e> getComponents() {
        C9237e vip = C7259e.vip(InterfaceC5632e.class);
        vip.ad(C8625e.vip(C14679e.class));
        vip.ad(C8625e.vip(Context.class));
        vip.ad(C8625e.vip(InterfaceC13242e.class));
        vip.billing = C9821e.f19385e;
        vip.metrica(2);
        return Arrays.asList(vip.vip(), AbstractC4511e.vip("fire-analytics", "23.2.0"));
    }
}
