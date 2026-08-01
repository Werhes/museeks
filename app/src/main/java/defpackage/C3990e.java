package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌِؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3990e extends AbstractC6484e {
    public static final Parcelable.Creator<C3990e> CREATOR = new C18517e(8);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f8904e;

    public C3990e(String str) {
        AbstractC9528e.metrica(str.length() <= 32, "Cast id should be at most 32 characters.");
        this.f8904e = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3990e)) {
            return false;
        }
        return Objects.equals(this.f8904e, ((C3990e) obj).f8904e);
    }

    public final int hashCode() {
        return Objects.hash(17, this.f8904e);
    }

    public final String toString() {
        Locale locale = Locale.US;
        return AbstractC5087e.m1746extends("DataElement<type: CastId, Id: ", this.f8904e, ">");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 1, this.f8904e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
