package defpackage;

import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘّۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5854e extends AbstractC5735e {
    public final /* synthetic */ C17684e appmetrica;
    public final /* synthetic */ Bundle billing;
    public final /* synthetic */ String purchase;
    public final /* synthetic */ ServiceC13230e startapp;
    public final /* synthetic */ Bundle yandex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5854e(ServiceC13230e serviceC13230e, String str, C17684e c17684e, String str2, Bundle bundle, Bundle bundle2) {
        super(str);
        this.startapp = serviceC13230e;
        this.appmetrica = c17684e;
        this.purchase = str2;
        this.billing = bundle;
        this.yandex = bundle2;
    }

    @Override // defpackage.AbstractC5735e
    public final void license(Object obj) {
        List list = (List) obj;
        C2271e c2271e = this.startapp.f26248e;
        C17684e c17684e = this.appmetrica;
        C9770e c9770e = c17684e.appmetrica;
        String str = c17684e.ad;
        c9770e.getClass();
        Object obj2 = c2271e.get(((Messenger) c9770e.f19315e).getBinder());
        String str2 = this.purchase;
        if (obj2 != c17684e) {
            AbstractC2803e.license("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + str + " id=" + str2);
            return;
        }
        try {
            c9770e.inmobi(str2, list, this.billing, this.yandex);
        } catch (RemoteException unused) {
            AbstractC2803e.smaato("MBServiceCompat", "Calling onLoadChildren() failed for id=" + str2 + " package=" + str);
        }
    }
}
