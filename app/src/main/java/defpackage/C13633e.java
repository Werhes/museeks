package defpackage;

import android.content.Context;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۦؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13633e implements InterfaceC6823e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Context f27054e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27055e;

    public /* synthetic */ C13633e(Context context, int i) {
        this.f27055e = i;
        this.f27054e = context;
    }

    @Override // defpackage.InterfaceC6823e
    public final Object get() {
        C10573e c10573e;
        switch (this.f27055e) {
            case 0:
                return AbstractC17305e.amazon(this.f27054e);
            case 1:
                return new C11010e(this.f27054e);
            default:
                Context context = this.f27054e;
                C1410e c1410e = C10573e.Signature;
                synchronized (C10573e.class) {
                    try {
                        if (C10573e.tapsense == null) {
                            Context applicationContext = context == null ? null : context.getApplicationContext();
                            HashMap hashMap = new HashMap(8);
                            hashMap.put(0, 1000000L);
                            hashMap.put(2, -9223372036854775807L);
                            hashMap.put(3, -9223372036854775807L);
                            hashMap.put(4, -9223372036854775807L);
                            hashMap.put(5, -9223372036854775807L);
                            hashMap.put(10, -9223372036854775807L);
                            hashMap.put(9, -9223372036854775807L);
                            hashMap.put(7, -9223372036854775807L);
                            C10573e.tapsense = new C10573e(applicationContext, hashMap);
                        }
                        c10573e = C10573e.tapsense;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c10573e;
        }
    }
}
