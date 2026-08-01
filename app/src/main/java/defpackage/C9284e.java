package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9284e implements Comparator, Parcelable {
    public static final Parcelable.Creator<C9284e> CREATOR = new C1928e(10);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f18504e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f18505e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f18506e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C14290e[] f18507e;

    public C9284e(Parcel parcel) {
        this.f18504e = parcel.readString();
        C14290e[] c14290eArr = (C14290e[]) parcel.createTypedArray(C14290e.CREATOR);
        String str = AbstractC9413e.ad;
        this.f18507e = c14290eArr;
        this.f18506e = c14290eArr.length;
    }

    public C9284e(String str, boolean z, C14290e... c14290eArr) {
        this.f18504e = str;
        c14290eArr = z ? (C14290e[]) c14290eArr.clone() : c14290eArr;
        this.f18507e = c14290eArr;
        this.f18506e = c14290eArr.length;
        Arrays.sort(c14290eArr, this);
    }

    public final C9284e ad(String str) {
        return Objects.equals(this.f18504e, str) ? this : new C9284e(str, false, this.f18507e);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C14290e c14290e = (C14290e) obj;
        C14290e c14290e2 = (C14290e) obj2;
        UUID uuid = AbstractC18394e.vip;
        return uuid.equals(c14290e.f28264e) ? uuid.equals(c14290e2.f28264e) ? 0 : 1 : c14290e.f28264e.compareTo(c14290e2.f28264e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9284e.class == obj.getClass()) {
            C9284e c9284e = (C9284e) obj;
            if (Objects.equals(this.f18504e, c9284e.f18504e) && Arrays.equals(this.f18507e, c9284e.f18507e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f18505e == 0) {
            String str = this.f18504e;
            this.f18505e = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f18507e);
        }
        return this.f18505e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18504e);
        parcel.writeTypedArray(this.f18507e, 0);
    }
}
