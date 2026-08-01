package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕ۟ٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15760e extends AbstractC6484e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f31035e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f31036e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f31037e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C18482e f31034e = new C18482e("VideoInfo", null);
    public static final Parcelable.Creator<C15760e> CREATOR = new C6153e(11);

    public C15760e(int i, int i2, int i3) {
        this.f31037e = i;
        this.f31036e = i2;
        this.f31035e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15760e)) {
            return false;
        }
        C15760e c15760e = (C15760e) obj;
        return this.f31036e == c15760e.f31036e && this.f31037e == c15760e.f31037e && this.f31035e == c15760e.f31035e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f31036e), Integer.valueOf(this.f31037e), Integer.valueOf(this.f31035e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f31037e);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f31036e);
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(this.f31035e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
