package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10806e extends AbstractC6484e {
    public static final Parcelable.Creator<C10806e> CREATOR = new C10765e(24);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C15591e f21424e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f21425e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public boolean f21426e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public String f21427e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f21428e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public String f21429e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public long f21430e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public String f21431e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public List f21432e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f21433e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10806e)) {
            return false;
        }
        C10806e c10806e = (C10806e) obj;
        return TextUtils.equals(this.f21431e, c10806e.f21431e) && TextUtils.equals(this.f21427e, c10806e.f21427e) && this.f21425e == c10806e.f21425e && TextUtils.equals(this.f21429e, c10806e.f21429e) && AbstractC5729e.vip(this.f21424e, c10806e.f21424e) && this.f21433e == c10806e.f21433e && AbstractC5729e.vip(this.f21432e, c10806e.f21432e) && this.f21428e == c10806e.f21428e && this.f21430e == c10806e.f21430e && this.f21426e == c10806e.f21426e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21431e, this.f21427e, Integer.valueOf(this.f21425e), this.f21429e, this.f21424e, Integer.valueOf(this.f21433e), this.f21432e, Integer.valueOf(this.f21428e), Long.valueOf(this.f21430e), Boolean.valueOf(this.f21426e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 2, this.f21431e);
        AbstractC16852e.remoteconfig(parcel, 3, this.f21427e);
        int i2 = this.f21425e;
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(i2);
        AbstractC16852e.remoteconfig(parcel, 5, this.f21429e);
        AbstractC16852e.subscription(parcel, 6, this.f21424e, i);
        int i3 = this.f21433e;
        AbstractC16852e.isPro(parcel, 7, 4);
        parcel.writeInt(i3);
        List list = this.f21432e;
        AbstractC16852e.isVip(parcel, 8, list == null ? null : DesugarCollections.unmodifiableList(list));
        int i4 = this.f21428e;
        AbstractC16852e.isPro(parcel, 9, 4);
        parcel.writeInt(i4);
        long j = this.f21430e;
        AbstractC16852e.isPro(parcel, 10, 8);
        parcel.writeLong(j);
        boolean z = this.f21426e;
        AbstractC16852e.isPro(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        AbstractC16852e.ads(parcel, applovin);
    }
}
