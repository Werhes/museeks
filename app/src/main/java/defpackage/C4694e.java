package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؗۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4694e extends AbstractC6484e {
    public static final Parcelable.Creator<C4694e> CREATOR = new C1304e(16);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f10077e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C14758e f10078e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final IBinder f10079e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f10080e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f10081e;

    public C4694e(int i, IBinder iBinder, C14758e c14758e, boolean z, boolean z2) {
        this.f10081e = i;
        this.f10079e = iBinder;
        this.f10078e = c14758e;
        this.f10080e = z;
        this.f10077e = z2;
    }

    public final boolean equals(Object obj) {
        Object abstractC16277e;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4694e)) {
            return false;
        }
        C4694e c4694e = (C4694e) obj;
        if (!this.f10078e.equals(c4694e.f10078e)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.f10079e;
        if (iBinder == null) {
            abstractC16277e = null;
        } else {
            int i = AbstractBinderC17538e.license;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            abstractC16277e = queryLocalInterface instanceof InterfaceC6840e ? (InterfaceC6840e) queryLocalInterface : new AbstractC16277e(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
        }
        IBinder iBinder2 = c4694e.f10079e;
        if (iBinder2 != null) {
            int i2 = AbstractBinderC17538e.license;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof InterfaceC6840e ? (InterfaceC6840e) queryLocalInterface2 : new AbstractC16277e(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 2);
        }
        return AbstractC5729e.vip(abstractC16277e, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f10081e);
        AbstractC16852e.smaato(parcel, 2, this.f10079e);
        AbstractC16852e.subscription(parcel, 3, this.f10078e, i);
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(this.f10080e ? 1 : 0);
        AbstractC16852e.isPro(parcel, 5, 4);
        parcel.writeInt(this.f10077e ? 1 : 0);
        AbstractC16852e.ads(parcel, applovin);
    }
}
