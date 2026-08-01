package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍّٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14618e {
    public static final C18482e metrica = new C18482e("SessionManager", null);
    public final C9699e ad;
    public final Context vip;

    public C14618e(C9699e c9699e, Context context) {
        this.ad = c9699e;
        this.vip = context;
    }

    public final void ad(InterfaceC15135e interfaceC15135e) {
        AbstractC9528e.appmetrica();
        try {
            C9699e c9699e = this.ad;
            BinderC10556e binderC10556e = new BinderC10556e(interfaceC15135e);
            Parcel m4156e = c9699e.m4156e();
            AbstractC3336e.metrica(m4156e, binderC10556e);
            c9699e.m4155e(m4156e, 2);
        } catch (RemoteException e) {
            metrica.ad(e, "Unable to call %s on %s.", "addSessionManagerListener", C9699e.class.getSimpleName());
        }
    }

    public final AbstractC1215e metrica() {
        AbstractC9528e.appmetrica();
        try {
            C9699e c9699e = this.ad;
            Parcel m4154e = c9699e.m4154e(c9699e.m4156e(), 1);
            InterfaceC15751e m1404e = BinderC3838e.m1404e(m4154e.readStrongBinder());
            m4154e.recycle();
            return (AbstractC1215e) BinderC3838e.m1403e(m1404e);
        } catch (RemoteException e) {
            metrica.ad(e, "Unable to call %s on %s.", "getWrappedCurrentSession", C9699e.class.getSimpleName());
            return null;
        }
    }

    public final void vip(boolean z) {
        C18482e c18482e = metrica;
        AbstractC9528e.appmetrica();
        try {
            Log.i(c18482e.ad, c18482e.license("End session for %s", this.vip.getPackageName()));
            C9699e c9699e = this.ad;
            Parcel m4156e = c9699e.m4156e();
            int i = AbstractC3336e.ad;
            m4156e.writeInt(1);
            m4156e.writeInt(z ? 1 : 0);
            c9699e.m4155e(m4156e, 6);
        } catch (RemoteException e) {
            c18482e.ad(e, "Unable to call %s on %s.", "endCurrentSession", C9699e.class.getSimpleName());
        }
    }
}
