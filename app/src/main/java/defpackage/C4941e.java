package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؗٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4941e extends AbstractC6484e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f10454e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C10439e f10455e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f10456e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C1727e f10457e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f10458e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f10459e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C18482e f10453e = new C18482e("CastMediaOptions", null);
    public static final Parcelable.Creator<C4941e> CREATOR = new C1318e(1);

    /* JADX WARN: Multi-variable type inference failed */
    public C4941e(String str, String str2, IBinder iBinder, C1727e c1727e, boolean z, boolean z2) {
        C10439e c10439e;
        this.f10458e = str;
        this.f10456e = str2;
        if (iBinder == null) {
            c10439e = 0;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            c10439e = queryLocalInterface instanceof C10439e ? (C10439e) queryLocalInterface : new AbstractC16277e(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", 1);
        }
        this.f10455e = c10439e;
        this.f10457e = c1727e;
        this.f10454e = z;
        this.f10459e = z2;
    }

    public final void billing() {
        C10439e c10439e = this.f10455e;
        if (c10439e != null) {
            try {
                Parcel m4154e = c10439e.m4154e(c10439e.m4156e(), 2);
                InterfaceC15751e m1404e = BinderC3838e.m1404e(m4154e.readStrongBinder());
                m4154e.recycle();
                if (BinderC3838e.m1403e(m1404e) == null) {
                } else {
                    throw new ClassCastException();
                }
            } catch (RemoteException e) {
                f10453e.ad(e, "Unable to call %s on %s.", "getWrappedClientObject", C10439e.class.getSimpleName());
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 2, this.f10458e);
        AbstractC16852e.remoteconfig(parcel, 3, this.f10456e);
        C10439e c10439e = this.f10455e;
        AbstractC16852e.smaato(parcel, 4, c10439e == null ? null : c10439e.license);
        AbstractC16852e.subscription(parcel, 5, this.f10457e, i);
        AbstractC16852e.isPro(parcel, 6, 4);
        parcel.writeInt(this.f10454e ? 1 : 0);
        AbstractC16852e.isPro(parcel, 7, 4);
        parcel.writeInt(this.f10459e ? 1 : 0);
        AbstractC16852e.ads(parcel, applovin);
    }
}
