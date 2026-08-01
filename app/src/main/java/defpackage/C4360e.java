package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۚؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4360e extends AbstractC6484e {
    public static final Parcelable.Creator<C4360e> CREATOR = new C6153e(8);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Intent f9490e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f9491e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f9492e;

    public C4360e(int i, String str, Intent intent) {
        this.f9492e = i;
        this.f9491e = str;
        this.f9490e = intent;
    }

    public static C4360e billing(Activity activity) {
        return new C4360e(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4360e)) {
            return false;
        }
        C4360e c4360e = (C4360e) obj;
        return this.f9492e == c4360e.f9492e && Objects.equals(this.f9491e, c4360e.f9491e) && Objects.equals(this.f9490e, c4360e.f9490e);
    }

    public final int hashCode() {
        return this.f9492e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f9492e);
        AbstractC16852e.remoteconfig(parcel, 2, this.f9491e);
        AbstractC16852e.subscription(parcel, 3, this.f9490e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
