package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٝٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15607e extends AbstractC6484e {
    public static final Parcelable.Creator<C15607e> CREATOR = new C10765e(9);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C9075e[] f30782e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f30783e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f30784e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C2349e[] f30785e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C14019e f30786e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C18030e[] f30787e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final String[] f30788e;

    public C15607e(C14019e c14019e, String str, String str2, C2349e[] c2349eArr, C9075e[] c9075eArr, String[] strArr, C18030e[] c18030eArr) {
        this.f30786e = c14019e;
        this.f30784e = str;
        this.f30783e = str2;
        this.f30785e = c2349eArr;
        this.f30782e = c9075eArr;
        this.f30788e = strArr;
        this.f30787e = c18030eArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.subscription(parcel, 1, this.f30786e, i);
        AbstractC16852e.remoteconfig(parcel, 2, this.f30784e);
        AbstractC16852e.remoteconfig(parcel, 3, this.f30783e);
        AbstractC16852e.tapsense(parcel, 4, this.f30785e, i);
        AbstractC16852e.tapsense(parcel, 5, this.f30782e, i);
        AbstractC16852e.pro(parcel, 6, this.f30788e);
        AbstractC16852e.tapsense(parcel, 7, this.f30787e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
