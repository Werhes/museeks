package com.google.mlkit.vision.barcode.internal;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC2358e;
import defpackage.C10068e;
import defpackage.C2306e;
import defpackage.C2316e;
import defpackage.C3200e;
import defpackage.C6776e;
import defpackage.C7259e;
import defpackage.C8455e;
import defpackage.C8625e;
import defpackage.C9237e;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C9237e vip = C7259e.vip(C3200e.class);
        vip.ad(C8625e.vip(C2316e.class));
        vip.billing = new C10068e(15);
        C7259e vip2 = vip.vip();
        C9237e vip3 = C7259e.vip(C2306e.class);
        vip3.ad(C8625e.vip(C3200e.class));
        vip3.ad(C8625e.vip(C6776e.class));
        vip3.ad(C8625e.vip(C2316e.class));
        vip3.billing = new C8455e(17);
        return AbstractC2358e.advert(vip2, vip3.vip());
    }
}
