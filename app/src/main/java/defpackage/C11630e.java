package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌِۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11630e extends AbstractC6484e {
    public static final Parcelable.Creator<C11630e> CREATOR = new C0928e(23);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f23331e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f23332e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f23333e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f23334e;

    public C11630e(int i, String str, String str2, String str3) {
        this.f23334e = i;
        this.f23332e = str;
        this.f23331e = str2;
        this.f23333e = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f23334e);
        AbstractC16852e.remoteconfig(parcel, 2, this.f23332e);
        AbstractC16852e.remoteconfig(parcel, 3, this.f23331e);
        AbstractC16852e.remoteconfig(parcel, 4, this.f23333e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
