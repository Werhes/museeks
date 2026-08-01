package com.google.firebase;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC3743e;
import defpackage.AbstractC6874e;
import defpackage.C1400e;
import defpackage.C16628e;
import defpackage.C16786e;
import defpackage.C17647e;
import defpackage.C5438e;
import defpackage.C7259e;
import defpackage.C8625e;
import defpackage.C9237e;
import defpackage.InterfaceC10123e;
import defpackage.InterfaceC13161e;
import defpackage.InterfaceC4086e;
import defpackage.InterfaceC7549e;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", BuildConfig.FLAVOR, "Leؚؚٚ;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C7259e> getComponents() {
        C9237e ad = C7259e.ad(new C16786e(InterfaceC7549e.class, AbstractC3743e.class));
        ad.ad(new C8625e(new C16786e(InterfaceC7549e.class, Executor.class), 1, 0));
        ad.billing = C1400e.f4196e;
        C7259e vip = ad.vip();
        C9237e ad2 = C7259e.ad(new C16786e(InterfaceC4086e.class, AbstractC3743e.class));
        ad2.ad(new C8625e(new C16786e(InterfaceC4086e.class, Executor.class), 1, 0));
        ad2.billing = C17647e.f34592e;
        C7259e vip2 = ad2.vip();
        C9237e ad3 = C7259e.ad(new C16786e(InterfaceC10123e.class, AbstractC3743e.class));
        ad3.ad(new C8625e(new C16786e(InterfaceC10123e.class, Executor.class), 1, 0));
        ad3.billing = C16628e.f32593e;
        C7259e vip3 = ad3.vip();
        C9237e ad4 = C7259e.ad(new C16786e(InterfaceC13161e.class, AbstractC3743e.class));
        ad4.ad(new C8625e(new C16786e(InterfaceC13161e.class, Executor.class), 1, 0));
        ad4.billing = C5438e.f11691e;
        return AbstractC6874e.startapp(vip, vip2, vip3, ad4.vip());
    }
}
