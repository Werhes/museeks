package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC2498e extends AbstractBinderC8216e implements InterfaceC8945e {
    public static InterfaceC8945e asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        return queryLocalInterface instanceof InterfaceC8945e ? (InterfaceC8945e) queryLocalInterface : new C10931e(iBinder);
    }
}
