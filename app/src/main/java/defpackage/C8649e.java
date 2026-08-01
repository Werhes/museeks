package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌّ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8649e implements Parcelable {
    public static final Parcelable.Creator<C8649e> CREATOR = new C1928e(7);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f17464e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C7365e f17465e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C16831e f17466e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C16831e f17467e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C16831e f17468e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f17469e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f17470e;

    public C8649e(C16831e c16831e, C16831e c16831e2, C7365e c7365e, C16831e c16831e3, int i) {
        Objects.requireNonNull(c16831e, "start cannot be null");
        Objects.requireNonNull(c16831e2, "end cannot be null");
        Objects.requireNonNull(c7365e, "validator cannot be null");
        this.f17468e = c16831e;
        this.f17466e = c16831e2;
        this.f17467e = c16831e3;
        this.f17464e = i;
        this.f17465e = c7365e;
        if (c16831e3 != null && c16831e.f32966e.compareTo(c16831e3.f32966e) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c16831e3 != null && c16831e3.f32966e.compareTo(c16831e2.f32966e) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > AbstractC12206e.metrica(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f17469e = c16831e.license(c16831e2) + 1;
        this.f17470e = (c16831e2.f32963e - c16831e.f32963e) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8649e)) {
            return false;
        }
        C8649e c8649e = (C8649e) obj;
        return this.f17468e.equals(c8649e.f17468e) && this.f17466e.equals(c8649e.f17466e) && Objects.equals(this.f17467e, c8649e.f17467e) && this.f17464e == c8649e.f17464e && this.f17465e.equals(c8649e.f17465e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17468e, this.f17466e, this.f17467e, Integer.valueOf(this.f17464e), this.f17465e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f17468e, 0);
        parcel.writeParcelable(this.f17466e, 0);
        parcel.writeParcelable(this.f17467e, 0);
        parcel.writeParcelable(this.f17465e, 0);
        parcel.writeInt(this.f17464e);
    }
}
