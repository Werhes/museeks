package defpackage;

import android.app.Notification;
import android.os.Parcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؖٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3964e {
    public final String ad;
    public final Notification vip;

    public C3964e(String str, Notification notification) {
        this.ad = str;
        this.vip = notification;
    }

    public final void ad(InterfaceC12360e interfaceC12360e) {
        String str = this.ad;
        Notification notification = this.vip;
        C3371e c3371e = (C3371e) interfaceC12360e;
        c3371e.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC12360e.ad);
            obtain.writeString(str);
            obtain.writeInt(200);
            obtain.writeString(null);
            obtain.writeTypedObject(notification, 0);
            c3371e.metrica.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        return AbstractC1786e.signatures(new StringBuilder("NotifyTask[packageName:"), this.ad, ", id:200, tag:null]");
    }
}
