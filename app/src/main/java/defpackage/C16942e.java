package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٗؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16942e extends AbstractC6484e {
    public static final Parcelable.Creator<C16942e> CREATOR = new C6153e(22);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C13561e f33178e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C10627e f33179e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f33180e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f33181e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f33182e;

    public C16942e(String str, int i, C10627e c10627e, int i2, C13561e c13561e) {
        this.f33182e = str;
        this.f33180e = i;
        this.f33179e = c10627e;
        this.f33181e = i2;
        this.f33178e = c13561e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16942e) {
            C16942e c16942e = (C16942e) obj;
            if (AbstractC5729e.vip(this.f33182e, c16942e.f33182e) && AbstractC5729e.vip(Integer.valueOf(this.f33180e), Integer.valueOf(c16942e.f33180e)) && AbstractC5729e.vip(this.f33179e, c16942e.f33179e) && AbstractC5729e.vip(Integer.valueOf(this.f33181e), Integer.valueOf(c16942e.f33181e)) && AbstractC5729e.vip(this.f33178e, c16942e.f33178e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33182e, Integer.valueOf(this.f33180e), this.f33179e, Integer.valueOf(this.f33181e), this.f33178e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 1, this.f33182e);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f33180e);
        AbstractC16852e.subscription(parcel, 3, this.f33179e, i);
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(this.f33181e);
        AbstractC16852e.subscription(parcel, 5, this.f33178e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
