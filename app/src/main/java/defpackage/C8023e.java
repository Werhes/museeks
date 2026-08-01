package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٚؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8023e extends AbstractC6484e {
    public static final Parcelable.Creator<C8023e> CREATOR = new C1318e(25);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C7125e f16306e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C7125e f16307e;

    public C8023e(C7125e c7125e, C7125e c7125e2) {
        this.f16307e = c7125e;
        this.f16306e = c7125e2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8023e)) {
            return false;
        }
        C8023e c8023e = (C8023e) obj;
        return AbstractC5942e.metrica(this.f16307e, c8023e.f16307e) && AbstractC5942e.metrica(this.f16306e, c8023e.f16306e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16307e, this.f16306e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.subscription(parcel, 2, this.f16307e, i);
        AbstractC16852e.subscription(parcel, 3, this.f16306e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
