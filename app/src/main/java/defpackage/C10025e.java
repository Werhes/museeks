package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؔٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10025e {
    public final /* synthetic */ C10078e ad;

    public C10025e(C10078e c10078e) {
        this.ad = c10078e;
    }

    public final void ad() {
        C10078e c10078e = this.ad;
        if (c10078e.appmetrica == null) {
            return;
        }
        try {
            C5710e c5710e = c10078e.adcel;
            if (c5710e != null) {
                c5710e.amazon();
            }
            C13560e c13560e = (C13560e) c10078e.appmetrica;
            Parcel m4156e = c13560e.m4156e();
            int i = AbstractC3336e.ad;
            m4156e.writeInt(0);
            c13560e.m4155e(m4156e, 1);
        } catch (RemoteException e) {
            C10078e.smaato.ad(e, "Unable to call %s on %s.", "onConnected", InterfaceC4112e.class.getSimpleName());
        }
        C10182e c10182e = c10078e.advert;
        if (c10182e != null) {
            ((C11328e) c10182e.f20137e).ad(new C11742e(new C7306e(3)));
        }
    }
}
