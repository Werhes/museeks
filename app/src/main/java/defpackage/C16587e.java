package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۢۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16587e extends AbstractC6484e {
    public static final Parcelable.Creator<C16587e> CREATOR = new C10765e(8);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f32539e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f32540e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f32541e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f32542e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f32543e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C12194e f32544e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C12194e f32545e;

    public C16587e(String str, String str2, String str3, String str4, String str5, C12194e c12194e, C12194e c12194e2) {
        this.f32543e = str;
        this.f32541e = str2;
        this.f32540e = str3;
        this.f32542e = str4;
        this.f32539e = str5;
        this.f32545e = c12194e;
        this.f32544e = c12194e2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 1, this.f32543e);
        AbstractC16852e.remoteconfig(parcel, 2, this.f32541e);
        AbstractC16852e.remoteconfig(parcel, 3, this.f32540e);
        AbstractC16852e.remoteconfig(parcel, 4, this.f32542e);
        AbstractC16852e.remoteconfig(parcel, 5, this.f32539e);
        AbstractC16852e.subscription(parcel, 6, this.f32545e, i);
        AbstractC16852e.subscription(parcel, 7, this.f32544e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
