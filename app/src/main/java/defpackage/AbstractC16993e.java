package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٓۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16993e {
    public static final C18482e ad = new C18482e("MediaSessionUtils", null);

    public static ArrayList ad(C13645e c13645e) {
        try {
            Parcel m4154e = c13645e.m4154e(c13645e.m4156e(), 3);
            ArrayList createTypedArrayList = m4154e.createTypedArrayList(C6372e.CREATOR);
            m4154e.recycle();
            return createTypedArrayList;
        } catch (RemoteException e) {
            Object[] objArr = {"getNotificationActions", C13645e.class.getSimpleName()};
            C18482e c18482e = ad;
            Log.e(c18482e.ad, c18482e.license("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }

    public static int[] vip(C13645e c13645e) {
        try {
            Parcel m4154e = c13645e.m4154e(c13645e.m4156e(), 4);
            int[] createIntArray = m4154e.createIntArray();
            m4154e.recycle();
            return createIntArray;
        } catch (RemoteException e) {
            Object[] objArr = {"getCompactViewActionIndices", C13645e.class.getSimpleName()};
            C18482e c18482e = ad;
            Log.e(c18482e.ad, c18482e.license("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }
}
