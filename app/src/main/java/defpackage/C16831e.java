package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٗۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16831e implements Comparable, Parcelable {
    public static final Parcelable.Creator<C16831e> CREATOR = new C1928e(28);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f32962e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f32963e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f32964e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f32965e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Calendar f32966e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public String f32967e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final long f32968e;

    public C16831e(Calendar calendar) {
        calendar.set(5, 1);
        Calendar ad = AbstractC12206e.ad(calendar);
        this.f32966e = ad;
        this.f32964e = ad.get(2);
        this.f32963e = ad.get(1);
        this.f32965e = ad.getMaximum(7);
        this.f32962e = ad.getActualMaximum(5);
        this.f32968e = ad.getTimeInMillis();
    }

    public static C16831e ad(int i, int i2) {
        Calendar metrica = AbstractC12206e.metrica(null);
        metrica.set(1, i);
        metrica.set(2, i2);
        return new C16831e(metrica);
    }

    public static C16831e vip(long j) {
        Calendar metrica = AbstractC12206e.metrica(null);
        metrica.setTimeInMillis(j);
        return new C16831e(metrica);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f32966e.compareTo(((C16831e) obj).f32966e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16831e)) {
            return false;
        }
        C16831e c16831e = (C16831e) obj;
        return this.f32964e == c16831e.f32964e && this.f32963e == c16831e.f32963e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f32964e), Integer.valueOf(this.f32963e)});
    }

    public final int license(C16831e c16831e) {
        if (!(this.f32966e instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (c16831e.f32964e - this.f32964e) + ((c16831e.f32963e - this.f32963e) * 12);
    }

    public final String metrica() {
        if (this.f32967e == null) {
            this.f32967e = AbstractC12026e.loadAd(this.f32966e.getTimeInMillis());
        }
        return this.f32967e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f32963e);
        parcel.writeInt(this.f32964e);
    }
}
