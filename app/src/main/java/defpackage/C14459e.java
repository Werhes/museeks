package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؒ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14459e extends AbstractC6484e {
    public static final Parcelable.Creator<C14459e> CREATOR = new C0928e(28);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f28583e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f28584e;

    public C14459e(String str, String str2) {
        this.f28584e = str;
        this.f28583e = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 1, this.f28584e);
        AbstractC16852e.remoteconfig(parcel, 2, this.f28583e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
