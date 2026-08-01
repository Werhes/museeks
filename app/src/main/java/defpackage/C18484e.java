package defpackage;

import android.content.pm.PackageManager;
import android.util.Log;
import android.util.Pair;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۥِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18484e {
    public static final C18484e metrica = new C18484e(new HashMap());
    public final HashMap vip = new HashMap();
    public final boolean ad = true;

    public C18484e(HashMap hashMap) {
    }

    public final boolean ad(C15525e c15525e) {
        int i = c15525e.metrica;
        String str = c15525e.vip;
        if (Log.isLoggable("CarApp.Val", 3)) {
            Log.d("CarApp.Val", "Evaluating " + c15525e);
        }
        if (this.ad) {
            if (Log.isLoggable("CarApp.Val", 3)) {
                Log.d("CarApp.Val", "Accepted - Validator disabled, all hosts allowed");
            }
            return true;
        }
        HashMap hashMap = this.vip;
        Pair pair = (Pair) hashMap.get(str);
        Boolean bool = null;
        if (pair != null && ((Integer) pair.first).intValue() == i) {
            bool = (Boolean) pair.second;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Log.d("CarApp.Val", "PackageManager is null. Package info cannot be found for package " + str);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("CarApp.Val", "Package " + str + " not found", e);
        }
        Log.w("CarApp.Val", "Rejected - package name " + str + " not found");
        hashMap.put(str, Pair.create(Integer.valueOf(i), false));
        return false;
    }
}
