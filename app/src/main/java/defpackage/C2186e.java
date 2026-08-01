package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٕؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2186e extends AbstractC6484e {
    public static final Parcelable.Creator<C2186e> CREATOR = new C6153e(20);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C15924e f5550e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f5551e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f5552e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f5553e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f5554e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C13561e f5555e;

    public C2186e(String str, int i, byte[] bArr, int i2, C15924e c15924e, C13561e c13561e) {
        this.f5554e = str;
        this.f5552e = i;
        this.f5551e = bArr;
        this.f5553e = i2;
        this.f5550e = c15924e;
        this.f5555e = c13561e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2186e) {
            C2186e c2186e = (C2186e) obj;
            if (AbstractC5729e.vip(this.f5554e, c2186e.f5554e) && AbstractC5729e.vip(Integer.valueOf(this.f5552e), Integer.valueOf(c2186e.f5552e)) && Arrays.equals(this.f5551e, c2186e.f5551e) && AbstractC5729e.vip(Integer.valueOf(this.f5553e), Integer.valueOf(c2186e.f5553e)) && AbstractC5729e.vip(this.f5550e, c2186e.f5550e) && AbstractC5729e.vip(this.f5555e, c2186e.f5555e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5554e, Integer.valueOf(this.f5552e), Integer.valueOf(Arrays.hashCode(this.f5551e)), Integer.valueOf(this.f5553e), this.f5550e, this.f5555e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 1, this.f5554e);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f5552e);
        AbstractC16852e.mopub(parcel, 3, this.f5551e);
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(this.f5553e);
        AbstractC16852e.subscription(parcel, 5, this.f5550e, i);
        AbstractC16852e.subscription(parcel, 6, this.f5555e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
