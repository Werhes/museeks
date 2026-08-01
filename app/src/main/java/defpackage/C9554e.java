package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٚؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9554e extends AbstractC6484e {
    public static final Parcelable.Creator<C9554e> CREATOR = new C0928e(1);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f18959e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f18960e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public byte[] f18961e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Bundle f18962e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f18963e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public String f18964e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final long f18965e;

    public C9554e(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.f18963e = j;
        this.f18961e = bArr;
        this.f18960e = str;
        this.f18962e = bundle;
        this.f18959e = i;
        this.f18965e = j2;
        this.f18964e = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 8);
        parcel.writeLong(this.f18963e);
        AbstractC16852e.mopub(parcel, 2, this.f18961e);
        AbstractC16852e.remoteconfig(parcel, 3, this.f18960e);
        AbstractC16852e.adcel(parcel, 4, this.f18962e);
        AbstractC16852e.isPro(parcel, 5, 4);
        parcel.writeInt(this.f18959e);
        AbstractC16852e.isPro(parcel, 6, 8);
        parcel.writeLong(this.f18965e);
        AbstractC16852e.remoteconfig(parcel, 7, this.f18964e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
