package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7210e extends AbstractC6484e {
    public static final Parcelable.Creator<C7210e> CREATOR = new C18517e(4);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public String f14719e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public String f14720e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public long f14721e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public byte[] f14722e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public boolean f14723e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public String f14724e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f14725e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Uri f14726e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public C9505e f14727e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public ParcelFileDescriptor f14728e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public long f14729e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public long f14730e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public ParcelFileDescriptor f14731e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public long f14732e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7210e) {
            C7210e c7210e = (C7210e) obj;
            if (AbstractC5729e.vip(Long.valueOf(this.f14730e), Long.valueOf(c7210e.f14730e)) && AbstractC5729e.vip(Integer.valueOf(this.f14725e), Integer.valueOf(c7210e.f14725e)) && Arrays.equals(this.f14722e, c7210e.f14722e) && AbstractC5729e.vip(this.f14728e, c7210e.f14728e) && AbstractC5729e.vip(this.f14719e, c7210e.f14719e) && AbstractC5729e.vip(Long.valueOf(this.f14732e), Long.valueOf(c7210e.f14732e)) && AbstractC5729e.vip(this.f14731e, c7210e.f14731e) && AbstractC5729e.vip(this.f14726e, c7210e.f14726e) && AbstractC5729e.vip(Long.valueOf(this.f14729e), Long.valueOf(c7210e.f14729e)) && AbstractC5729e.vip(Boolean.valueOf(this.f14723e), Boolean.valueOf(c7210e.f14723e)) && AbstractC5729e.vip(this.f14727e, c7210e.f14727e) && AbstractC5729e.vip(Long.valueOf(this.f14721e), Long.valueOf(c7210e.f14721e)) && AbstractC5729e.vip(this.f14720e, c7210e.f14720e) && AbstractC5729e.vip(this.f14724e, c7210e.f14724e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f14730e), Integer.valueOf(this.f14725e), Integer.valueOf(Arrays.hashCode(this.f14722e)), this.f14728e, this.f14719e, Long.valueOf(this.f14732e), this.f14731e, this.f14726e, Long.valueOf(this.f14729e), Boolean.valueOf(this.f14723e), this.f14727e, Long.valueOf(this.f14721e), this.f14720e, this.f14724e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        long j = this.f14730e;
        AbstractC16852e.isPro(parcel, 1, 8);
        parcel.writeLong(j);
        int i2 = this.f14725e;
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(i2);
        AbstractC16852e.mopub(parcel, 3, this.f14722e);
        AbstractC16852e.subscription(parcel, 4, this.f14728e, i);
        AbstractC16852e.remoteconfig(parcel, 5, this.f14719e);
        long j2 = this.f14732e;
        AbstractC16852e.isPro(parcel, 6, 8);
        parcel.writeLong(j2);
        AbstractC16852e.subscription(parcel, 7, this.f14731e, i);
        AbstractC16852e.subscription(parcel, 8, this.f14726e, i);
        long j3 = this.f14729e;
        AbstractC16852e.isPro(parcel, 9, 8);
        parcel.writeLong(j3);
        boolean z = this.f14723e;
        AbstractC16852e.isPro(parcel, 10, 4);
        parcel.writeInt(z ? 1 : 0);
        AbstractC16852e.subscription(parcel, 11, this.f14727e, i);
        long j4 = this.f14721e;
        AbstractC16852e.isPro(parcel, 12, 8);
        parcel.writeLong(j4);
        AbstractC16852e.remoteconfig(parcel, 13, this.f14720e);
        AbstractC16852e.remoteconfig(parcel, 14, this.f14724e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
