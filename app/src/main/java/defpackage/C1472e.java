package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۦۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1472e extends AbstractC16277e implements InterfaceC2134e {
    public C1472e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 5);
    }

    @Override // defpackage.InterfaceC2134e
    public final int appmetrica() {
        Parcel m4150e = m4150e(m4156e(), 2);
        int readInt = m4150e.readInt();
        m4150e.recycle();
        return readInt;
    }

    @Override // defpackage.InterfaceC2134e
    /* renamed from: native, reason: not valid java name */
    public final void mo612native(String str, String str2, Bundle bundle, long j) {
        Parcel m4156e = m4156e();
        m4156e.writeString(str);
        m4156e.writeString(str2);
        AbstractC1757e.vip(m4156e, bundle);
        m4156e.writeLong(j);
        m4155e(m4156e, 1);
    }
}
