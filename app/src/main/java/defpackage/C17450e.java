package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۨۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17450e extends AbstractC6484e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final long f34180e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f34181e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f34182e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f34183e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f34184e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C18482e f34179e = new C18482e("AdBreakStatus", null);
    public static final Parcelable.Creator<C17450e> CREATOR = new C6153e(0);

    public C17450e(long j, long j2, String str, String str2, long j3) {
        this.f34184e = j;
        this.f34182e = j2;
        this.f34181e = str;
        this.f34183e = str2;
        this.f34180e = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17450e)) {
            return false;
        }
        C17450e c17450e = (C17450e) obj;
        return this.f34184e == c17450e.f34184e && this.f34182e == c17450e.f34182e && AbstractC5942e.metrica(this.f34181e, c17450e.f34181e) && AbstractC5942e.metrica(this.f34183e, c17450e.f34183e) && this.f34180e == c17450e.f34180e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f34184e), Long.valueOf(this.f34182e), this.f34181e, this.f34183e, Long.valueOf(this.f34180e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 2, 8);
        parcel.writeLong(this.f34184e);
        AbstractC16852e.isPro(parcel, 3, 8);
        parcel.writeLong(this.f34182e);
        AbstractC16852e.remoteconfig(parcel, 4, this.f34181e);
        AbstractC16852e.remoteconfig(parcel, 5, this.f34183e);
        AbstractC16852e.isPro(parcel, 6, 8);
        parcel.writeLong(this.f34180e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
