package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٖٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16207e extends AbstractC6484e {
    public static final Parcelable.Creator<C16207e> CREATOR = new C18517e(5);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public String f31826e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final byte[] f31827e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C13561e f31828e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C1918e f31829e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final int f31830e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final String f31831e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C0059e f31832e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final byte[] f31833e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C15924e f31834e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public String f31835e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C15661e f31836e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public InterfaceC16090e f31837e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public InterfaceC0664e f31838e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final byte[] f31839e;

    public C16207e() {
        this.f31830e = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C16207e(IBinder iBinder, IBinder iBinder2, IBinder iBinder3, String str, String str2, byte[] bArr, IBinder iBinder4, byte[] bArr2, C15661e c15661e, int i, C15924e c15924e, C13561e c13561e, byte[] bArr3, String str3) {
        InterfaceC16090e c2018e;
        C0059e c0059e;
        C1918e c1918e;
        InterfaceC0664e interfaceC0664e = null;
        if (iBinder == null) {
            c2018e = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            c2018e = queryLocalInterface instanceof InterfaceC16090e ? (InterfaceC16090e) queryLocalInterface : new C2018e(iBinder);
        }
        if (iBinder2 == null) {
            c0059e = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionEventListener");
            c0059e = queryLocalInterface2 instanceof C0059e ? (C0059e) queryLocalInterface2 : new C0059e(iBinder2);
        }
        if (iBinder3 == null) {
            c1918e = 0;
        } else {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionResponseListener");
            c1918e = queryLocalInterface3 instanceof C1918e ? (C1918e) queryLocalInterface3 : new AbstractC16277e(iBinder3, "com.google.android.gms.nearby.internal.connection.IConnectionResponseListener", 4);
        }
        if (iBinder4 != null) {
            IInterface queryLocalInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
            interfaceC0664e = queryLocalInterface4 instanceof InterfaceC0664e ? (InterfaceC0664e) queryLocalInterface4 : new C8714e(iBinder4);
        }
        this.f31837e = c2018e;
        this.f31832e = c0059e;
        this.f31829e = c1918e;
        this.f31835e = str;
        this.f31826e = str2;
        this.f31839e = bArr;
        this.f31838e = interfaceC0664e;
        this.f31833e = bArr2;
        this.f31836e = c15661e;
        this.f31830e = i;
        this.f31834e = c15924e;
        this.f31828e = c13561e;
        this.f31827e = bArr3;
        this.f31831e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16207e) {
            C16207e c16207e = (C16207e) obj;
            if (AbstractC5729e.vip(this.f31837e, c16207e.f31837e) && AbstractC5729e.vip(this.f31832e, c16207e.f31832e) && AbstractC5729e.vip(this.f31829e, c16207e.f31829e) && AbstractC5729e.vip(this.f31835e, c16207e.f31835e) && AbstractC5729e.vip(this.f31826e, c16207e.f31826e) && Arrays.equals(this.f31839e, c16207e.f31839e) && AbstractC5729e.vip(this.f31838e, c16207e.f31838e) && Arrays.equals(this.f31833e, c16207e.f31833e) && AbstractC5729e.vip(this.f31836e, c16207e.f31836e) && AbstractC5729e.vip(Integer.valueOf(this.f31830e), Integer.valueOf(c16207e.f31830e)) && AbstractC5729e.vip(this.f31834e, c16207e.f31834e) && AbstractC5729e.vip(this.f31828e, c16207e.f31828e) && Arrays.equals(this.f31827e, c16207e.f31827e) && AbstractC5729e.vip(this.f31831e, c16207e.f31831e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31837e, this.f31832e, this.f31829e, this.f31835e, this.f31826e, Integer.valueOf(Arrays.hashCode(this.f31839e)), this.f31838e, Integer.valueOf(Arrays.hashCode(this.f31833e)), this.f31836e, Integer.valueOf(this.f31830e), this.f31834e, this.f31828e, Integer.valueOf(Arrays.hashCode(this.f31827e)), this.f31831e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        InterfaceC16090e interfaceC16090e = this.f31837e;
        AbstractC16852e.smaato(parcel, 1, interfaceC16090e == null ? null : interfaceC16090e.asBinder());
        C0059e c0059e = this.f31832e;
        AbstractC16852e.smaato(parcel, 2, c0059e == null ? null : c0059e.license);
        C1918e c1918e = this.f31829e;
        AbstractC16852e.smaato(parcel, 3, c1918e == null ? null : c1918e.license);
        AbstractC16852e.remoteconfig(parcel, 4, this.f31835e);
        AbstractC16852e.remoteconfig(parcel, 5, this.f31826e);
        AbstractC16852e.mopub(parcel, 6, this.f31839e);
        InterfaceC0664e interfaceC0664e = this.f31838e;
        AbstractC16852e.smaato(parcel, 7, interfaceC0664e != null ? interfaceC0664e.asBinder() : null);
        AbstractC16852e.mopub(parcel, 8, this.f31833e);
        AbstractC16852e.subscription(parcel, 9, this.f31836e, i);
        AbstractC16852e.isPro(parcel, 10, 4);
        parcel.writeInt(this.f31830e);
        AbstractC16852e.subscription(parcel, 11, this.f31834e, i);
        AbstractC16852e.mopub(parcel, 12, this.f31827e);
        AbstractC16852e.remoteconfig(parcel, 13, this.f31831e);
        AbstractC16852e.subscription(parcel, 14, this.f31828e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
