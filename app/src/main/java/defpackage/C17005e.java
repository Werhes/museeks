package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٗٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17005e extends AbstractC6484e {
    public static final Parcelable.Creator<C17005e> CREATOR = new C6153e(6);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Uri f33307e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final List f33308e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final int f33309e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f33310e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final Boolean f33311e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f33312e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final Boolean f33313e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f33314e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final String f33315e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final String f33316e;

    public C17005e(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2, int i) {
        this.f33314e = str;
        this.f33310e = str2;
        this.f33308e = arrayList;
        this.f33312e = str3;
        this.f33307e = uri;
        this.f33316e = str4;
        this.f33315e = str5;
        this.f33311e = bool;
        this.f33313e = bool2;
        this.f33309e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17005e)) {
            return false;
        }
        C17005e c17005e = (C17005e) obj;
        return AbstractC5942e.metrica(this.f33314e, c17005e.f33314e) && AbstractC5942e.metrica(this.f33310e, c17005e.f33310e) && AbstractC5942e.metrica(this.f33308e, c17005e.f33308e) && AbstractC5942e.metrica(this.f33312e, c17005e.f33312e) && AbstractC5942e.metrica(this.f33307e, c17005e.f33307e) && AbstractC5942e.metrica(this.f33316e, c17005e.f33316e) && AbstractC5942e.metrica(this.f33315e, c17005e.f33315e) && this.f33309e == c17005e.f33309e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33314e, this.f33310e, this.f33308e, this.f33312e, this.f33307e, this.f33316e, Integer.valueOf(this.f33309e)});
    }

    public final String toString() {
        List list = this.f33308e;
        int size = list == null ? 0 : list.size();
        String valueOf = String.valueOf(this.f33307e);
        String str = this.f33314e;
        int length = String.valueOf(str).length();
        String str2 = this.f33310e;
        int length2 = String.valueOf(str2).length() + length + 23;
        int length3 = String.valueOf(size).length();
        String str3 = this.f33312e;
        int length4 = String.valueOf(str3).length() + length2 + 20 + length3 + 23 + 22;
        int length5 = valueOf.length();
        String str4 = this.f33316e;
        int i = length4 + length5 + 11;
        int length6 = String.valueOf(str4).length();
        String str5 = this.f33315e;
        StringBuilder sb = new StringBuilder(i + length6 + 8 + String.valueOf(str5).length());
        AbstractC13501e.Signature(sb, "applicationId: ", str, ", name: ", str2);
        sb.append(", namespaces.count: ");
        sb.append(size);
        sb.append(", senderAppIdentifier: ");
        sb.append(str3);
        AbstractC13501e.Signature(sb, ", senderAppLaunchUrl: ", valueOf, ", iconUrl: ", str4);
        return AbstractC1786e.signatures(sb, ", type: ", str5);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 2, this.f33314e);
        AbstractC16852e.remoteconfig(parcel, 3, this.f33310e);
        AbstractC16852e.signatures(parcel, 5, DesugarCollections.unmodifiableList(this.f33308e));
        AbstractC16852e.remoteconfig(parcel, 6, this.f33312e);
        AbstractC16852e.subscription(parcel, 7, this.f33307e, i);
        AbstractC16852e.remoteconfig(parcel, 8, this.f33316e);
        AbstractC16852e.remoteconfig(parcel, 9, this.f33315e);
        AbstractC16852e.startapp(parcel, 10, this.f33311e);
        AbstractC16852e.startapp(parcel, 11, this.f33313e);
        AbstractC16852e.isPro(parcel, 12, 4);
        parcel.writeInt(this.f33309e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
