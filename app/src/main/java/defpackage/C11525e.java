package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؖٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11525e extends AbstractC16277e {
    /* renamed from: eؚؒؖ, reason: contains not printable characters */
    public final InterfaceC15751e m3222e(BinderC3838e binderC3838e, String str, int i) {
        Parcel m4156e = m4156e();
        AbstractC14342e.vip(m4156e, binderC3838e);
        m4156e.writeString(str);
        m4156e.writeInt(i);
        Parcel m4152e = m4152e(m4156e, 4);
        InterfaceC15751e m1404e = BinderC3838e.m1404e(m4152e.readStrongBinder());
        m4152e.recycle();
        return m1404e;
    }

    /* renamed from: eٌٕۗ, reason: contains not printable characters */
    public final InterfaceC15751e m3223e(BinderC3838e binderC3838e, String str, int i, BinderC3838e binderC3838e2) {
        Parcel m4156e = m4156e();
        AbstractC14342e.vip(m4156e, binderC3838e);
        m4156e.writeString(str);
        m4156e.writeInt(i);
        AbstractC14342e.vip(m4156e, binderC3838e2);
        Parcel m4152e = m4152e(m4156e, 8);
        InterfaceC15751e m1404e = BinderC3838e.m1404e(m4152e.readStrongBinder());
        m4152e.recycle();
        return m1404e;
    }

    /* renamed from: eُٚۜ, reason: contains not printable characters */
    public final InterfaceC15751e m3224e(BinderC3838e binderC3838e, String str, int i) {
        Parcel m4156e = m4156e();
        AbstractC14342e.vip(m4156e, binderC3838e);
        m4156e.writeString(str);
        m4156e.writeInt(i);
        Parcel m4152e = m4152e(m4156e, 2);
        InterfaceC15751e m1404e = BinderC3838e.m1404e(m4152e.readStrongBinder());
        m4152e.recycle();
        return m1404e;
    }

    /* renamed from: eِۥٕ, reason: contains not printable characters */
    public final InterfaceC15751e m3225e(BinderC3838e binderC3838e, String str, boolean z, long j) {
        Parcel m4156e = m4156e();
        AbstractC14342e.vip(m4156e, binderC3838e);
        m4156e.writeString(str);
        m4156e.writeInt(z ? 1 : 0);
        m4156e.writeLong(j);
        Parcel m4152e = m4152e(m4156e, 7);
        InterfaceC15751e m1404e = BinderC3838e.m1404e(m4152e.readStrongBinder());
        m4152e.recycle();
        return m1404e;
    }
}
