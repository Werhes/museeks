package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۤٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9097e extends AbstractC6484e {
    public static final Parcelable.Creator<C9097e> CREATOR = new C0928e(5);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f18219e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f18220e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f18221e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Long f18222e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f18223e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final Double f18224e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final String f18225e;

    public C9097e(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f18223e = i;
        this.f18221e = str;
        this.f18220e = j;
        this.f18222e = l;
        this.f18224e = i == 1 ? f != null ? Double.valueOf(f.doubleValue()) : null : d;
        this.f18219e = str2;
        this.f18225e = str3;
    }

    public C9097e(long j, Object obj, String str, String str2) {
        AbstractC9528e.purchase(str);
        this.f18223e = 2;
        this.f18221e = str;
        this.f18220e = j;
        this.f18225e = str2;
        if (obj == null) {
            this.f18222e = null;
            this.f18224e = null;
            this.f18219e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f18222e = (Long) obj;
            this.f18224e = null;
            this.f18219e = null;
        } else if (obj instanceof String) {
            this.f18222e = null;
            this.f18224e = null;
            this.f18219e = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.f18222e = null;
            this.f18224e = (Double) obj;
            this.f18219e = null;
        }
    }

    public C9097e(C10030e c10030e) {
        this(c10030e.license, c10030e.appmetrica, c10030e.metrica, c10030e.vip);
    }

    public final Object billing() {
        Long l = this.f18222e;
        if (l != null) {
            return l;
        }
        Double d = this.f18224e;
        if (d != null) {
            return d;
        }
        String str = this.f18219e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C0928e.ad(this, parcel);
    }
}
