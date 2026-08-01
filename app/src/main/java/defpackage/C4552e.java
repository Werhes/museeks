package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؗؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4552e extends AbstractC6484e {
    public static final Parcelable.Creator<C4552e> CREATOR = new C6153e(24);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C13561e f9835e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f9836e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f9837e;

    public C4552e(String str, int i, C13561e c13561e) {
        this.f9837e = str;
        this.f9836e = i;
        this.f9835e = c13561e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4552e) {
            C4552e c4552e = (C4552e) obj;
            if (AbstractC5729e.vip(this.f9837e, c4552e.f9837e) && AbstractC5729e.vip(Integer.valueOf(this.f9836e), Integer.valueOf(c4552e.f9836e)) && AbstractC5729e.vip(this.f9835e, c4552e.f9835e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9837e, Integer.valueOf(this.f9836e), this.f9835e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 1, this.f9837e);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f9836e);
        AbstractC16852e.subscription(parcel, 3, this.f9835e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
