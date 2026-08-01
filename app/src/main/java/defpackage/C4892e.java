package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٔٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4892e extends AbstractC16277e {
    /* renamed from: eُٚۜ, reason: contains not printable characters */
    public final C5053e[] m1676e(BinderC3838e binderC3838e, C5141e c5141e) {
        Parcel m4156e = m4156e();
        int i = AbstractC15518e.ad;
        m4156e.writeStrongBinder(binderC3838e);
        m4156e.writeInt(1);
        c5141e.writeToParcel(m4156e, 0);
        Parcel m4154e = m4154e(m4156e, 1);
        C5053e[] c5053eArr = (C5053e[]) m4154e.createTypedArray(C5053e.CREATOR);
        m4154e.recycle();
        return c5053eArr;
    }
}
