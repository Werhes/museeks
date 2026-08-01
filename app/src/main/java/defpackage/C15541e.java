package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕ٘ۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15541e extends AbstractC6484e {
    public static final Parcelable.Creator<C15541e> CREATOR = new C10765e(10);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final long f30685e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f30686e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C3276e f30687e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final long f30688e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f30689e;

    public C15541e(C15541e c15541e, long j, long j2) {
        AbstractC9528e.startapp(c15541e);
        this.f30689e = c15541e.f30689e;
        this.f30687e = c15541e.f30687e;
        this.f30686e = c15541e.f30686e;
        this.f30688e = j;
        this.f30685e = j2;
    }

    public C15541e(String str, C3276e c3276e, String str2, long j, long j2) {
        this.f30689e = str;
        this.f30687e = c3276e;
        this.f30686e = str2;
        this.f30688e = j;
        this.f30685e = j2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f30687e);
        String str = this.f30686e;
        int length = String.valueOf(str).length();
        String str2 = this.f30689e;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + valueOf.length());
        AbstractC13501e.Signature(sb, "origin=", str, ",name=", str2);
        return AbstractC1786e.signatures(sb, ",params=", valueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C10765e.ad(this, parcel, i);
    }
}
