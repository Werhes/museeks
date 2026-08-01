package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًًَ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7843e {
    public static C7843e license;
    public static final ReentrantLock metrica = new ReentrantLock();
    public final ReentrantLock ad = new ReentrantLock();
    public final SharedPreferences vip;

    public C7843e(Context context) {
        this.vip = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String ad(String str) {
        ReentrantLock reentrantLock = this.ad;
        reentrantLock.lock();
        try {
            return this.vip.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
