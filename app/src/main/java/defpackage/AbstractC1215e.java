package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؒٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1215e {
    public static final C18482e vip = new C18482e("Session", null);
    public final InterfaceC11791e ad;

    public AbstractC1215e(Context context, String str, String str2) {
        InterfaceC11791e interfaceC11791e;
        try {
            interfaceC11791e = AbstractC5672e.vip(context).m3629e(str, str2, new BinderC1109e(this));
        } catch (RemoteException | C13373e e) {
            AbstractC5672e.ad.ad(e, "Unable to call %s on %s.", "newSessionImpl", C13624e.class.getSimpleName());
            interfaceC11791e = null;
        }
        this.ad = interfaceC11791e;
    }

    public final void ad(int i) {
        InterfaceC11791e interfaceC11791e = this.ad;
        if (interfaceC11791e == null) {
            return;
        }
        try {
            C7706e c7706e = (C7706e) interfaceC11791e;
            Parcel m4156e = c7706e.m4156e();
            m4156e.writeInt(i);
            c7706e.m4155e(m4156e, 13);
        } catch (RemoteException e) {
            vip.ad(e, "Unable to call %s on %s.", "notifySessionEnded", InterfaceC11791e.class.getSimpleName());
        }
    }

    public final InterfaceC15751e metrica() {
        InterfaceC11791e interfaceC11791e = this.ad;
        if (interfaceC11791e != null) {
            try {
                C7706e c7706e = (C7706e) interfaceC11791e;
                Parcel m4154e = c7706e.m4154e(c7706e.m4156e(), 1);
                InterfaceC15751e m1404e = BinderC3838e.m1404e(m4154e.readStrongBinder());
                m4154e.recycle();
                return m1404e;
            } catch (RemoteException e) {
                vip.ad(e, "Unable to call %s on %s.", "getWrappedObject", InterfaceC11791e.class.getSimpleName());
            }
        }
        return null;
    }

    public final int vip() {
        AbstractC9528e.appmetrica();
        InterfaceC11791e interfaceC11791e = this.ad;
        if (interfaceC11791e != null) {
            try {
                C7706e c7706e = (C7706e) interfaceC11791e;
                Parcel m4154e = c7706e.m4154e(c7706e.m4156e(), 17);
                int readInt = m4154e.readInt();
                m4154e.recycle();
                if (readInt >= 211100000) {
                    C7706e c7706e2 = (C7706e) interfaceC11791e;
                    Parcel m4154e2 = c7706e2.m4154e(c7706e2.m4156e(), 18);
                    int readInt2 = m4154e2.readInt();
                    m4154e2.recycle();
                    return readInt2;
                }
            } catch (RemoteException e) {
                vip.ad(e, "Unable to call %s on %s.", "getSessionStartType", InterfaceC11791e.class.getSimpleName());
            }
        }
        return 0;
    }
}
