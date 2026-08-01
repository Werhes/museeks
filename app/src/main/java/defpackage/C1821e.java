package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٔۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1821e extends AbstractC6484e {
    public static final Parcelable.Creator<C1821e> CREATOR = new C0928e(29);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f4902e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f4903e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f4904e;

    public C1821e(String str, int i, String str2) {
        this.f4904e = str;
        this.f4903e = str2;
        this.f4902e = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 1, this.f4904e);
        AbstractC16852e.remoteconfig(parcel, 2, this.f4903e);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f4902e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
