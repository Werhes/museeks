package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.text.TextUtils;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۧؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0717e implements Runnable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C12636e f3007e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ String f3008e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C9770e f3009e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Bundle f3010e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f3011e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C12916e f3012e;

    public /* synthetic */ RunnableC0717e(C12916e c12916e, C9770e c9770e, String str, Bundle bundle, C12636e c12636e, int i) {
        this.f3011e = i;
        this.f3012e = c12916e;
        this.f3009e = c9770e;
        this.f3008e = str;
        this.f3010e = bundle;
        this.f3007e = c12636e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3011e) {
            case 0:
                IBinder binder = ((Messenger) this.f3009e.f19315e).getBinder();
                C12916e c12916e = this.f3012e;
                C17684e c17684e = (C17684e) ((ServiceC13230e) c12916e.f25784e).f26248e.get(binder);
                if (c17684e == null) {
                    AbstractC2803e.smaato("MBServiceCompat", "search for callback that isn't registered query=" + this.f3008e);
                    return;
                }
                ServiceC13230e serviceC13230e = (ServiceC13230e) c12916e.f25784e;
                String str = this.f3008e;
                C8597e c8597e = new C8597e(str, this.f3007e, 1);
                serviceC13230e.f26259e = c17684e;
                C18424e vip = serviceC13230e.vip();
                if (vip == null) {
                    c8597e.purchase(null);
                } else if (TextUtils.isEmpty(str)) {
                    AbstractC2803e.smaato("MLSLegacyStub", "Ignoring empty query from " + vip);
                    c8597e.purchase(null);
                } else if (vip.license instanceof C13340e) {
                    c8597e.ad();
                    AbstractC9413e.m2565strictfp(serviceC13230e.f26249e.advert, new RunnableC14110e(serviceC13230e, vip, c8597e, str, this.f3010e));
                }
                serviceC13230e.f26259e = null;
                if (!c8597e.vip()) {
                    throw new IllegalStateException(AbstractC17861e.Signature("onSearch must call detach() or sendResult() before returning for query=", str));
                }
                return;
            default:
                IBinder binder2 = ((Messenger) this.f3009e.f19315e).getBinder();
                C12916e c12916e2 = this.f3012e;
                C17684e c17684e2 = (C17684e) ((ServiceC13230e) c12916e2.f25784e).f26248e.get(binder2);
                Bundle bundle = this.f3010e;
                if (c17684e2 == null) {
                    AbstractC2803e.smaato("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.f3008e + ", extras=" + bundle);
                    return;
                }
                ServiceC13230e serviceC13230e2 = (ServiceC13230e) c12916e2.f25784e;
                String str2 = this.f3008e;
                C8597e c8597e2 = new C8597e(str2, this.f3007e, 2);
                serviceC13230e2.f26259e = c17684e2;
                Bundle bundle2 = bundle == null ? Bundle.EMPTY : bundle;
                C18424e vip2 = serviceC13230e2.vip();
                if (vip2 == null) {
                    c8597e2.appmetrica();
                } else {
                    c8597e2.ad();
                    AbstractC9413e.m2565strictfp(serviceC13230e2.f26249e.advert, new RunnableC14110e(serviceC13230e2, str2, vip2, c8597e2, bundle2));
                }
                serviceC13230e2.f26259e = null;
                if (c8597e2.vip()) {
                    return;
                }
                throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str2 + " extras=" + bundle);
        }
    }
}
