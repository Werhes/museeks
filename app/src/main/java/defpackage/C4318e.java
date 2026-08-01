package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۗۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4318e extends AbstractC6484e {
    public static final Parcelable.Creator<C4318e> CREATOR = new C6153e(26);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C13561e f9427e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f9428e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C16062e f9429e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C15924e f9430e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f9431e;

    public C4318e(String str, C16062e c16062e, int i, C15924e c15924e, C13561e c13561e) {
        this.f9431e = str;
        this.f9429e = c16062e;
        this.f9428e = i;
        this.f9430e = c15924e;
        this.f9427e = c13561e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4318e) {
            C4318e c4318e = (C4318e) obj;
            if (AbstractC5729e.vip(this.f9431e, c4318e.f9431e) && AbstractC5729e.vip(this.f9429e, c4318e.f9429e) && AbstractC5729e.vip(Integer.valueOf(this.f9428e), Integer.valueOf(c4318e.f9428e)) && AbstractC5729e.vip(this.f9430e, c4318e.f9430e) && AbstractC5729e.vip(this.f9427e, c4318e.f9427e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9431e, this.f9429e, Integer.valueOf(this.f9428e), this.f9430e, this.f9427e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 1, this.f9431e);
        AbstractC16852e.subscription(parcel, 2, this.f9429e, i);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f9428e);
        AbstractC16852e.subscription(parcel, 4, this.f9430e, i);
        AbstractC16852e.subscription(parcel, 5, this.f9427e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
