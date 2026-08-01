package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۥٍ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13624e extends AbstractC16277e implements IInterface {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5, types: [eْؖٔ] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* renamed from: eؚؒؖ, reason: contains not printable characters */
    public final InterfaceC4112e m3626e(C12487e c12487e, InterfaceC15751e interfaceC15751e, BinderC1109e binderC1109e) {
        ?? r4;
        Parcel m4156e = m4156e();
        AbstractC3336e.vip(m4156e, c12487e);
        AbstractC3336e.metrica(m4156e, interfaceC15751e);
        AbstractC3336e.metrica(m4156e, binderC1109e);
        Parcel m4154e = m4154e(m4156e, 3);
        IBinder readStrongBinder = m4154e.readStrongBinder();
        int i = AbstractBinderC10764e.license;
        if (readStrongBinder == null) {
            r4 = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            r4 = queryLocalInterface instanceof InterfaceC4112e ? (InterfaceC4112e) queryLocalInterface : new AbstractC16277e(readStrongBinder, "com.google.android.gms.cast.framework.ICastSession", 1);
        }
        m4154e.recycle();
        return r4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5, types: [eۣٗٞ] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* renamed from: eٌٕۗ, reason: contains not printable characters */
    public final InterfaceC17175e m3627e(BinderC3838e binderC3838e, BinderC1109e binderC1109e, int i, int i2) {
        ?? r3;
        Parcel m4156e = m4156e();
        AbstractC3336e.metrica(m4156e, binderC3838e);
        AbstractC3336e.metrica(m4156e, binderC1109e);
        m4156e.writeInt(i);
        m4156e.writeInt(i2);
        m4156e.writeInt(0);
        m4156e.writeLong(2097152L);
        m4156e.writeInt(5);
        m4156e.writeInt(333);
        m4156e.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel m4154e = m4154e(m4156e, 6);
        IBinder readStrongBinder = m4154e.readStrongBinder();
        int i3 = AbstractBinderC13953e.license;
        if (readStrongBinder == null) {
            r3 = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            r3 = queryLocalInterface instanceof InterfaceC17175e ? (InterfaceC17175e) queryLocalInterface : new AbstractC16277e(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 1);
        }
        m4154e.recycle();
        return r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5, types: [eۣٗٞ] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* renamed from: eٍ٘ۛ, reason: contains not printable characters */
    public final InterfaceC17175e m3628e(BinderC3838e binderC3838e, BinderC3838e binderC3838e2, BinderC1109e binderC1109e, int i, int i2) {
        ?? r3;
        Parcel m4156e = m4156e();
        AbstractC3336e.metrica(m4156e, binderC3838e);
        AbstractC3336e.metrica(m4156e, binderC3838e2);
        AbstractC3336e.metrica(m4156e, binderC1109e);
        m4156e.writeInt(i);
        m4156e.writeInt(i2);
        m4156e.writeInt(0);
        m4156e.writeLong(2097152L);
        m4156e.writeInt(5);
        m4156e.writeInt(333);
        m4156e.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel m4154e = m4154e(m4156e, 7);
        IBinder readStrongBinder = m4154e.readStrongBinder();
        int i3 = AbstractBinderC13953e.license;
        if (readStrongBinder == null) {
            r3 = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            r3 = queryLocalInterface instanceof InterfaceC17175e ? (InterfaceC17175e) queryLocalInterface : new AbstractC16277e(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 1);
        }
        m4154e.recycle();
        return r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5, types: [eِٗۥ] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* renamed from: eُٚۜ, reason: contains not printable characters */
    public final InterfaceC11791e m3629e(String str, String str2, BinderC1109e binderC1109e) {
        ?? r4;
        Parcel m4156e = m4156e();
        m4156e.writeString(str);
        m4156e.writeString(str2);
        AbstractC3336e.metrica(m4156e, binderC1109e);
        Parcel m4154e = m4154e(m4156e, 2);
        IBinder readStrongBinder = m4154e.readStrongBinder();
        int i = AbstractBinderC9942e.license;
        if (readStrongBinder == null) {
            r4 = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            r4 = queryLocalInterface instanceof InterfaceC11791e ? (InterfaceC11791e) queryLocalInterface : new AbstractC16277e(readStrongBinder, "com.google.android.gms.cast.framework.ISession", 1);
        }
        m4154e.recycle();
        return r4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5, types: [eٔۢؗ] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* renamed from: eِۥٕ, reason: contains not printable characters */
    public final InterfaceC15033e m3630e(BinderC3838e binderC3838e, InterfaceC15751e interfaceC15751e, InterfaceC15751e interfaceC15751e2) {
        ?? r4;
        Parcel m4156e = m4156e();
        AbstractC3336e.metrica(m4156e, binderC3838e);
        AbstractC3336e.metrica(m4156e, interfaceC15751e);
        AbstractC3336e.metrica(m4156e, interfaceC15751e2);
        Parcel m4154e = m4154e(m4156e, 5);
        IBinder readStrongBinder = m4154e.readStrongBinder();
        int i = AbstractBinderC3727e.license;
        if (readStrongBinder == null) {
            r4 = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            r4 = queryLocalInterface instanceof InterfaceC15033e ? (InterfaceC15033e) queryLocalInterface : new AbstractC16277e(readStrongBinder, "com.google.android.gms.cast.framework.IReconnectionService", 1);
        }
        m4154e.recycle();
        return r4;
    }
}
