package defpackage;

import android.os.Build;
import android.util.Log;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؕؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3532e extends ClassLoader {
    public final /* synthetic */ int ad = 1;

    public C3532e() {
    }

    public C3532e(ClassLoader classLoader) {
        super(classLoader);
    }

    public ArrayList ad() {
        Package[] packages = getPackages();
        ArrayList arrayList = new ArrayList(packages.length);
        for (Package r0 : packages) {
            arrayList.add(r0.getName());
        }
        return arrayList;
    }

    @Override // java.lang.ClassLoader
    public Class loadClass(String str, boolean z) {
        switch (this.ad) {
            case 1:
                if (!Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
                    return super.loadClass(str, z);
                }
                if (Log.isLoggable("CloudMessengerCompat", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3))) {
                    Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
                }
                return C3773e.class;
            default:
                return super.loadClass(str, z);
        }
    }
}
