package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۘۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6611e extends AbstractC6484e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f13635e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f13636e;
    public static final Parcelable.Creator<C6611e> CREATOR = new C7075e(1);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C6611e f13633e = new C6611e(1, 3);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C6611e f13634e = new C6611e(1, 2);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C6611e f13632e = new C6611e(1, 1);

    public C6611e(int i, int i2) {
        this.f13636e = i;
        this.f13635e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6611e)) {
            return false;
        }
        C6611e c6611e = (C6611e) obj;
        return this.f13636e == c6611e.f13636e && this.f13635e == c6611e.f13635e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f13636e), Integer.valueOf(this.f13635e)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return AbstractC17861e.smaato(this.f13635e, "}", AbstractC10257e.smaato("Strategy(", f13633e.equals(this) ? "P2P_CLUSTER" : f13634e.equals(this) ? "P2P_STAR" : f13632e.equals(this) ? "P2P_POINT_TO_POINT" : "UNKNOWN", "){connectionType=", this.f13636e, ", topology="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f13636e);
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(this.f13635e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
