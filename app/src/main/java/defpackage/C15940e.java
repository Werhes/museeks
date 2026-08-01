package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؒۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15940e extends AbstractC6484e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f31397e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f31398e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f31399e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f31400e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C18482e f31396e = new C18482e("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<C15940e> CREATOR = new C10765e(18);

    public C15940e(long j, long j2, boolean z, boolean z2) {
        this.f31400e = Math.max(j, 0L);
        this.f31398e = Math.max(j2, 0L);
        this.f31397e = z;
        this.f31399e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15940e)) {
            return false;
        }
        C15940e c15940e = (C15940e) obj;
        return this.f31400e == c15940e.f31400e && this.f31398e == c15940e.f31398e && this.f31397e == c15940e.f31397e && this.f31399e == c15940e.f31399e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f31400e), Long.valueOf(this.f31398e), Boolean.valueOf(this.f31397e), Boolean.valueOf(this.f31399e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 2, 8);
        parcel.writeLong(this.f31400e);
        AbstractC16852e.isPro(parcel, 3, 8);
        parcel.writeLong(this.f31398e);
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(this.f31397e ? 1 : 0);
        AbstractC16852e.isPro(parcel, 5, 4);
        parcel.writeInt(this.f31399e ? 1 : 0);
        AbstractC16852e.ads(parcel, applovin);
    }
}
