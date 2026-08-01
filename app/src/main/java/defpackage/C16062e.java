package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16062e extends AbstractC6484e {
    public static final Parcelable.Creator<C16062e> CREATOR = new C0928e(16);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public long f31622e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f31623e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long f31624e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public long f31625e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16062e) {
            C16062e c16062e = (C16062e) obj;
            if (AbstractC5729e.vip(Long.valueOf(this.f31625e), Long.valueOf(c16062e.f31625e)) && AbstractC5729e.vip(Integer.valueOf(this.f31623e), Integer.valueOf(c16062e.f31623e)) && AbstractC5729e.vip(Long.valueOf(this.f31622e), Long.valueOf(c16062e.f31622e)) && AbstractC5729e.vip(Long.valueOf(this.f31624e), Long.valueOf(c16062e.f31624e))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f31625e), Integer.valueOf(this.f31623e), Long.valueOf(this.f31622e), Long.valueOf(this.f31624e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        long j = this.f31625e;
        AbstractC16852e.isPro(parcel, 1, 8);
        parcel.writeLong(j);
        int i2 = this.f31623e;
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(i2);
        long j2 = this.f31622e;
        AbstractC16852e.isPro(parcel, 3, 8);
        parcel.writeLong(j2);
        long j3 = this.f31624e;
        AbstractC16852e.isPro(parcel, 4, 8);
        parcel.writeLong(j3);
        AbstractC16852e.ads(parcel, applovin);
    }
}
