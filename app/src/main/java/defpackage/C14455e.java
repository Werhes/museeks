package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٔؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14455e extends AbstractC6484e {
    public static final Parcelable.Creator<C14455e> CREATOR = new C18517e(17);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f28567e;

    public C14455e(int i) {
        boolean z = false;
        if (i >= 0 && i <= 15) {
            z = true;
        }
        AbstractC9528e.metrica(z, "Sequence number should be 4 bits.");
        this.f28567e = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14455e) {
            if (this.f28567e == ((C14455e) obj).f28567e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(19, Integer.valueOf(this.f28567e));
    }

    public final String toString() {
        Locale locale = Locale.US;
        return AbstractC1634e.smaato("DataElement<type: ContextSequenceNumber, value: ", this.f28567e, ">");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f28567e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
