package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؕۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3612e extends AbstractC6484e {
    public static final Parcelable.Creator<C3612e> CREATOR = new C18517e(13);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f8153e;

    public C3612e(int i) {
        this.f8153e = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3612e) && this.f8153e == ((C3612e) obj).f8153e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8153e)});
    }

    public final String toString() {
        return AbstractC1786e.pro(new StringBuilder("PresenceAction[action="), this.f8153e, ']');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f8153e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
