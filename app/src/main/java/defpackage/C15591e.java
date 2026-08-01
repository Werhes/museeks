package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٜۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15591e extends AbstractC6484e {
    public static final Parcelable.Creator<C15591e> CREATOR = new C10765e(22);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public double f30760e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public List f30761e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public String f30762e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public List f30763e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f30764e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15591e)) {
            return false;
        }
        C15591e c15591e = (C15591e) obj;
        return this.f30764e == c15591e.f30764e && TextUtils.equals(this.f30762e, c15591e.f30762e) && AbstractC5729e.vip(this.f30761e, c15591e.f30761e) && AbstractC5729e.vip(this.f30763e, c15591e.f30763e) && this.f30760e == c15591e.f30760e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f30764e), this.f30762e, this.f30761e, this.f30763e, Double.valueOf(this.f30760e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        int i2 = this.f30764e;
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(i2);
        AbstractC16852e.remoteconfig(parcel, 3, this.f30762e);
        List list = this.f30761e;
        AbstractC16852e.isVip(parcel, 4, list == null ? null : DesugarCollections.unmodifiableList(list));
        List list2 = this.f30763e;
        AbstractC16852e.isVip(parcel, 5, list2 != null ? DesugarCollections.unmodifiableList(list2) : null);
        double d = this.f30760e;
        AbstractC16852e.isPro(parcel, 6, 8);
        parcel.writeDouble(d);
        AbstractC16852e.ads(parcel, applovin);
    }
}
