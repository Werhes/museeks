package com.google.mlkit.vision.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC16136e;
import defpackage.AbstractC1786e;
import defpackage.AbstractC6080e;
import defpackage.C11047e;
import defpackage.C17647e;
import defpackage.C2847e;
import defpackage.C7259e;
import defpackage.C8625e;
import defpackage.C9237e;
import defpackage.C9311e;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C9237e vip = C7259e.vip(C11047e.class);
        vip.ad(new C8625e(2, 0, AbstractC16136e.class));
        vip.billing = C17647e.f34593e;
        Object[] objArr = {vip.vip()};
        for (int i = 0; i < 1; i++) {
            C9311e c9311e = AbstractC6080e.f12753e;
            if (objArr[i] == null) {
                throw new NullPointerException(AbstractC1786e.admob(i, "at index "));
            }
        }
        C9311e c9311e2 = AbstractC6080e.f12753e;
        return new C2847e(1, objArr);
    }
}
