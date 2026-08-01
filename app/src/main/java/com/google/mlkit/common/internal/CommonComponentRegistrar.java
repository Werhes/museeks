package com.google.mlkit.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC11261e;
import defpackage.AbstractC4354e;
import defpackage.C0136e;
import defpackage.C10068e;
import defpackage.C11530e;
import defpackage.C12461e;
import defpackage.C13023e;
import defpackage.C13122e;
import defpackage.C14595e;
import defpackage.C2316e;
import defpackage.C4205e;
import defpackage.C4590e;
import defpackage.C4731e;
import defpackage.C6043e;
import defpackage.C6114e;
import defpackage.C6173e;
import defpackage.C6776e;
import defpackage.C7249e;
import defpackage.C7259e;
import defpackage.C7936e;
import defpackage.C8081e;
import defpackage.C8625e;
import defpackage.C9237e;
import defpackage.C9616e;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C9237e vip = C7259e.vip(C4590e.class);
        vip.ad(C8625e.vip(C2316e.class));
        vip.billing = new C13023e(13);
        C7259e vip2 = vip.vip();
        C9237e vip3 = C7259e.vip(C13122e.class);
        vip3.billing = new C6173e(14);
        C7259e vip4 = vip3.vip();
        C9237e vip5 = C7259e.vip(C4731e.class);
        vip5.ad(new C8625e(2, 0, C12461e.class));
        vip5.billing = new C13023e(15);
        C7259e vip6 = vip5.vip();
        C9237e vip7 = C7259e.vip(C6776e.class);
        vip7.ad(new C8625e(1, 1, C13122e.class));
        vip7.billing = new C7249e(17);
        C7259e vip8 = vip7.vip();
        C9237e vip9 = C7259e.vip(C4205e.class);
        vip9.billing = new C14595e(19);
        C7259e vip10 = vip9.vip();
        C9237e vip11 = C7259e.vip(C6114e.class);
        vip11.ad(C8625e.vip(C4205e.class));
        vip11.billing = new C0136e(20);
        C7259e vip12 = vip11.vip();
        C9237e vip13 = C7259e.vip(C9616e.class);
        vip13.ad(C8625e.vip(C2316e.class));
        vip13.billing = new C10068e(22);
        C7259e vip14 = vip13.vip();
        C9237e vip15 = C7259e.vip(C12461e.class);
        vip15.metrica = 1;
        vip15.ad(new C8625e(1, 1, C9616e.class));
        vip15.billing = new C7936e(22);
        C7259e vip16 = vip15.vip();
        C8081e c8081e = AbstractC4354e.f9489e;
        Object[] objArr = {C6043e.vip, vip2, vip4, vip6, vip8, vip10, vip12, vip14, vip16};
        AbstractC11261e.purchase(9, objArr);
        return new C11530e(9, objArr);
    }
}
