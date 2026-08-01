package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؓۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2006e extends AbstractC6484e {
    public static final Parcelable.Creator<C2006e> CREATOR = new C1318e(26);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public InterfaceC14876e f5246e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public String f5247e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C0059e f5248e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C13561e f5249e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[] f5250e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public InterfaceC16090e f5251e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C15924e f5252e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f5253e;

    public C2006e() {
        this.f5253e = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [eّٟٔ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [eٖ٘ؔ] */
    /* JADX WARN: Type inference failed for: r0v4, types: [eّٟٔ] */
    public C2006e(IBinder iBinder, IBinder iBinder2, String str, byte[] bArr, IBinder iBinder3, int i, C15924e c15924e, C13561e c13561e) {
        InterfaceC16090e c2018e;
        C0059e c0059e;
        ?? r0 = 0;
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
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IPayloadListener");
            r0 = queryLocalInterface3 instanceof InterfaceC14876e ? (InterfaceC14876e) queryLocalInterface3 : new AbstractC16277e(iBinder3, "com.google.android.gms.nearby.internal.connection.IPayloadListener", 4);
        }
        this.f5251e = c2018e;
        this.f5248e = c0059e;
        this.f5247e = str;
        this.f5250e = bArr;
        this.f5246e = r0;
        this.f5253e = i;
        this.f5252e = c15924e;
        this.f5249e = c13561e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2006e) {
            C2006e c2006e = (C2006e) obj;
            if (AbstractC5729e.vip(this.f5251e, c2006e.f5251e) && AbstractC5729e.vip(this.f5248e, c2006e.f5248e) && AbstractC5729e.vip(this.f5247e, c2006e.f5247e) && Arrays.equals(this.f5250e, c2006e.f5250e) && AbstractC5729e.vip(this.f5246e, c2006e.f5246e) && AbstractC5729e.vip(Integer.valueOf(this.f5253e), Integer.valueOf(c2006e.f5253e)) && AbstractC5729e.vip(this.f5252e, c2006e.f5252e) && AbstractC5729e.vip(this.f5249e, c2006e.f5249e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5251e, this.f5248e, this.f5247e, Integer.valueOf(Arrays.hashCode(this.f5250e)), this.f5246e, Integer.valueOf(this.f5253e), this.f5252e, this.f5249e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        InterfaceC16090e interfaceC16090e = this.f5251e;
        AbstractC16852e.smaato(parcel, 1, interfaceC16090e == null ? null : interfaceC16090e.asBinder());
        C0059e c0059e = this.f5248e;
        AbstractC16852e.smaato(parcel, 2, c0059e == null ? null : c0059e.license);
        AbstractC16852e.remoteconfig(parcel, 3, this.f5247e);
        AbstractC16852e.mopub(parcel, 4, this.f5250e);
        InterfaceC14876e interfaceC14876e = this.f5246e;
        AbstractC16852e.smaato(parcel, 5, interfaceC14876e != null ? interfaceC14876e.asBinder() : null);
        AbstractC16852e.isPro(parcel, 6, 4);
        parcel.writeInt(this.f5253e);
        AbstractC16852e.subscription(parcel, 7, this.f5252e, i);
        AbstractC16852e.subscription(parcel, 8, this.f5249e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
