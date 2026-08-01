package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٖۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5672e {
    public static final C18482e ad = new C18482e("CastDynamiteModule", null);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5, types: [eٌِّ] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static InterfaceC12362e ad(Context context, C12487e c12487e, BinderC8922e binderC8922e, HashMap hashMap) {
        ?? r3;
        C13624e vip = vip(context);
        BinderC3838e binderC3838e = new BinderC3838e(context.getApplicationContext());
        Parcel m4156e = vip.m4156e();
        AbstractC3336e.metrica(m4156e, binderC3838e);
        AbstractC3336e.vip(m4156e, c12487e);
        AbstractC3336e.metrica(m4156e, binderC8922e);
        m4156e.writeMap(hashMap);
        Parcel m4154e = vip.m4154e(m4156e, 1);
        IBinder readStrongBinder = m4154e.readStrongBinder();
        int i = AbstractBinderC1353e.license;
        if (readStrongBinder == null) {
            r3 = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            r3 = queryLocalInterface instanceof InterfaceC12362e ? (InterfaceC12362e) queryLocalInterface : new AbstractC16277e(readStrongBinder, "com.google.android.gms.cast.framework.ICastContext", 1);
        }
        m4154e.recycle();
        return r3;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [eْۥٍ, eٖ٘ؔ] */
    public static C13624e vip(Context context) {
        try {
            IBinder vip = C0781e.metrica(context, C0781e.vip, "com.google.android.gms.cast.framework.dynamite").vip("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (vip == null) {
                return null;
            }
            IInterface queryLocalInterface = vip.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return queryLocalInterface instanceof C13624e ? (C13624e) queryLocalInterface : new AbstractC16277e(vip, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule", 1);
        } catch (C15674e e) {
            throw new Exception(e);
        }
    }
}
