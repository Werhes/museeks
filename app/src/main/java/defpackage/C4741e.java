package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٜؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4741e implements Parcelable {
    public static final Parcelable.Creator<C4741e> CREATOR = new C1928e(4);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f10143e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final ArrayList f10144e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final ArrayList f10145e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int[] f10146e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final int f10147e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final boolean f10148e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ArrayList f10149e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final int f10150e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final CharSequence f10151e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int[] f10152e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final CharSequence f10153e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int[] f10154e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f10155e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final String f10156e;

    public C4741e(Parcel parcel) {
        this.f10154e = parcel.createIntArray();
        this.f10149e = parcel.createStringArrayList();
        this.f10146e = parcel.createIntArray();
        this.f10152e = parcel.createIntArray();
        this.f10143e = parcel.readInt();
        this.f10156e = parcel.readString();
        this.f10155e = parcel.readInt();
        this.f10150e = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f10153e = (CharSequence) creator.createFromParcel(parcel);
        this.f10147e = parcel.readInt();
        this.f10151e = (CharSequence) creator.createFromParcel(parcel);
        this.f10145e = parcel.createStringArrayList();
        this.f10144e = parcel.createStringArrayList();
        this.f10148e = parcel.readInt() != 0;
    }

    public C4741e(C10159e c10159e) {
        int size = c10159e.ad.size();
        this.f10154e = new int[size * 6];
        if (!c10159e.billing) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f10149e = new ArrayList(size);
        this.f10146e = new int[size];
        this.f10152e = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C7659e c7659e = (C7659e) c10159e.ad.get(i2);
            int i3 = i + 1;
            this.f10154e[i] = c7659e.ad;
            ArrayList arrayList = this.f10149e;
            AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = c7659e.vip;
            arrayList.add(abstractComponentCallbacksC17875e != null ? abstractComponentCallbacksC17875e.f35068e : null);
            int[] iArr = this.f10154e;
            iArr[i3] = c7659e.metrica ? 1 : 0;
            iArr[i + 2] = c7659e.license;
            iArr[i + 3] = c7659e.appmetrica;
            int i4 = i + 5;
            iArr[i + 4] = c7659e.purchase;
            i += 6;
            iArr[i4] = c7659e.billing;
            this.f10146e[i2] = c7659e.yandex.ordinal();
            this.f10152e[i2] = c7659e.startapp.ordinal();
        }
        this.f10143e = c10159e.purchase;
        this.f10156e = c10159e.yandex;
        this.f10155e = c10159e.remoteconfig;
        this.f10150e = c10159e.startapp;
        this.f10153e = c10159e.adcel;
        this.f10147e = c10159e.mopub;
        this.f10151e = c10159e.advert;
        this.f10145e = c10159e.smaato;
        this.f10144e = c10159e.amazon;
        this.f10148e = c10159e.loadAd;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f10154e);
        parcel.writeStringList(this.f10149e);
        parcel.writeIntArray(this.f10146e);
        parcel.writeIntArray(this.f10152e);
        parcel.writeInt(this.f10143e);
        parcel.writeString(this.f10156e);
        parcel.writeInt(this.f10155e);
        parcel.writeInt(this.f10150e);
        TextUtils.writeToParcel(this.f10153e, parcel, 0);
        parcel.writeInt(this.f10147e);
        TextUtils.writeToParcel(this.f10151e, parcel, 0);
        parcel.writeStringList(this.f10145e);
        parcel.writeStringList(this.f10144e);
        parcel.writeInt(this.f10148e ? 1 : 0);
    }
}
