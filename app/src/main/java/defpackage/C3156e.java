package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؗۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3156e extends AbstractC6484e {
    public static final Parcelable.Creator<C3156e> CREATOR = new C18517e(11);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f7253e;

    public C3156e(int i) {
        this.f7253e = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3156e) {
            if (this.f7253e == ((C3156e) obj).f7253e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(22, Integer.valueOf(this.f7253e));
    }

    public final String toString() {
        Locale locale = Locale.US;
        return AbstractC1634e.smaato("DataElement<type: DeviceType, value: ", this.f7253e, ">");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f7253e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
