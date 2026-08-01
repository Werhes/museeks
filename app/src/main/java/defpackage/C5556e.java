package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘَُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5556e extends AbstractC6484e {
    public static final Parcelable.Creator<C5556e> CREATOR = new C0928e(25);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f11893e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f11894e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f11895e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f11896e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f11897e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final String f11898e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final String f11899e;

    public C5556e(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f11897e = str;
        this.f11895e = str2;
        this.f11894e = str3;
        this.f11896e = str4;
        this.f11893e = str5;
        this.f11899e = str6;
        this.f11898e = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 1, this.f11897e);
        AbstractC16852e.remoteconfig(parcel, 2, this.f11895e);
        AbstractC16852e.remoteconfig(parcel, 3, this.f11894e);
        AbstractC16852e.remoteconfig(parcel, 4, this.f11896e);
        AbstractC16852e.remoteconfig(parcel, 5, this.f11893e);
        AbstractC16852e.remoteconfig(parcel, 6, this.f11899e);
        AbstractC16852e.remoteconfig(parcel, 7, this.f11898e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
