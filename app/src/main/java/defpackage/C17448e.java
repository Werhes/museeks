package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۨۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17448e extends AbstractC6484e {
    public static final Parcelable.Creator<C17448e> CREATOR = new C1318e(11);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f34172e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f34173e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f34174e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C17005e f34175e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public double f34176e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public double f34177e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C8023e f34178e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17448e)) {
            return false;
        }
        C17448e c17448e = (C17448e) obj;
        if (this.f34176e == c17448e.f34176e && this.f34174e == c17448e.f34174e && this.f34173e == c17448e.f34173e && AbstractC5942e.metrica(this.f34175e, c17448e.f34175e) && this.f34172e == c17448e.f34172e) {
            C8023e c8023e = this.f34178e;
            if (AbstractC5942e.metrica(c8023e, c8023e) && this.f34177e == c17448e.f34177e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f34176e), Boolean.valueOf(this.f34174e), Integer.valueOf(this.f34173e), this.f34175e, Integer.valueOf(this.f34172e), this.f34178e, Double.valueOf(this.f34177e)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.f34176e));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        double d = this.f34176e;
        AbstractC16852e.isPro(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z = this.f34174e;
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        int i2 = this.f34173e;
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(i2);
        AbstractC16852e.subscription(parcel, 5, this.f34175e, i);
        int i3 = this.f34172e;
        AbstractC16852e.isPro(parcel, 6, 4);
        parcel.writeInt(i3);
        AbstractC16852e.subscription(parcel, 7, this.f34178e, i);
        double d2 = this.f34177e;
        AbstractC16852e.isPro(parcel, 8, 8);
        parcel.writeDouble(d2);
        AbstractC16852e.ads(parcel, applovin);
    }
}
