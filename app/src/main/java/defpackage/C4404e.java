package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖ۟ؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4404e extends AbstractC16277e implements InterfaceC17012e {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: eُٚۜ, reason: contains not printable characters */
    public final C4892e m1628e(BinderC3838e binderC3838e, C0622e c0622e) {
        C4892e c4892e;
        Parcel m4156e = m4156e();
        int i = AbstractC15518e.ad;
        m4156e.writeStrongBinder(binderC3838e);
        m4156e.writeInt(1);
        c0622e.writeToParcel(m4156e, 0);
        Parcel m4154e = m4154e(m4156e, 1);
        IBinder readStrongBinder = m4154e.readStrongBinder();
        if (readStrongBinder == null) {
            c4892e = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            c4892e = queryLocalInterface instanceof C4892e ? (C4892e) queryLocalInterface : new AbstractC16277e(readStrongBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector", 3);
        }
        m4154e.recycle();
        return c4892e;
    }
}
