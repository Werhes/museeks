package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؖۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4661e extends AbstractC16277e implements InterfaceC8227e {
    public C4661e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 5);
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eّؔٞ, reason: contains not printable characters */
    public final void mo1647e(C15541e c15541e, C8019e c8019e) {
        Parcel m4156e = m4156e();
        AbstractC1757e.vip(m4156e, c15541e);
        AbstractC1757e.vip(m4156e, c8019e);
        m4155e(m4156e, 1);
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eؕؗؑ, reason: contains not printable characters */
    public final void mo1648e(C8019e c8019e, Bundle bundle, InterfaceC6486e interfaceC6486e) {
        Parcel m4156e = m4156e();
        AbstractC1757e.vip(m4156e, c8019e);
        AbstractC1757e.vip(m4156e, bundle);
        AbstractC1757e.metrica(m4156e, interfaceC6486e);
        m4155e(m4156e, 31);
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eَُؗ, reason: contains not printable characters */
    public final byte[] mo1649e(String str, C15541e c15541e) {
        Parcel m4156e = m4156e();
        AbstractC1757e.vip(m4156e, c15541e);
        m4156e.writeString(str);
        Parcel m4150e = m4150e(m4156e, 9);
        byte[] createByteArray = m4150e.createByteArray();
        m4150e.recycle();
        return createByteArray;
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eؚٕؗ, reason: contains not printable characters */
    public final void mo1650e(C8019e c8019e) {
        Parcel m4156e = m4156e();
        AbstractC1757e.vip(m4156e, c8019e);
        m4155e(m4156e, 27);
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eؚۜؑ, reason: contains not printable characters */
    public final void mo1651e(C8019e c8019e) {
        Parcel m4156e = m4156e();
        AbstractC1757e.vip(m4156e, c8019e);
        m4155e(m4156e, 26);
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eَٖٓ, reason: contains not printable characters */
    public final void mo1652e(C8019e c8019e) {
        Parcel m4156e = m4156e();
        AbstractC1757e.vip(m4156e, c8019e);
        m4155e(m4156e, 6);
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eّؓٙ, reason: contains not printable characters */
    public final void mo1653e(C8019e c8019e) {
        Parcel m4156e = m4156e();
        AbstractC1757e.vip(m4156e, c8019e);
        m4155e(m4156e, 20);
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eّ۟ٝ, reason: contains not printable characters */
    public final void mo1654e(C9097e c9097e, C8019e c8019e) {
        Parcel m4156e = m4156e();
        AbstractC1757e.vip(m4156e, c9097e);
        AbstractC1757e.vip(m4156e, c8019e);
        m4155e(m4156e, 2);
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eّ۟ۘ, reason: contains not printable characters */
    public final String mo1655e(C8019e c8019e) {
        Parcel m4156e = m4156e();
        AbstractC1757e.vip(m4156e, c8019e);
        Parcel m4150e = m4150e(m4156e, 11);
        String readString = m4150e.readString();
        m4150e.recycle();
        return readString;
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eْۢؕ, reason: contains not printable characters */
    public final void mo1656e(C15148e c15148e, C8019e c8019e) {
        Parcel m4156e = m4156e();
        AbstractC1757e.vip(m4156e, c15148e);
        AbstractC1757e.vip(m4156e, c8019e);
        m4155e(m4156e, 12);
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eٓٔؔ, reason: contains not printable characters */
    public final void mo1657e(C8019e c8019e) {
        Parcel m4156e = m4156e();
        AbstractC1757e.vip(m4156e, c8019e);
        m4155e(m4156e, 18);
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eٖٔۧ, reason: contains not printable characters */
    public final void mo1658e(C8019e c8019e, C17965e c17965e) {
        Parcel m4156e = m4156e();
        AbstractC1757e.vip(m4156e, c8019e);
        AbstractC1757e.vip(m4156e, c17965e);
        m4155e(m4156e, 30);
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eٌٗۙ, reason: contains not printable characters */
    public final List mo1659e(String str, String str2, C8019e c8019e) {
        Parcel m4156e = m4156e();
        m4156e.writeString(str);
        m4156e.writeString(str2);
        AbstractC1757e.vip(m4156e, c8019e);
        Parcel m4150e = m4150e(m4156e, 16);
        ArrayList createTypedArrayList = m4150e.createTypedArrayList(C15148e.CREATOR);
        m4150e.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eؙٟ٘, reason: contains not printable characters */
    public final List mo1660e(String str, String str2, String str3) {
        Parcel m4156e = m4156e();
        m4156e.writeString(null);
        m4156e.writeString(str2);
        m4156e.writeString(str3);
        Parcel m4150e = m4150e(m4156e, 17);
        ArrayList createTypedArrayList = m4150e.createTypedArrayList(C15148e.CREATOR);
        m4150e.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: final, reason: not valid java name */
    public final void mo1661final(C8019e c8019e) {
        Parcel m4156e = m4156e();
        AbstractC1757e.vip(m4156e, c8019e);
        m4155e(m4156e, 4);
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: goto, reason: not valid java name */
    public final C12221e mo1662goto(C8019e c8019e) {
        Parcel m4156e = m4156e();
        AbstractC1757e.vip(m4156e, c8019e);
        Parcel m4150e = m4150e(m4156e, 21);
        C12221e c12221e = (C12221e) AbstractC1757e.ad(m4150e, C12221e.CREATOR);
        m4150e.recycle();
        return c12221e;
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: package, reason: not valid java name */
    public final void mo1663package(long j, String str, String str2, String str3) {
        Parcel m4156e = m4156e();
        m4156e.writeLong(j);
        m4156e.writeString(str);
        m4156e.writeString(str2);
        m4156e.writeString(str3);
        m4155e(m4156e, 10);
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: return, reason: not valid java name */
    public final List mo1664return(String str, String str2, boolean z, C8019e c8019e) {
        Parcel m4156e = m4156e();
        m4156e.writeString(str);
        m4156e.writeString(str2);
        ClassLoader classLoader = AbstractC1757e.ad;
        m4156e.writeInt(z ? 1 : 0);
        AbstractC1757e.vip(m4156e, c8019e);
        Parcel m4150e = m4150e(m4156e, 14);
        ArrayList createTypedArrayList = m4150e.createTypedArrayList(C9097e.CREATOR);
        m4150e.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: static, reason: not valid java name */
    public final void mo1665static(Bundle bundle, C8019e c8019e) {
        Parcel m4156e = m4156e();
        AbstractC1757e.vip(m4156e, bundle);
        AbstractC1757e.vip(m4156e, c8019e);
        m4155e(m4156e, 19);
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: synchronized, reason: not valid java name */
    public final void mo1666synchronized(C8019e c8019e, C1157e c1157e, InterfaceC7517e interfaceC7517e) {
        Parcel m4156e = m4156e();
        AbstractC1757e.vip(m4156e, c8019e);
        AbstractC1757e.vip(m4156e, c1157e);
        AbstractC1757e.metrica(m4156e, interfaceC7517e);
        m4155e(m4156e, 29);
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: this, reason: not valid java name */
    public final List mo1667this(String str, String str2, String str3, boolean z) {
        Parcel m4156e = m4156e();
        m4156e.writeString(null);
        m4156e.writeString(str2);
        m4156e.writeString(str3);
        ClassLoader classLoader = AbstractC1757e.ad;
        m4156e.writeInt(z ? 1 : 0);
        Parcel m4150e = m4150e(m4156e, 15);
        ArrayList createTypedArrayList = m4150e.createTypedArrayList(C9097e.CREATOR);
        m4150e.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: volatile, reason: not valid java name */
    public final void mo1668volatile(C8019e c8019e) {
        Parcel m4156e = m4156e();
        AbstractC1757e.vip(m4156e, c8019e);
        m4155e(m4156e, 25);
    }
}
