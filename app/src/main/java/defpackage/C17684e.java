package defpackage;

import android.os.IBinder;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ٘ٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17684e implements IBinder.DeathRecipient {
    public final String ad;
    public final C9770e appmetrica;
    public final /* synthetic */ ServiceC13230e billing;
    public final C18287e license;
    public final int metrica;
    public final HashMap purchase = new HashMap();
    public final int vip;

    public C17684e(ServiceC13230e serviceC13230e, String str, int i, int i2, C9770e c9770e) {
        this.billing = serviceC13230e;
        this.ad = str;
        this.vip = i;
        this.metrica = i2;
        this.license = new C18287e(str, i, i2);
        this.appmetrica = c9770e;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.billing.f26258e.post(new RunnableC12991e(19, this));
    }
}
