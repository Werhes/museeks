package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٓؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13731e extends AbstractC6484e {
    public static final Parcelable.Creator<C13731e> CREATOR = new C1318e(12);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public String f27209e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public String f27210e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 2, this.f27210e);
        AbstractC16852e.remoteconfig(parcel, 3, this.f27209e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
