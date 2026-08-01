package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٕؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2595e extends AbstractC6484e {
    public static final Parcelable.Creator<C2595e> CREATOR = new C6153e(10);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f6443e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f6444e;

    public C2595e(String str, String str2) {
        this.f6444e = str;
        this.f6443e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2595e)) {
            return false;
        }
        C2595e c2595e = (C2595e) obj;
        return AbstractC5942e.metrica(this.f6444e, c2595e.f6444e) && AbstractC5942e.metrica(this.f6443e, c2595e.f6443e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6444e, this.f6443e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 2, this.f6444e);
        AbstractC16852e.remoteconfig(parcel, 3, this.f6443e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
