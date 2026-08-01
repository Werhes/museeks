package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٓۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14019e extends AbstractC6484e {
    public static final Parcelable.Creator<C14019e> CREATOR = new C10765e(23);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f27738e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f27739e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f27740e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f27741e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f27742e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final String f27743e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final String f27744e;

    public C14019e(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f27742e = str;
        this.f27740e = str2;
        this.f27739e = str3;
        this.f27741e = str4;
        this.f27738e = str5;
        this.f27744e = str6;
        this.f27743e = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 1, this.f27742e);
        AbstractC16852e.remoteconfig(parcel, 2, this.f27740e);
        AbstractC16852e.remoteconfig(parcel, 3, this.f27739e);
        AbstractC16852e.remoteconfig(parcel, 4, this.f27741e);
        AbstractC16852e.remoteconfig(parcel, 5, this.f27738e);
        AbstractC16852e.remoteconfig(parcel, 6, this.f27744e);
        AbstractC16852e.remoteconfig(parcel, 7, this.f27743e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
