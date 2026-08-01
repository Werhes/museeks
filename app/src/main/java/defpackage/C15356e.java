package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15356e extends AbstractC6484e {
    public static final Parcelable.Creator<C15356e> CREATOR = new C6153e(13);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final ArrayList f30281e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f30282e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f30283e;

    public C15356e(String str, byte[] bArr, ArrayList arrayList) {
        this.f30283e = str;
        this.f30282e = bArr;
        this.f30281e = arrayList == null ? new ArrayList(0) : new ArrayList(arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15356e)) {
            return false;
        }
        C15356e c15356e = (C15356e) obj;
        return AbstractC5729e.vip(this.f30283e, c15356e.f30283e) && AbstractC5729e.vip(this.f30282e, c15356e.f30282e) && AbstractC5729e.vip(this.f30281e, c15356e.f30281e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30283e, this.f30282e, this.f30281e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 1, this.f30283e);
        AbstractC16852e.mopub(parcel, 2, this.f30282e);
        AbstractC16852e.loadAd(parcel, 3, new ArrayList(this.f30281e));
        AbstractC16852e.ads(parcel, applovin);
    }
}
