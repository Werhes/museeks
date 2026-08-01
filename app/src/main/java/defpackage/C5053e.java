package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؗٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5053e extends AbstractC6484e {
    public static final Parcelable.Creator<C5053e> CREATOR = new C0928e(11);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Point[] f10844e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public C8121e f10845e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public C7753e f10846e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public String f10847e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C6360e f10848e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public C3470e f10849e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public String f10850e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public double f10851e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public byte[] f10852e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public boolean f10853e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C13731e f10854e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public C0256e f10855e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f10856e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public C12168e f10857e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f10858e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C5917e f10859e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C3173e f10860e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        int i2 = this.f10858e;
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(i2);
        AbstractC16852e.remoteconfig(parcel, 3, this.f10850e);
        AbstractC16852e.remoteconfig(parcel, 4, this.f10847e);
        int i3 = this.f10856e;
        AbstractC16852e.isPro(parcel, 5, 4);
        parcel.writeInt(i3);
        AbstractC16852e.tapsense(parcel, 6, this.f10844e, i);
        AbstractC16852e.subscription(parcel, 7, this.f10860e, i);
        AbstractC16852e.subscription(parcel, 8, this.f10859e, i);
        AbstractC16852e.subscription(parcel, 9, this.f10854e, i);
        AbstractC16852e.subscription(parcel, 10, this.f10857e, i);
        AbstractC16852e.subscription(parcel, 11, this.f10848e, i);
        AbstractC16852e.subscription(parcel, 12, this.f10855e, i);
        AbstractC16852e.subscription(parcel, 13, this.f10846e, i);
        AbstractC16852e.subscription(parcel, 14, this.f10845e, i);
        AbstractC16852e.subscription(parcel, 15, this.f10849e, i);
        AbstractC16852e.mopub(parcel, 16, this.f10852e);
        boolean z = this.f10853e;
        AbstractC16852e.isPro(parcel, 17, 4);
        parcel.writeInt(z ? 1 : 0);
        double d = this.f10851e;
        AbstractC16852e.isPro(parcel, 18, 8);
        parcel.writeDouble(d);
        AbstractC16852e.ads(parcel, applovin);
    }
}
